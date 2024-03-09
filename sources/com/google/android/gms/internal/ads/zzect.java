package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzect extends zzegp<zzect, zza> implements zzeib {
    private static volatile zzeim<zzect> zzel;
    /* access modifiers changed from: private */
    public static final zzect zzhxy;

    private zzect() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzect, zza> implements zzeib {
        private zza() {
            super(zzect.zzhxy);
        }

        /* synthetic */ zza(zzecu zzecu) {
            this();
        }
    }

    public static zzect zzy(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzect) zzegp.zza(zzhxy, zzeff, zzegc);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecu.zzdv[i - 1]) {
            case 1:
                return new zzect();
            case 2:
                return new zza((zzecu) null);
            case 3:
                return zza((zzehz) zzhxy, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhxy;
            case 5:
                zzeim<zzect> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzect.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhxy);
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
        zzect zzect = new zzect();
        zzhxy = zzect;
        zzegp.zza(zzect.class, zzect);
    }
}
