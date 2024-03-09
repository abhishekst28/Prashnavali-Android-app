package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcdi {
    zzaex zzfyk;
    zzaew zzfyl;
    zzafl zzfym;
    zzafk zzfyn;
    zzaiz zzfyo;
    final SimpleArrayMap<String, zzafd> zzfyp = new SimpleArrayMap<>();
    final SimpleArrayMap<String, zzafc> zzfyq = new SimpleArrayMap<>();

    public final zzcdi zzb(zzaex zzaex) {
        this.zzfyk = zzaex;
        return this;
    }

    public final zzcdi zzb(zzaew zzaew) {
        this.zzfyl = zzaew;
        return this;
    }

    public final zzcdi zzb(zzafl zzafl) {
        this.zzfym = zzafl;
        return this;
    }

    public final zzcdi zza(zzafk zzafk) {
        this.zzfyn = zzafk;
        return this;
    }

    public final zzcdi zzb(zzaiz zzaiz) {
        this.zzfyo = zzaiz;
        return this;
    }

    public final zzcdi zzb(String str, zzafd zzafd, zzafc zzafc) {
        this.zzfyp.put(str, zzafd);
        this.zzfyq.put(str, zzafc);
        return this;
    }

    public final zzcdg zzamk() {
        return new zzcdg(this);
    }
}
