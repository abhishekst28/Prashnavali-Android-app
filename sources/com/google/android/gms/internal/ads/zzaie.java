package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaie implements Runnable {
    private final /* synthetic */ zzahz zzdfd;

    zzaie(zzahz zzahz) {
        this.zzdfd = zzahz;
    }

    public final void run() {
        this.zzdfd.disconnect();
    }
}
