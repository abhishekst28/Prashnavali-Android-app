package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzazu extends zzbh {
    private final /* synthetic */ byte[] zzebx;
    private final /* synthetic */ Map zzeby;
    private final /* synthetic */ zzbax zzebz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzazu(zzazt zzazt, int i, String str, zzal zzal, zzai zzai, byte[] bArr, Map map, zzbax zzbax) {
        super(i, str, zzal, zzai);
        this.zzebx = bArr;
        this.zzeby = map;
        this.zzebz = zzbax;
    }

    public final byte[] zzg() throws zzl {
        byte[] bArr = this.zzebx;
        return bArr == null ? super.zzg() : bArr;
    }

    public final Map<String, String> getHeaders() throws zzl {
        Map<String, String> map = this.zzeby;
        return map == null ? super.getHeaders() : map;
    }

    /* access modifiers changed from: protected */
    public final void zzj(String str) {
        this.zzebz.zzez(str);
        super.zza(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void zza(Object obj) {
        zza((String) obj);
    }
}
