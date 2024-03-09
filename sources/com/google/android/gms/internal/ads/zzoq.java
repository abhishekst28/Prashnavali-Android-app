package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzoq implements zzok {
    private final boolean zzbir;
    private final int zzbis;
    private final byte[] zzbit;
    private final zzoh[] zzbiu;
    private int zzbiv;
    private int zzbiw;
    private int zzbix;
    private zzoh[] zzbiy;

    public zzoq(boolean z, int i) {
        this(true, 65536, 0);
    }

    private zzoq(boolean z, int i, int i2) {
        zzoz.checkArgument(true);
        zzoz.checkArgument(true);
        this.zzbir = true;
        this.zzbis = 65536;
        this.zzbix = 0;
        this.zzbiy = new zzoh[100];
        this.zzbit = null;
        this.zzbiu = new zzoh[1];
    }

    public final synchronized void reset() {
        if (this.zzbir) {
            zzbi(0);
        }
    }

    public final synchronized void zzbi(int i) {
        boolean z = i < this.zzbiv;
        this.zzbiv = i;
        if (z) {
            zzn();
        }
    }

    public final synchronized zzoh zzil() {
        zzoh zzoh;
        this.zzbiw++;
        if (this.zzbix > 0) {
            zzoh[] zzohArr = this.zzbiy;
            int i = this.zzbix - 1;
            this.zzbix = i;
            zzoh = zzohArr[i];
            this.zzbiy[i] = null;
        } else {
            zzoh = new zzoh(new byte[this.zzbis], 0);
        }
        return zzoh;
    }

    public final synchronized void zza(zzoh zzoh) {
        this.zzbiu[0] = zzoh;
        zza(this.zzbiu);
    }

    public final synchronized void zza(zzoh[] zzohArr) {
        boolean z;
        if (this.zzbix + zzohArr.length >= this.zzbiy.length) {
            this.zzbiy = (zzoh[]) Arrays.copyOf(this.zzbiy, Math.max(this.zzbiy.length << 1, this.zzbix + zzohArr.length));
        }
        for (zzoh zzoh : zzohArr) {
            if (zzoh.data != null) {
                if (zzoh.data.length != this.zzbis) {
                    z = false;
                    zzoz.checkArgument(z);
                    zzoh[] zzohArr2 = this.zzbiy;
                    int i = this.zzbix;
                    this.zzbix = i + 1;
                    zzohArr2[i] = zzoh;
                }
            }
            z = true;
            zzoz.checkArgument(z);
            zzoh[] zzohArr22 = this.zzbiy;
            int i2 = this.zzbix;
            this.zzbix = i2 + 1;
            zzohArr22[i2] = zzoh;
        }
        this.zzbiw -= zzohArr.length;
        notifyAll();
    }

    public final synchronized void zzn() {
        int max = Math.max(0, zzpq.zzf(this.zzbiv, this.zzbis) - this.zzbiw);
        if (max < this.zzbix) {
            Arrays.fill(this.zzbiy, max, this.zzbix, (Object) null);
            this.zzbix = max;
        }
    }

    public final synchronized int zzip() {
        return this.zzbiw * this.zzbis;
    }

    public final int zzim() {
        return this.zzbis;
    }
}
