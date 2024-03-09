package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdqd extends zzdqc {
    private final String zzhix;
    private final boolean zzxj;
    private final boolean zzzf;

    private zzdqd(String str, boolean z, boolean z2) {
        this.zzhix = str;
        this.zzxj = z;
        this.zzzf = z2;
    }

    public final String zzavb() {
        return this.zzhix;
    }

    public final boolean zzavc() {
        return this.zzxj;
    }

    public final boolean zzcm() {
        return this.zzzf;
    }

    public final String toString() {
        String str = this.zzhix;
        boolean z = this.zzxj;
        boolean z2 = this.zzzf;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdqc)) {
            return false;
        }
        zzdqc zzdqc = (zzdqc) obj;
        if (this.zzhix.equals(zzdqc.zzavb()) && this.zzxj == zzdqc.zzavc() && this.zzzf == zzdqc.zzcm()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.zzhix.hashCode() ^ 1000003) * 1000003) ^ (this.zzxj ? 1231 : 1237)) * 1000003;
        if (!this.zzzf) {
            i = 1237;
        }
        return hashCode ^ i;
    }
}
