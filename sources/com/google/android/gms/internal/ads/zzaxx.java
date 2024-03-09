package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaxx implements Runnable {
    private final /* synthetic */ zzaxu zzdzk;

    zzaxx(zzaxu zzaxu) {
        this.zzdzk = zzaxu;
    }

    public final void run() {
        Thread unused = this.zzdzk.thread = Thread.currentThread();
        this.zzdzk.zzuy();
    }
}
