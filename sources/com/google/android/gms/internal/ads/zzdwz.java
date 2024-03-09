package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzdwz<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> zzhqt;

    public zzdwz(Class<PrimitiveT> cls) {
        this.zzhqt = cls;
    }

    public abstract PrimitiveT zzag(KeyT keyt) throws GeneralSecurityException;

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> zzaxp() {
        return this.zzhqt;
    }
}
