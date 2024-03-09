package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbkj extends zzxn {
    private final zzbbg zzbpa;
    private final zzawb zzbqm;
    private final zzcji zzfkk;
    private final zzcrf<zzdlx, zzcsn> zzfkl;
    private final zzcwu zzfkm;
    private final zzcmi zzfkn;
    private final zzcjk zzfko;
    private final Context zzvr;
    private boolean zzzh = false;

    zzbkj(Context context, zzbbg zzbbg, zzcji zzcji, zzcrf<zzdlx, zzcsn> zzcrf, zzcwu zzcwu, zzcmi zzcmi, zzawb zzawb, zzcjk zzcjk) {
        this.zzvr = context;
        this.zzbpa = zzbbg;
        this.zzfkk = zzcji;
        this.zzfkl = zzcrf;
        this.zzfkm = zzcwu;
        this.zzfkn = zzcmi;
        this.zzbqm = zzawb;
        this.zzfko = zzcjk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void initialize() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzzh     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "Mobile ads is initialized already."
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)     // Catch:{ all -> 0x005d }
            monitor-exit(r3)
            return
        L_0x000c:
            android.content.Context r0 = r3.zzvr     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaat.initialize(r0)     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaxk r0 = com.google.android.gms.ads.internal.zzp.zzkt()     // Catch:{ all -> 0x005d }
            android.content.Context r1 = r3.zzvr     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzbbg r2 = r3.zzbpa     // Catch:{ all -> 0x005d }
            r0.zzd(r1, r2)     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzss r0 = com.google.android.gms.ads.internal.zzp.zzkv()     // Catch:{ all -> 0x005d }
            android.content.Context r1 = r3.zzvr     // Catch:{ all -> 0x005d }
            r0.initialize(r1)     // Catch:{ all -> 0x005d }
            r0 = 1
            r3.zzzh = r0     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzcmi r0 = r3.zzfkn     // Catch:{ all -> 0x005d }
            r0.zzaox()     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcpt     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x005d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.zzcwu r0 = r3.zzfkm     // Catch:{ all -> 0x005d }
            r0.zzanu()     // Catch:{ all -> 0x005d }
        L_0x0044:
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcsf     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x005d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.zzcjk r0 = r3.zzfko     // Catch:{ all -> 0x005d }
            r0.zzanu()     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r3)
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkj.initialize():void");
    }

    public final synchronized void setAppVolume(float f) {
        zzp.zzku().setAppVolume(f);
    }

    public final synchronized float zzqd() {
        return zzp.zzku().zzqd();
    }

    public final synchronized void setAppMuted(boolean z) {
        zzp.zzku().setAppMuted(z);
    }

    public final synchronized boolean zzqe() {
        return zzp.zzku().zzqe();
    }

    public final synchronized void zzch(String str) {
        zzaat.initialize(this.zzvr);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcse)).booleanValue()) {
                zzp.zzkx().zza(this.zzvr, this.zzbpa, str, (Runnable) null);
            }
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzaxy.zzfc("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzaxy.zzfc("Context is null. Failed to open debug menu.");
            return;
        }
        zzayy zzayy = new zzayy(context);
        zzayy.setAdUnitId(str);
        zzayy.zzae(this.zzbpa.zzbra);
        zzayy.showDialog();
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzaat.initialize(this.zzvr);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcsg)).booleanValue()) {
            zzp.zzkp();
            str2 = zzayh.zzbd(this.zzvr);
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean booleanValue = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcse)).booleanValue() | ((Boolean) zzwe.zzpu().zzd(zzaat.zzcoa)).booleanValue();
            zzbkm zzbkm = null;
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcoa)).booleanValue()) {
                booleanValue = true;
                zzbkm = new zzbkm(this, (Runnable) ObjectWrapper.unwrap(iObjectWrapper));
            }
            if (booleanValue) {
                zzp.zzkx().zza(this.zzvr, this.zzbpa, str, (Runnable) zzbkm);
            }
        }
    }

    public final String getVersionString() {
        return this.zzbpa.zzbra;
    }

    public final void zzci(String str) {
        this.zzfkm.zzgq(str);
    }

    public final void zza(zzamu zzamu) throws RemoteException {
        this.zzfkk.zzb(zzamu);
    }

    public final void zza(zzaim zzaim) throws RemoteException {
        this.zzfkn.zzb(zzaim);
    }

    public final List<zzaif> zzqf() throws RemoteException {
        return this.zzfkn.zzaoy();
    }

    public final void zza(zzzw zzzw) throws RemoteException {
        this.zzbqm.zza(this.zzvr, zzzw);
    }

    public final void zzqg() {
        this.zzfkn.disable();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map<String, zzamp> zzwr = zzp.zzkt().zzwj().zzxe().zzwr();
        if (zzwr != null && !zzwr.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzaxy.zzd("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.zzfkk.zzans()) {
                HashMap hashMap = new HashMap();
                for (zzamp zzamp : zzwr.values()) {
                    for (zzamq next : zzamp.zzdiq) {
                        String str = next.zzdjv;
                        for (String next2 : next.zzdjn) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        zzcrg<zzdlx, zzcsn> zzf = this.zzfkl.zzf(str2, jSONObject);
                        if (zzf != null) {
                            zzdlx zzdlx = (zzdlx) zzf.zzdkn;
                            if (!zzdlx.isInitialized()) {
                                if (zzdlx.zztt()) {
                                    zzdlx.zza(this.zzvr, (zzaua) (zzcsn) zzf.zzglc, (List<String>) (List) entry.getValue());
                                    String valueOf = String.valueOf(str2);
                                    zzaxy.zzef(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (zzdlr e) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        zzaxy.zzd(sb.toString(), e);
                    }
                }
            }
        }
    }
}
