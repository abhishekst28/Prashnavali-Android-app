package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzir extends Thread {
    private final /* synthetic */ AudioTrack zzalt;
    private final /* synthetic */ zzio zzalu;

    zzir(zzio zzio, AudioTrack audioTrack) {
        this.zzalu = zzio;
        this.zzalt = audioTrack;
    }

    public final void run() {
        try {
            this.zzalt.flush();
            this.zzalt.release();
        } finally {
            this.zzalu.zzajq.open();
        }
    }
}
