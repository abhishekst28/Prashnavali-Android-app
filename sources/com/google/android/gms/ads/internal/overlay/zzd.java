package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zza();
    public final Intent intent;
    public final String mimeType;
    public final String packageName;
    public final String url;
    private final String zzdof;
    public final String zzdog;
    public final String zzdoh;
    private final String zzdoi;

    public zzd(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null);
    }

    public zzd(Intent intent2) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent2);
    }

    public zzd(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent2) {
        this.zzdof = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzdog = str5;
        this.zzdoh = str6;
        this.zzdoi = str7;
        this.intent = intent2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdof, false);
        SafeParcelWriter.writeString(parcel, 3, this.url, false);
        SafeParcelWriter.writeString(parcel, 4, this.mimeType, false);
        SafeParcelWriter.writeString(parcel, 5, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzdog, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdoh, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzdoi, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.intent, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
