package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdpb implements Runnable {
    private final zzdox zzhgz;
    private final zzdos zzhha;

    zzdpb(zzdox zzdox, zzdos zzdos) {
        this.zzhgz = zzdox;
        this.zzhha = zzdos;
    }

    public final void run() {
        zzdox zzdox = this.zzhgz;
        zzdox.zzhgu.zzhgp.zzb(this.zzhha);
    }
}
