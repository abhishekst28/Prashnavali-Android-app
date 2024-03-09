package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzqc implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ zzpx zzbmn;

    private zzqc(zzpx zzpx, MediaCodec mediaCodec) {
        this.zzbmn = zzpx;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this == this.zzbmn.zzbly) {
            this.zzbmn.zzji();
        }
    }
}
