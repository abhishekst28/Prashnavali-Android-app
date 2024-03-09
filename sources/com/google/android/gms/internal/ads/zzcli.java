package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcli {
    /* access modifiers changed from: private */
    public final Executor executor;
    /* access modifiers changed from: private */
    public final zzcln zzgfb;
    /* access modifiers changed from: private */
    public final Map<String, String> zzgff;

    public zzcli(zzcln zzcln, Executor executor2) {
        this.zzgfb = zzcln;
        this.zzgff = zzcln.zzaos();
        this.executor = executor2;
    }

    public final zzclh zzaor() {
        return new zzclh(this).zzaoo();
    }
}
