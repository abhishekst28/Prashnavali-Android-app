package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeal extends zzegp<zzeal, zza> implements zzeib {
    private static volatile zzeim<zzeal> zzel;
    /* access modifiers changed from: private */
    public static final zzeal zzhub;
    private int zzhtw;

    private zzeal() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeal, zza> implements zzeib {
        private zza() {
            super(zzeal.zzhub);
        }

        /* synthetic */ zza(zzeak zzeak) {
            this();
        }
    }

    public final int zzazd() {
        return this.zzhtw;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeak.zzdv[i - 1]) {
            case 1:
                return new zzeal();
            case 2:
                return new zza((zzeak) null);
            case 3:
                return zza((zzehz) zzhub, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhtw"});
            case 4:
                return zzhub;
            case 5:
                zzeim<zzeal> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeal.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhub);
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

    public static zzeal zzazk() {
        return zzhub;
    }

    static {
        zzeal zzeal = new zzeal();
        zzhub = zzeal;
        zzegp.zza(zzeal.class, zzeal);
    }
}
