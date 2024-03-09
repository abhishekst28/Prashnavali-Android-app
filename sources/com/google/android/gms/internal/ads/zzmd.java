package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzmd implements zzmb {
    private final int zzbdb;
    private MediaCodecInfo[] zzbdc;

    public zzmd(boolean z) {
        this.zzbdb = z ? 1 : 0;
    }

    public final int getCodecCount() {
        zzhk();
        return this.zzbdc.length;
    }

    public final MediaCodecInfo getCodecInfoAt(int i) {
        zzhk();
        return this.zzbdc[i];
    }

    public final boolean zzhj() {
        return true;
    }

    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private final void zzhk() {
        if (this.zzbdc == null) {
            this.zzbdc = new MediaCodecList(this.zzbdb).getCodecInfos();
        }
    }
}
