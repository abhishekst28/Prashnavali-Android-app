package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzazl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzazl> CREATOR = new zzazn();
    public final int errorCode;
    public final String zzacm;

    public static zzazl zzc(Throwable th) {
        String str;
        zzuw zze = zzcmt.zze(th);
        if (zzdsw.zzas(th.getMessage())) {
            str = zze.zzcgr;
        } else {
            str = th.getMessage();
        }
        return new zzazl(str, zze.errorCode);
    }

    zzazl(String str, int i) {
        this.zzacm = str == null ? "" : str;
        this.errorCode = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzacm, false);
        SafeParcelWriter.writeInt(parcel, 2, this.errorCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
