package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zztw {

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp<zza, zzb> implements zzeib {
        /* access modifiers changed from: private */
        public static final zza zzbyk;
        private static volatile zzeim<zza> zzel;
        private int zzbxz;
        private int zzbya = 1000;
        private zzd zzbyb;
        private zze zzbyc;
        private zzeha<zzc> zzbyd = zzbfo();
        private zzf zzbye;
        private zzp zzbyf;
        private zzn zzbyg;
        private zzk zzbyh;
        private zzl zzbyi;
        private zzeha<zzv> zzbyj = zzbfo();
        private int zzdw;

        /* renamed from: com.google.android.gms.internal.ads.zztw$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public enum C0016zza implements zzegu {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10);
            
            private static final zzegt<C0016zza> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public static C0016zza zzbz(int i) {
                switch (i) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    default:
                        return null;
                }
            }

            public static zzegw zzw() {
                return zzua.zzeu;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private C0016zza(int i) {
                this.value = i;
            }

            static {
                zzes = new zztz();
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zzb extends zzegp.zzb<zza, zzb> implements zzeib {
            private zzb() {
                super(zza.zzbyk);
            }

            public final zzb zzb(C0016zza zza) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zza(zza);
                return this;
            }

            public final zzb zza(zze.zza zza) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zza((zze) ((zzegp) zza.zzbfx()));
                return this;
            }

            /* synthetic */ zzb(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(C0016zza zza) {
            this.zzbxz = zza.zzv();
            this.zzdw |= 1;
        }

        public final zze zznb() {
            zze zze = this.zzbyc;
            return zze == null ? zze.zzno() : zze;
        }

        /* access modifiers changed from: private */
        public final void zza(zze zze) {
            zze.getClass();
            this.zzbyc = zze;
            this.zzdw |= 8;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb((zzty) null);
                case 3:
                    return zza((zzehz) zzbyk, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzdw", "zzbxz", C0016zza.zzw(), "zzbya", zzug.zzw(), "zzbyb", "zzbyc", "zzbyd", zzc.class, "zzbye", "zzbyf", "zzbyg", "zzbyh", "zzbyi", "zzbyj", zzv.class});
                case 4:
                    return zzbyk;
                case 5:
                    zzeim<zza> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zza.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzbyk);
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

        public static zza zznc() {
            return zzbyk;
        }

        static {
            zza zza = new zza();
            zzbyk = zza;
            zzegp.zza(zza.class, zza);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzaa extends zzegp<zzaa, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzaa zzcgg;
        private static volatile zzeim<zzaa> zzel;
        private int zzcch = 1000;
        private zzx zzcfs;
        private zzt zzcft;
        private int zzdw;

        private zzaa() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzaa, zza> implements zzeib {
            private zza() {
                super(zzaa.zzcgg);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzaa();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcgg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcch", zzug.zzw(), "zzcfs", "zzcft"});
                case 4:
                    return zzcgg;
                case 5:
                    zzeim<zzaa> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzaa.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcgg);
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
            zzaa zzaa = new zzaa();
            zzcgg = zzaa;
            zzegp.zza(zzaa.class, zzaa);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzab extends zzegp<zzab, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzab zzcgi;
        private static volatile zzeim<zzab> zzel;
        private int zzcch = 1000;
        private int zzcfi;
        private int zzcfj;
        private zzx zzcfs;
        private int zzcge;
        private long zzcgh;
        private int zzdw;

        private zzab() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzab, zza> implements zzeib {
            private zza() {
                super(zzab.zzcgi);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzab();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcgi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzdw", "zzcch", zzug.zzw(), "zzcfs", "zzcfi", "zzcfj", "zzcge", "zzcgh"});
                case 4:
                    return zzcgi;
                case 5:
                    zzeim<zzab> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzab.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcgi);
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
            zzab zzab = new zzab();
            zzcgi = zzab;
            zzegp.zza(zzab.class, zzab);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzac extends zzegp<zzac, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzac zzcgj;
        private static volatile zzeim<zzac> zzel;
        private int zzcch = 1000;
        private zzx zzcfs;
        private zzt zzcft;
        private int zzdw;

        private zzac() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzac, zza> implements zzeib {
            private zza() {
                super(zzac.zzcgj);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzac();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcgj, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcch", zzug.zzw(), "zzcfs", "zzcft"});
                case 4:
                    return zzcgj;
                case 5:
                    zzeim<zzac> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzac.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcgj);
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
            zzac zzac = new zzac();
            zzcgj = zzac;
            zzegp.zza(zzac.class, zzac);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzad extends zzegp<zzad, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzad zzcgk;
        private static volatile zzeim<zzad> zzel;
        private int zzcch = 1000;
        private zzx zzcfs;
        private int zzdw;

        private zzad() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzad, zza> implements zzeib {
            private zza() {
                super(zzad.zzcgk);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzad();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcgk, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzcch", zzug.zzw(), "zzcfs"});
                case 4:
                    return zzcgk;
                case 5:
                    zzeim<zzad> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzad.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcgk);
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
            zzad zzad = new zzad();
            zzcgk = zzad;
            zzegp.zza(zzad.class, zzad);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzae extends zzegp<zzae, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzae zzcgn;
        private static volatile zzeim<zzae> zzel;
        private boolean zzcgl;
        private int zzcgm;
        private int zzdw;

        private zzae() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzae, zza> implements zzeib {
            private zza() {
                super(zzae.zzcgn);
            }

            public final boolean zzpc() {
                return ((zzae) this.zzift).zzpc();
            }

            public final zza zzx(boolean z) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzae) this.zzift).zzw(z);
                return this;
            }

            public final zza zzcy(int i) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzae) this.zzift).zzcx(i);
                return this;
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        public final boolean zzpc() {
            return this.zzcgl;
        }

        /* access modifiers changed from: private */
        public final void zzw(boolean z) {
            this.zzdw |= 1;
            this.zzcgl = z;
        }

        /* access modifiers changed from: private */
        public final void zzcx(int i) {
            this.zzdw |= 2;
            this.zzcgm = i;
        }

        public static zza zzpd() {
            return (zza) zzcgn.zzbfj();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzae();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcgn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcgl", "zzcgm"});
                case 4:
                    return zzcgn;
                case 5:
                    zzeim<zzae> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzae.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcgn);
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
            zzae zzae = new zzae();
            zzcgn = zzae;
            zzegp.zza(zzae.class, zzae);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzb extends zzegp<zzb, C0018zzb> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzb zzbzc;
        private static volatile zzeim<zzb> zzel;
        private zzeha<zza> zzbzb = zzbfo();

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp<zza, C0017zza> implements zzeib {
            /* access modifiers changed from: private */
            public static final zza zzbza;
            private static volatile zzeim<zza> zzel;
            private int zzbyx;
            private zzd zzbyy;
            private zze zzbyz;
            private int zzdw;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zztw$zzb$zza$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            public static final class C0017zza extends zzegp.zzb<zza, C0017zza> implements zzeib {
                private C0017zza() {
                    super(zza.zzbza);
                }

                public final C0017zza zzb(zzc zzc) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zza(zzc);
                    return this;
                }

                public final C0017zza zza(zzd.zza zza) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zza((zzd) ((zzegp) zza.zzbfx()));
                    return this;
                }

                public final C0017zza zza(zze.zza zza) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zza((zze) ((zzegp) zza.zzbfx()));
                    return this;
                }

                /* synthetic */ C0017zza(zzty zzty) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzc zzc) {
                this.zzbyx = zzc.zzv();
                this.zzdw |= 1;
            }

            /* access modifiers changed from: private */
            public final void zza(zzd zzd) {
                zzd.getClass();
                this.zzbyy = zzd;
                this.zzdw |= 2;
            }

            /* access modifiers changed from: private */
            public final void zza(zze zze) {
                zze.getClass();
                this.zzbyz = zze;
                this.zzdw |= 4;
            }

            public static C0017zza zzne() {
                return (C0017zza) zzbza.zzbfj();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzty.zzdv[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0017zza((zzty) null);
                    case 3:
                        return zza((zzehz) zzbza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzbyx", zzc.zzw(), "zzbyy", "zzbyz"});
                    case 4:
                        return zzbza;
                    case 5:
                        zzeim<zza> zzeim = zzel;
                        if (zzeim == null) {
                            synchronized (zza.class) {
                                zzeim = zzel;
                                if (zzeim == null) {
                                    zzeim = new zzegp.zza<>(zzbza);
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
                zzbza = zza;
                zzegp.zza(zza.class, zza);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public enum zzc implements zzegu {
            UNSPECIFIED(0),
            IN_MEMORY(1);
            
            private static final zzegt<zzc> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public static zzc zzca(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static zzegw zzw() {
                return zzuc.zzeu;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzes = new zzub();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zzd extends zzegp<zzd, zza> implements zzeib {
            /* access modifiers changed from: private */
            public static final zzd zzbzi;
            private static volatile zzeim<zzd> zzel;
            private boolean zzbzg;
            private int zzbzh;
            private int zzdw;

            private zzd() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            public static final class zza extends zzegp.zzb<zzd, zza> implements zzeib {
                private zza() {
                    super(zzd.zzbzi);
                }

                public final zza zzt(boolean z) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzd) this.zzift).zzq(z);
                    return this;
                }

                public final zza zzcc(int i) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzd) this.zzift).zzcb(i);
                    return this;
                }

                /* synthetic */ zza(zzty zzty) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzq(boolean z) {
                this.zzdw |= 1;
                this.zzbzg = z;
            }

            /* access modifiers changed from: private */
            public final void zzcb(int i) {
                this.zzdw |= 2;
                this.zzbzh = i;
            }

            public static zza zzni() {
                return (zza) zzbzi.zzbfj();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzty.zzdv[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza((zzty) null);
                    case 3:
                        return zza((zzehz) zzbzi, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzdw", "zzbzg", "zzbzh"});
                    case 4:
                        return zzbzi;
                    case 5:
                        zzeim<zzd> zzeim = zzel;
                        if (zzeim == null) {
                            synchronized (zzd.class) {
                                zzeim = zzel;
                                if (zzeim == null) {
                                    zzeim = new zzegp.zza<>(zzbzi);
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
                zzd zzd = new zzd();
                zzbzi = zzd;
                zzegp.zza(zzd.class, zzd);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zze extends zzegp<zze, zza> implements zzeib {
            /* access modifiers changed from: private */
            public static final zze zzbzl;
            private static volatile zzeim<zze> zzel;
            private int zzbzh;
            private boolean zzbzj;
            private boolean zzbzk;
            private int zzdw;

            private zze() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            public static final class zza extends zzegp.zzb<zze, zza> implements zzeib {
                private zza() {
                    super(zze.zzbzl);
                }

                public final zza zzu(boolean z) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzr(z);
                    return this;
                }

                public final zza zzv(boolean z) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzs(z);
                    return this;
                }

                public final zza zzcd(int i) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcb(i);
                    return this;
                }

                /* synthetic */ zza(zzty zzty) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzr(boolean z) {
                this.zzdw |= 1;
                this.zzbzj = z;
            }

            /* access modifiers changed from: private */
            public final void zzs(boolean z) {
                this.zzdw |= 2;
                this.zzbzk = z;
            }

            /* access modifiers changed from: private */
            public final void zzcb(int i) {
                this.zzdw |= 4;
                this.zzbzh = i;
            }

            public static zza zznk() {
                return (zza) zzbzl.zzbfj();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzty.zzdv[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new zza((zzty) null);
                    case 3:
                        return zza((zzehz) zzbzl, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzdw", "zzbzj", "zzbzk", "zzbzh"});
                    case 4:
                        return zzbzl;
                    case 5:
                        zzeim<zze> zzeim = zzel;
                        if (zzeim == null) {
                            synchronized (zze.class) {
                                zzeim = zzel;
                                if (zzeim == null) {
                                    zzeim = new zzegp.zza<>(zzbzl);
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
                zze zze = new zze();
                zzbzl = zze;
                zzegp.zza(zze.class, zze);
            }
        }

        private zzb() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zztw$zzb$zzb  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class C0018zzb extends zzegp.zzb<zzb, C0018zzb> implements zzeib {
            private C0018zzb() {
                super(zzb.zzbzc);
            }

            public final C0018zzb zza(zza.C0017zza zza) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zza((zza) ((zzegp) zza.zzbfx()));
                return this;
            }

            /* synthetic */ C0018zzb(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            zza2.getClass();
            zzeha<zza> zzeha = this.zzbzb;
            if (!zzeha.zzbdf()) {
                this.zzbzb = zzegp.zza(zzeha);
            }
            this.zzbzb.add(zza2);
        }

        public static C0018zzb zzng() {
            return (C0018zzb) zzbzc.zzbfj();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C0018zzb((zzty) null);
                case 3:
                    return zza((zzehz) zzbzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbzb", zza.class});
                case 4:
                    return zzbzc;
                case 5:
                    zzeim<zzb> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzb.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzbzc);
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
            zzbzc = zzb;
            zzegp.zza(zzb.class, zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzc extends zzegp<zzc, zzb> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzc zzbzo;
        private static volatile zzeim<zzc> zzel;
        private int zzbzm;
        private zzr zzbzn;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public enum zza implements zzegu {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);
            
            private static final zzegt<zza> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public static zza zzce(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzegw zzw() {
                return zzue.zzeu;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzes = new zzud();
            }
        }

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zzb extends zzegp.zzb<zzc, zzb> implements zzeib {
            private zzb() {
                super(zzc.zzbzo);
            }

            /* synthetic */ zzb(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zzb((zzty) null);
                case 3:
                    return zza((zzehz) zzbzo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzbzm", zza.zzw(), "zzbzn"});
                case 4:
                    return zzbzo;
                case 5:
                    zzeim<zzc> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzc.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzbzo);
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
            zzc zzc = new zzc();
            zzbzo = zzc;
            zzegp.zza(zzc.class, zzc);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzd extends zzegp<zzd, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzd zzcae;
        private static volatile zzeim<zzd> zzel;
        private String zzcab = "";
        private zzeha<zzc> zzcac = zzbfo();
        private int zzcad;
        private int zzdw;

        private zzd() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzd, zza> implements zzeib {
            private zza() {
                super(zzd.zzcae);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcae, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzdw", "zzcab", "zzcac", zzc.class, "zzcad", zzug.zzw()});
                case 4:
                    return zzcae;
                case 5:
                    zzeim<zzd> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzd.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcae);
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
            zzd zzd = new zzd();
            zzcae = zzd;
            zzegp.zza(zzd.class, zzd);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zze extends zzegp<zze, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zze zzcak;
        private static volatile zzeim<zze> zzel;
        private String zzcaf = "";
        private zzeha<zzc> zzcag = zzbfo();
        private int zzcah = 1000;
        private int zzcai = 1000;
        private int zzcaj = 1000;
        private int zzdw;

        private zze() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zze, zza> implements zzeib {
            private zza() {
                super(zze.zzcak);
            }

            public final zza zzbx(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zze) this.zzift).zzby(str);
                return this;
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzby(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzcaf = str;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcak, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzdw", "zzcaf", "zzcag", zzc.class, "zzcah", zzug.zzw(), "zzcai", zzug.zzw(), "zzcaj", zzug.zzw()});
                case 4:
                    return zzcak;
                case 5:
                    zzeim<zze> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zze.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcak);
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

        public static zze zzno() {
            return zzcak;
        }

        static {
            zze zze = new zze();
            zzcak = zze;
            zzegp.zza(zze.class, zze);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzf extends zzegp<zzf, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzf zzcar;
        private static volatile zzeim<zzf> zzel;
        private int zzcal;
        private zzt zzcam;
        private zzt zzcan;
        private zzt zzcao;
        private zzeha<zzt> zzcap = zzbfo();
        private int zzcaq;
        private int zzdw;

        private zzf() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzf, zza> implements zzeib {
            private zza() {
                super(zzf.zzcar);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcar, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzdw", "zzcal", "zzcam", "zzcan", "zzcao", "zzcap", zzt.class, "zzcaq"});
                case 4:
                    return zzcar;
                case 5:
                    zzeim<zzf> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzf.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcar);
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
            zzf zzf = new zzf();
            zzcar = zzf;
            zzegp.zza(zzf.class, zzf);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzg extends zzegp<zzg, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzg zzcba;
        private static volatile zzeim<zzg> zzel;
        private String zzcas = "";
        private zzt zzcat;
        private int zzcau;
        private zzu zzcav;
        private int zzcaw;
        private int zzcax = 1000;
        private int zzcay = 1000;
        private int zzcaz = 1000;
        private int zzdw;

        private zzg() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzg, zza> implements zzeib {
            private zza() {
                super(zzg.zzcba);
            }

            public final zza zzbz(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzg) this.zzift).zzca(str);
                return this;
            }

            public final zza zza(zzu zzu) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzg) this.zzift).zzb(zzu);
                return this;
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzca(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzcas = str;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzu zzu) {
            zzu.getClass();
            this.zzcav = zzu;
            this.zzdw |= 8;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcba, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzdw", "zzcas", "zzcat", "zzcau", "zzcav", "zzcaw", "zzcax", zzug.zzw(), "zzcay", zzug.zzw(), "zzcaz", zzug.zzw()});
                case 4:
                    return zzcba;
                case 5:
                    zzeim<zzg> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzg.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcba);
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

        public static zzg zznr() {
            return zzcba;
        }

        static {
            zzg zzg = new zzg();
            zzcba = zzg;
            zzegp.zza(zzg.class, zzg);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzh extends zzegp<zzh, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzh zzcbf;
        private static volatile zzeim<zzh> zzel;
        private int zzcbb;
        private zzu zzcbc;
        private String zzcbd = "";
        private String zzcbe = "";
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public enum zzb implements zzegu {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);
            
            private static final zzegt<zzb> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public static zzb zzcf(int i) {
                if (i == 0) {
                    return PLATFORM_UNSPECIFIED;
                }
                if (i == 1) {
                    return IOS;
                }
                if (i != 2) {
                    return null;
                }
                return ANDROID;
            }

            public static zzegw zzw() {
                return zzuh.zzeu;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzes = new zzuf();
            }
        }

        private zzh() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzh, zza> implements zzeib {
            private zza() {
                super(zzh.zzcbf);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcbf, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzdw", "zzcbb", zzb.zzw(), "zzcbc", "zzcbd", "zzcbe"});
                case 4:
                    return zzcbf;
                case 5:
                    zzeim<zzh> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzh.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcbf);
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
            zzh zzh = new zzh();
            zzcbf = zzh;
            zzegp.zza(zzh.class, zzh);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzi extends zzegp<zzi, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzi zzccb;
        private static volatile zzeim<zzi> zzel;
        private int zzcbo;
        private String zzcbp = "";
        private int zzcbq;
        private int zzcbr = 1000;
        private zzu zzcbs;
        private zzegx zzcbt = zzbfn();
        private zzg zzcbu;
        private zzh zzcbv;
        private zzm zzcbw;
        private zza zzcbx;
        private zzo zzcby;
        private zzae zzcbz;
        private zzb zzcca;
        private int zzdw;

        private zzi() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzi, zza> implements zzeib {
            private zza() {
                super(zzi.zzccb);
            }

            public final String zznu() {
                return ((zzi) this.zzift).zznu();
            }

            public final zza zzcb(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzi) this.zzift).zzcc(str);
                return this;
            }

            public final zza zza(Iterable<? extends Long> iterable) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzi) this.zzift).zzb(iterable);
                return this;
            }

            public final zza zznv() {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzi) this.zzift).zzny();
                return this;
            }

            public final zzg zznw() {
                return ((zzi) this.zzift).zznw();
            }

            public final zza zza(zzg.zza zza) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzi) this.zzift).zza((zzg) ((zzegp) zza.zzbfx()));
                return this;
            }

            public final zza zznx() {
                return ((zzi) this.zzift).zznx();
            }

            public final zza zza(zza.zzb zzb) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzi) this.zzift).zza((zza) ((zzegp) zzb.zzbfx()));
                return this;
            }

            public final zza zza(zzo zzo) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzi) this.zzift).zzb(zzo);
                return this;
            }

            public final zza zza(zzae zzae) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzi) this.zzift).zzb(zzae);
                return this;
            }

            public final zza zza(zzb zzb) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzi) this.zzift).zzb(zzb);
                return this;
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        public final String zznu() {
            return this.zzcbp;
        }

        /* access modifiers changed from: private */
        public final void zzcc(String str) {
            str.getClass();
            this.zzdw |= 2;
            this.zzcbp = str;
        }

        /* access modifiers changed from: private */
        public final void zzb(Iterable<? extends Long> iterable) {
            zzegx zzegx = this.zzcbt;
            if (!zzegx.zzbdf()) {
                int size = zzegx.size();
                this.zzcbt = zzegx.zzhd(size == 0 ? 10 : size << 1);
            }
            zzeev.zza(iterable, this.zzcbt);
        }

        /* access modifiers changed from: private */
        public final void zzny() {
            this.zzcbt = zzbfn();
        }

        public final zzg zznw() {
            zzg zzg = this.zzcbu;
            return zzg == null ? zzg.zznr() : zzg;
        }

        /* access modifiers changed from: private */
        public final void zza(zzg zzg) {
            zzg.getClass();
            this.zzcbu = zzg;
            this.zzdw |= 32;
        }

        public final zza zznx() {
            zza zza2 = this.zzcbx;
            return zza2 == null ? zza.zznc() : zza2;
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            zza2.getClass();
            this.zzcbx = zza2;
            this.zzdw |= 256;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzo zzo) {
            zzo.getClass();
            this.zzcby = zzo;
            this.zzdw |= 512;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzae zzae) {
            zzae.getClass();
            this.zzcbz = zzae;
            this.zzdw |= 1024;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzb zzb) {
            zzb.getClass();
            this.zzcca = zzb;
            this.zzdw |= 2048;
        }

        public static zza zznz() {
            return (zza) zzccb.zzbfj();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzccb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzdw", "zzcbo", "zzcbp", "zzcbq", "zzcbr", zzug.zzw(), "zzcbs", "zzcbt", "zzcbu", "zzcbv", "zzcbw", "zzcbx", "zzcby", "zzcbz", "zzcca"});
                case 4:
                    return zzccb;
                case 5:
                    zzeim<zzi> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzi.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzccb);
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
            zzi zzi = new zzi();
            zzccb = zzi;
            zzegp.zza(zzi.class, zzi);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzj extends zzegp<zzj, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzj zzccg;
        private static volatile zzeim<zzj> zzel;
        private String zzccc = "";
        private int zzccd;
        private zzegv zzcce = zzbfm();
        private zzt zzccf;
        private int zzdw;

        private zzj() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzj, zza> implements zzeib {
            private zza() {
                super(zzj.zzccg);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzccg, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzdw", "zzccc", "zzccd", zzug.zzw(), "zzcce", "zzccf"});
                case 4:
                    return zzccg;
                case 5:
                    zzeim<zzj> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzj.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzccg);
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
            zzj zzj = new zzj();
            zzccg = zzj;
            zzegp.zza(zzj.class, zzj);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzk extends zzegp<zzk, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzk zzcci;
        private static volatile zzeim<zzk> zzel;
        private zzegv zzcce = zzbfm();
        private int zzcch;
        private int zzdw;

        private zzk() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzk, zza> implements zzeib {
            private zza() {
                super(zzk.zzcci);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcci, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzdw", "zzcch", zzug.zzw(), "zzcce"});
                case 4:
                    return zzcci;
                case 5:
                    zzeim<zzk> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzk.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcci);
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
            zzk zzk = new zzk();
            zzcci = zzk;
            zzegp.zza(zzk.class, zzk);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzl extends zzegp<zzl, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzl zzccl;
        private static volatile zzeim<zzl> zzel;
        private zzt zzccf;
        private int zzcch;
        private zzj zzccj;
        private zzeha<zzs> zzcck = zzbfo();
        private int zzdw;

        private zzl() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzl, zza> implements zzeib {
            private zza() {
                super(zzl.zzccl);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzccl, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzdw", "zzccj", "zzcck", zzs.class, "zzcch", zzug.zzw(), "zzccf"});
                case 4:
                    return zzccl;
                case 5:
                    zzeim<zzl> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzl.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzccl);
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
            zzl zzl = new zzl();
            zzccl = zzl;
            zzegp.zza(zzl.class, zzl);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzm extends zzegp<zzm, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzm zzccn;
        private static volatile zzeim<zzm> zzel;
        private int zzbzm;
        private int zzccm;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public enum zzb implements zzegu {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);
            
            private static final zzegt<zzb> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public static zzb zzch(int i) {
                if (i == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return TWO_G;
                }
                if (i == 2) {
                    return THREE_G;
                }
                if (i != 4) {
                    return null;
                }
                return LTE;
            }

            public static zzegw zzw() {
                return zzul.zzeu;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzes = new zzuk();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public enum zzc implements zzegu {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);
            
            private static final zzegt<zzc> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public static zzc zzci(int i) {
                if (i == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return CELL;
                }
                if (i != 2) {
                    return null;
                }
                return WIFI;
            }

            public static zzegw zzw() {
                return zzum.zzeu;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzes = new zzun();
            }
        }

        private zzm() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzm, zza> implements zzeib {
            private zza() {
                super(zzm.zzccn);
            }

            public final zza zza(zzc zzc) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzm) this.zzift).zzb(zzc);
                return this;
            }

            public final zza zza(zzb zzb) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzm) this.zzift).zzb(zzb);
                return this;
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzb(zzc zzc2) {
            this.zzbzm = zzc2.zzv();
            this.zzdw |= 1;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzb zzb2) {
            this.zzccm = zzb2.zzv();
            this.zzdw |= 2;
        }

        public static zza zzoe() {
            return (zza) zzccn.zzbfj();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzccn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzdw", "zzbzm", zzc.zzw(), "zzccm", zzb.zzw()});
                case 4:
                    return zzccn;
                case 5:
                    zzeim<zzm> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzm.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzccn);
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
            zzm zzm = new zzm();
            zzccn = zzm;
            zzegp.zza(zzm.class, zzm);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzn extends zzegp<zzn, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzn zzccz;
        private static volatile zzeim<zzn> zzel;
        private int zzccx;
        private zzt zzccy;
        private int zzdw;

        private zzn() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzn, zza> implements zzeib {
            private zza() {
                super(zzn.zzccz);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzccz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzccx", zzug.zzw(), "zzccy"});
                case 4:
                    return zzccz;
                case 5:
                    zzeim<zzn> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzn.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzccz);
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
            zzn zzn = new zzn();
            zzccz = zzn;
            zzegp.zza(zzn.class, zzn);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzo extends zzegp<zzo, zzc> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzo zzcdt;
        private static volatile zzeim<zzo> zzel;
        private zzeha<zza> zzbzb = zzbfo();
        private int zzcdo;
        private int zzcdp;
        private long zzcdq;
        private String zzcdr = "";
        private long zzcds;
        private int zzdw;
        private String zzdx = "";

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp<zza, C0019zza> implements zzeib {
            private static final zzegy<Integer, zzc.zza> zzcdf = new zzuo();
            /* access modifiers changed from: private */
            public static final zza zzcdn;
            private static volatile zzeim<zza> zzel;
            private long zzcda;
            private int zzcdb;
            private long zzcdc;
            private long zzcdd;
            private zzegv zzcde = zzbfm();
            private zzm zzcdg;
            private int zzcdh;
            private int zzcdi;
            private int zzcdj;
            private int zzcdk;
            private int zzcdl;
            private int zzcdm;
            private int zzdw;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zztw$zzo$zza$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            public static final class C0019zza extends zzegp.zzb<zza, C0019zza> implements zzeib {
                private C0019zza() {
                    super(zza.zzcdn);
                }

                public final C0019zza zzes(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).setTimestamp(j);
                    return this;
                }

                public final C0019zza zzf(zzug zzug) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zza(zzug);
                    return this;
                }

                public final C0019zza zzet(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zzeo(j);
                    return this;
                }

                public final C0019zza zzeu(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zzep(j);
                    return this;
                }

                public final C0019zza zze(Iterable<? extends zzc.zza> iterable) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zzc(iterable);
                    return this;
                }

                public final C0019zza zzb(zzm zzm) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zza(zzm);
                    return this;
                }

                public final C0019zza zzg(zzug zzug) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zzb(zzug);
                    return this;
                }

                public final C0019zza zzh(zzug zzug) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zzc(zzug);
                    return this;
                }

                public final C0019zza zzi(zzug zzug) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zzd(zzug);
                    return this;
                }

                public final C0019zza zzcm(int i) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zzcj(i);
                    return this;
                }

                public final C0019zza zzj(zzug zzug) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zze(zzug);
                    return this;
                }

                public final C0019zza zzb(zzb zzb) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zza) this.zzift).zza(zzb);
                    return this;
                }

                /* synthetic */ C0019zza(zzty zzty) {
                    this();
                }
            }

            public final long getTimestamp() {
                return this.zzcda;
            }

            /* access modifiers changed from: private */
            public final void setTimestamp(long j) {
                this.zzdw |= 1;
                this.zzcda = j;
            }

            public final zzug zzoh() {
                zzug zzcg = zzug.zzcg(this.zzcdb);
                return zzcg == null ? zzug.ENUM_FALSE : zzcg;
            }

            /* access modifiers changed from: private */
            public final void zza(zzug zzug) {
                this.zzcdb = zzug.zzv();
                this.zzdw |= 2;
            }

            /* access modifiers changed from: private */
            public final void zzeo(long j) {
                this.zzdw |= 4;
                this.zzcdc = j;
            }

            /* access modifiers changed from: private */
            public final void zzep(long j) {
                this.zzdw |= 8;
                this.zzcdd = j;
            }

            /* access modifiers changed from: private */
            public final void zzc(Iterable<? extends zzc.zza> iterable) {
                zzegv zzegv = this.zzcde;
                if (!zzegv.zzbdf()) {
                    this.zzcde = zzegp.zza(zzegv);
                }
                for (zzc.zza zzv : iterable) {
                    this.zzcde.zzhc(zzv.zzv());
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzm zzm) {
                zzm.getClass();
                this.zzcdg = zzm;
                this.zzdw |= 16;
            }

            /* access modifiers changed from: private */
            public final void zzb(zzug zzug) {
                this.zzcdh = zzug.zzv();
                this.zzdw |= 32;
            }

            /* access modifiers changed from: private */
            public final void zzc(zzug zzug) {
                this.zzcdi = zzug.zzv();
                this.zzdw |= 64;
            }

            /* access modifiers changed from: private */
            public final void zzd(zzug zzug) {
                this.zzcdj = zzug.zzv();
                this.zzdw |= 128;
            }

            /* access modifiers changed from: private */
            public final void zzcj(int i) {
                this.zzdw |= 256;
                this.zzcdk = i;
            }

            /* access modifiers changed from: private */
            public final void zze(zzug zzug) {
                this.zzcdl = zzug.zzv();
                this.zzdw |= 512;
            }

            /* access modifiers changed from: private */
            public final void zza(zzb zzb) {
                this.zzcdm = zzb.zzv();
                this.zzdw |= 1024;
            }

            public static zza zzg(byte[] bArr) throws zzegz {
                return (zza) zzegp.zza(zzcdn, bArr);
            }

            public static C0019zza zzoi() {
                return (C0019zza) zzcdn.zzbfj();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzty.zzdv[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0019zza((zzty) null);
                    case 3:
                        return zza((zzehz) zzcdn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzdw", "zzcda", "zzcdb", zzug.zzw(), "zzcdc", "zzcdd", "zzcde", zzc.zza.zzw(), "zzcdg", "zzcdh", zzug.zzw(), "zzcdi", zzug.zzw(), "zzcdj", zzug.zzw(), "zzcdk", "zzcdl", zzug.zzw(), "zzcdm", zzb.zzw()});
                    case 4:
                        return zzcdn;
                    case 5:
                        zzeim<zza> zzeim = zzel;
                        if (zzeim == null) {
                            synchronized (zza.class) {
                                zzeim = zzel;
                                if (zzeim == null) {
                                    zzeim = new zzegp.zza<>(zzcdn);
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
                zzcdn = zza;
                zzegp.zza(zza.class, zza);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public enum zzb implements zzegu {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);
            
            private static final zzegt<zzb> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public static zzb zzcn(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return CONNECTING;
                }
                if (i == 2) {
                    return CONNECTED;
                }
                if (i == 3) {
                    return DISCONNECTING;
                }
                if (i == 4) {
                    return DISCONNECTED;
                }
                if (i != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static zzegw zzw() {
                return zzup.zzeu;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzes = new zzuq();
            }
        }

        private zzo() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zzc extends zzegp.zzb<zzo, zzc> implements zzeib {
            private zzc() {
                super(zzo.zzcdt);
            }

            public final zzc zzf(Iterable<? extends zza> iterable) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzo) this.zzift).zzd(iterable);
                return this;
            }

            public final zzc zzco(int i) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzo) this.zzift).zzck(i);
                return this;
            }

            public final zzc zzcp(int i) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzo) this.zzift).zzcl(i);
                return this;
            }

            public final zzc zzev(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzo) this.zzift).zzeq(j);
                return this;
            }

            public final zzc zzce(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzo) this.zzift).zzp(str);
                return this;
            }

            public final zzc zzcf(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzo) this.zzift).zzcd(str);
                return this;
            }

            public final zzc zzew(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzo) this.zzift).zzer(j);
                return this;
            }

            /* synthetic */ zzc(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzd(Iterable<? extends zza> iterable) {
            zzeha<zza> zzeha = this.zzbzb;
            if (!zzeha.zzbdf()) {
                this.zzbzb = zzegp.zza(zzeha);
            }
            zzeev.zza(iterable, this.zzbzb);
        }

        /* access modifiers changed from: private */
        public final void zzck(int i) {
            this.zzdw |= 1;
            this.zzcdo = i;
        }

        /* access modifiers changed from: private */
        public final void zzcl(int i) {
            this.zzdw |= 2;
            this.zzcdp = i;
        }

        /* access modifiers changed from: private */
        public final void zzeq(long j) {
            this.zzdw |= 4;
            this.zzcdq = j;
        }

        /* access modifiers changed from: private */
        public final void zzp(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zzdx = str;
        }

        /* access modifiers changed from: private */
        public final void zzcd(String str) {
            str.getClass();
            this.zzdw |= 16;
            this.zzcdr = str;
        }

        /* access modifiers changed from: private */
        public final void zzer(long j) {
            this.zzdw |= 32;
            this.zzcds = j;
        }

        public static zzc zzok() {
            return (zzc) zzcdt.zzbfj();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zzc((zzty) null);
                case 3:
                    return zza((zzehz) zzcdt, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzdw", "zzbzb", zza.class, "zzcdo", "zzcdp", "zzcdq", "zzdx", "zzcdr", "zzcds"});
                case 4:
                    return zzcdt;
                case 5:
                    zzeim<zzo> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzo.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcdt);
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
            zzo zzo = new zzo();
            zzcdt = zzo;
            zzegp.zza(zzo.class, zzo);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzp extends zzegp<zzp, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzp zzcem;
        private static volatile zzeim<zzp> zzel;
        private int zzceb = 1000;
        private int zzcec = 1000;
        private int zzced;
        private int zzcee;
        private int zzcef;
        private int zzceg;
        private int zzceh;
        private int zzcei;
        private int zzcej;
        private int zzcek;
        private zzq zzcel;
        private int zzdw;

        private zzp() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzp, zza> implements zzeib {
            private zza() {
                super(zzp.zzcem);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcem, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzdw", "zzceb", zzug.zzw(), "zzcec", zzug.zzw(), "zzced", "zzcee", "zzcef", "zzceg", "zzceh", "zzcei", "zzcej", "zzcek", "zzcel"});
                case 4:
                    return zzcem;
                case 5:
                    zzeim<zzp> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzp.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcem);
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
            zzp zzp = new zzp();
            zzcem = zzp;
            zzegp.zza(zzp.class, zzp);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzq extends zzegp<zzq, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzq zzcep;
        private static volatile zzeim<zzq> zzel;
        private int zzcen;
        private int zzceo;
        private int zzdw;

        private zzq() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzq, zza> implements zzeib {
            private zza() {
                super(zzq.zzcep);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcep, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcen", "zzceo"});
                case 4:
                    return zzcep;
                case 5:
                    zzeim<zzq> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzq.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcep);
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
            zzq zzq = new zzq();
            zzcep = zzq;
            zzegp.zza(zzq.class, zzq);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzr extends zzegp<zzr, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzr zzces;
        private static volatile zzeim<zzr> zzel;
        private int zzceq;
        private int zzcer;
        private int zzdw;

        private zzr() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzr, zza> implements zzeib {
            private zza() {
                super(zzr.zzces);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzces, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzceq", "zzcer"});
                case 4:
                    return zzces;
                case 5:
                    zzeim<zzr> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzr.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzces);
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
            zzr zzr = new zzr();
            zzces = zzr;
            zzegp.zza(zzr.class, zzr);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzs extends zzegp<zzs, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzs zzcet;
        private static volatile zzeim<zzs> zzel;
        private String zzccc = "";
        private int zzccd;
        private zzt zzccf;
        private int zzdw;

        private zzs() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzs, zza> implements zzeib {
            private zza() {
                super(zzs.zzcet);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcet, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzccc", "zzccd", zzug.zzw(), "zzccf"});
                case 4:
                    return zzcet;
                case 5:
                    zzeim<zzs> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzs.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcet);
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
            zzs zzs = new zzs();
            zzcet = zzs;
            zzegp.zza(zzs.class, zzs);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzt extends zzegp<zzt, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzt zzcew;
        private static volatile zzeim<zzt> zzel;
        private int zzceu;
        private int zzcev;
        private int zzdw;

        private zzt() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzt, zza> implements zzeib {
            private zza() {
                super(zzt.zzcew);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcew, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzceu", "zzcev"});
                case 4:
                    return zzcew;
                case 5:
                    zzeim<zzt> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzt.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcew);
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
            zzt zzt = new zzt();
            zzcew = zzt;
            zzegp.zza(zzt.class, zzt);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzu extends zzegp<zzu, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzu zzcfa;
        private static volatile zzeim<zzu> zzel;
        private int zzcex;
        private int zzcey;
        private int zzcez;
        private int zzdw;

        private zzu() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzu, zza> implements zzeib {
            private zza() {
                super(zzu.zzcfa);
            }

            public final zza zzcq(int i) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzu) this.zzift).zzct(i);
                return this;
            }

            public final zza zzcr(int i) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzu) this.zzift).zzcu(i);
                return this;
            }

            public final zza zzcs(int i) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzu) this.zzift).zzcv(i);
                return this;
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzct(int i) {
            this.zzdw |= 1;
            this.zzcex = i;
        }

        /* access modifiers changed from: private */
        public final void zzcu(int i) {
            this.zzdw |= 2;
            this.zzcey = i;
        }

        /* access modifiers changed from: private */
        public final void zzcv(int i) {
            this.zzdw |= 4;
            this.zzcez = i;
        }

        public static zza zzor() {
            return (zza) zzcfa.zzbfj();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcfa, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzdw", "zzcex", "zzcey", "zzcez"});
                case 4:
                    return zzcfa;
                case 5:
                    zzeim<zzu> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzu.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcfa);
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
            zzu zzu = new zzu();
            zzcfa = zzu;
            zzegp.zza(zzu.class, zzu);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzv extends zzegp<zzv, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzv zzcfr;
        private static volatile zzeim<zzv> zzel;
        private zzz zzcfb;
        private zzab zzcfc;
        private zzac zzcfd;
        private zzad zzcfe;
        private zzw zzcff;
        private zzaa zzcfg;
        private zzy zzcfh;
        private int zzcfi;
        private int zzcfj;
        private zzt zzcfk;
        private int zzcfl;
        private int zzcfm;
        private int zzcfn;
        private int zzcfo;
        private int zzcfp;
        private long zzcfq;
        private int zzdw;

        private zzv() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzv, zza> implements zzeib {
            private zza() {
                super(zzv.zzcfr);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcfr, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzdw", "zzcfb", "zzcfc", "zzcfd", "zzcfe", "zzcff", "zzcfg", "zzcfh", "zzcfi", "zzcfj", "zzcfk", "zzcfl", "zzcfm", "zzcfn", "zzcfo", "zzcfp", "zzcfq"});
                case 4:
                    return zzcfr;
                case 5:
                    zzeim<zzv> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzv.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcfr);
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
            zzv zzv = new zzv();
            zzcfr = zzv;
            zzegp.zza(zzv.class, zzv);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzw extends zzegp<zzw, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzw zzcfu;
        private static volatile zzeim<zzw> zzel;
        private int zzcch = 1000;
        private zzx zzcfs;
        private zzt zzcft;
        private int zzdw;

        private zzw() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzw, zza> implements zzeib {
            private zza() {
                super(zzw.zzcfu);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzw();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcfu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcch", zzug.zzw(), "zzcfs", "zzcft"});
                case 4:
                    return zzcfu;
                case 5:
                    zzeim<zzw> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzw.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcfu);
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
            zzw zzw = new zzw();
            zzcfu = zzw;
            zzegp.zza(zzw.class, zzw);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzx extends zzegp<zzx, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzx zzcfw;
        private static volatile zzeim<zzx> zzel;
        private int zzcfv;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public enum zzb implements zzegu {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);
            
            private static final zzegt<zzb> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public static zzb zzcw(int i) {
                if (i == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static zzegw zzw() {
                return zzus.zzeu;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzes = new zzur();
            }
        }

        private zzx() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzx, zza> implements zzeib {
            private zza() {
                super(zzx.zzcfw);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzx();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcfw, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzdw", "zzcfv", zzb.zzw()});
                case 4:
                    return zzcfw;
                case 5:
                    zzeim<zzx> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzx.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcfw);
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
            zzx zzx = new zzx();
            zzcfw = zzx;
            zzegp.zza(zzx.class, zzx);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzy extends zzegp<zzy, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzy zzcgd;
        private static volatile zzeim<zzy> zzel;
        private int zzcch = 1000;
        private zzx zzcfs;
        private zzt zzcft;
        private zzu zzcgc;
        private int zzdw;

        private zzy() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzy, zza> implements zzeib {
            private zza() {
                super(zzy.zzcgd);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzy();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcgd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzdw", "zzcgc", "zzcch", zzug.zzw(), "zzcfs", "zzcft"});
                case 4:
                    return zzcgd;
                case 5:
                    zzeim<zzy> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzy.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcgd);
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
            zzy zzy = new zzy();
            zzcgd = zzy;
            zzegp.zza(zzy.class, zzy);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzz extends zzegp<zzz, zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zzz zzcgf;
        private static volatile zzeim<zzz> zzel;
        private int zzcch = 1000;
        private int zzcfi;
        private int zzcfj;
        private zzx zzcfs;
        private int zzcge;
        private int zzdw;

        private zzz() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class zza extends zzegp.zzb<zzz, zza> implements zzeib {
            private zza() {
                super(zzz.zzcgf);
            }

            /* synthetic */ zza(zzty zzty) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzty.zzdv[i - 1]) {
                case 1:
                    return new zzz();
                case 2:
                    return new zza((zzty) null);
                case 3:
                    return zza((zzehz) zzcgf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzdw", "zzcch", zzug.zzw(), "zzcfs", "zzcfi", "zzcfj", "zzcge"});
                case 4:
                    return zzcgf;
                case 5:
                    zzeim<zzz> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zzz.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzcgf);
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
            zzz zzz = new zzz();
            zzcgf = zzz;
            zzegp.zza(zzz.class, zzz);
        }
    }
}
