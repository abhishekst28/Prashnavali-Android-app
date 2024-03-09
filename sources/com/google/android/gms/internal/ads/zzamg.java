package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzamg<I, O> implements zzduv<I, O> {
    /* access modifiers changed from: private */
    public final zzalo<O> zzdhy;
    private final zzaln<I> zzdhz;
    private final String zzdia;
    private final zzdvt<zzali> zzdif;

    zzamg(zzdvt<zzali> zzdvt, String str, zzaln<I> zzaln, zzalo<O> zzalo) {
        this.zzdif = zzdvt;
        this.zzdia = str;
        this.zzdhz = zzaln;
        this.zzdhy = zzalo;
    }

    public final zzdvt<O> zzf(I i) throws Exception {
        return zzdvl.zzb(this.zzdif, new zzamf(this, i), (Executor) zzbbi.zzedz);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(Object obj, zzali zzali) throws Exception {
        zzbbq zzbbq = new zzbbq();
        zzp.zzkp();
        String zzxo = zzayh.zzxo();
        zzagp.zzdem.zza(zzxo, (zzahn) new zzami(this, zzbbq));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", zzxo);
        jSONObject.put("args", this.zzdhz.zzj(obj));
        zzali.zza(this.zzdia, jSONObject);
        return zzbbq;
    }
}
