package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzta extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzta> CREATOR = new zzsz();
    public final String url;
    private final long zzbuz;
    private final String zzbva;
    private final String zzbvb;
    private final String zzbvc;
    private final Bundle zzbvd;
    public final boolean zzbve;
    public long zzbvf;

    public static zzta zzbw(String str) {
        return zzd(Uri.parse(str));
    }

    public static zzta zzd(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                zzaxy.zzfe(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter(ImagesContract.URL);
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            zzp.zzkr();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri.getQueryParameter(next));
                }
            }
            return new zzta(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e) {
            zzaxy.zzd("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    zzta(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.url = str;
        this.zzbuz = j;
        this.zzbva = str2 == null ? "" : str2;
        this.zzbvb = str3 == null ? "" : str3;
        this.zzbvc = str4 == null ? "" : str4;
        this.zzbvd = bundle == null ? new Bundle() : bundle;
        this.zzbve = z;
        this.zzbvf = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.url, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzbuz);
        SafeParcelWriter.writeString(parcel, 4, this.zzbva, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbvb, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzbvc, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzbvd, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbve);
        SafeParcelWriter.writeLong(parcel, 9, this.zzbvf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
