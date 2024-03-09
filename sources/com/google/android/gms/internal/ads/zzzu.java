package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzzu extends zzxy {
    private final OnAdMetadataChangedListener zzcks;

    public zzzu(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzcks = onAdMetadataChangedListener;
    }

    public final void onAdMetadataChanged() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.zzcks;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
