package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzegr {
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final byte[] zzibj;
    private static final ByteBuffer zzigk;
    private static final zzefq zzigl;

    static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    static <T> T zza(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean zzy(byte[] bArr) {
        return zzejw.zzy(bArr);
    }

    public static String zzz(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int zzfr(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zzbu(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean zzk(zzehz zzehz) {
        if (!(zzehz instanceof zzeex)) {
            return false;
        }
        zzeex zzeex = (zzeex) zzehz;
        return false;
    }

    static Object zze(Object obj, Object obj2) {
        return ((zzehz) obj).zzbfp().zzf((zzehz) obj2).zzbfw();
    }

    static {
        byte[] bArr = new byte[0];
        zzibj = bArr;
        zzigk = ByteBuffer.wrap(bArr);
        byte[] bArr2 = zzibj;
        zzigl = zzefq.zzb(bArr2, 0, bArr2.length, false);
    }
}
