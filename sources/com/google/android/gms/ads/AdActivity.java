package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaql;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzwe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzaql zzacp;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzaql zzb = zzwe.zzpr().zzb((Activity) this);
        this.zzacp = zzb;
        if (zzb == null) {
            zzbbd.zze("#007 Could not call remote method.", (Throwable) null);
            finish();
            return;
        }
        try {
            zzb.onCreate(bundle);
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            if (this.zzacp != null) {
                this.zzacp.onRestart();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            if (this.zzacp != null) {
                this.zzacp.onStart();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            if (this.zzacp != null) {
                this.zzacp.onResume();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            if (this.zzacp != null) {
                this.zzacp.onPause();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.zzacp != null) {
                this.zzacp.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            if (this.zzacp != null) {
                this.zzacp.onStop();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            if (this.zzacp != null) {
                this.zzacp.onDestroy();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    private final void zzdo() {
        zzaql zzaql = this.zzacp;
        if (zzaql != null) {
            try {
                zzaql.zzdo();
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        zzdo();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        zzdo();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzdo();
    }

    public final void onBackPressed() {
        boolean z = true;
        try {
            if (this.zzacp != null) {
                z = this.zzacp.zzuq();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.zzacp.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.zzacp.zzad(ObjectWrapper.wrap(configuration));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
