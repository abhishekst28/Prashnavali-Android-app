package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzchm implements Callable<zzchc> {
    /* access modifiers changed from: private */
    public final zzbfy zzbpp;
    /* access modifiers changed from: private */
    public final zzbbg zzdpq;
    /* access modifiers changed from: private */
    public final zzeg zzenn;
    /* access modifiers changed from: private */
    public final Executor zzfmk;
    /* access modifiers changed from: private */
    public final zzb zzgbm;
    /* access modifiers changed from: private */
    public final Context zzvr;

    public zzchm(Context context, Executor executor, zzeg zzeg, zzbbg zzbbg, zzb zzb, zzbfy zzbfy) {
        this.zzvr = context;
        this.zzfmk = executor;
        this.zzenn = zzeg;
        this.zzdpq = zzbbg;
        this.zzgbm = zzb;
        this.zzbpp = zzbfy;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzchc zzchc = new zzchc(this);
        zzchc.zzang();
        return zzchc;
    }
}
