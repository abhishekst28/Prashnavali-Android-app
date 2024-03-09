package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbvr implements zzbwg {
    private final String zzdft;
    private final String zzdgb;

    zzbvr(String str, String str2) {
        this.zzdgb = str;
        this.zzdft = str2;
    }

    public final void zzq(Object obj) {
        ((zzcxl) obj).onAppEvent(this.zzdgb, this.zzdft);
    }
}
