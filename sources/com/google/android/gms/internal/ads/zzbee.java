package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbee implements zzol {
    private final byte[] zzdtc;
    private final zzol zzekg;

    zzbee(zzol zzol, byte[] bArr) {
        this.zzekg = zzol;
        this.zzdtc = bArr;
    }

    public final zzom zzin() {
        zzol zzol = this.zzekg;
        byte[] bArr = this.zzdtc;
        return new zzbel(new zzoj(bArr), bArr.length, zzol.zzin());
    }
}
