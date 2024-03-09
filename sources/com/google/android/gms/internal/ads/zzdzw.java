package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdzw extends zzegp<zzdzw, zza> implements zzeib {
    private static volatile zzeim<zzdzw> zzel;
    /* access modifiers changed from: private */
    public static final zzdzw zzhtp;
    private int zzhtf;
    private zzeaa zzhtn;
    private zzebl zzhto;

    private zzdzw() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzdzw, zza> implements zzeib {
        private zza() {
            super(zzdzw.zzhtp);
        }

        public final zza zzet(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzw) this.zzift).setVersion(i);
            return this;
        }

        public final zza zzb(zzeaa zzeaa) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzw) this.zzift).zza(zzeaa);
            return this;
        }

        public final zza zzb(zzebl zzebl) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzw) this.zzift).zza(zzebl);
            return this;
        }

        /* synthetic */ zza(zzdzx zzdzx) {
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

    public final zzeaa zzayq() {
        zzeaa zzeaa = this.zzhtn;
        return zzeaa == null ? zzeaa.zzayz() : zzeaa;
    }

    /* access modifiers changed from: private */
    public final void zza(zzeaa zzeaa) {
        zzeaa.getClass();
        this.zzhtn = zzeaa;
    }

    public final zzebl zzayr() {
        zzebl zzebl = this.zzhto;
        return zzebl == null ? zzebl.zzbar() : zzebl;
    }

    /* access modifiers changed from: private */
    public final void zza(zzebl zzebl) {
        zzebl.getClass();
        this.zzhto = zzebl;
    }

    public static zzdzw zze(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzdzw) zzegp.zza(zzhtp, zzeff, zzegc);
    }

    public static zza zzays() {
        return (zza) zzhtp.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzx.zzdv[i - 1]) {
            case 1:
                return new zzdzw();
            case 2:
                return new zza((zzdzx) null);
            case 3:
                return zza((zzehz) zzhtp, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzhtf", "zzhtn", "zzhto"});
            case 4:
                return zzhtp;
            case 5:
                zzeim<zzdzw> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzdzw.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhtp);
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
        zzdzw zzdzw = new zzdzw();
        zzhtp = zzdzw;
        zzegp.zza(zzdzw.class, zzdzw);
    }
}
