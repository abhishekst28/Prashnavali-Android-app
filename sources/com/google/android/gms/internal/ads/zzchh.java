package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzchh implements zzo, zzt, zzagl, zzagn, zzut {
    private zzut zzcgq;
    private zzagl zzddv;
    private zzagn zzddw;
    private zzo zzdor;
    private zzt zzdov;

    private zzchh() {
    }

    public final synchronized void onAdClicked() {
        if (this.zzcgq != null) {
            this.zzcgq.onAdClicked();
        }
    }

    public final synchronized void zzui() {
        if (this.zzdor != null) {
            this.zzdor.zzui();
        }
    }

    public final synchronized void onPause() {
        if (this.zzdor != null) {
            this.zzdor.onPause();
        }
    }

    public final synchronized void onResume() {
        if (this.zzdor != null) {
            this.zzdor.onResume();
        }
    }

    public final synchronized void zzuj() {
        if (this.zzdor != null) {
            this.zzdor.zzuj();
        }
    }

    public final synchronized void zzuz() {
        if (this.zzdov != null) {
            this.zzdov.zzuz();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        if (this.zzddv != null) {
            this.zzddv.zza(str, bundle);
        }
    }

    public final synchronized void onAppEvent(String str, String str2) {
        if (this.zzddw != null) {
            this.zzddw.onAppEvent(str, str2);
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zza(zzut zzut, zzagl zzagl, zzo zzo, zzagn zzagn, zzt zzt) {
        this.zzcgq = zzut;
        this.zzddv = zzagl;
        this.zzdor = zzo;
        this.zzddw = zzagn;
        this.zzdov = zzt;
    }

    /* synthetic */ zzchh(zzchd zzchd) {
        this();
    }
}
