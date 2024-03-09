package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzaxt {
    private String zzdpz = "0";
    private BigInteger zzdzd = BigInteger.ONE;

    public final synchronized String zzwt() {
        String bigInteger;
        bigInteger = this.zzdzd.toString();
        this.zzdzd = this.zzdzd.add(BigInteger.ONE);
        this.zzdpz = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzwu() {
        return this.zzdpz;
    }
}
