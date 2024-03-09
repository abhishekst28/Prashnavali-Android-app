package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzhy {
    public static final zzhy zzahz = new zzib();

    public abstract zzia zza(int i, zzia zzia, boolean z);

    public abstract zzid zza(int i, zzid zzid, boolean z, long j);

    public abstract int zzc(Object obj);

    public abstract int zzfd();

    public abstract int zzfe();

    public final boolean isEmpty() {
        return zzfd() == 0;
    }

    public final zzid zza(int i, zzid zzid, boolean z) {
        return zza(i, zzid, false, 0);
    }

    public final int zza(int i, zzia zzia, zzid zzid, int i2) {
        zza(i, zzia, false);
        zza(0, zzid, false);
        int i3 = 1;
        if (i != 0) {
            return i + 1;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = 0;
            } else if (i2 != 2) {
                throw new IllegalStateException();
            } else if (zzfd() - 1 == 0) {
                i3 = 0;
            }
        } else if (zzfd() - 1 == 0) {
            i3 = -1;
        }
        if (i3 == -1) {
            return -1;
        }
        zza(i3, zzid, false);
        return 0;
    }
}
