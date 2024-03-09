package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzaau implements zzadc {
    private final /* synthetic */ zzaap zzcxy;

    zzaau(zzaap zzaap) {
        this.zzcxy = zzaap;
    }

    public final Boolean zzf(String str, boolean z) {
        return Boolean.valueOf(this.zzcxy.zzcld.getBoolean(str, z));
    }

    public final Long getLong(String str, long j) {
        try {
            return Long.valueOf(this.zzcxy.zzcld.getLong(str, j));
        } catch (ClassCastException e) {
            return Long.valueOf((long) this.zzcxy.zzcld.getInt(str, (int) j));
        }
    }

    public final Double zza(String str, double d) {
        return Double.valueOf((double) this.zzcxy.zzcld.getFloat(str, (float) d));
    }

    public final String get(String str, String str2) {
        return this.zzcxy.zzcld.getString(str, str2);
    }
}
