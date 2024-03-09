package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdhc implements zzcxy<zzbnc> {
    /* access modifiers changed from: private */
    public final Executor zzfmk;
    private final ViewGroup zzfnx;
    private final zzdlp zzgps;
    /* access modifiers changed from: private */
    @Nullable
    public zzdvt<zzbnc> zzgqd;
    private final zzbii zzgrp;
    private final Context zzgwv;
    /* access modifiers changed from: private */
    public final zzdht zzgww;
    /* access modifiers changed from: private */
    public final zzdiz<zzbmw, zzbnc> zzgwx;

    public zzdhc(Context context, Executor executor, zzbii zzbii, zzdiz<zzbmw, zzbnc> zzdiz, zzdht zzdht, zzdlp zzdlp) {
        this.zzgwv = context;
        this.zzfmk = executor;
        this.zzgrp = zzbii;
        this.zzgwx = zzdiz;
        this.zzgww = zzdht;
        this.zzgps = zzdlp;
        this.zzfnx = new FrameLayout(context);
    }

    public final boolean isLoading() {
        zzdvt<zzbnc> zzdvt = this.zzgqd;
        return zzdvt != null && !zzdvt.isDone();
    }

    public final synchronized boolean zza(zzvc zzvc, String str, zzcxx zzcxx, zzcya<? super zzbnc> zzcya) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str == null) {
            zzaxy.zzfc("Ad unit ID should not be null for app open ad.");
            this.zzfmk.execute(new zzdhf(this));
            return false;
        } else if (this.zzgqd != null) {
            return false;
        } else {
            zzdly.zze(this.zzgwv, zzvc.zzcgy);
            zzdln zzasu = this.zzgps.zzgt(str).zze(zzvj.zzpk()).zzh(zzvc).zzasu();
            zzdhj zzdhj = new zzdhj((zzdhh) null);
            zzdhj.zzfqn = zzasu;
            zzdvt<zzbnc> zza = this.zzgwx.zza(new zzdja(zzdhj), new zzdhe(this));
            this.zzgqd = zza;
            zzdvl.zza(zza, new zzdhh(this, zzcya, zzdhj), this.zzfmk);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final synchronized zzbmv zzb(zzdiy zzdiy) {
        zzdhj zzdhj = (zzdhj) zzdiy;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxr)).booleanValue()) {
            return this.zzgrp.zzadr().zza(new zzbnd(this.zzfnx)).zzb(new zzbsg.zza().zzcd(this.zzgwv).zza(zzdhj.zzfqn).zzajj()).zzb(new zzbxj.zza().zzake());
        }
        zzdht zzb = zzdht.zzb(this.zzgww);
        zzbxj.zza zza = new zzbxj.zza();
        zza.zza((zzbsz) zzb, this.zzfmk);
        zza.zza((zzbuo) zzb, this.zzfmk);
        zza.zza((zzdiw) zzb);
        return this.zzgrp.zzadr().zza(new zzbnd(this.zzfnx)).zzb(new zzbsg.zza().zzcd(this.zzgwv).zza(zzdhj.zzfqn).zzajj()).zzb(zza.zzake());
    }

    public final void zza(zzvm zzvm) {
        this.zzgps.zzb(zzvm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzarw() {
        this.zzgww.zzg(zzdmb.zza(zzdmd.zzhct, (String) null, (zzuw) null));
    }
}
