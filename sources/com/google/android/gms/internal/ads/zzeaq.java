package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeaq extends zzegp<zzeaq, zza> implements zzeib {
    private static volatile zzeim<zzeaq> zzel;
    /* access modifiers changed from: private */
    public static final zzeaq zzhue;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;

    private zzeaq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeaq, zza> implements zzeib {
        private zza() {
            super(zzeaq.zzhue);
        }

        public final zza zzex(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaq) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzx(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaq) this.zzift).zzs(zzeff);
            return this;
        }

        /* synthetic */ zza(zzear zzear) {
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

    public static zzeaq zzm(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzeaq) zzegp.zza(zzhue, zzeff, zzegc);
    }

    public static zza zzazp() {
        return (zza) zzhue.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzear.zzdv[i - 1]) {
            case 1:
                return new zzeaq();
            case 2:
                return new zza((zzear) null);
            case 3:
                return zza((zzehz) zzhue, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzhtf", "zzhtg"});
            case 4:
                return zzhue;
            case 5:
                zzeim<zzeaq> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeaq.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhue);
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
        zzeaq zzeaq = new zzeaq();
        zzhue = zzeaq;
        zzegp.zza(zzeaq.class, zzeaq);
    }
}
