package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcch implements zzelo<zzqo> {
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<String> zzfne;

    public zzcch(zzelx<zzbbg> zzelx, zzelx<String> zzelx2) {
        this.zzfnd = zzelx;
        this.zzfne = zzelx2;
    }

    public final /* synthetic */ Object get() {
        zzp.zzkp();
        return (zzqo) zzelu.zza(new zzqo(zzayh.zzxo(), this.zzfnd.get(), this.zzfne.get(), new JSONObject(), false, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}
