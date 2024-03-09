package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzece extends zzegp<zzece, zzb> implements zzeib {
    private static volatile zzeim<zzece> zzel;
    /* access modifiers changed from: private */
    public static final zzece zzhxc;
    private int zzhwu;
    private zzeha<zza> zzhxb = zzbfo();

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp<zza, C0007zza> implements zzeib {
        private static volatile zzeim<zza> zzel;
        /* access modifiers changed from: private */
        public static final zza zzhxd;
        private String zzhvw = "";
        private int zzhwn;
        private int zzhwy;
        private int zzhwz;

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzece$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class C0007zza extends zzegp.zzb<zza, C0007zza> implements zzeib {
            private C0007zza() {
                super(zza.zzhxd);
            }

            public final C0007zza zzhr(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzhp(str);
                return this;
            }

            public final C0007zza zzb(zzebu zzebu) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zza(zzebu);
                return this;
            }

            public final C0007zza zzfj(int i) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzfh(i);
                return this;
            }

            public final C0007zza zzb(zzecn zzecn) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zza(zzecn);
                return this;
            }

            /* synthetic */ C0007zza(zzecd zzecd) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzhp(String str) {
            str.getClass();
            this.zzhvw = str;
        }

        /* access modifiers changed from: private */
        public final void zza(zzebu zzebu) {
            this.zzhwy = zzebu.zzv();
        }

        /* access modifiers changed from: private */
        public final void zzfh(int i) {
            this.zzhwz = i;
        }

        /* access modifiers changed from: private */
        public final void zza(zzecn zzecn) {
            this.zzhwn = zzecn.zzv();
        }

        public static C0007zza zzbbv() {
            return (C0007zza) zzhxd.zzbfj();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzecd.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0007zza((zzecd) null);
                case 3:
                    return zza((zzehz) zzhxd, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhvw", "zzhwy", "zzhwz", "zzhwn"});
                case 4:
                    return zzhxd;
                case 5:
                    zzeim<zza> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zza.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzhxd);
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
            zzhxd = zza;
            zzegp.zza(zza.class, zza);
        }
    }

    private zzece() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzb extends zzegp.zzb<zzece, zzb> implements zzeib {
        private zzb() {
            super(zzece.zzhxc);
        }

        public final zzb zzfi(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzece) this.zzift).zzfg(i);
            return this;
        }

        public final zzb zzb(zza zza) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzece) this.zzift).zza(zza);
            return this;
        }

        /* synthetic */ zzb(zzecd zzecd) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final void zzfg(int i) {
        this.zzhwu = i;
    }

    /* access modifiers changed from: private */
    public final void zza(zza zza2) {
        zza2.getClass();
        zzeha<zza> zzeha = this.zzhxb;
        if (!zzeha.zzbdf()) {
            this.zzhxb = zzegp.zza(zzeha);
        }
        this.zzhxb.add(zza2);
    }

    public static zzb zzbbt() {
        return (zzb) zzhxc.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecd.zzdv[i - 1]) {
            case 1:
                return new zzece();
            case 2:
                return new zzb((zzecd) null);
            case 3:
                return zza((zzehz) zzhxc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhwu", "zzhxb", zza.class});
            case 4:
                return zzhxc;
            case 5:
                zzeim<zzece> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzece.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhxc);
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
        zzece zzece = new zzece();
        zzhxc = zzece;
        zzegp.zza(zzece.class, zzece);
    }
}
