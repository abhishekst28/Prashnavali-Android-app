package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.ads.zztq;
import com.google.android.gms.internal.ads.zztw;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzto {
    private final zztt zzbvr;
    private final zztw.zzi.zza zzbvs;
    private final boolean zzbvt;

    public static zzto zzmy() {
        return new zzto();
    }

    public zzto(zztt zztt) {
        this.zzbvs = zztw.zzi.zznz();
        this.zzbvr = zztt;
        this.zzbvt = ((Boolean) zzwe.zzpu().zzd(zzaat.zzctk)).booleanValue();
    }

    private zzto() {
        this.zzbvs = zztw.zzi.zznz();
        this.zzbvt = false;
        this.zzbvr = new zztt();
    }

    public final synchronized void zza(zztq.zza.zzb zzb) {
        if (this.zzbvt) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctl)).booleanValue()) {
                zzc(zzb);
            } else {
                zzb(zzb);
            }
        }
    }

    private final synchronized void zzb(zztq.zza.zzb zzb) {
        this.zzbvs.zznv().zza((Iterable<? extends Long>) zzmz());
        this.zzbvr.zzf(((zztw.zzi) ((zzegp) this.zzbvs.zzbfx())).toByteArray()).zzby(zzb.zzv()).zzdv();
        String valueOf = String.valueOf(Integer.toString(zzb.zzv(), 10));
        zzaxy.zzei(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void zzc(zztq.zza.zzb zzb) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(zzd(zzb).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        zzaxy.zzei("Could not close Clearcut output stream.");
                    }
                } catch (IOException e2) {
                    zzaxy.zzei("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        zzaxy.zzei("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException e4) {
                zzaxy.zzei("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    zzaxy.zzei("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized String zzd(zztq.zza.zzb zzb) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.zzbvs.zznu(), Long.valueOf(zzp.zzkw().elapsedRealtime()), Integer.valueOf(zzb.zzv()), Base64.encodeToString(((zztw.zzi) ((zzegp) this.zzbvs.zzbfx())).toByteArray(), 3)});
    }

    public final synchronized void zza(zztn zztn) {
        if (this.zzbvt) {
            try {
                zztn.zza(this.zzbvs);
            } catch (NullPointerException e) {
                zzp.zzkt().zza(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    private static List<Long> zzmz() {
        List<String> zzre = zzaat.zzre();
        ArrayList arrayList = new ArrayList();
        for (String split : zzre) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException e) {
                    zzaxy.zzei("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }
}
