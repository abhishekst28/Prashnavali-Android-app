package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzp;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzahz implements zzx {
    /* access modifiers changed from: private */
    public volatile zzahs zzdfb;
    private final Context zzvr;

    public zzahz(Context context) {
        this.zzvr = context;
    }

    public final zzy zzc(zzaa<?> zzaa) throws zzao {
        zzahr zzh = zzahr.zzh(zzaa);
        long elapsedRealtime = zzp.zzkw().elapsedRealtime();
        try {
            zzbbq zzbbq = new zzbbq();
            this.zzdfb = new zzahs(this.zzvr, zzp.zzld().zzyf(), new zzaid(this, zzbbq), new zzaig(this, zzbbq));
            this.zzdfb.checkAvailabilityAndConnect();
            zzdvt zza = zzdvl.zza(zzdvl.zzb(zzbbq, new zzaic(this, zzh), (Executor) zzbbi.zzedu), (long) ((Integer) zzwe.zzpu().zzd(zzaat.zzcsw)).intValue(), TimeUnit.MILLISECONDS, zzbbi.zzedx);
            zza.addListener(new zzaie(this), zzbbi.zzedu);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zza.get();
            long elapsedRealtime2 = zzp.zzkw().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            zzaxy.zzei(sb.toString());
            zzaht zzaht = (zzaht) new zzask(parcelFileDescriptor).zza(zzaht.CREATOR);
            if (zzaht == null) {
                return null;
            }
            if (zzaht.zzdfa) {
                throw new zzao(zzaht.zzcgr);
            } else if (zzaht.zzdey.length != zzaht.zzdez.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < zzaht.zzdey.length; i++) {
                    hashMap.put(zzaht.zzdey[i], zzaht.zzdez[i]);
                }
                return new zzy(zzaht.statusCode, zzaht.data, (Map<String, String>) hashMap, zzaht.zzan, zzaht.zzao);
            }
        } catch (InterruptedException | ExecutionException e) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(zzp.zzkw().elapsedRealtime() - elapsedRealtime);
            sb2.append("ms");
            zzaxy.zzei(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime3 = zzp.zzkw().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime3);
            sb3.append("ms");
            zzaxy.zzei(sb3.toString());
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public final void disconnect() {
        if (this.zzdfb != null) {
            this.zzdfb.disconnect();
            Binder.flushPendingCommands();
        }
    }
}
