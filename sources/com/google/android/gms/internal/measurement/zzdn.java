package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdn;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public abstract class zzdn<MessageType extends zzdl<MessageType, BuilderType>, BuilderType extends zzdn<MessageType, BuilderType>> implements zzgm {
    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzeh zzeh, zzeq zzeq) throws IOException;

    /* renamed from: zzo */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2) throws zzfn {
        try {
            zzeh zza = zzeh.zza(bArr, 0, i2, false);
            zza(zza, zzeq.zza());
            zza.zza(0);
            return this;
        } catch (zzfn e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zza(byte[] bArr, int i, int i2, zzeq zzeq) throws zzfn {
        try {
            zzeh zza = zzeh.zza(bArr, 0, i2, false);
            zza(zza, zzeq);
            zza.zza(0);
            return this;
        } catch (zzfn e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    private final String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public final /* synthetic */ zzgm zza(zzgn zzgn) {
        if (zzv().getClass().isInstance(zzgn)) {
            return zza((zzdl) zzgn);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public final /* synthetic */ zzgm zza(byte[] bArr, zzeq zzeq) throws zzfn {
        return zza(bArr, 0, bArr.length, zzeq);
    }

    public final /* synthetic */ zzgm zza(byte[] bArr) throws zzfn {
        return zza(bArr, 0, bArr.length);
    }
}
