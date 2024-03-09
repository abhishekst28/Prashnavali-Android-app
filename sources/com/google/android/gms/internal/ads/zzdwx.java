package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import com.google.android.gms.internal.ads.zzehz;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzdwx<KeyProtoT extends zzehz> {
    private final Class<KeyProtoT> zzhqt;
    private final Map<Class<?>, zzdwz<?, KeyProtoT>> zzhqu;
    private final Class<?> zzhqv;

    @SafeVarargs
    protected zzdwx(Class<KeyProtoT> cls, zzdwz<?, KeyProtoT>... zzdwzArr) {
        this.zzhqt = cls;
        HashMap hashMap = new HashMap();
        int length = zzdwzArr.length;
        int i = 0;
        while (i < length) {
            zzdwz<?, KeyProtoT> zzdwz = zzdwzArr[i];
            if (hashMap.containsKey(zzdwz.zzaxp())) {
                String valueOf = String.valueOf(zzdwz.zzaxp().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(zzdwz.zzaxp(), zzdwz);
                i++;
            }
        }
        if (zzdwzArr.length > 0) {
            this.zzhqv = zzdwzArr[0].zzaxp();
        } else {
            this.zzhqv = Void.class;
        }
        this.zzhqu = Collections.unmodifiableMap(hashMap);
    }

    public abstract String getKeyType();

    public abstract zzebt.zza zzaxs();

    public abstract void zzc(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract KeyProtoT zzp(zzeff zzeff) throws zzegz;

    public final Class<KeyProtoT> zzaxr() {
        return this.zzhqt;
    }

    public final <P> P zza(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzdwz zzdwz = this.zzhqu.get(cls);
        if (zzdwz != null) {
            return zzdwz.zzag(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final Set<Class<?>> zzaxt() {
        return this.zzhqu.keySet();
    }

    /* access modifiers changed from: package-private */
    public final Class<?> zzaxu() {
        return this.zzhqv;
    }

    public zzdxa<?, KeyProtoT> zzaxv() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
