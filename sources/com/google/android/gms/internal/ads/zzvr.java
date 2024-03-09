package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class zzvr {
    /* access modifiers changed from: private */
    public final zzva zzcia;
    /* access modifiers changed from: private */
    public final zzvb zzcib;
    /* access modifiers changed from: private */
    public final zzzd zzcic;
    /* access modifiers changed from: private */
    public final zzaga zzcid;
    /* access modifiers changed from: private */
    public final zzatx zzcie;
    private final zzavb zzcif;
    /* access modifiers changed from: private */
    public final zzaqj zzcig;
    /* access modifiers changed from: private */
    public final zzafz zzcih;

    public zzvr(zzva zzva, zzvb zzvb, zzzd zzzd, zzaga zzaga, zzatx zzatx, zzavb zzavb, zzaqj zzaqj, zzafz zzafz) {
        this.zzcia = zzva;
        this.zzcib = zzvb;
        this.zzcic = zzzd;
        this.zzcid = zzaga;
        this.zzcie = zzatx;
        this.zzcif = zzavb;
        this.zzcig = zzaqj;
        this.zzcih = zzafz;
    }

    /* access modifiers changed from: private */
    public static void zza(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzwe.zzpq().zza(context, zzwe.zzpw().zzbra, "gmob-apps", bundle, true);
    }

    public final zzwu zza(Context context, zzvj zzvj, String str, zzamu zzamu) {
        return (zzwu) new zzvx(this, context, zzvj, str, zzamu).zzd(context, false);
    }

    public final zzwr zzb(Context context, String str, zzamu zzamu) {
        return (zzwr) new zzvy(this, context, str, zzamu).zzd(context, false);
    }

    public final zzaea zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzaea) new zzwa(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzaed zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (zzaed) new zzwd(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzaul zzc(Context context, String str, zzamu zzamu) {
        return (zzaul) new zzvt(this, context, str, zzamu).zzd(context, false);
    }

    public final zzaql zzb(Activity activity) {
        zzvs zzvs = new zzvs(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzbbd.zzfc("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzaql) zzvs.zzd(activity, z);
    }

    public final zzawu zza(Context context, zzamu zzamu) {
        return (zzawu) new zzvv(this, context, zzamu).zzd(context, false);
    }
}
