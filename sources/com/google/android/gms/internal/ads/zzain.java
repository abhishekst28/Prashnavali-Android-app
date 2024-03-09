package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzain implements AdapterStatus {
    private final String description;
    private final int zzdfg;
    private final AdapterStatus.State zzdfh;

    public zzain(AdapterStatus.State state, String str, int i) {
        this.zzdfh = state;
        this.description = str;
        this.zzdfg = i;
    }

    public final AdapterStatus.State getInitializationState() {
        return this.zzdfh;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getLatency() {
        return this.zzdfg;
    }
}
