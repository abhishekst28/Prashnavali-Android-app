package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;
import com.google.android.gms.internal.ads.zzegp.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzegp<MessageType extends zzegp<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzeev<MessageType, BuilderType> {
    private static Map<Object, zzegp<?, ?>> zzifq = new ConcurrentHashMap();
    protected zzejq zzifo = zzejq.zzbhz();
    private int zzifp = -1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    public static class zza<T extends zzegp<T, ?>> extends zzeew<T> {
        private final T zzifs;

        public zza(T t) {
            this.zzifs = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static final class zzc implements zzegk<zzc> {
        public final int zzv() {
            throw new NoSuchMethodError();
        }

        public final zzeke zzbfe() {
            throw new NoSuchMethodError();
        }

        public final zzekh zzbff() {
            throw new NoSuchMethodError();
        }

        public final boolean zzbfg() {
            throw new NoSuchMethodError();
        }

        public final boolean zzbfh() {
            throw new NoSuchMethodError();
        }

        public final zzeic zza(zzeic zzeic, zzehz zzehz) {
            throw new NoSuchMethodError();
        }

        public final zzeii zza(zzeii zzeii, zzeii zzeii2) {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    public static final class zze {
        public static final int zzifw = 1;
        public static final int zzifx = 2;
        public static final int zzify = 3;
        public static final int zzifz = 4;
        public static final int zziga = 5;
        public static final int zzigb = 6;
        public static final int zzigc = 7;
        private static final /* synthetic */ int[] zzigd = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzige = 1;
        public static final int zzigf = 2;
        private static final /* synthetic */ int[] zzigg = {1, 2};
        public static final int zzigh = 1;
        public static final int zzigi = 2;
        private static final /* synthetic */ int[] zzigj = {1, 2};

        public static int[] zzbfz() {
            return (int[]) zzigd.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    public static class zzf<ContainingType extends zzehz, Type> extends zzegd<ContainingType, Type> {
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzegp<MessageType, BuilderType> implements zzeib {
        protected zzegi<zzc> zzifv = zzegi.zzbfc();

        /* access modifiers changed from: package-private */
        public final zzegi<zzc> zzbfy() {
            if (this.zzifv.isImmutable()) {
                this.zzifv = (zzegi) this.zzifv.clone();
            }
            return this.zzifv;
        }
    }

    public String toString() {
        return zzeie.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zziaq != 0) {
            return this.zziaq;
        }
        this.zziaq = zzeio.zzbhg().zzaw(this).hashCode(this);
        return this.zziaq;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    public static abstract class zzb<MessageType extends zzegp<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzeeu<MessageType, BuilderType> {
        private final MessageType zzifs;
        protected MessageType zzift;
        protected boolean zzifu = false;

        protected zzb(MessageType messagetype) {
            this.zzifs = messagetype;
            this.zzift = (zzegp) messagetype.zza(zze.zzifz, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        public void zzbft() {
            MessageType messagetype = (zzegp) this.zzift.zza(zze.zzifz, (Object) null, (Object) null);
            zza(messagetype, this.zzift);
            this.zzift = messagetype;
        }

        public final boolean isInitialized() {
            return zzegp.zza(this.zzift, false);
        }

        /* renamed from: zzbfu */
        public MessageType zzbfw() {
            if (this.zzifu) {
                return this.zzift;
            }
            MessageType messagetype = this.zzift;
            zzeio.zzbhg().zzaw(messagetype).zzaj(messagetype);
            this.zzifu = true;
            return this.zzift;
        }

        /* renamed from: zzbfv */
        public final MessageType zzbfx() {
            MessageType messagetype = (zzegp) zzbfw();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzejo(messagetype);
        }

        /* renamed from: zzb */
        public final BuilderType zza(MessageType messagetype) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            zza(this.zzift, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzeio.zzbhg().zzaw(messagetype).zzg(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzegc zzegc) throws zzegz {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            try {
                zzeio.zzbhg().zzaw(this.zzift).zza(this.zzift, bArr, 0, i2 + 0, new zzefa(zzegc));
                return this;
            } catch (zzegz e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                throw zzegz.zzbgb();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: zzb */
        public final BuilderType zza(zzefq zzefq, zzegc zzegc) throws IOException {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            try {
                zzeio.zzbhg().zzaw(this.zzift).zza(this.zzift, zzefx.zza(zzefq), zzegc);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public final /* synthetic */ zzeeu zza(byte[] bArr, int i, int i2, zzegc zzegc) throws zzegz {
            return zzb(bArr, 0, i2, zzegc);
        }

        public final /* synthetic */ zzeeu zzbcz() {
            return (zzb) clone();
        }

        public final /* synthetic */ zzehz zzbfr() {
            return this.zzifs;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzb = (zzb) ((zzegp) this.zzifs).zza(zze.zziga, (Object) null, (Object) null);
            zzb.zza((zzegp) zzbfw());
            return zzb;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzeio.zzbhg().zzaw(this).equals(this, (zzegp) obj);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzegp<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzbfj() {
        return (zzb) zza(zze.zziga, (Object) null, (Object) null);
    }

    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzbfk() {
        BuilderType buildertype = (zzb) zza(zze.zziga, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    /* access modifiers changed from: package-private */
    public final int zzbdb() {
        return this.zzifp;
    }

    /* access modifiers changed from: package-private */
    public final void zzfq(int i) {
        this.zzifp = i;
    }

    public final void zzb(zzefz zzefz) throws IOException {
        zzeio.zzbhg().zzaw(this).zza(this, zzegb.zza(zzefz));
    }

    public final int zzbfl() {
        if (this.zzifp == -1) {
            this.zzifp = zzeio.zzbhg().zzaw(this).zzat(this);
        }
        return this.zzifp;
    }

    static <T extends zzegp<?, ?>> T zzd(Class<T> cls) {
        T t = (zzegp) zzifq.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzegp) zzifq.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzegp) ((zzegp) zzejt.zzj(cls)).zza(zze.zzigb, (Object) null, (Object) null);
            if (t != null) {
                zzifq.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzegp<?, ?>> void zza(Class<T> cls, T t) {
        zzifq.put(cls, t);
    }

    protected static Object zza(zzehz zzehz, String str, Object[] objArr) {
        return new zzeiq(zzehz, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends zzegp<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zzifw, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzav = zzeio.zzbhg().zzaw(t).zzav(t);
        if (z) {
            t.zza(zze.zzifx, (Object) zzav ? t : null, (Object) null);
        }
        return zzav;
    }

    protected static zzegv zzbfm() {
        return zzegs.zzbga();
    }

    protected static zzegv zza(zzegv zzegv) {
        int size = zzegv.size();
        return zzegv.zzhb(size == 0 ? 10 : size << 1);
    }

    protected static zzegx zzbfn() {
        return zzehn.zzbgr();
    }

    protected static <E> zzeha<E> zzbfo() {
        return zzein.zzbhf();
    }

    protected static <E> zzeha<E> zza(zzeha<E> zzeha) {
        int size = zzeha.size();
        return zzeha.zzft(size == 0 ? 10 : size << 1);
    }

    private static <T extends zzegp<T, ?>> T zza(T t, zzefq zzefq, zzegc zzegc) throws zzegz {
        T t2 = (zzegp) t.zza(zze.zzifz, (Object) null, (Object) null);
        try {
            zzeiv zzaw = zzeio.zzbhg().zzaw(t2);
            zzaw.zza(t2, zzefx.zza(zzefq), zzegc);
            zzaw.zzaj(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzegz) {
                throw ((zzegz) e.getCause());
            }
            throw new zzegz(e.getMessage()).zzl(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzegz) {
                throw ((zzegz) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzegp<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzegc zzegc) throws zzegz {
        T t2 = (zzegp) t.zza(zze.zzifz, (Object) null, (Object) null);
        try {
            zzeiv zzaw = zzeio.zzbhg().zzaw(t2);
            zzaw.zza(t2, bArr, 0, i2, new zzefa(zzegc));
            zzaw.zzaj(t2);
            if (t2.zziaq == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzegz) {
                throw ((zzegz) e.getCause());
            }
            throw new zzegz(e.getMessage()).zzl(t2);
        } catch (IndexOutOfBoundsException e2) {
            throw zzegz.zzbgb().zzl(t2);
        }
    }

    private static <T extends zzegp<T, ?>> T zza(T t) throws zzegz {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw new zzegz(new zzejo(t).getMessage()).zzl(t);
    }

    protected static <T extends zzegp<T, ?>> T zza(T t, zzeff zzeff) throws zzegz {
        return zza(zza(zzb(t, zzeff, zzegc.zzbex())));
    }

    protected static <T extends zzegp<T, ?>> T zza(T t, zzeff zzeff, zzegc zzegc) throws zzegz {
        return zza(zzb(t, zzeff, zzegc));
    }

    private static <T extends zzegp<T, ?>> T zzb(T t, zzeff zzeff, zzegc zzegc) throws zzegz {
        T zza2;
        try {
            zzefq zzbdl = zzeff.zzbdl();
            zza2 = zza(t, zzbdl, zzegc);
            zzbdl.zzfy(0);
            return zza2;
        } catch (zzegz e) {
            throw e.zzl(zza2);
        } catch (zzegz e2) {
            throw e2;
        }
    }

    protected static <T extends zzegp<T, ?>> T zza(T t, byte[] bArr) throws zzegz {
        return zza(zza(t, bArr, 0, bArr.length, zzegc.zzbex()));
    }

    protected static <T extends zzegp<T, ?>> T zza(T t, byte[] bArr, zzegc zzegc) throws zzegz {
        return zza(zza(t, bArr, 0, bArr.length, zzegc));
    }

    public final /* synthetic */ zzeic zzbfp() {
        zzb zzb2 = (zzb) zza(zze.zziga, (Object) null, (Object) null);
        zzb2.zza(this);
        return zzb2;
    }

    public final /* synthetic */ zzeic zzbfq() {
        return (zzb) zza(zze.zziga, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzehz zzbfr() {
        return (zzegp) zza(zze.zzigb, (Object) null, (Object) null);
    }
}
