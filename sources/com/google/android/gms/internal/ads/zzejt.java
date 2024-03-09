package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzejt {
    private static final Logger logger = Logger.getLogger(zzejt.class.getName());
    private static final Unsafe zzhop = zzbie();
    private static final Class<?> zziau = zzeey.zzbde();
    private static final boolean zzicg = zzbif();
    private static final boolean zzikl = zzm(Long.TYPE);
    private static final boolean zzikm = zzm(Integer.TYPE);
    private static final zzd zzikn;
    private static final boolean zziko = zzbig();
    private static final long zzikp = ((long) zzk(byte[].class));
    private static final long zzikq;
    private static final long zzikr;
    private static final long zziks;
    private static final long zzikt;
    private static final long zziku;
    private static final long zzikv;
    private static final long zzikw;
    private static final long zzikx;
    private static final long zziky;
    private static final long zzikz;
    private static final long zzila = ((long) zzk(Object[].class));
    private static final long zzilb = ((long) zzl(Object[].class));
    private static final long zzilc;
    private static final int zzild = ((int) (zzikp & 7));
    static final boolean zzile = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    private zzejt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzejt.zzile) {
                return zzejt.zzq(obj, j);
            }
            return zzejt.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzejt.zzile) {
                zzejt.zza(obj, j, b);
            } else {
                zzejt.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzejt.zzile) {
                return zzejt.zzs(obj, j);
            }
            return zzejt.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzejt.zzile) {
                zzejt.zzb(obj, j, z);
            } else {
                zzejt.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            return this.zzilh.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzilh.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zzilh.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzilh.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zzilh.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzilh.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zzilh.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzilh.putDouble(obj, j, d);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzejt.zzile) {
                return zzejt.zzq(obj, j);
            }
            return zzejt.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzejt.zzile) {
                zzejt.zza(obj, j, b);
            } else {
                zzejt.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzejt.zzile) {
                return zzejt.zzs(obj, j);
            }
            return zzejt.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzejt.zzile) {
                zzejt.zzb(obj, j, z);
            } else {
                zzejt.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static boolean zzbic() {
        return zzicg;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static abstract class zzd {
        Unsafe zzilh;

        zzd(Unsafe unsafe) {
            this.zzilh = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzilh.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzilh.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzilh.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzilh.putLong(obj, j, j2);
        }
    }

    static boolean zzbid() {
        return zziko;
    }

    static <T> T zzj(Class<T> cls) {
        try {
            return zzhop.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzk(Class<?> cls) {
        if (zzicg) {
            return zzikn.zzilh.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzl(Class<?> cls) {
        if (zzicg) {
            return zzikn.zzilh.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzk(Object obj, long j) {
        return zzikn.zzk(obj, j);
    }

    static void zzb(Object obj, long j, int i) {
        zzikn.zzb(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzikn.zzl(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzikn.zza(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzikn.zzm(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzikn.zza(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzikn.zzn(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzikn.zza(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzikn.zzo(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzikn.zza(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzikn.zzilh.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzikn.zzilh.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzikn.zzy(bArr, zzikp + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzikn.zze(bArr, zzikp + j, b);
    }

    static Unsafe zzbie() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzejv());
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean zzbif() {
        Unsafe unsafe = zzhop;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (zzeey.zzbdd()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzbig() {
        Unsafe unsafe = zzhop;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzbih() == null) {
                return false;
            }
            if (zzeey.zzbdd()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzm(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzeey.zzbdd()) {
            return false;
        }
        try {
            Class<?> cls3 = zziau;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static Field zzbih() {
        Field zzb2;
        if (zzeey.zzbdd() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzb2;
        }
        Field zzb3 = zzb(Buffer.class, "address");
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int zzk = zzk(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : 0);
    }

    static {
        long j;
        zzd zzd2;
        Class<double[]> cls = double[].class;
        Class<float[]> cls2 = float[].class;
        Class<long[]> cls3 = long[].class;
        Class<int[]> cls4 = int[].class;
        Class<boolean[]> cls5 = boolean[].class;
        zzd zzd3 = null;
        if (zzhop != null) {
            if (!zzeey.zzbdd()) {
                zzd3 = new zzb(zzhop);
            } else if (zzikl) {
                zzd3 = new zzc(zzhop);
            } else if (zzikm) {
                zzd3 = new zza(zzhop);
            }
        }
        zzikn = zzd3;
        zzikq = (long) zzk(cls5);
        zzikr = (long) zzl(cls5);
        zziks = (long) zzk(cls4);
        zzikt = (long) zzl(cls4);
        zziku = (long) zzk(cls3);
        zzikv = (long) zzl(cls3);
        zzikw = (long) zzk(cls2);
        zzikx = (long) zzl(cls2);
        zziky = (long) zzk(cls);
        zzikz = (long) zzl(cls);
        Field zzbih = zzbih();
        if (zzbih == null || (zzd2 = zzikn) == null) {
            j = -1;
        } else {
            j = zzd2.zzilh.objectFieldOffset(zzbih);
        }
        zzilc = j;
    }
}
