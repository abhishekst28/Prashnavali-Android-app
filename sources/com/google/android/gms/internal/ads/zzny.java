package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzny {
    public final int viewportHeight;
    public final int viewportWidth;
    public final String zzbgy;
    public final String zzbgz;
    public final boolean zzbha;
    public final boolean zzbhb;
    public final int zzbhc;
    public final int zzbhd;
    public final int zzbhe;
    public final boolean zzbhf;
    public final boolean zzbhg;
    public final boolean zzbhh;

    public zzny() {
        this((String) null, (String) null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    private zzny(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.zzbgy = null;
        this.zzbgz = null;
        this.zzbha = false;
        this.zzbhb = true;
        this.zzbhc = Integer.MAX_VALUE;
        this.zzbhd = Integer.MAX_VALUE;
        this.zzbhe = Integer.MAX_VALUE;
        this.zzbhf = true;
        this.zzbhg = true;
        this.viewportWidth = Integer.MAX_VALUE;
        this.viewportHeight = Integer.MAX_VALUE;
        this.zzbhh = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzny zzny = (zzny) obj;
        if (this.zzbhb == zzny.zzbhb && this.zzbhc == zzny.zzbhc && this.zzbhd == zzny.zzbhd && this.zzbhf == zzny.zzbhf && this.zzbhg == zzny.zzbhg && this.zzbhh == zzny.zzbhh && this.viewportWidth == zzny.viewportWidth && this.viewportHeight == zzny.viewportHeight && this.zzbhe == zzny.zzbhe && TextUtils.equals((CharSequence) null, (CharSequence) null) && TextUtils.equals((CharSequence) null, (CharSequence) null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.zzbhb ? 1 : 0)) * 31) + this.zzbhc) * 31) + this.zzbhd) * 31) + this.zzbhe) * 31) + (this.zzbhf ? 1 : 0)) * 31) + (this.zzbhg ? 1 : 0)) * 31) + (this.zzbhh ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight;
    }
}
