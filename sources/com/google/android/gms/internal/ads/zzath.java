package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzath extends zzati {
    private final String type;
    private final int zzdva;

    public zzath(String str, int i) {
        this.type = str;
        this.zzdva = i;
    }

    public final String getType() {
        return this.type;
    }

    public final int getAmount() {
        return this.zzdva;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzath)) {
            return false;
        }
        zzath zzath = (zzath) obj;
        if (!Objects.equal(this.type, zzath.type) || !Objects.equal(Integer.valueOf(this.zzdva), Integer.valueOf(zzath.zzdva))) {
            return false;
        }
        return true;
    }
}
