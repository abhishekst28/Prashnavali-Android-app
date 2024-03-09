package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzbaw implements zzbba {
    private final String zzdft;
    private final Map zzdfy;
    private final String zzdgb;
    private final byte[] zzedj;

    zzbaw(String str, String str2, Map map, byte[] bArr) {
        this.zzdgb = str;
        this.zzdft = str2;
        this.zzdfy = map;
        this.zzedj = bArr;
    }

    public final void zzb(JsonWriter jsonWriter) {
        zzbax.zza(this.zzdgb, this.zzdft, this.zzdfy, this.zzedj, jsonWriter);
    }
}
