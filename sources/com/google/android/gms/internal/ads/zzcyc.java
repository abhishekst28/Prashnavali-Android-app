package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcyc implements zzcxy<zzbpd> {
    /* access modifiers changed from: private */
    public final zzbii zzgmy;
    private final Context zzgpr;
    private final zzdlp zzgps;
    /* access modifiers changed from: private */
    public final zzcxw zzgrc;
    private zzbpo zzgrd;

    public zzcyc(zzbii zzbii, Context context, zzcxw zzcxw, zzdlp zzdlp) {
        this.zzgmy = zzbii;
        this.zzgpr = context;
        this.zzgrc = zzcxw;
        this.zzgps = zzdlp;
    }

    public final boolean isLoading() {
        zzbpo zzbpo = this.zzgrd;
        return zzbpo != null && zzbpo.isLoading();
    }

    public final boolean zza(zzvc zzvc, String str, zzcxx zzcxx, zzcya<? super zzbpd> zzcya) throws RemoteException {
        int i;
        zzcbn zzcbn;
        zzp.zzkp();
        if (zzayh.zzbe(this.zzgpr) && zzvc.zzchi == null) {
            zzaxy.zzfc("Failed to load the ad because app ID is missing.");
            this.zzgmy.zzadj().execute(new zzcyb(this));
            return false;
        } else if (str == null) {
            zzaxy.zzfc("Ad unit ID should not be null for NativeAdLoader.");
            this.zzgmy.zzadj().execute(new zzcye(this));
            return false;
        } else {
            zzdly.zze(this.zzgpr, zzvc.zzcgy);
            if (zzcxx instanceof zzcxz) {
                i = ((zzcxz) zzcxx).zzgra;
            } else {
                i = 1;
            }
            zzdln zzasu = this.zzgps.zzh(zzvc).zzec(i).zzasu();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxt)).booleanValue()) {
                zzcbn = this.zzgmy.zzadu().zza(new zzbsg.zza().zzcd(this.zzgpr).zza(zzasu).zzajj()).zza(new zzbxj.zza().zzake()).zza(this.zzgrc.zzaqf()).zzaek();
            } else {
                zzcbn = this.zzgmy.zzadu().zza(new zzbsg.zza().zzcd(this.zzgpr).zza(zzasu).zzajj()).zza(new zzbxj.zza().zza(this.zzgrc.zzaqi(), this.zzgmy.zzadj()).zza(this.zzgrc.zzaqj(), this.zzgmy.zzadj()).zza(this.zzgrc.zzaqk(), this.zzgmy.zzadj()).zza(this.zzgrc.zzaql(), this.zzgmy.zzadj()).zza(this.zzgrc.zzaqh(), this.zzgmy.zzadj()).zza(zzasu.zzhca, this.zzgmy.zzadj()).zzake()).zza(this.zzgrc.zzaqf()).zzaek();
            }
            this.zzgmy.zzadz().zzed(1);
            zzbpo zzbpo = new zzbpo(this.zzgmy.zzadl(), this.zzgmy.zzadk(), zzcbn.zzafc().zzaiv());
            this.zzgrd = zzbpo;
            zzbpo.zza((zzdvi<zzbpd>) new zzcyd(this, zzcya, zzcbn));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaqm() {
        this.zzgrc.zzaqj().zzg(zzdmb.zza(zzdmd.zzhct, (String) null, (zzuw) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaqn() {
        this.zzgrc.zzaqj().zzg(zzdmb.zza(zzdmd.zzhcr, (String) null, (zzuw) null));
    }
}
