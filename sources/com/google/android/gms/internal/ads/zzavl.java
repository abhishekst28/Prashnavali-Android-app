package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzekj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzavl implements zzavu {
    /* access modifiers changed from: private */
    public static List<Future<Void>> zzdvs = Collections.synchronizedList(new ArrayList());
    private final Object lock = new Object();
    private final zzavt zzdsm;
    private final zzekj.zzb.zza zzdvt;
    private final LinkedHashMap<String, zzekj.zzb.zzh.C0014zzb> zzdvu;
    private final List<String> zzdvv = new ArrayList();
    private final List<String> zzdvw = new ArrayList();
    private final zzavw zzdvx;
    private boolean zzdvy;
    private final zzavz zzdvz;
    private HashSet<String> zzdwa = new HashSet<>();
    private boolean zzdwb = false;
    private boolean zzdwc = false;
    private boolean zzdwd = false;
    private final Context zzvr;

    public zzavl(Context context, zzbbg zzbbg, zzavt zzavt, String str, zzavw zzavw) {
        Preconditions.checkNotNull(zzavt, "SafeBrowsing config is not present.");
        this.zzvr = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdvu = new LinkedHashMap<>();
        this.zzdvx = zzavw;
        this.zzdsm = zzavt;
        for (String lowerCase : zzavt.zzdwl) {
            this.zzdwa.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.zzdwa.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzekj.zzb.zza zzbiq = zzekj.zzb.zzbiq();
        zzbiq.zza(zzekj.zzb.zzg.OCTAGON_AD);
        zzbiq.zzhy(str);
        zzbiq.zzhz(str);
        zzekj.zzb.C0010zzb.zza zzbis = zzekj.zzb.C0010zzb.zzbis();
        if (this.zzdsm.zzdwh != null) {
            zzbis.zzic(this.zzdsm.zzdwh);
        }
        zzbiq.zza((zzekj.zzb.C0010zzb) ((zzegp) zzbis.zzbfx()));
        zzekj.zzb.zzi.zza zzbx = zzekj.zzb.zzi.zzbjg().zzbx(Wrappers.packageManager(this.zzvr).isCallerInstantApp());
        if (zzbbg.zzbra != null) {
            zzbx.zzij(zzbbg.zzbra);
        }
        long apkVersion = (long) GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzvr);
        if (apkVersion > 0) {
            zzbx.zzfu(apkVersion);
        }
        zzbiq.zza((zzekj.zzb.zzi) ((zzegp) zzbx.zzbfx()));
        this.zzdvt = zzbiq;
        this.zzdvz = new zzavz(this.zzvr, this.zzdsm.zzdwo, this);
    }

    public final zzavt zzvn() {
        return this.zzdsm;
    }

    public final void zzea(String str) {
        synchronized (this.lock) {
            if (str == null) {
                this.zzdvt.zzbio();
            } else {
                this.zzdvt.zzia(str);
            }
        }
    }

    public final boolean zzvo() {
        return PlatformVersion.isAtLeastKitKat() && this.zzdsm.zzdwj && !this.zzdwc;
    }

    public final void zzl(View view) {
        if (this.zzdsm.zzdwj && !this.zzdwc) {
            zzp.zzkp();
            Bitmap zzn = zzayh.zzn(view);
            if (zzn == null) {
                zzavv.zzef("Failed to capture the webview bitmap.");
                return;
            }
            this.zzdwc = true;
            zzayh.zzc(new zzavk(this, zzn));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.zzdwd = r2     // Catch:{ all -> 0x00bd }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzekj$zzb$zzh$zzb> r2 = r6.zzdvu     // Catch:{ all -> 0x00bd }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x0024
            if (r9 != r1) goto L_0x0022
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzekj$zzb$zzh$zzb> r8 = r6.zzdvu     // Catch:{ all -> 0x00bd }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzekj$zzb$zzh$zzb r7 = (com.google.android.gms.internal.ads.zzekj.zzb.zzh.C0014zzb) r7     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzekj$zzb$zzh$zza r8 = com.google.android.gms.internal.ads.zzekj.zzb.zzh.zza.zzhw(r9)     // Catch:{ all -> 0x00bd }
            r7.zzb((com.google.android.gms.internal.ads.zzekj.zzb.zzh.zza) r8)     // Catch:{ all -> 0x00bd }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return
        L_0x0024:
            com.google.android.gms.internal.ads.zzekj$zzb$zzh$zzb r1 = com.google.android.gms.internal.ads.zzekj.zzb.zzh.zzbje()     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzekj$zzb$zzh$zza r9 = com.google.android.gms.internal.ads.zzekj.zzb.zzh.zza.zzhw(r9)     // Catch:{ all -> 0x00bd }
            if (r9 == 0) goto L_0x0031
            r1.zzb((com.google.android.gms.internal.ads.zzekj.zzb.zzh.zza) r9)     // Catch:{ all -> 0x00bd }
        L_0x0031:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzekj$zzb$zzh$zzb> r9 = r6.zzdvu     // Catch:{ all -> 0x00bd }
            int r9 = r9.size()     // Catch:{ all -> 0x00bd }
            r1.zzhx(r9)     // Catch:{ all -> 0x00bd }
            r1.zzih(r7)     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzekj$zzb$zzd$zza r9 = com.google.android.gms.internal.ads.zzekj.zzb.zzd.zzbiw()     // Catch:{ all -> 0x00bd }
            java.util.HashSet<java.lang.String> r2 = r6.zzdwa     // Catch:{ all -> 0x00bd }
            int r2 = r2.size()     // Catch:{ all -> 0x00bd }
            if (r2 <= 0) goto L_0x00ab
            if (r8 == 0) goto L_0x00ab
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00bd }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00bd }
        L_0x0053:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x00ab
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00bd }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00bd }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00bd }
            goto L_0x006e
        L_0x006c:
            java.lang.String r3 = ""
        L_0x006e:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x007b
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00bd }
            goto L_0x007d
        L_0x007b:
            java.lang.String r2 = ""
        L_0x007d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00bd }
            java.util.HashSet<java.lang.String> r5 = r6.zzdwa     // Catch:{ all -> 0x00bd }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.zzekj$zzb$zzc$zza r4 = com.google.android.gms.internal.ads.zzekj.zzb.zzc.zzbiu()     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzeff r3 = com.google.android.gms.internal.ads.zzeff.zzhu(r3)     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzekj$zzb$zzc$zza r3 = r4.zzan(r3)     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzeff r2 = com.google.android.gms.internal.ads.zzeff.zzhu(r2)     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzekj$zzb$zzc$zza r2 = r3.zzao(r2)     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzehz r2 = r2.zzbfx()     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzegp r2 = (com.google.android.gms.internal.ads.zzegp) r2     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzekj$zzb$zzc r2 = (com.google.android.gms.internal.ads.zzekj.zzb.zzc) r2     // Catch:{ all -> 0x00bd }
            r9.zza(r2)     // Catch:{ all -> 0x00bd }
            goto L_0x0053
        L_0x00ab:
            com.google.android.gms.internal.ads.zzehz r8 = r9.zzbfx()     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzegp r8 = (com.google.android.gms.internal.ads.zzegp) r8     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ads.zzekj$zzb$zzd r8 = (com.google.android.gms.internal.ads.zzekj.zzb.zzd) r8     // Catch:{ all -> 0x00bd }
            r1.zzb((com.google.android.gms.internal.ads.zzekj.zzb.zzd) r8)     // Catch:{ all -> 0x00bd }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzekj$zzb$zzh$zzb> r8 = r6.zzdvu     // Catch:{ all -> 0x00bd }
            r8.put(r7, r1)     // Catch:{ all -> 0x00bd }
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return
        L_0x00bd:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavl.zza(java.lang.String, java.util.Map, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void zzeb(String str) {
        synchronized (this.lock) {
            this.zzdvv.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzec(String str) {
        synchronized (this.lock) {
            this.zzdvw.add(str);
        }
    }

    public final String[] zza(String[] strArr) {
        return (String[]) this.zzdvz.zzb(strArr).toArray(new String[0]);
    }

    public final void zzvp() {
        this.zzdwb = true;
    }

    private final zzekj.zzb.zzh.C0014zzb zzed(String str) {
        zzekj.zzb.zzh.C0014zzb zzb;
        synchronized (this.lock) {
            zzb = this.zzdvu.get(str);
        }
        return zzb;
    }

    public final void zzvq() {
        synchronized (this.lock) {
            zzdvt<O> zzb = zzdvl.zzb(this.zzdvx.zza(this.zzvr, this.zzdvu.keySet()), new zzavn(this), (Executor) zzbbi.zzedz);
            zzdvt<O> zza = zzdvl.zza(zzb, 10, TimeUnit.SECONDS, zzbbi.zzedx);
            zzdvl.zza(zzb, new zzavo(this, zza), zzbbi.zzedz);
            zzdvs.add(zza);
        }
    }

    private final zzdvt<Void> zzvr() {
        zzdvt<Void> zzb;
        if (!((this.zzdvy && this.zzdsm.zzdwn) || (this.zzdwd && this.zzdsm.zzdwm) || (!this.zzdvy && this.zzdsm.zzdwk))) {
            return zzdvl.zzaf(null);
        }
        synchronized (this.lock) {
            for (zzekj.zzb.zzh.C0014zzb zzbfx : this.zzdvu.values()) {
                this.zzdvt.zza((zzekj.zzb.zzh) ((zzegp) zzbfx.zzbfx()));
            }
            this.zzdvt.zzm(this.zzdvv);
            this.zzdvt.zzn(this.zzdvw);
            if (zzavv.isEnabled()) {
                String url = this.zzdvt.getUrl();
                String zzbin = this.zzdvt.zzbin();
                StringBuilder sb = new StringBuilder(String.valueOf(url).length() + 53 + String.valueOf(zzbin).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(url);
                sb.append("\n  clickUrl: ");
                sb.append(zzbin);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzekj.zzb.zzh next : this.zzdvt.zzbim()) {
                    sb2.append("    [");
                    sb2.append(next.zzbjd());
                    sb2.append("] ");
                    sb2.append(next.getUrl());
                }
                zzavv.zzef(sb2.toString());
            }
            zzdvt<String> zza = new zzazt(this.zzvr).zza(1, this.zzdsm.zzdwi, (Map<String, String>) null, ((zzekj.zzb) ((zzegp) this.zzdvt.zzbfx())).toByteArray());
            if (zzavv.isEnabled()) {
                zza.addListener(zzavm.zzdwe, zzbbi.zzedu);
            }
            zzb = zzdvl.zzb(zza, zzavp.zzdwg, (Executor) zzbbi.zzedz);
        }
        return zzb;
    }

    static final /* synthetic */ Void zzee(String str) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzi(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.lock) {
                            int length = optJSONArray.length();
                            zzekj.zzb.zzh.C0014zzb zzed = zzed(str);
                            if (zzed == null) {
                                String valueOf = String.valueOf(str);
                                zzavv.zzef(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    zzed.zzii(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                boolean z2 = this.zzdvy;
                                if (length > 0) {
                                    z = true;
                                }
                                this.zzdvy = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (zzacu.zzdbp.get().booleanValue()) {
                    zzaxy.zzb("Failed to get SafeBrowsing metadata", e);
                }
                return zzdvl.immediateFailedFuture(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zzdvy) {
            synchronized (this.lock) {
                this.zzdvt.zza(zzekj.zzb.zzg.OCTAGON_AD_SB_MATCH);
            }
        }
        return zzvr();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Bitmap bitmap) {
        zzefo zzbdm = zzeff.zzbdm();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzbdm);
        synchronized (this.lock) {
            this.zzdvt.zza((zzekj.zzb.zzf) ((zzegp) zzekj.zzb.zzf.zzbjb().zzaq(zzbdm.zzbda()).zzie("image/png").zza(zzekj.zzb.zzf.C0013zzb.TYPE_CREATIVE).zzbfx()));
        }
    }
}
