package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcti implements zzctf<zzcco> {
    private final zzdvw zzgay;
    private final zzcbn zzgmp;
    private final zzcff zzgmq;
    private final zzdma<zzchc> zzgmr;

    public zzcti(zzcbn zzcbn, zzdvw zzdvw, zzcff zzcff, zzdma<zzchc> zzdma) {
        this.zzgmp = zzcbn;
        this.zzgay = zzdvw;
        this.zzgmq = zzcff;
        this.zzgmr = zzdma;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return (zzdkx.zzhao == null || zzdkx.zzhao.zzfvr == null) ? false : true;
    }

    public final zzdvt<List<zzdvt<zzcco>>> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        return zzdvl.zzb(zzdvl.zzb(this.zzgmr.zzasz(), new zzcth(this, zzdkx), (Executor) this.zzgay), new zzctk(this, zzdlj, zzdkx), (Executor) this.zzgay);
    }

    private final zzdvt<zzcco> zzb(zzdlj zzdlj, zzdkx zzdkx, JSONObject jSONObject) {
        zzdvt<zzchc> zzasz = this.zzgmr.zzasz();
        zzdvt<zzccv> zza = this.zzgmq.zza(zzdlj, zzdkx, jSONObject);
        return zzdvl.zzb((zzdvt<? extends V>[]) new zzdvt[]{zzasz, zza}).zza(new zzctl(this, zza, zzasz, zzdlj, zzdkx, jSONObject), this.zzgay);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcco zza(zzdvt zzdvt, zzdvt zzdvt2, zzdlj zzdlj, zzdkx zzdkx, JSONObject jSONObject) throws Exception {
        zzccv zzccv = (zzccv) zzdvt.get();
        zzchc zzchc = (zzchc) zzdvt2.get();
        zzccx zza = this.zzgmp.zza(new zzbpt(zzdlj, zzdkx, (String) null), new zzcdh(zzccv), new zzccc(jSONObject, zzchc));
        zza.zzaeu().zzanf();
        zza.zzaev().zzb(zzchc);
        zza.zzaew().zzl(zzccv.zzals());
        return zza.zzaet();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzchc zzchc, JSONObject jSONObject) throws Exception {
        this.zzgmr.zzd(zzdvl.zzaf(zzchc));
        if (jSONObject.optBoolean("success")) {
            return zzdvl.zzaf(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzalj("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdlj zzdlj, zzdkx zzdkx, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcq));
        }
        if (zzdlj.zzhbp.zzfqn.zzgra <= 1) {
            return zzdvl.zzb(zzb(zzdlj, zzdkx, jSONArray.getJSONObject(0)), zzctm.zzdwg, (Executor) this.zzgay);
        }
        int length = jSONArray.length();
        this.zzgmr.zzed(Math.min(length, zzdlj.zzhbp.zzfqn.zzgra));
        ArrayList arrayList = new ArrayList(zzdlj.zzhbp.zzfqn.zzgra);
        for (int i = 0; i < zzdlj.zzhbp.zzfqn.zzgra; i++) {
            if (i < length) {
                arrayList.add(zzb(zzdlj, zzdkx, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcq)));
            }
        }
        return zzdvl.zzaf(arrayList);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdkx zzdkx, zzchc zzchc) throws Exception {
        JSONObject zza = zzbab.zza("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", zzdkx.zzhao.zzfvr);
        jSONObject.put("sdk_params", zza);
        return zzdvl.zzb(zzchc.zzc("google.afma.nativeAds.preProcessJson", jSONObject), new zzctj(this, zzchc), (Executor) this.zzgay);
    }
}
