package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzebd extends zzegp<zzebd, zza> implements zzeib {
    private static volatile zzeim<zzebd> zzel;
    /* access modifiers changed from: private */
    public static final zzebd zzhuv;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzebe zzhuu;

    private zzebd() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzebd, zza> implements zzeib {
        private zza() {
            super(zzebd.zzhuv);
        }

        public final zza zzez(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebd) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzb(zzebe zzebe) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebd) this.zzift).zza(zzebe);
            return this;
        }

        public final zza zzaa(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebd) this.zzift).zzs(zzeff);
            return this;
        }

        /* synthetic */ zza(zzebc zzebc) {
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

    public final zzebe zzbac() {
        zzebe zzebe = this.zzhuu;
        return zzebe == null ? zzebe.zzbai() : zzebe;
    }

    /* access modifiers changed from: private */
    public final void zza(zzebe zzebe) {
        zzebe.getClass();
        this.zzhuu = zzebe;
    }

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzeff zzeff) {
        zzeff.getClass();
        this.zzhtg = zzeff;
    }

    public static zzebd zzp(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzebd) zzegp.zza(zzhuv, zzeff, zzegc);
    }

    public static zza zzbad() {
        return (zza) zzhuv.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebc.zzdv[i - 1]) {
            case 1:
                return new zzebd();
            case 2:
                return new zza((zzebc) null);
            case 3:
                return zza((zzehz) zzhuv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhtf", "zzhuu", "zzhtg"});
            case 4:
                return zzhuv;
            case 5:
                zzeim<zzebd> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzebd.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhuv);
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
        zzebd zzebd = new zzebd();
        zzhuv = zzebd;
        zzegp.zza(zzebd.class, zzebd);
    }
}
