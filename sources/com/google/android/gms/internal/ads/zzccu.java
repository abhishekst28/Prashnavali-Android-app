package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzccu {
    private zzadr zzcki;

    public zzccu(zzccm zzccm) {
        this.zzcki = zzccm;
    }

    public final synchronized zzadr zzss() {
        return this.zzcki;
    }

    public final synchronized void zza(zzadr zzadr) {
        this.zzcki = zzadr;
    }
}
