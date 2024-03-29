package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzmw implements zznm {
    /* access modifiers changed from: private */
    public final int track;
    private final /* synthetic */ zzmn zzbeg;

    public zzmw(zzmn zzmn, int i) {
        this.zzbeg = zzmn;
        this.track = i;
    }

    public final boolean isReady() {
        return this.zzbeg.zzbb(this.track);
    }

    public final void zzhq() throws IOException {
        this.zzbeg.zzhq();
    }

    public final int zzb(zzhq zzhq, zzjk zzjk, boolean z) {
        return this.zzbeg.zza(this.track, zzhq, zzjk, z);
    }

    public final void zzeh(long j) {
        this.zzbeg.zzd(this.track, j);
    }
}
