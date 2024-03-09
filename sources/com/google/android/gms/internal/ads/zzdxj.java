package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehz;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzdxj<KeyProtoT extends zzehz, PublicKeyProtoT extends zzehz> extends zzdwx<KeyProtoT> {
    private final Class<PublicKeyProtoT> zzhrg;

    @SafeVarargs
    protected zzdxj(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, zzdwz<?, KeyProtoT>... zzdwzArr) {
        super(cls, zzdwzArr);
        this.zzhrg = cls2;
    }
}
