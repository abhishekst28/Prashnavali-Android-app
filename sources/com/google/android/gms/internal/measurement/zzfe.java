package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class zzfe {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;
    private static final Charset zzc = Charset.forName("ISO-8859-1");
    private static final ByteBuffer zzd;
    private static final zzeh zze;

    static <T> T zza(T t) {
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

    public static boolean zza(byte[] bArr) {
        return zzid.zza(bArr);
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static int zza(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzc(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean zza(zzgn zzgn) {
        return false;
    }

    static Object zza(Object obj, Object obj2) {
        return ((zzgn) obj).zzbp().zza((zzgn) obj2).zzt();
    }

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzd = ByteBuffer.wrap(bArr);
        byte[] bArr2 = zzb;
        zze = zzeh.zza(bArr2, 0, bArr2.length, false);
    }
}
