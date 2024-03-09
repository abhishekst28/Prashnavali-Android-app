package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaid implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzbbq zzbvn;
    private final /* synthetic */ zzahz zzdfd;

    zzaid(zzahz zzahz, zzbbq zzbbq) {
        this.zzdfd = zzahz;
        this.zzbvn = zzbbq;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.zzbvn.set(this.zzdfd.zzdfb.zzsx());
        } catch (DeadObjectException e) {
            this.zzbvn.setException(e);
        }
    }

    public final void onConnectionSuspended(int i) {
        zzbbq zzbbq = this.zzbvn;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzbbq.setException(new RuntimeException(sb.toString()));
    }
}
