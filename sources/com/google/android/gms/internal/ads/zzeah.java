package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeah extends zzegp<zzeah, zza> implements zzeib {
    private static volatile zzeim<zzeah> zzel;
    /* access modifiers changed from: private */
    public static final zzeah zzhtz;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzeal zzhty;

    private zzeah() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeah, zza> implements zzeib {
        private zza() {
            super(zzeah.zzhtz);
        }

        public final zza zzev(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeah) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzb(zzeal zzeal) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeah) this.zzift).zza(zzeal);
            return this;
        }

        public final zza zzv(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeah) this.zzift).zzs(zzeff);
            return this;
        }

        /* synthetic */ zza(zzeag zzeag) {
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

    public final zzeal zzazg() {
        zzeal zzeal = this.zzhty;
        return zzeal == null ? zzeal.zzazk() : zzeal;
    }

    /* access modifiers changed from: private */
    public final void zza(zzeal zzeal) {
        zzeal.getClass();
        this.zzhty = zzeal;
    }

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzeff zzeff) {
        zzeff.getClass();
        this.zzhtg = zzeff;
    }

    public static zzeah zzi(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzeah) zzegp.zza(zzhtz, zzeff, zzegc);
    }

    public static zza zzazh() {
        return (zza) zzhtz.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeag.zzdv[i - 1]) {
            case 1:
                return new zzeah();
            case 2:
                return new zza((zzeag) null);
            case 3:
                return zza((zzehz) zzhtz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhtf", "zzhty", "zzhtg"});
            case 4:
                return zzhtz;
            case 5:
                zzeim<zzeah> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeah.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhtz);
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
        zzeah zzeah = new zzeah();
        zzhtz = zzeah;
        zzegp.zza(zzeah.class, zzeah);
    }
}
