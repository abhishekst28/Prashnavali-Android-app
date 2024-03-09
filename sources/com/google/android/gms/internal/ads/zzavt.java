package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzavt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavt> CREATOR = new zzavs();
    public final String zzdwh;
    public final String zzdwi;
    public final boolean zzdwj;
    public final boolean zzdwk;
    public final List<String> zzdwl;
    public final boolean zzdwm;
    public final boolean zzdwn;
    public final List<String> zzdwo;

    public zzavt(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.zzdwh = str;
        this.zzdwi = str2;
        this.zzdwj = z;
        this.zzdwk = z2;
        this.zzdwl = list;
        this.zzdwm = z3;
        this.zzdwn = z4;
        this.zzdwo = list2 == null ? new ArrayList<>() : list2;
    }

    public static zzavt zzg(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzavt(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzbab.zza(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzbab.zza(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdwh, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdwi, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdwj);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzdwk);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzdwl, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzdwm);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdwn);
        SafeParcelWriter.writeStringList(parcel, 9, this.zzdwo, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
