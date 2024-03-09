package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdup;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzduz<V> extends zzdup<Object, V> {
    /* access modifiers changed from: private */
    public zzdvb<?> zzhpn;

    zzduz(zzdtf<? extends zzdvt<?>> zzdtf, boolean z, Executor executor, Callable<V> callable) {
        super(zzdtf, z, false);
        this.zzhpn = new zzduy(this, callable, executor);
        zzaxd();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(int i, @NullableDecl Object obj) {
    }

    /* access modifiers changed from: package-private */
    public final void zzaxe() {
        zzdvb<?> zzdvb = this.zzhpn;
        if (zzdvb != null) {
            zzdvb.execute();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzdup.zza zza) {
        super.zza(zza);
        if (zza == zzdup.zza.OUTPUT_FUTURE_DONE) {
            this.zzhpn = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void interruptTask() {
        zzdvb<?> zzdvb = this.zzhpn;
        if (zzdvb != null) {
            zzdvb.interruptTask();
        }
    }
}
