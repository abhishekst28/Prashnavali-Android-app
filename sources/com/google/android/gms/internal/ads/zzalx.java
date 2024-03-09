package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzalx implements zzbbs {
    private final /* synthetic */ zzbbq zzdew;
    private final /* synthetic */ zzakx zzdib;

    zzalx(zzalv zzalv, zzbbq zzbbq, zzakx zzakx) {
        this.zzdew = zzbbq;
        this.zzdib = zzakx;
    }

    public final void run() {
        this.zzdew.setException(new zzalj("Unable to obtain a JavascriptEngine."));
        this.zzdib.release();
    }
}
