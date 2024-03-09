package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzp;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcpj extends zzasf {
    private final Executor zzfmk;
    private final zzatc zzgiy;
    private final zzatd zzgiz;
    private final zzble zzgja;
    private final HashMap<String, zzcpy> zzgjb;
    private final Context zzvr;

    public zzcpj(Context context, Executor executor, zzatc zzatc, zzble zzble, zzatd zzatd, HashMap<String, zzcpy> hashMap) {
        zzaat.initialize(context);
        this.zzvr = context;
        this.zzfmk = executor;
        this.zzgiy = zzatc;
        this.zzgiz = zzatd;
        this.zzgja = zzble;
        this.zzgjb = hashMap;
    }

    public final zzdvt<InputStream> zzb(zzasp zzasp, int i) {
        zzalu zza = zzp.zzlc().zza(this.zzvr, zzbbg.zzyr());
        zzdff zza2 = this.zzgja.zza(zzasp, i);
        zzalm<I, O> zza3 = zza.zza("google.afma.response.normalize", zzcpx.zzgjj, zzalp.zzdht);
        zzcqc zzcqc = new zzcqc(this.zzvr, zzasp.zzdpq.zzbra, this.zzgiy, zzasp.zzdqr, i);
        zzdpf zzafi = zza2.zzafi();
        zzcpy zzcpy = null;
        if (!zzacs.zzdbg.get().booleanValue()) {
            if (zzasp.zzdth != null && !zzasp.zzdth.isEmpty()) {
                zzaxy.zzei("Request contained a PoolKey but split request is disabled.");
            }
        } else if (zzasp.zzdth != null && !zzasp.zzdth.isEmpty() && (zzcpy = this.zzgjb.remove(zzasp.zzdth)) == null) {
            zzaxy.zzei("Request contained a PoolKey but no matching parameters were found.");
        }
        if (zzcpy == null) {
            zzdvt<JSONObject> zza4 = zza(zzasp, zzafi, zza2);
            zzdvt<zzasv> zza5 = zza(zza4, zzafi, zza);
            zzdos zzauz = zzafi.zza(zzdpg.HTTP, (zzdvt<?>[]) new zzdvt[]{zza5, zza4}).zzb(new zzcpm(zza4, zza5)).zzb(zzcqc).zzauz();
            return zzafi.zza(zzdpg.PRE_PROCESS, (zzdvt<?>[]) new zzdvt[]{zza4, zza5, zzauz}).zzb(new zzcpl(zzauz, zza4, zza5)).zza(zza3).zzauz();
        }
        zzdos zzauz2 = zzafi.zza(zzdpg.HTTP, zzdvl.zzaf(new zzcqb(zzcpy.zzgjh, zzcpy.zzgji))).zzb(zzcqc).zzauz();
        zzdvt zzaf = zzdvl.zzaf(zzcpy);
        return zzafi.zza(zzdpg.PRE_PROCESS, (zzdvt<?>[]) new zzdvt[]{zzauz2, zzaf}).zzb(new zzcpo(zzauz2, zzaf)).zza(zza3).zzauz();
    }

    private static zzdvt<JSONObject> zza(zzasp zzasp, zzdpf zzdpf, zzdff zzdff) {
        zzcpn zzcpn = new zzcpn(zzdff);
        return zzdpf.zza(zzdpg.GMS_SIGNALS, zzdvl.zzaf(zzasp.zzdtd)).zza(zzcpn).zzb(zzcpq.zzghg).zzauz();
    }

    private static zzdvt<zzasv> zza(zzdvt<JSONObject> zzdvt, zzdpf zzdpf, zzalu zzalu) {
        return zzdpf.zza(zzdpg.BUILD_URL, zzdvt).zza(zzalu.zza("AFMA_getAdDictionary", zzalp.zzdhs, zzcpp.zzdhu)).zzauz();
    }

    public final void zza(zzasp zzasp, zzasj zzasj) {
        zzdvt<InputStream> zzb = zzb(zzasp, Binder.getCallingUid());
        zza(zzb, zzasj);
        zzb.addListener(new zzcps(this), this.zzfmk);
    }

    public final zzdvt<InputStream> zzc(zzasp zzasp, int i) {
        if (!zzacs.zzdbg.get().booleanValue()) {
            return zzdvl.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        if (zzasp.zzdtg == null) {
            return zzdvl.immediateFailedFuture(new Exception("Pool configuration missing from request."));
        }
        if (zzasp.zzdtg.zzhej == 0 || zzasp.zzdtg.zzhek == 0) {
            return zzdvl.immediateFailedFuture(new Exception("Caching is disabled."));
        }
        zzalu zza = zzp.zzlc().zza(this.zzvr, zzbbg.zzyr());
        zzdff zza2 = this.zzgja.zza(zzasp, i);
        zzdpf zzafi = zza2.zzafi();
        zzdvt<JSONObject> zza3 = zza(zzasp, zzafi, zza2);
        zzdvt<zzasv> zza4 = zza(zza3, zzafi, zza);
        return zzafi.zza(zzdpg.GET_URL_AND_CACHE_KEY, (zzdvt<?>[]) new zzdvt[]{zza3, zza4}).zzb(new zzcpr(this, zza4, zza3)).zzauz();
    }

    public final zzdvt<InputStream> zzgn(String str) {
        if (!zzacs.zzdbg.get().booleanValue()) {
            return zzdvl.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        zzcpw zzcpw = new zzcpw(this);
        if (this.zzgjb.remove(str) != null) {
            return zzdvl.zzaf(zzcpw);
        }
        String valueOf = String.valueOf(str);
        return zzdvl.immediateFailedFuture(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    public final void zzc(zzasp zzasp, zzasj zzasj) {
        zza(zzc(zzasp, Binder.getCallingUid()), zzasj);
    }

    public final void zza(String str, zzasj zzasj) {
        zza(zzgn(str), zzasj);
    }

    public final zzdvt<InputStream> zzd(zzasp zzasp, int i) {
        zzalu zza = zzp.zzlc().zza(this.zzvr, zzbbg.zzyr());
        if (!zzacy.zzdbx.get().booleanValue()) {
            return zzdvl.immediateFailedFuture(new Exception("Signal collection disabled."));
        }
        zzdff zza2 = this.zzgja.zza(zzasp, i);
        zzdem<JSONObject> zzafh = zza2.zzafh();
        return zza2.zzafi().zza(zzdpg.GET_SIGNALS, zzdvl.zzaf(zzasp.zzdtd)).zza(new zzcpu(zzafh)).zzw(zzdpg.JS_SIGNALS).zza(zza.zza("google.afma.request.getSignals", zzalp.zzdhs, zzalp.zzdht)).zzauz();
    }

    public final void zzb(zzasp zzasp, zzasj zzasj) {
        zza(zzd(zzasp, Binder.getCallingUid()), zzasj);
    }

    private final void zza(zzdvt<InputStream> zzdvt, zzasj zzasj) {
        zzdvl.zza(zzdvl.zzb(zzdvt, new zzcpt(this), (Executor) zzbbi.zzedu), new zzcpv(this, zzasj), zzbbi.zzedz);
    }

    public final zzary zza(zzarw zzarw) throws RemoteException {
        return null;
    }

    public final void zza(zzarw zzarw, zzash zzash) throws RemoteException {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zza(zzdvt zzdvt, zzdvt zzdvt2) throws Exception {
        String zzvj = ((zzasv) zzdvt.get()).zzvj();
        this.zzgjb.put(zzvj, new zzcpy((zzasv) zzdvt.get(), (JSONObject) zzdvt2.get()));
        return new ByteArrayInputStream(zzvj.getBytes(zzdsj.UTF_8));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzapm() {
        zzbbm.zza(this.zzgiz.zzvl(), "persistFlags");
    }
}
