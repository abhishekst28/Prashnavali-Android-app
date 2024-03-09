package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdkd implements zzcxy<zzchu> {
    /* access modifiers changed from: private */
    public final Executor zzfmk;
    private final zzdli zzfsl;
    private final zzdlp zzgps;
    private final zzbii zzgrp;
    private final Context zzgwv;
    /* access modifiers changed from: private */
    public final zzdiz<zzchx, zzchu> zzgwx;
    /* access modifiers changed from: private */
    public final zzdje zzgzn;
    private zzdvt<zzchu> zzgzo;

    public zzdkd(Context context, Executor executor, zzbii zzbii, zzdiz<zzchx, zzchu> zzdiz, zzdje zzdje, zzdlp zzdlp, zzdli zzdli) {
        this.zzgwv = context;
        this.zzfmk = executor;
        this.zzgrp = zzbii;
        this.zzgwx = zzdiz;
        this.zzgzn = zzdje;
        this.zzgps = zzdlp;
        this.zzfsl = zzdli;
    }

    public final boolean isLoading() {
        zzdvt<zzchu> zzdvt = this.zzgzo;
        return zzdvt != null && !zzdvt.isDone();
    }

    public final boolean zza(zzvc zzvc, String str, zzcxx zzcxx, zzcya<? super zzchu> zzcya) throws RemoteException {
        String str2;
        zzatz zzatz = new zzatz(zzvc, str);
        if (zzcxx instanceof zzdka) {
            str2 = ((zzdka) zzcxx).zzgzl;
        } else {
            str2 = null;
        }
        if (zzatz.zzbuo == null) {
            zzaxy.zzfc("Ad unit ID should not be null for rewarded video ad.");
            this.zzfmk.execute(new zzdkc(this));
            return false;
        }
        zzdvt<zzchu> zzdvt = this.zzgzo;
        if (zzdvt != null && !zzdvt.isDone()) {
            return false;
        }
        zzdly.zze(this.zzgwv, zzatz.zzdpw.zzcgy);
        zzdln zzasu = this.zzgps.zzgt(zzatz.zzbuo).zze(zzvj.zzpj()).zzh(zzatz.zzdpw).zzasu();
        zzdkj zzdkj = new zzdkj((zzdke) null);
        zzdkj.zzfqn = zzasu;
        zzdkj.zzgzl = str2;
        zzdvt<zzchu> zza = this.zzgwx.zza(new zzdja(zzdkj), new zzdkf(this));
        this.zzgzo = zza;
        zzdvl.zza(zza, new zzdke(this, zzcya, zzdkj), this.zzfmk);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void zzea(int i) {
        this.zzgps.zzast().zzeb(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzcia zze(zzdiy zzdiy) {
        zzdkj zzdkj = (zzdkj) zzdiy;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxq)).booleanValue()) {
            return this.zzgrp.zzadv().zze(new zzbsg.zza().zzcd(this.zzgwv).zza(zzdkj.zzfqn).zzfx(zzdkj.zzgzl).zza(this.zzfsl).zzajj()).zze(new zzbxj.zza().zzake());
        }
        zzdje zzb = zzdje.zzb(this.zzgzn);
        return this.zzgrp.zzadv().zze(new zzbsg.zza().zzcd(this.zzgwv).zza(zzdkj.zzfqn).zzfx(zzdkj.zzgzl).zza(this.zzfsl).zzajj()).zze(new zzbxj.zza().zza((zzbsu) zzb, this.zzfmk).zza((zzbuj) zzb, this.zzfmk).zza((zzbsz) zzb, this.zzfmk).zza((AdMetadataListener) zzb, this.zzfmk).zza((zzbti) zzb, this.zzfmk).zza((zzbuy) zzb, this.zzfmk).zza((zzdiw) zzb).zzake());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzasi() {
        this.zzgzn.zzg(zzdmb.zza(zzdmd.zzhct, (String) null, (zzuw) null));
    }
}
