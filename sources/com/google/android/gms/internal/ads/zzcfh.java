package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcfh implements Callable {
    private final zzdvt zzfqe;
    private final zzdvt zzfsi;
    private final zzcff zzgbb;
    private final zzdvt zzgbc;
    private final zzdvt zzgbd;
    private final zzdvt zzgbe;
    private final JSONObject zzgbf;
    private final zzdvt zzgbg;
    private final zzdvt zzgbh;
    private final zzdvt zzgbi;

    zzcfh(zzcff zzcff, zzdvt zzdvt, zzdvt zzdvt2, zzdvt zzdvt3, zzdvt zzdvt4, zzdvt zzdvt5, JSONObject jSONObject, zzdvt zzdvt6, zzdvt zzdvt7, zzdvt zzdvt8) {
        this.zzgbb = zzcff;
        this.zzfsi = zzdvt;
        this.zzfqe = zzdvt2;
        this.zzgbc = zzdvt3;
        this.zzgbd = zzdvt4;
        this.zzgbe = zzdvt5;
        this.zzgbf = jSONObject;
        this.zzgbg = zzdvt6;
        this.zzgbh = zzdvt7;
        this.zzgbi = zzdvt8;
    }

    public final Object call() {
        zzdvt zzdvt = this.zzfsi;
        zzdvt zzdvt2 = this.zzfqe;
        zzdvt zzdvt3 = this.zzgbc;
        zzdvt zzdvt4 = this.zzgbd;
        zzdvt zzdvt5 = this.zzgbe;
        JSONObject jSONObject = this.zzgbf;
        zzdvt zzdvt6 = this.zzgbg;
        zzdvt zzdvt7 = this.zzgbh;
        zzdvt zzdvt8 = this.zzgbi;
        zzccv zzccv = (zzccv) zzdvt.get();
        zzccv.setImages((List) zzdvt2.get());
        zzccv.zza((zzadw) zzdvt3.get());
        zzccv.zzb((zzadw) zzdvt4.get());
        zzccv.zza((zzado) zzdvt5.get());
        zzccv.zzh(zzcfj.zzj(jSONObject));
        zzccv.zza(zzcfj.zzk(jSONObject));
        zzbfq zzbfq = (zzbfq) zzdvt6.get();
        if (zzbfq != null) {
            zzccv.zzi(zzbfq);
            zzccv.zzac(zzbfq.getView());
            zzccv.zzb((zzyg) zzbfq.zzzo());
        }
        zzbfq zzbfq2 = (zzbfq) zzdvt7.get();
        if (zzbfq2 != null) {
            zzccv.zzj(zzbfq2);
        }
        for (zzcfy zzcfy : (List) zzdvt8.get()) {
            int i = zzcfy.type;
            if (i == 1) {
                zzccv.zzn(zzcfy.zzcn, zzcfy.zzgbw);
            } else if (i == 2) {
                zzccv.zza(zzcfy.zzcn, zzcfy.zzgbx);
            }
        }
        return zzccv;
    }
}
