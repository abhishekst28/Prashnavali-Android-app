package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdzr extends zzegp<zzdzr, zza> implements zzeib {
    private static volatile zzeim<zzdzr> zzel;
    /* access modifiers changed from: private */
    public static final zzdzr zzhti;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzdzv zzhth;

    private zzdzr() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzdzr, zza> implements zzeib {
        private zza() {
            super(zzdzr.zzhti);
        }

        public final zza zzes(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzr) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzt(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzr) this.zzift).zzs(zzeff);
            return this;
        }

        public final zza zzd(zzdzv zzdzv) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzr) this.zzift).zzc(zzdzv);
            return this;
        }

        /* synthetic */ zza(zzdzq zzdzq) {
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

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzeff zzeff) {
        zzeff.getClass();
        this.zzhtg = zzeff;
    }

    public final zzdzv zzayj() {
        zzdzv zzdzv = this.zzhth;
        return zzdzv == null ? zzdzv.zzayo() : zzdzv;
    }

    /* access modifiers changed from: private */
    public final void zzc(zzdzv zzdzv) {
        zzdzv.getClass();
        this.zzhth = zzdzv;
    }

    public static zzdzr zzc(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzdzr) zzegp.zza(zzhti, zzeff, zzegc);
    }

    public static zza zzayk() {
        return (zza) zzhti.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzq.zzdv[i - 1]) {
            case 1:
                return new zzdzr();
            case 2:
                return new zza((zzdzq) null);
            case 3:
                return zza((zzehz) zzhti, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzhtf", "zzhtg", "zzhth"});
            case 4:
                return zzhti;
            case 5:
                zzeim<zzdzr> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzdzr.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhti);
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
        zzdzr zzdzr = new zzdzr();
        zzhti = zzdzr;
        zzegp.zza(zzdzr.class, zzdzr);
    }
}
