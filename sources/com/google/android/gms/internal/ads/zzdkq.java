package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdkq implements zzcya<zzchu> {
    private final /* synthetic */ zzdkr zzgzx;

    zzdkq(zzdkr zzdkr) {
        this.zzgzx = zzdkr;
    }

    public final void zzaqe() {
        synchronized (this.zzgzx) {
            zzchu unused = this.zzgzx.zzgzw = null;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzchu zzchu = (zzchu) obj;
        synchronized (this.zzgzx) {
            zzchu unused = this.zzgzx.zzgzw = zzchu;
            this.zzgzx.zzgzw.zzahw();
        }
    }
}
