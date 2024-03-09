package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzebl extends zzegp<zzebl, zza> implements zzeib {
    private static volatile zzeim<zzebl> zzel;
    /* access modifiers changed from: private */
    public static final zzebl zzhvs;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzebq zzhvr;

    private zzebl() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzebl, zza> implements zzeib {
        private zza() {
            super(zzebl.zzhvs);
        }

        public final zza zzfd(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebl) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzd(zzebq zzebq) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebl) this.zzift).zzc(zzebq);
            return this;
        }

        public final zza zzad(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebl) this.zzift).zzs(zzeff);
            return this;
        }

        /* synthetic */ zza(zzebn zzebn) {
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

    public final zzebq zzbap() {
        zzebq zzebq = this.zzhvr;
        return zzebq == null ? zzebq.zzbaw() : zzebq;
    }

    /* access modifiers changed from: private */
    public final void zzc(zzebq zzebq) {
        zzebq.getClass();
        this.zzhvr = zzebq;
    }

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzeff zzeff) {
        zzeff.getClass();
        this.zzhtg = zzeff;
    }

    public static zzebl zzr(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzebl) zzegp.zza(zzhvs, zzeff, zzegc);
    }

    public static zza zzbaq() {
        return (zza) zzhvs.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebn.zzdv[i - 1]) {
            case 1:
                return new zzebl();
            case 2:
                return new zza((zzebn) null);
            case 3:
                return zza((zzehz) zzhvs, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhtf", "zzhvr", "zzhtg"});
            case 4:
                return zzhvs;
            case 5:
                zzeim<zzebl> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzebl.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhvs);
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

    public static zzebl zzbar() {
        return zzhvs;
    }

    static {
        zzebl zzebl = new zzebl();
        zzhvs = zzebl;
        zzegp.zza(zzebl.class, zzebl);
    }
}
