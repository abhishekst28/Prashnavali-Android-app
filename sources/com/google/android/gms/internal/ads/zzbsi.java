package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbsi implements zzelo<Bundle> {
    private final zzbsg zzfsm;

    private zzbsi(zzbsg zzbsg) {
        this.zzfsm = zzbsg;
    }

    public static zzbsi zzi(zzbsg zzbsg) {
        return new zzbsi(zzbsg);
    }

    public static Bundle zzj(zzbsg zzbsg) {
        return zzbsg.zzajh();
    }

    public final /* synthetic */ Object get() {
        return this.zzfsm.zzajh();
    }
}
