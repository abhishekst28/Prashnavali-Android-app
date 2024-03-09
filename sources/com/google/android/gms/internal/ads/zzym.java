package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzym extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzym> CREATOR = new zzyp();
    private final int zzcjb;

    public zzym(int i) {
        this.zzcjb = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzcjb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
