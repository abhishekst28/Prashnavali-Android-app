package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzfy extends zzgm {
    private long zzabe = -1;

    public zzfy(zzex zzex, String str, String str2, zzcf.zza.C0004zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 12);
    }

    /* access modifiers changed from: protected */
    public final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzabc.zzi(-1);
        this.zzabc.zzi(((Long) this.zzabm.invoke((Object) null, new Object[]{this.zzwg.getContext()})).longValue());
    }
}
