package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzbay implements zzbba {
    private final byte[] zzedn;

    zzbay(byte[] bArr) {
        this.zzedn = bArr;
    }

    public final void zzb(JsonWriter jsonWriter) {
        zzbax.zza(this.zzedn, jsonWriter);
    }
}
