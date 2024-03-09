package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzfq extends zzgm {
    public zzfq(zzex zzex, String str, String str2, zzcf.zza.C0004zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzabc.zzf(-1);
        this.zzabc.zzg(-1);
        int[] iArr = (int[]) this.zzabm.invoke((Object) null, new Object[]{this.zzwg.getContext()});
        synchronized (this.zzabc) {
            this.zzabc.zzf((long) iArr[0]);
            this.zzabc.zzg((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.zzabc.zzaf((long) iArr[2]);
            }
        }
    }
}
