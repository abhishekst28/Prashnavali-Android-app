package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdzz extends zzegp<zzdzz, zza> implements zzeib {
    private static volatile zzeim<zzdzz> zzel;
    /* access modifiers changed from: private */
    public static final zzdzz zzhts;
    private zzead zzhtq;
    private zzebp zzhtr;

    private zzdzz() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzdzz, zza> implements zzeib {
        private zza() {
            super(zzdzz.zzhts);
        }

        /* synthetic */ zza(zzdzy zzdzy) {
            this();
        }
    }

    public final zzead zzayu() {
        zzead zzead = this.zzhtq;
        return zzead == null ? zzead.zzazb() : zzead;
    }

    public final zzebp zzayv() {
        zzebp zzebp = this.zzhtr;
        return zzebp == null ? zzebp.zzbat() : zzebp;
    }

    public static zzdzz zzf(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzdzz) zzegp.zza(zzhts, zzeff, zzegc);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzy.zzdv[i - 1]) {
            case 1:
                return new zzdzz();
            case 2:
                return new zza((zzdzy) null);
            case 3:
                return zza((zzehz) zzhts, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzhtq", "zzhtr"});
            case 4:
                return zzhts;
            case 5:
                zzeim<zzdzz> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzdzz.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhts);
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
        zzdzz zzdzz = new zzdzz();
        zzhts = zzdzz;
        zzegp.zza(zzdzz.class, zzdzz);
    }
}
