package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.firebase.database.core.ServerValues;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcdx implements zzahf {
    private final zzcdy zzfzq;
    private final zzafr zzfzr;

    zzcdx(zzcdy zzcdy, zzafr zzafr) {
        this.zzfzq = zzcdy;
        this.zzfzr = zzafr;
    }

    public final void zza(Object obj, Map map) {
        zzcdy zzcdy = this.zzfzq;
        zzafr zzafr = this.zzfzr;
        try {
            zzcdy.zzfzw = Long.valueOf(Long.parseLong((String) map.get(ServerValues.NAME_OP_TIMESTAMP)));
        } catch (NumberFormatException e) {
            zzaxy.zzfc("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzcdy.zzfzv = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzafr == null) {
            zzaxy.zzef("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzafr.onUnconfirmedClickReceived(str);
        } catch (RemoteException e2) {
            zzbbd.zze("#007 Could not call remote method.", e2);
        }
    }
}
