package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzebt extends zzegp<zzebt, zzb> implements zzeib {
    private static volatile zzeim<zzebt> zzel;
    /* access modifiers changed from: private */
    public static final zzebt zzhvz;
    private String zzhvw = "";
    private zzeff zzhvx = zzeff.zzibd;
    private int zzhvy;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public enum zza implements zzegu {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzegt<zza> zzes = null;
        private final int value;

        public final int zzv() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zza zzfe(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zzv());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        private zza(int i) {
            this.value = i;
        }

        static {
            zzes = new zzebv();
        }
    }

    private zzebt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zzb extends zzegp.zzb<zzebt, zzb> implements zzeib {
        private zzb() {
            super(zzebt.zzhvz);
        }

        public final zzb zzhq(String str) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebt) this.zzift).zzhp(str);
            return this;
        }

        public final zzb zzaf(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebt) this.zzift).zzae(zzeff);
            return this;
        }

        public final zzb zzb(zza zza) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebt) this.zzift).zza(zza);
            return this;
        }

        /* synthetic */ zzb(zzebs zzebs) {
            this();
        }
    }

    public final String zzbay() {
        return this.zzhvw;
    }

    /* access modifiers changed from: private */
    public final void zzhp(String str) {
        str.getClass();
        this.zzhvw = str;
    }

    public final zzeff zzbaz() {
        return this.zzhvx;
    }

    /* access modifiers changed from: private */
    public final void zzae(zzeff zzeff) {
        zzeff.getClass();
        this.zzhvx = zzeff;
    }

    public final zza zzbba() {
        zza zzfe = zza.zzfe(this.zzhvy);
        return zzfe == null ? zza.UNRECOGNIZED : zzfe;
    }

    /* access modifiers changed from: private */
    public final void zza(zza zza2) {
        this.zzhvy = zza2.zzv();
    }

    public static zzb zzbbb() {
        return (zzb) zzhvz.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebs.zzdv[i - 1]) {
            case 1:
                return new zzebt();
            case 2:
                return new zzb((zzebs) null);
            case 3:
                return zza((zzehz) zzhvz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhvw", "zzhvx", "zzhvy"});
            case 4:
                return zzhvz;
            case 5:
                zzeim<zzebt> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzebt.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhvz);
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

    public static zzebt zzbbc() {
        return zzhvz;
    }

    static {
        zzebt zzebt = new zzebt();
        zzhvz = zzebt;
        zzegp.zza(zzebt.class, zzebt);
    }
}
