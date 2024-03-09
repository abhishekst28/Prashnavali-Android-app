package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcmi {
    private boolean enabled = true;
    /* access modifiers changed from: private */
    public final Executor executor;
    private final zzbbg zzbop;
    private final Context zzcle;
    private final Executor zzfmk;
    private final ScheduledExecutorService zzfnh;
    private boolean zzggb = false;
    /* access modifiers changed from: private */
    public boolean zzggc = false;
    /* access modifiers changed from: private */
    public final long zzggd;
    /* access modifiers changed from: private */
    public final zzbbq<Boolean> zzgge = new zzbbq<>();
    private final WeakReference<Context> zzggf;
    private final zzcji zzggg;
    /* access modifiers changed from: private */
    public final zzcls zzggh;
    private Map<String, zzaif> zzggi = new ConcurrentHashMap();

    public zzcmi(Executor executor2, Context context, WeakReference<Context> weakReference, Executor executor3, zzcji zzcji, ScheduledExecutorService scheduledExecutorService, zzcls zzcls, zzbbg zzbbg) {
        this.zzggg = zzcji;
        this.zzcle = context;
        this.zzggf = weakReference;
        this.executor = executor3;
        this.zzfnh = scheduledExecutorService;
        this.zzfmk = executor2;
        this.zzggh = zzcls;
        this.zzbop = zzbbg;
        this.zzggd = zzp.zzkw().elapsedRealtime();
        zza("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public final void disable() {
        this.enabled = false;
    }

    public final void zzb(zzaim zzaim) {
        this.zzgge.addListener(new zzcmh(this, zzaim), this.zzfmk);
    }

    public final void zzaox() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpy)).booleanValue() && !zzacp.zzdaz.get().booleanValue()) {
            if (this.zzbop.zzedr >= ((Integer) zzwe.zzpu().zzd(zzaat.zzcpz)).intValue() && this.enabled) {
                if (!this.zzggb) {
                    synchronized (this) {
                        if (!this.zzggb) {
                            this.zzggh.zzaou();
                            this.zzgge.addListener(new zzcmk(this), this.executor);
                            this.zzggb = true;
                            zzdvt<String> zzaoz = zzaoz();
                            this.zzfnh.schedule(new zzcmm(this), ((Long) zzwe.zzpu().zzd(zzaat.zzcqb)).longValue(), TimeUnit.SECONDS);
                            zzdvl.zza(zzaoz, new zzcmp(this), this.executor);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zzggb) {
            zza("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zzgge.set(false);
            this.zzggb = true;
        }
    }

    public final List<zzaif> zzaoy() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.zzggi.keySet()) {
            zzaif zzaif = this.zzggi.get(next);
            arrayList.add(new zzaif(next, zzaif.zzdff, zzaif.zzdfg, zzaif.description));
        }
        return arrayList;
    }

    private final synchronized zzdvt<String> zzaoz() {
        String zzwp = zzp.zzkt().zzwj().zzxe().zzwp();
        if (!TextUtils.isEmpty(zzwp)) {
            return zzdvl.zzaf(zzwp);
        }
        zzbbq zzbbq = new zzbbq();
        zzp.zzkt().zzwj().zzb(new zzcmj(this, zzbbq));
        return zzbbq;
    }

    /* access modifiers changed from: private */
    public final void zzgl(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = new Object();
                zzbbq zzbbq = new zzbbq();
                zzdvt zza = zzdvl.zza(zzbbq, ((Long) zzwe.zzpu().zzd(zzaat.zzcqa)).longValue(), TimeUnit.SECONDS, this.zzfnh);
                this.zzggh.zzgj(next);
                long elapsedRealtime = zzp.zzkw().elapsedRealtime();
                Iterator<String> it = keys;
                zzcml zzcml = r1;
                zzcml zzcml2 = new zzcml(this, obj, zzbbq, next, elapsedRealtime);
                zza.addListener(zzcml, this.executor);
                arrayList.add(zza);
                zzcmr zzcmr = new zzcmr(this, obj, next, elapsedRealtime, zzbbq);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzaip(optString, bundle));
                        }
                    } catch (JSONException e) {
                    }
                }
                zza(next, false, "", 0);
                try {
                    this.zzfmk.execute(new zzcmn(this, this.zzggg.zzd(next, new JSONObject()), zzcmr, arrayList2, next));
                    keys = it;
                } catch (zzdlr e2) {
                    try {
                        zzcmr.onInitializationFailed("Failed to create Adapter.");
                        keys = it;
                    } catch (RemoteException e3) {
                        zzbbd.zzc("", e3);
                        keys = it;
                    }
                }
            }
            zzdvl.zzj(arrayList).zza(new zzcmo(this), this.executor);
        } catch (JSONException e4) {
            zzaxy.zza("Malformed CLD response", e4);
        }
    }

    /* access modifiers changed from: private */
    public final void zza(String str, boolean z, String str2, int i) {
        this.zzggi.put(str, new zzaif(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdlx zzdlx, zzaih zzaih, List list, String str) {
        try {
            Context context = (Context) this.zzggf.get();
            if (context == null) {
                context = this.zzcle;
            }
            zzdlx.zza(context, zzaih, (List<zzaip>) list);
        } catch (zzdlr e) {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
                sb.append("Failed to initialize adapter. ");
                sb.append(str);
                sb.append(" does not implement the initialize() method.");
                zzaih.onInitializationFailed(sb.toString());
            } catch (RemoteException e2) {
                zzbbd.zzc("", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzapa() throws Exception {
        this.zzgge.set(true);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzbbq zzbbq, String str, long j) {
        synchronized (obj) {
            if (!zzbbq.isDone()) {
                zza(str, false, "Timeout.", (int) (zzp.zzkw().elapsedRealtime() - j));
                this.zzggh.zzr(str, "timeout");
                zzbbq.set(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzapb() {
        synchronized (this) {
            if (!this.zzggc) {
                zza("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzp.zzkw().elapsedRealtime() - this.zzggd));
                this.zzgge.setException(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbbq zzbbq) {
        this.executor.execute(new zzcmq(this, zzbbq));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzapc() {
        this.zzggh.zzaov();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzaim zzaim) {
        try {
            zzaim.zze(zzaoy());
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
