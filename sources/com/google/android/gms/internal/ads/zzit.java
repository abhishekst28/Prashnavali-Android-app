package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzit extends zziq {
    private final AudioTimestamp zzalv = new AudioTimestamp();
    private long zzalw;
    private long zzalx;
    private long zzaly;

    public zzit() {
        super((zzir) null);
    }

    public final void zza(AudioTrack audioTrack, boolean z) {
        super.zza(audioTrack, z);
        this.zzalw = 0;
        this.zzalx = 0;
        this.zzaly = 0;
    }

    public final boolean zzfy() {
        boolean timestamp = this.zzaju.getTimestamp(this.zzalv);
        if (timestamp) {
            long j = this.zzalv.framePosition;
            if (this.zzalx > j) {
                this.zzalw++;
            }
            this.zzalx = j;
            this.zzaly = j + (this.zzalw << 32);
        }
        return timestamp;
    }

    public final long zzfz() {
        return this.zzalv.nanoTime;
    }

    public final long zzga() {
        return this.zzaly;
    }
}
