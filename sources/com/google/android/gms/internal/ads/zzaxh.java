package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaxh implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzbbq zzdxl;

    zzaxh(zzaxe zzaxe, Context context, zzbbq zzbbq) {
        this.val$context = context;
        this.zzdxl = zzbbq;
    }

    public final void run() {
        try {
            this.zzdxl.set(AdvertisingIdClient.getAdvertisingIdInfo(this.val$context));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzdxl.setException(e);
            zzbbd.zzc("Exception while getting advertising Id info", e);
        }
    }
}
