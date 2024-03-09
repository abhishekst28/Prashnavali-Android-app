package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcwm implements zzg {
    private zzg zzgpf;

    public final synchronized void zza(zzg zzg) {
        this.zzgpf = zzg;
    }

    public final synchronized void zzh(View view) {
        if (this.zzgpf != null) {
            this.zzgpf.zzh(view);
        }
    }

    public final synchronized void zzka() {
        if (this.zzgpf != null) {
            this.zzgpf.zzka();
        }
    }

    public final synchronized void zzkb() {
        if (this.zzgpf != null) {
            this.zzgpf.zzkb();
        }
    }
}
