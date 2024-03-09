package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcdz {
    private final zzcdd zzfwx;
    private final zzchc zzfzs;
    private final zzcih zzfzy;
    private final zzbmj zzfzz;

    public zzcdz(zzcih zzcih, zzchc zzchc, zzbmj zzbmj, zzcdd zzcdd) {
        this.zzfzy = zzcih;
        this.zzfzs = zzchc;
        this.zzfzz = zzbmj;
        this.zzfwx = zzcdd;
    }

    public final View zzamy() throws zzbgc {
        zzbfq zza = this.zzfzy.zza(zzvj.zzpi(), false);
        zza.getView().setVisibility(8);
        zza.zza("/sendMessageToSdk", (zzahf<? super zzbfq>) new zzcec(this));
        zza.zza("/adMuted", (zzahf<? super zzbfq>) new zzceb(this));
        this.zzfzs.zza(new WeakReference(zza), "/loadHtml", new zzcee(this));
        this.zzfzs.zza(new WeakReference(zza), "/showOverlay", new zzced(this));
        this.zzfzs.zza(new WeakReference(zza), "/hideOverlay", new zzceg(this));
        return zza.getView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbfq zzbfq, Map map) {
        zzaxy.zzfd("Hiding native ads overlay.");
        zzbfq.getView().setVisibility(8);
        this.zzfzz.zzbf(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbfq zzbfq, Map map) {
        zzaxy.zzfd("Showing native ads overlay.");
        zzbfq.getView().setVisibility(0);
        this.zzfzz.zzbf(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzfzs.zza("sendMessageToNativeJs", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbfq zzbfq, Map map) {
        this.zzfwx.zzald();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzbfq zzbfq, Map map) {
        this.zzfzs.zza("sendMessageToNativeJs", (Map<String, ?>) map);
    }
}
