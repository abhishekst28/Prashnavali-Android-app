package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcf;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzdqo {
    private final Executor executor;
    private final zzdqu zzhjk;
    private final zzdqu zzhjl;
    private Task<zzcf.zza> zzhjm;
    private Task<zzcf.zza> zzhjn;
    private final Context zzvr;
    private final zzdpy zzvw;
    private final zzdqc zzyr;

    private zzdqo(Context context, Executor executor2, zzdpy zzdpy, zzdqc zzdqc, zzdqs zzdqs, zzdqr zzdqr) {
        this.zzvr = context;
        this.executor = executor2;
        this.zzvw = zzdpy;
        this.zzyr = zzdqc;
        this.zzhjk = zzdqs;
        this.zzhjl = zzdqr;
    }

    public static zzdqo zza(Context context, Executor executor2, zzdpy zzdpy, zzdqc zzdqc) {
        zzdqo zzdqo = new zzdqo(context, executor2, zzdpy, zzdqc, new zzdqs(), new zzdqr());
        if (zzdqo.zzyr.zzavc()) {
            zzdqo.zzhjm = zzdqo.zzd(new zzdqn(zzdqo));
        } else {
            zzdqo.zzhjm = Tasks.forResult(zzdqo.zzhjk.zzavl());
        }
        zzdqo.zzhjn = zzdqo.zzd(new zzdqq(zzdqo));
        return zzdqo;
    }

    public final zzcf.zza zzavi() {
        return zza(this.zzhjm, this.zzhjk.zzavl());
    }

    public final zzcf.zza zzco() {
        return zza(this.zzhjn, this.zzhjl.zzavl());
    }

    private final Task<zzcf.zza> zzd(Callable<zzcf.zza> callable) {
        return Tasks.call(this.executor, callable).addOnFailureListener(this.executor, (OnFailureListener) new zzdqp(this));
    }

    private static zzcf.zza zza(Task<zzcf.zza> task, zzcf.zza zza) {
        if (!task.isSuccessful()) {
            return zza;
        }
        return task.getResult();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzvw.zza(2025, -1, exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza zzavj() throws Exception {
        return this.zzhjl.zzcj(this.zzvr);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza zzavk() throws Exception {
        return this.zzhjk.zzcj(this.zzvr);
    }
}
