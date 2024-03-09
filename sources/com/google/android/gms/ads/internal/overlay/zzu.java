package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqk;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzu extends zzaqk {
    private Activity zzaas;
    private boolean zzdnu = false;
    private AdOverlayInfoParcel zzdpb;
    private boolean zzdpc = false;

    public zzu(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdpb = adOverlayInfoParcel;
        this.zzaas = activity;
    }

    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdpb;
        if (adOverlayInfoParcel == null) {
            this.zzaas.finish();
        } else if (z) {
            this.zzaas.finish();
        } else {
            if (bundle == null) {
                if (adOverlayInfoParcel.zzcgq != null) {
                    this.zzdpb.zzcgq.onAdClicked();
                }
                if (!(this.zzaas.getIntent() == null || !this.zzaas.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.zzdpb.zzdor == null)) {
                    this.zzdpb.zzdor.zzuj();
                }
            }
            zzp.zzkn();
            if (!zzb.zza((Context) this.zzaas, this.zzdpb.zzdoq, this.zzdpb.zzdov)) {
                this.zzaas.finish();
            }
        }
    }

    public final void onResume() throws RemoteException {
        if (this.zzdnu) {
            this.zzaas.finish();
            return;
        }
        this.zzdnu = true;
        if (this.zzdpb.zzdor != null) {
            this.zzdpb.zzdor.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdnu);
    }

    public final void onPause() throws RemoteException {
        if (this.zzdpb.zzdor != null) {
            this.zzdpb.zzdor.onPause();
        }
        if (this.zzaas.isFinishing()) {
            zzva();
        }
    }

    public final void onStop() throws RemoteException {
        if (this.zzaas.isFinishing()) {
            zzva();
        }
    }

    public final void onDestroy() throws RemoteException {
        if (this.zzaas.isFinishing()) {
            zzva();
        }
    }

    private final synchronized void zzva() {
        if (!this.zzdpc) {
            if (this.zzdpb.zzdor != null) {
                this.zzdpb.zzdor.zzui();
            }
            this.zzdpc = true;
        }
    }

    public final void onRestart() throws RemoteException {
    }

    public final void onStart() throws RemoteException {
    }

    public final void zzdo() throws RemoteException {
    }

    public final void onBackPressed() throws RemoteException {
    }

    public final boolean zzuq() throws RemoteException {
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
    }
}
