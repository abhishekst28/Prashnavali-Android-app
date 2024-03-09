package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzby {

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    public static final class zza extends zzegp<zza, C0003zza> implements zzeib {
        private static volatile zzeim<zza> zzel;
        /* access modifiers changed from: private */
        public static final zza zzex;
        private int zzdw;
        private zzb zzev;
        private zzc zzew;

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzby$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        public static final class C0003zza extends zzegp.zzb<zza, C0003zza> implements zzeib {
            private C0003zza() {
                super(zza.zzex);
            }

            /* synthetic */ C0003zza(zzca zzca) {
                this();
            }
        }

        public final boolean zzx() {
            return (this.zzdw & 1) != 0;
        }

        public final zzb zzy() {
            zzb zzb = this.zzev;
            return zzb == null ? zzb.zzad() : zzb;
        }

        public final boolean zzz() {
            return (this.zzdw & 2) != 0;
        }

        public final zzc zzaa() {
            zzc zzc = this.zzew;
            return zzc == null ? zzc.zzag() : zzc;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzca.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0003zza((zzca) null);
                case 3:
                    return zza((zzehz) zzex, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzev", "zzew"});
                case 4:
                    return zzex;
                case 5:
                    zzeim<zza> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zza.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzex);
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
            zzex = zza;
            zzegp.zza(zza.class, zza);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    public static final class zzb extends zzegp<zzb, zza> implements zzeib {
        private static volatile zzeim<zzb> zzel;
        /* access modifiers changed from: private */
        public static final zzb zzez;
        private int zzdw;
        private int zzey = 2;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzb, zza> implements zzeib {
            private zza() {
                super(zzb.zzez);
            }

            /* synthetic */ zza(zzca zzca) {
                this();
            }
        }

        public final zzcb zzac() {
            zzcb zzj = zzcb.zzj(this.zzey);
            return zzj == null ? zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD : zzj;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzca.zzdv[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzca) null);
                case 3:
                    return zza((zzehz) zzez, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzdw", "zzey", zzcb.zzw()});
                case 4:
                    return zzez;
                case 5:
                    zzeim<zzb> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzb.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzez);
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

        public static zzb zzad() {
            return zzez;
        }

        static {
            zzb zzb = new zzb();
            zzez = zzb;
            zzegp.zza(zzb.class, zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    public static final class zzc extends zzegp<zzc, zza> implements zzeib {
        private static volatile zzeim<zzc> zzel;
        /* access modifiers changed from: private */
        public static final zzc zzfm;
        private int zzdw;
        private String zzfg = "";
        private String zzfh = "";
        private String zzfi = "";
        private String zzfj = "";
        private String zzfk = "";
        private String zzfl = "";

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzc, zza> implements zzeib {
            private zza() {
                super(zzc.zzfm);
            }

            /* synthetic */ zza(zzca zzca) {
                this();
            }
        }

        public final String zzaf() {
            return this.zzfg;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzca.zzdv[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzca) null);
                case 3:
                    return zza((zzehz) zzfm, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzdw", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzfl"});
                case 4:
                    return zzfm;
                case 5:
                    zzeim<zzc> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzc.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzfm);
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

        public static zzc zzag() {
            return zzfm;
        }

        static {
            zzc zzc = new zzc();
            zzfm = zzc;
            zzegp.zza(zzc.class, zzc);
        }
    }
}
