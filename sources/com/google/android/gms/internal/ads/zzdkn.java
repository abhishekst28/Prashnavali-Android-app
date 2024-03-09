package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdkn implements zzcya<zzchu> {
    private final /* synthetic */ zzdkl zzgzt;

    zzdkn(zzdkl zzdkl) {
        this.zzgzt = zzdkl;
    }

    public final void zzaqe() {
        synchronized (this.zzgzt) {
            zzchu unused = this.zzgzt.zzgzw = null;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzchu zzchu = (zzchu) obj;
        synchronized (this.zzgzt) {
            zzchu unused = this.zzgzt.zzgzw = zzchu;
            this.zzgzt.zzgzw.zzahw();
        }
    }
}
