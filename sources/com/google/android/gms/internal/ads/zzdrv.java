package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzdrv {
    private static final Object zzhkx = new Object();
    private final SharedPreferences zzcld;
    private final String zzhkw;
    private final Context zzvr;

    public zzdrv(Context context, zzgo zzgo) {
        this.zzvr = context;
        this.zzhkw = Integer.toString(zzgo.zzv());
        this.zzcld = context.getSharedPreferences("pcvmspf", 0);
    }

    public final zzdrn zzp(int i) {
        synchronized (zzhkx) {
            zzgr zzei = zzei(i);
            if (zzei == null) {
                return null;
            }
            File zzhg = zzhg(zzei.zzdg());
            zzdrn zzdrn = new zzdrn(zzei, new File(zzhg, "pcam"), new File(zzhg, "pcbc"), new File(zzhg, "pcopt"));
            return zzdrn;
        }
    }

    public final boolean zza(zzgq zzgq, zzdrw zzdrw) {
        synchronized (zzhkx) {
            zzgr zzei = zzei(zzdry.zzhkz);
            String zzdg = zzgq.zzdc().zzdg();
            if (zzei != null && zzei.zzdg().equals(zzdg)) {
                return false;
            }
            if (!zzhg(zzdg).mkdirs()) {
                return false;
            }
            File zzhg = zzhg(zzdg);
            File file = new File(zzhg, "pcam");
            File file2 = new File(zzhg, "pcbc");
            if (!zzdrp.zza(file, zzgq.zzdd().toByteArray())) {
                return false;
            }
            if (!zzdrp.zza(file2, zzgq.zzde().toByteArray())) {
                return false;
            }
            if (zzdrw == null || zzdrw.zzb(file)) {
                String zzb = zzb(zzgq);
                String string = this.zzcld.getString(zzawf(), (String) null);
                SharedPreferences.Editor edit = this.zzcld.edit();
                edit.putString(zzawf(), zzb);
                if (string != null) {
                    edit.putString(zzawe(), string);
                }
                if (!edit.commit()) {
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzgr zzei2 = zzei(zzdry.zzhkz);
                if (zzei2 != null) {
                    hashSet.add(zzei2.zzdg());
                }
                zzgr zzei3 = zzei(zzdry.zzhla);
                if (zzei3 != null) {
                    hashSet.add(zzei3.zzdg());
                }
                for (File file3 : new File(this.zzvr.getDir("pccache", 0), this.zzhkw).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzdrp.zze(file3);
                    }
                }
                return true;
            }
            zzdrp.zze(zzhg);
            return false;
        }
    }

    public final boolean zza(zzgq zzgq) {
        synchronized (zzhkx) {
            if (!zzdrp.zza(new File(zzhg(zzgq.zzdc().zzdg()), "pcbc"), zzgq.zzde().toByteArray())) {
                return false;
            }
            String zzb = zzb(zzgq);
            SharedPreferences.Editor edit = this.zzcld.edit();
            edit.putString(zzawf(), zzb);
            boolean commit = edit.commit();
            return commit;
        }
    }

    private final zzgr zzei(int i) {
        String str;
        if (i == zzdry.zzhkz) {
            str = this.zzcld.getString(zzawf(), (String) null);
        } else if (i == zzdry.zzhla) {
            str = this.zzcld.getString(zzawe(), (String) null);
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return zzgr.zzb(zzeff.zzu(Hex.stringToBytes(str)), zzegc.zzbey());
        } catch (zzegz e) {
            return null;
        }
    }

    private final File zzhg(String str) {
        return new File(new File(this.zzvr.getDir("pccache", 0), this.zzhkw), str);
    }

    private final String zzawe() {
        String valueOf = String.valueOf("FBAMTD");
        String valueOf2 = String.valueOf(this.zzhkw);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final String zzawf() {
        String valueOf = String.valueOf("LATMTD");
        String valueOf2 = String.valueOf(this.zzhkw);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static String zzb(zzgq zzgq) {
        return Hex.bytesToStringLowercase(((zzgr) ((zzegp) zzgr.zzdl().zzaw(zzgq.zzdc().zzdg()).zzax(zzgq.zzdc().zzdh()).zzdk(zzgq.zzdc().zzdj()).zzdl(zzgq.zzdc().zzdk()).zzdj(zzgq.zzdc().zzdi()).zzbfx())).zzbda().toByteArray());
    }
}
