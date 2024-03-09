package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcvh implements zzbzf {
    private final /* synthetic */ zzdkx zzgnh;
    private final /* synthetic */ zzdlj zzgnv;
    private final /* synthetic */ zzcrg zzgnw;
    final /* synthetic */ zzcvf zzgnx;

    zzcvh(zzcvf zzcvf, zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) {
        this.zzgnx = zzcvf;
        this.zzgnv = zzdlj;
        this.zzgnh = zzdkx;
        this.zzgnw = zzcrg;
    }

    public final void onInitializationSucceeded() {
        this.zzgnx.zzfmk.execute(new zzcvk(this, this.zzgnv, this.zzgnh, this.zzgnw));
    }

    public final void zzdx(int i) {
        String valueOf = String.valueOf(this.zzgnw.zzfqh);
        zzaxy.zzfe(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }
}
