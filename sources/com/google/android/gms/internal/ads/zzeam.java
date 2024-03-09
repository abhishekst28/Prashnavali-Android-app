package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeam extends zzegp<zzeam, zza> implements zzeib {
    private static volatile zzeim<zzeam> zzel;
    /* access modifiers changed from: private */
    public static final zzeam zzhuc;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;

    private zzeam() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeam, zza> implements zzeib {
        private zza() {
            super(zzeam.zzhuc);
        }

        public final zza zzew(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeam) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzw(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeam) this.zzift).zzs(zzeff);
            return this;
        }

        /* synthetic */ zza(zzean zzean) {
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

    public static zzeam zzk(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzeam) zzegp.zza(zzhuc, zzeff, zzegc);
    }

    public static zza zzazm() {
        return (zza) zzhuc.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzean.zzdv[i - 1]) {
            case 1:
                return new zzeam();
            case 2:
                return new zza((zzean) null);
            case 3:
                return zza((zzehz) zzhuc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhtf", "zzhtg"});
            case 4:
                return zzhuc;
            case 5:
                zzeim<zzeam> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeam.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhuc);
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
        zzeam zzeam = new zzeam();
        zzhuc = zzeam;
        zzegp.zza(zzeam.class, zzeam);
    }
}
