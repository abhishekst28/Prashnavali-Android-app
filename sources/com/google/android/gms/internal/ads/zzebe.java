package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzebe extends zzegp<zzebe, zza> implements zzeib {
    private static volatile zzeim<zzebe> zzel;
    /* access modifiers changed from: private */
    public static final zzebe zzhuy;
    private int zzhtf;
    private zzeba zzhuo;
    private zzeff zzhuw = zzeff.zzibd;
    private zzeff zzhux = zzeff.zzibd;

    private zzebe() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzebe, zza> implements zzeib {
        private zza() {
            super(zzebe.zzhuy);
        }

        public final zza zzfa(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebe) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzc(zzeba zzeba) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebe) this.zzift).zzb(zzeba);
            return this;
        }

        public final zza zzab(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebe) this.zzift).zzy(zzeff);
            return this;
        }

        public final zza zzac(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebe) this.zzift).zzz(zzeff);
            return this;
        }

        /* synthetic */ zza(zzebf zzebf) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzhtf;
    }

    /* access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzhtf = i;
    }

    public final zzeba zzazv() {
        zzeba zzeba = this.zzhuo;
        return zzeba == null ? zzeba.zzbaa() : zzeba;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzeba zzeba) {
        zzeba.getClass();
        this.zzhuo = zzeba;
    }

    public final zzeff zzbaf() {
        return this.zzhuw;
    }

    /* access modifiers changed from: private */
    public final void zzy(zzeff zzeff) {
        zzeff.getClass();
        this.zzhuw = zzeff;
    }

    public final zzeff zzbag() {
        return this.zzhux;
    }

    /* access modifiers changed from: private */
    public final void zzz(zzeff zzeff) {
        zzeff.getClass();
        this.zzhux = zzeff;
    }

    public static zzebe zzq(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzebe) zzegp.zza(zzhuy, zzeff, zzegc);
    }

    public static zza zzbah() {
        return (zza) zzhuy.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebf.zzdv[i - 1]) {
            case 1:
                return new zzebe();
            case 2:
                return new zza((zzebf) null);
            case 3:
                return zza((zzehz) zzhuy, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzhtf", "zzhuo", "zzhuw", "zzhux"});
            case 4:
                return zzhuy;
            case 5:
                zzeim<zzebe> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzebe.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhuy);
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

    public static zzebe zzbai() {
        return zzhuy;
    }

    static {
        zzebe zzebe = new zzebe();
        zzhuy = zzebe;
        zzegp.zza(zzebe.class, zzebe);
    }
}
