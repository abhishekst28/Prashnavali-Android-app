package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeeu;
import com.google.android.gms.internal.ads.zzeev;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzeeu<MessageType extends zzeev<MessageType, BuilderType>, BuilderType extends zzeeu<MessageType, BuilderType>> implements zzeic {
    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzefq zzefq, zzegc zzegc) throws IOException;

    /* renamed from: zzbcz */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2, zzegc zzegc) throws zzegz {
        try {
            zzefq zzb = zzefq.zzb(bArr, 0, i2, false);
            zza(zzb, zzegc);
            zzb.zzfy(0);
            return this;
        } catch (zzegz e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf("byte array").length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public final /* synthetic */ zzeic zzf(zzehz zzehz) {
        if (zzbfr().getClass().isInstance(zzehz)) {
            return zza((zzeev) zzehz);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
