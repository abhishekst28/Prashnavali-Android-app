package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzyf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class ResponseInfo {
    private final zzyf zzadq;

    private ResponseInfo(zzyf zzyf) {
        this.zzadq = zzyf;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.zzadq.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzbbd.zzc("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public final String getResponseId() {
        try {
            return this.zzadq.getResponseId();
        } catch (RemoteException e) {
            zzbbd.zzc("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public static ResponseInfo zza(zzyf zzyf) {
        if (zzyf != null) {
            return new ResponseInfo(zzyf);
        }
        return null;
    }
}
