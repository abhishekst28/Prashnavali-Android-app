package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzmg extends zzmj {
    public static final Parcelable.Creator<zzmg> CREATOR = new zzmf();
    private final String description;
    private final String mimeType;
    private final int zzbdd;
    private final byte[] zzbde;

    public zzmg(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.mimeType = str;
        this.description = null;
        this.zzbdd = 3;
        this.zzbde = bArr;
    }

    zzmg(Parcel parcel) {
        super("APIC");
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.zzbdd = parcel.readInt();
        this.zzbde = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzmg zzmg = (zzmg) obj;
        if (this.zzbdd != zzmg.zzbdd || !zzpq.zza(this.mimeType, zzmg.mimeType) || !zzpq.zza(this.description, zzmg.description) || !Arrays.equals(this.zzbde, zzmg.zzbde)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = (this.zzbdd + 527) * 31;
        String str = this.mimeType;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.zzbde);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.zzbdd);
        parcel.writeByteArray(this.zzbde);
    }
}
