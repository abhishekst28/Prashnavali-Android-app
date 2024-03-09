package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzage extends zzafb {
    private final /* synthetic */ zzagc zzddm;

    private zzage(zzagc zzagc) {
        this.zzddm = zzagc;
    }

    public final void zza(zzaes zzaes, String str) {
        if (this.zzddm.zzddk != null) {
            this.zzddm.zzddk.onCustomClick(this.zzddm.zzb(zzaes), str);
        }
    }
}
