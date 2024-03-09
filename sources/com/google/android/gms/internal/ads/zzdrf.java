package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzdrf extends zzc<zzdrm> {
    private final int zzhkg;

    public zzdrf(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, int i) {
        super(context, looper, 116, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
        this.zzhkg = i;
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final int getMinApkVersion() {
        return this.zzhkg;
    }

    public final zzdrm zzavt() throws DeadObjectException {
        return (zzdrm) super.getService();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof zzdrm) {
            return (zzdrm) queryLocalInterface;
        }
        return new zzdrl(iBinder);
    }
}
