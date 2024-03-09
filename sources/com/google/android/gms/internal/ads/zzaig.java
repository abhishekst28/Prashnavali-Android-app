package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaig implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzbbq zzbvn;

    zzaig(zzahz zzahz, zzbbq zzbbq) {
        this.zzbvn = zzbbq;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbvn.setException(new RuntimeException("Connection failed."));
    }
}
