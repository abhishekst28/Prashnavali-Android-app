package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzfp extends zzgm {
    private static volatile Long zzaaz = null;
    private static final Object zzaba = new Object();

    public zzfp(zzex zzex, String str, String str2, zzcf.zza.C0004zza zza, int i, int i2) {
        super(zzex, str, str2, zza, i, 44);
    }

    /* access modifiers changed from: protected */
    public final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (zzaaz == null) {
            synchronized (zzaba) {
                if (zzaaz == null) {
                    zzaaz = (Long) this.zzabm.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zzabc) {
            this.zzabc.zzaa(zzaaz.longValue());
        }
    }
}
