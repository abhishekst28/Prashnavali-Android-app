package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzfe {
    static zzdwt zzaaa;

    static boolean zzb(zzex zzex) throws IllegalAccessException, InvocationTargetException {
        if (zzaaa != null) {
            return true;
        }
        String str = (String) zzwe.zzpu().zzd(zzaat.zzcqt);
        if (str == null || str.length() == 0) {
            if (zzex == null) {
                str = null;
            } else {
                Method zza = zzex.zza("TkuK+8ZKbIcxeUe4msY7eeifKf/tICuqqRvwzwQUhsKM0HemvJhBrPQYp0qpvgcE", "eNJuSXkridnHpFkTgNBQFH0ivDH801goaJfT5bONEac=");
                if (zza == null) {
                    str = null;
                } else {
                    str = (String) zza.invoke((Object) null, new Object[0]);
                }
            }
            if (str == null) {
                return false;
            }
        }
        try {
            try {
                zzdxc zzm = zzdxg.zzm(zzcv.zzb(str, true));
                for (zzeca next : zzdyz.zzhsa.zzbck()) {
                    if (next.zzbay().isEmpty()) {
                        throw new GeneralSecurityException("Missing type_url.");
                    } else if (next.zzbbg().isEmpty()) {
                        throw new GeneralSecurityException("Missing primitive_name.");
                    } else if (next.zzbbj().isEmpty()) {
                        throw new GeneralSecurityException("Missing catalogue_name.");
                    } else if (!next.zzbbj().equals("TinkAead") && !next.zzbbj().equals("TinkMac") && !next.zzbbj().equals("TinkHybridDecrypt") && !next.zzbbj().equals("TinkHybridEncrypt") && !next.zzbbj().equals("TinkPublicKeySign") && !next.zzbbj().equals("TinkPublicKeyVerify") && !next.zzbbj().equals("TinkStreamingAead")) {
                        if (!next.zzbbj().equals("TinkDeterministicAead")) {
                            zzdwp<?> zzhn = zzdxm.zzhn(next.zzbbj());
                            zzdxm.zza(zzhn.zzaxo());
                            zzdxm.zza(zzhn.zzb(next.zzbay(), next.zzbbg(), next.zzbbh()), next.zzbbi());
                        }
                    }
                }
                zzdwt zza2 = zzdza.zza(zzm, (zzdww<zzdwt>) null);
                zzaaa = zza2;
                if (zza2 != null) {
                    return true;
                }
                return false;
            } catch (GeneralSecurityException e) {
                return false;
            }
        } catch (IllegalArgumentException e2) {
            return false;
        }
    }
}
