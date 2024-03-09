package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzazz extends zzaa<zzy> {
    private final Map<String, String> zzam;
    private final zzbbq<zzy> zzecd;
    private final zzbax zzece;

    public zzazz(String str, zzbbq<zzy> zzbbq) {
        this(str, (Map<String, String>) null, zzbbq);
    }

    private zzazz(String str, Map<String, String> map, zzbbq<zzy> zzbbq) {
        super(0, str, new zzazy(zzbbq));
        this.zzam = null;
        this.zzecd = zzbbq;
        zzbax zzbax = new zzbax();
        this.zzece = zzbax;
        zzbax.zza(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final zzaj<zzy> zza(zzy zzy) {
        return zzaj.zza(zzy, zzbc.zzb(zzy));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void zza(Object obj) {
        zzy zzy = (zzy) obj;
        this.zzece.zza((Map<String, ?>) zzy.zzam, zzy.statusCode);
        zzbax zzbax = this.zzece;
        byte[] bArr = zzy.data;
        if (zzbax.isEnabled() && bArr != null) {
            zzbax.zzi(bArr);
        }
        this.zzecd.set(zzy);
    }
}
