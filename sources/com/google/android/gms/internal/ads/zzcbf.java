package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zztw;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcbf implements zzbsu, zzbyh {
    private final View view;
    private final zzawb zzbqm;
    private final zzavy zzfpr;
    private final zztw.zza.C0016zza zzfvf;
    private String zzfvh;
    private final Context zzvr;

    public zzcbf(zzavy zzavy, Context context, zzawb zzawb, View view2, zztw.zza.C0016zza zza) {
        this.zzfpr = zzavy;
        this.zzvr = context;
        this.zzbqm = zzawb;
        this.view = view2;
        this.zzfvf = zza;
    }

    public final void onAdOpened() {
        View view2 = this.view;
        if (!(view2 == null || this.zzfvh == null)) {
            this.zzbqm.zzh(view2.getContext(), this.zzfvh);
        }
        this.zzfpr.zzam(true);
    }

    public final void onAdClosed() {
        this.zzfpr.zzam(false);
    }

    public final void zzaiz() {
        String zzae = this.zzbqm.zzae(this.zzvr);
        this.zzfvh = zzae;
        String valueOf = String.valueOf(zzae);
        String valueOf2 = String.valueOf(this.zzfvf == zztw.zza.C0016zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        this.zzfvh = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final void zzaix() {
    }

    public final void onAdLeftApplication() {
    }

    public final void onRewardedVideoStarted() {
    }

    public final void onRewardedVideoCompleted() {
    }

    @ParametersAreNonnullByDefault
    public final void zzb(zzatj zzatj, String str, String str2) {
        if (this.zzbqm.zzac(this.zzvr)) {
            try {
                this.zzbqm.zza(this.zzvr, this.zzbqm.zzah(this.zzvr), this.zzfpr.getAdUnitId(), zzatj.getType(), zzatj.getAmount());
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception to get reward item.", e);
            }
        }
    }
}
