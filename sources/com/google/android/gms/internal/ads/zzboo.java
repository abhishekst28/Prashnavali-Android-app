package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzboo extends zzbni {
    private final Executor zzfmk;
    private final zzafq zzfpa;
    private final Runnable zzfpb;

    public zzboo(zzbpg zzbpg, zzafq zzafq, Runnable runnable, Executor executor) {
        super(zzbpg);
        this.zzfpa = zzafq;
        this.zzfpb = runnable;
        this.zzfmk = executor;
    }

    public final void zzahw() {
        this.zzfmk.execute(new zzboq(this, new zzbon(new AtomicReference(this.zzfpb))));
    }

    public final View zzahq() {
        return null;
    }

    public final void zza(ViewGroup viewGroup, zzvj zzvj) {
    }

    public final zzyg getVideoController() {
        return null;
    }

    public final zzdkw zzahp() {
        return null;
    }

    public final zzdkw zzahu() {
        return null;
    }

    public final int zzahv() {
        return 0;
    }

    public final void zzkd() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Runnable runnable) {
        try {
            if (!this.zzfpa.zzm(ObjectWrapper.wrap(runnable))) {
                runnable.run();
            }
        } catch (RemoteException e) {
            runnable.run();
        }
    }
}
