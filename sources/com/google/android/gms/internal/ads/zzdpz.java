package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final /* synthetic */ class zzdpz implements Continuation {
    private final int zzeax;
    private final zzbw.zza.C0001zza zzhiw;

    zzdpz(zzbw.zza.C0001zza zza, int i) {
        this.zzhiw = zza;
        this.zzeax = i;
    }

    public final Object then(Task task) {
        return zzdpy.zza(this.zzhiw, this.zzeax, task);
    }
}
