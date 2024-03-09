package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcdy implements View.OnClickListener {
    private final Clock zzbpw;
    private final zzchc zzfzs;
    private zzafr zzfzt;
    private zzahf<Object> zzfzu;
    String zzfzv;
    Long zzfzw;
    WeakReference<View> zzfzx;

    public zzcdy(zzchc zzchc, Clock clock) {
        this.zzfzs = zzchc;
        this.zzbpw = clock;
    }

    public final void zza(zzafr zzafr) {
        this.zzfzt = zzafr;
        zzahf<Object> zzahf = this.zzfzu;
        if (zzahf != null) {
            this.zzfzs.zzb("/unconfirmedClick", zzahf);
        }
        zzcdx zzcdx = new zzcdx(this, zzafr);
        this.zzfzu = zzcdx;
        this.zzfzs.zza("/unconfirmedClick", (zzahf<Object>) zzcdx);
    }

    public final zzafr zzamw() {
        return this.zzfzt;
    }

    public final void cancelUnconfirmedClick() {
        if (this.zzfzt != null && this.zzfzw != null) {
            zzamx();
            try {
                this.zzfzt.onUnconfirmedClickCancelled();
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.zzfzx;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zzfzv == null || this.zzfzw == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zzfzv);
                hashMap.put("time_interval", String.valueOf(this.zzbpw.currentTimeMillis() - this.zzfzw.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzfzs.zza("sendMessageToNativeJs", (Map<String, ?>) hashMap);
            }
            zzamx();
        }
    }

    private final void zzamx() {
        View view;
        this.zzfzv = null;
        this.zzfzw = null;
        WeakReference<View> weakReference = this.zzfzx;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzfzx = null;
        }
    }
}
