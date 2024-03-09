package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdkl extends zzauk {
    private final String zzbuo;
    private final zzdli zzfsl;
    private final Context zzgpr;
    private final zzdkd zzgzu;
    private final zzdje zzgzv;
    /* access modifiers changed from: private */
    public zzchu zzgzw;

    public zzdkl(String str, zzdkd zzdkd, Context context, zzdje zzdje, zzdli zzdli) {
        this.zzbuo = str;
        this.zzgzu = zzdkd;
        this.zzgzv = zzdje;
        this.zzfsl = zzdli;
        this.zzgpr = context;
    }

    public final synchronized void zza(zzvc zzvc, zzaut zzaut) throws RemoteException {
        zza(zzvc, zzaut, zzdlf.zzhbi);
    }

    public final synchronized void zzb(zzvc zzvc, zzaut zzaut) throws RemoteException {
        zza(zzvc, zzaut, zzdlf.zzhbj);
    }

    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zza(iObjectWrapper, false);
    }

    public final synchronized void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzgzw == null) {
            zzaxy.zzfe("Rewarded can not be shown before loaded");
            this.zzgzv.zzf(zzdmb.zza(zzdmd.zzhcw, (String) null, (zzuw) null));
            return;
        }
        this.zzgzw.zzb(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgzw == null || this.zzgzw.zzaim() == null) {
            return null;
        }
        return this.zzgzw.zzaim().getMediationAdapterClassName();
    }

    public final boolean isLoaded() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzchu zzchu = this.zzgzw;
        return zzchu != null && !zzchu.zzanh();
    }

    public final void zza(zzaum zzaum) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgzv.zzb(zzaum);
    }

    public final void zza(zzauu zzauu) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgzv.zzb(zzauu);
    }

    public final void zza(zzxz zzxz) {
        if (zzxz == null) {
            this.zzgzv.zza((AdMetadataListener) null);
        } else {
            this.zzgzv.zza(new zzdkk(this, zzxz));
        }
    }

    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzchu zzchu = this.zzgzw;
        return zzchu != null ? zzchu.getAdMetadata() : new Bundle();
    }

    public final zzaug zzqw() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzchu zzchu = this.zzgzw;
        if (zzchu != null) {
            return zzchu.zzqw();
        }
        return null;
    }

    public final synchronized void zza(zzavc zzavc) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdli zzdli = this.zzfsl;
        zzdli.zzdve = zzavc.zzdve;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcod)).booleanValue()) {
            zzdli.zzdvf = zzavc.zzdvf;
        }
    }

    public final zzyf zzkg() {
        zzchu zzchu;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwy)).booleanValue() && (zzchu = this.zzgzw) != null) {
            return zzchu.zzaim();
        }
        return null;
    }

    public final void zza(zzya zzya) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzgzv.zzc(zzya);
    }

    private final synchronized void zza(zzvc zzvc, zzaut zzaut, int i) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgzv.zzb(zzaut);
        zzp.zzkp();
        if (zzayh.zzbe(this.zzgpr) && zzvc.zzchi == null) {
            zzaxy.zzfc("Failed to load the ad because app ID is missing.");
            this.zzgzv.zzg(zzdmb.zza(zzdmd.zzhcr, (String) null, (zzuw) null));
        } else if (this.zzgzw == null) {
            zzdka zzdka = new zzdka((String) null);
            this.zzgzu.zzea(i);
            this.zzgzu.zza(zzvc, this.zzbuo, zzdka, new zzdkn(this));
        }
    }
}
