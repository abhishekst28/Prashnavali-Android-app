package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzarj {
    @Nonnull
    private final View zzaat;
    private final Map<String, WeakReference<View>> zzdpj;
    private final zzawu zzdpk;

    public zzarj(zzark zzark) {
        Map<String, WeakReference<View>> map;
        this.zzaat = zzark.zzaat;
        this.zzdpj = zzark.zzdpj;
        zzawu zzs = zzarh.zzs(zzark.zzaat.getContext());
        this.zzdpk = zzs;
        if (zzs != null && (map = this.zzdpj) != null && !map.isEmpty()) {
            try {
                this.zzdpk.zza(new zzarn(ObjectWrapper.wrap(this.zzaat).asBinder(), ObjectWrapper.wrap(this.zzdpj).asBinder()));
            } catch (RemoteException e) {
                zzbbd.zzfc("Failed to call remote method.");
            }
        }
    }

    public final void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzdpk == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzdpk.zza(list, ObjectWrapper.wrap(this.zzaat), (zzarc) new zzari(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateImpressionUrlsCallback.onFailure(sb.toString());
        }
    }

    public final void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzdpk == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzdpk.zzb(new ArrayList(Arrays.asList(new Uri[]{uri})), ObjectWrapper.wrap(this.zzaat), new zzarl(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateClickUrlCallback.onFailure(sb.toString());
        }
    }

    public final void reportTouchEvent(MotionEvent motionEvent) {
        zzawu zzawu = this.zzdpk;
        if (zzawu == null) {
            zzbbd.zzef("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzawu.zzan(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException e) {
            zzbbd.zzfc("Failed to call remote method.");
        }
    }
}
