package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddp implements zzden<zzddm> {
    private final ScheduledExecutorService zzflf;
    private final zzdln zzfqn;
    private final zzdvw zzgay;
    private final zzcws zzgoe;
    private String zzgrv;
    private final zzcwu zzgum;
    private final Context zzvr;

    public zzddp(zzdvw zzdvw, ScheduledExecutorService scheduledExecutorService, String str, zzcwu zzcwu, Context context, zzdln zzdln, zzcws zzcws) {
        this.zzgay = zzdvw;
        this.zzflf = scheduledExecutorService;
        this.zzgrv = str;
        this.zzgum = zzcwu;
        this.zzvr = context;
        this.zzfqn = zzdln;
        this.zzgoe = zzcws;
    }

    public final zzdvt<zzddm> zzaqs() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcps)).booleanValue()) {
            return zzdvl.zza(new zzddo(this), this.zzgay);
        }
        return zzdvl.zzaf(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(String str, List list, Bundle bundle) throws Exception {
        zzbbq zzbbq = new zzbbq();
        this.zzgoe.zzgo(str);
        zzapa zzgp = this.zzgoe.zzgp(str);
        if (zzgp != null) {
            Bundle bundle2 = bundle;
            zzgp.zza(ObjectWrapper.wrap(this.zzvr), this.zzgrv, bundle2, (Bundle) list.get(0), this.zzfqn.zzbpb, (zzapb) new zzcxa(str, zzgp, zzbbq));
            return zzbbq;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzare() {
        Bundle bundle;
        Map<String, List<Bundle>> zzs = this.zzgum.zzs(this.zzgrv, this.zzfqn.zzhbv);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : zzs.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            if (this.zzfqn.zzhbu.zzchc != null) {
                bundle = this.zzfqn.zzhbu.zzchc.getBundle(str);
            } else {
                bundle = null;
            }
            arrayList.add(zzdvc.zzg(zzdvl.zza(new zzddr(this, str, list, bundle), this.zzgay)).zza(((Long) zzwe.zzpu().zzd(zzaat.zzcpr)).longValue(), TimeUnit.MILLISECONDS, this.zzflf).zza(Throwable.class, new zzddq(str), (Executor) this.zzgay));
        }
        return zzdvl.zzk(arrayList).zza(new zzddt(arrayList), this.zzgay);
    }
}
