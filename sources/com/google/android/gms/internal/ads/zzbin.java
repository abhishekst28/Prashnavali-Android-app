package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbin implements zzelo<WeakReference<Context>> {
    private final zzbih zzern;

    public zzbin(zzbih zzbih) {
        this.zzern = zzbih;
    }

    public final /* synthetic */ Object get() {
        return (WeakReference) zzelu.zza(this.zzern.zzadf(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
