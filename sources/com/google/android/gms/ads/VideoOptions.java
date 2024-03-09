package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzaac;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class VideoOptions {
    private final boolean zzadr;
    private final boolean zzads;
    private final boolean zzadt;

    public VideoOptions(zzaac zzaac) {
        this.zzadr = zzaac.zzadr;
        this.zzads = zzaac.zzads;
        this.zzadt = zzaac.zzadt;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzadr = true;
        /* access modifiers changed from: private */
        public boolean zzads = false;
        /* access modifiers changed from: private */
        public boolean zzadt = false;

        public final Builder setStartMuted(boolean z) {
            this.zzadr = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzads = z;
            return this;
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzadt = z;
            return this;
        }

        public final VideoOptions build() {
            return new VideoOptions(this);
        }
    }

    private VideoOptions(Builder builder) {
        this.zzadr = builder.zzadr;
        this.zzads = builder.zzads;
        this.zzadt = builder.zzadt;
    }

    public final boolean getStartMuted() {
        return this.zzadr;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzads;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzadt;
    }
}
