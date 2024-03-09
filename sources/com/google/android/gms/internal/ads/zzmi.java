package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzmi extends zzmj {
    public static final Parcelable.Creator<zzmi> CREATOR = new zzmh();
    public final String description;
    public final String text;
    private final String zzahp;

    public zzmi(String str, String str2, String str3) {
        super("COMM");
        this.zzahp = str;
        this.description = str2;
        this.text = str3;
    }

    zzmi(Parcel parcel) {
        super("COMM");
        this.zzahp = parcel.readString();
        this.description = parcel.readString();
        this.text = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzmi zzmi = (zzmi) obj;
        if (!zzpq.zza(this.description, zzmi.description) || !zzpq.zza(this.zzahp, zzmi.zzahp) || !zzpq.zza(this.text, zzmi.text)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.zzahp;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzagt);
        parcel.writeString(this.zzahp);
        parcel.writeString(this.text);
    }
}
