package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzazt {
    private static zzae zzebu;
    private static final Object zzebv = new Object();
    @Deprecated
    private static final zzazx<Void> zzebw = new zzazs();

    public zzazt(Context context) {
        zzbk(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    public static zzdvt<zzy> zzev(String str) {
        zzbbq zzbbq = new zzbbq();
        zzebu.zze(new zzazz(str, zzbbq));
        return zzbbq;
    }

    public final zzdvt<String> zza(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        zzazw zzazw = new zzazw((zzazs) null);
        zzazv zzazv = new zzazv(this, str2, zzazw);
        zzbax zzbax = new zzbax((String) null);
        zzazu zzazu = new zzazu(this, i, str, zzazw, zzazv, bArr, map, zzbax);
        if (zzbax.isEnabled()) {
            try {
                zzbax.zza(str2, "GET", zzazu.getHeaders(), zzazu.zzg());
            } catch (zzl e) {
                zzaxy.zzfe(e.getMessage());
            }
        }
        zzebu.zze(zzazu);
        return zzazw;
    }

    public final zzdvt<String> zzc(String str, Map<String, String> map) {
        return zza(0, str, map, (byte[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzae zzbk(android.content.Context r3) {
        /*
            java.lang.Object r0 = zzebv
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzae r1 = zzebu     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzaat.initialize(r3)     // Catch:{ all -> 0x0036 }
            boolean r1 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzaat.zzcsu     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.zzaap r2 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzae r3 = com.google.android.gms.internal.ads.zzazi.zzbj(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0030
        L_0x002c:
            com.google.android.gms.internal.ads.zzae r3 = com.google.android.gms.internal.ads.zzbk.zza(r3)     // Catch:{ all -> 0x0036 }
        L_0x0030:
            zzebu = r3     // Catch:{ all -> 0x0036 }
        L_0x0032:
            com.google.android.gms.internal.ads.zzae r3 = zzebu     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return r3
        L_0x0036:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazt.zzbk(android.content.Context):com.google.android.gms.internal.ads.zzae");
    }
}
