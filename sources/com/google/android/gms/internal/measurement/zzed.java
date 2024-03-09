package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class zzed {
    private final zzek zza;
    private final byte[] zzb;

    private zzed(int i) {
        byte[] bArr = new byte[i];
        this.zzb = bArr;
        this.zza = zzek.zza(bArr);
    }

    public final zzdv zza() {
        this.zza.zzb();
        return new zzef(this.zzb);
    }

    public final zzek zzb() {
        return this.zza;
    }

    /* synthetic */ zzed(int i, zzdu zzdu) {
        this(i);
    }
}
