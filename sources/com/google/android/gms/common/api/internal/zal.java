package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zal extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean mStarted;
    protected final GoogleApiAvailability zacd;
    protected final AtomicReference<zam> zadf;
    private final Handler zadg;

    protected zal(LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, GoogleApiAvailability.getInstance());
    }

    /* access modifiers changed from: protected */
    public abstract void zaa(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    public abstract void zao();

    private zal(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zadf = new AtomicReference<>((Object) null);
        this.zadg = new zap(Looper.getMainLooper());
        this.zacd = googleApiAvailability;
    }

    public void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, (PendingIntent) null), zaa(this.zadf.get()));
        zaq();
    }

    public void onCreate(Bundle bundle) {
        zam zam;
        super.onCreate(bundle);
        if (bundle != null) {
            AtomicReference<zam> atomicReference = this.zadf;
            if (bundle.getBoolean("resolving_error", false)) {
                zam = new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                zam = null;
            }
            atomicReference.set(zam);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zam zam = this.zadf.get();
        if (zam != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zam.zar());
            bundle.putInt("failed_status", zam.getConnectionResult().getErrorCode());
            bundle.putParcelable("failed_resolution", zam.getConnectionResult().getResolution());
        }
    }

    public void onStart() {
        super.onStart();
        this.mStarted = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zam> r0 = r3.zadf
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zam r0 = (com.google.android.gms.common.api.internal.zam) r0
            r1 = 1
            r2 = 0
            if (r4 == r1) goto L_0x0031
            r5 = 2
            if (r4 == r5) goto L_0x0011
            goto L_0x005a
        L_0x0011:
            com.google.android.gms.common.GoogleApiAvailability r4 = r3.zacd
            android.app.Activity r5 = r3.getActivity()
            int r4 = r4.isGooglePlayServicesAvailable(r5)
            if (r4 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            return
        L_0x0022:
            com.google.android.gms.common.ConnectionResult r5 = r0.getConnectionResult()
            int r5 = r5.getErrorCode()
            r6 = 18
            if (r5 != r6) goto L_0x005b
            if (r4 != r6) goto L_0x005b
            return
        L_0x0031:
            r4 = -1
            if (r5 != r4) goto L_0x0035
            goto L_0x005b
        L_0x0035:
            if (r5 != 0) goto L_0x005a
            r4 = 13
            if (r6 == 0) goto L_0x0043
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x0043:
            com.google.android.gms.common.api.internal.zam r5 = new com.google.android.gms.common.api.internal.zam
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = zaa(r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zam> r4 = r3.zadf
            r4.set(r5)
            r0 = r5
            r1 = 0
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            if (r1 == 0) goto L_0x0061
            r3.zaq()
            return
        L_0x0061:
            if (r0 == 0) goto L_0x006f
            com.google.android.gms.common.ConnectionResult r4 = r0.getConnectionResult()
            int r5 = r0.zar()
            r3.zaa(r4, r5)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zal.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onStop() {
        super.onStop();
        this.mStarted = false;
    }

    /* access modifiers changed from: protected */
    public final void zaq() {
        this.zadf.set((Object) null);
        zao();
    }

    public final void zab(ConnectionResult connectionResult, int i) {
        zam zam = new zam(connectionResult, i);
        if (this.zadf.compareAndSet((Object) null, zam)) {
            this.zadg.post(new zan(this, zam));
        }
    }

    private static int zaa(zam zam) {
        if (zam == null) {
            return -1;
        }
        return zam.zar();
    }
}
