package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcxt implements zzcya<zzbpd> {
    private final /* synthetic */ zzcxu zzgqu;

    zzcxt(zzcxu zzcxu) {
        this.zzgqu = zzcxu;
    }

    public final void zzaqe() {
        synchronized (this.zzgqu) {
            boolean unused = this.zzgqu.zzaey = false;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbpd zzbpd = (zzbpd) obj;
        synchronized (this.zzgqu) {
            boolean unused = this.zzgqu.zzaey = false;
            zzyf unused2 = this.zzgqu.zzadq = zzbpd.zzaim();
            zzbpd.zzahw();
        }
    }
}
