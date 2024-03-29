package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzbw {

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    public static final class zza extends zzegp<zza, C0001zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zza zzek;
        private static volatile zzeim<zza> zzel;
        private int zzdw;
        private String zzdx = "";
        private long zzdy;
        private String zzdz = "";
        private String zzea = "";
        private String zzeb = "";
        private long zzec;
        private long zzed;
        private String zzee = "";
        private long zzef;
        private String zzeg = "";
        private String zzeh = "";
        private zzeha<zzb> zzei = zzbfo();
        private int zzej;

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        public static final class zzb extends zzegp<zzb, C0002zza> implements zzeib {
            private static volatile zzeim<zzb> zzel;
            /* access modifiers changed from: private */
            public static final zzb zzeo;
            private int zzdw;
            private String zzem = "";
            private String zzen = "";

            private zzb() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzbw$zza$zzb$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
            public static final class C0002zza extends zzegp.zzb<zzb, C0002zza> implements zzeib {
                private C0002zza() {
                    super(zzb.zzeo);
                }

                /* synthetic */ C0002zza(zzbv zzbv) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzbv.zzdv[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0002zza((zzbv) null);
                    case 3:
                        return zza((zzehz) zzeo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzdw", "zzem", "zzen"});
                    case 4:
                        return zzeo;
                    case 5:
                        zzeim<zzb> zzeim = zzel;
                        if (zzeim == null) {
                            synchronized (zzb.class) {
                                zzeim = zzel;
                                if (zzeim == null) {
                                    zzeim = new zzegp.zza<>(zzeo);
                                    zzel = zzeim;
                                }
                            }
                        }
                        return zzeim;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzb zzb = new zzb();
                zzeo = zzb;
                zzegp.zza(zzb.class, zzb);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        public enum zzc implements zzegu {
            UNKNOWN(0),
            ENABLED(1),
            DISABLED(2);
            
            private static final zzegt<zzc> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public static zzc zzh(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ENABLED;
                }
                if (i != 2) {
                    return null;
                }
                return DISABLED;
            }

            public static zzegw zzw() {
                return zzbz.zzeu;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzes = new zzbx();
            }
        }

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbw$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        public static final class C0001zza extends zzegp.zzb<zza, C0001zza> implements zzeib {
            private C0001zza() {
                super(zza.zzek);
            }

            public final C0001zza zzk(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzp(str);
                return this;
            }

            public final C0001zza zzc(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzd(j);
                return this;
            }

            public final C0001zza zzl(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzq(str);
                return this;
            }

            public final C0001zza zzm(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzr(str);
                return this;
            }

            public final C0001zza zzn(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzs(str);
                return this;
            }

            public final C0001zza zzo(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzt(str);
                return this;
            }

            public final C0001zza zza(zzc zzc) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzb(zzc);
                return this;
            }

            /* synthetic */ C0001zza(zzbv zzbv) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzp(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzdx = str;
        }

        /* access modifiers changed from: private */
        public final void zzd(long j) {
            this.zzdw |= 2;
            this.zzdy = j;
        }

        /* access modifiers changed from: private */
        public final void zzq(String str) {
            str.getClass();
            this.zzdw |= 4;
            this.zzdz = str;
        }

        /* access modifiers changed from: private */
        public final void zzr(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zzea = str;
        }

        /* access modifiers changed from: private */
        public final void zzs(String str) {
            str.getClass();
            this.zzdw |= 16;
            this.zzeb = str;
        }

        /* access modifiers changed from: private */
        public final void zzt(String str) {
            str.getClass();
            this.zzdw |= 1024;
            this.zzeh = str;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzc zzc2) {
            this.zzej = zzc2.zzv();
            this.zzdw |= 2048;
        }

        public static C0001zza zzs() {
            return (C0001zza) zzek.zzbfj();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbv.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0001zza((zzbv) null);
                case 3:
                    return zza((zzehz) zzek, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzdw", "zzdx", "zzdy", "zzdz", "zzea", "zzeb", "zzec", "zzed", "zzee", "zzef", "zzeg", "zzeh", "zzei", zzb.class, "zzej", zzc.zzw()});
                case 4:
                    return zzek;
                case 5:
                    zzeim<zza> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zza.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzek);
                                zzel = zzeim;
                            }
                        }
                    }
                    return zzeim;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zza = new zza();
            zzek = zza;
            zzegp.zza(zza.class, zza);
        }
    }
}
