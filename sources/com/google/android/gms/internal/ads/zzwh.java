package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class zzwh extends AdListener {
    private final Object lock = new Object();
    private AdListener zzciy;

    public final void zza(AdListener adListener) {
        synchronized (this.lock) {
            this.zzciy = adListener;
        }
    }

    public void onAdClosed() {
        synchronized (this.lock) {
            if (this.zzciy != null) {
                this.zzciy.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.lock) {
            if (this.zzciy != null) {
                this.zzciy.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.lock) {
            if (this.zzciy != null) {
                this.zzciy.onAdFailedToLoad(loadAdError);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.lock) {
            if (this.zzciy != null) {
                this.zzciy.onAdLeftApplication();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.lock) {
            if (this.zzciy != null) {
                this.zzciy.onAdOpened();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.lock) {
            if (this.zzciy != null) {
                this.zzciy.onAdLoaded();
            }
        }
    }
}
