package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class zzaca<T> {
    private final T zzckv;
    private final String zzcn;
    private final int zzczb;

    public static zzaca<Boolean> zzg(String str, boolean z) {
        return new zzaca<>(str, Boolean.valueOf(z), zzacc.zzczc);
    }

    public static zzaca<Long> zzb(String str, long j) {
        return new zzaca<>(str, Long.valueOf(j), zzacc.zzczd);
    }

    public static zzaca<Double> zzb(String str, double d) {
        return new zzaca<>(str, Double.valueOf(d), zzacc.zzcze);
    }

    public static zzaca<String> zzi(String str, String str2) {
        return new zzaca<>(str, str2, zzacc.zzczf);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [int, java.lang.Integer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected zzaca(java.lang.String r1, T r2, java.lang.Integer r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.zzcn = r1
            r0.zzckv = r2
            r0.zzczb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaca.<init>(java.lang.String, java.lang.Object, int):void");
    }

    public T get() {
        zzadc zzrx = zzadb.zzrx();
        if (zzrx != null) {
            int i = zzabz.zzcza[this.zzczb - 1];
            if (i == 1) {
                return zzrx.zzf(this.zzcn, ((Boolean) this.zzckv).booleanValue());
            }
            if (i == 2) {
                return zzrx.getLong(this.zzcn, ((Long) this.zzckv).longValue());
            }
            if (i == 3) {
                return zzrx.zza(this.zzcn, ((Double) this.zzckv).doubleValue());
            }
            if (i == 4) {
                return zzrx.get(this.zzcn, (String) this.zzckv);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException("Flag is not initialized.");
    }
}
