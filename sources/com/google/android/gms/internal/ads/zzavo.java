package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzavo implements zzdvi<Void> {
    private final /* synthetic */ zzdvt zzdwf;

    zzavo(zzavl zzavl, zzdvt zzdvt) {
        this.zzdwf = zzdvt;
    }

    public final void zzb(Throwable th) {
        zzavl.zzdvs.remove(this.zzdwf);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        zzavl.zzdvs.remove(this.zzdwf);
    }
}
