package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeav extends zzegp<zzeav, zza> implements zzeib {
    private static volatile zzeim<zzeav> zzel;
    /* access modifiers changed from: private */
    public static final zzeav zzhun;
    private zzebw zzhum;

    private zzeav() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeav, zza> implements zzeib {
        private zza() {
            super(zzeav.zzhun);
        }

        /* synthetic */ zza(zzeax zzeax) {
            this();
        }
    }

    public final zzebw zzazs() {
        zzebw zzebw = this.zzhum;
        return zzebw == null ? zzebw.zzbbe() : zzebw;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeax.zzdv[i - 1]) {
            case 1:
                return new zzeav();
            case 2:
                return new zza((zzeax) null);
            case 3:
                return zza((zzehz) zzhun, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzhum"});
            case 4:
                return zzhun;
            case 5:
                zzeim<zzeav> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeav.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhun);
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

    public static zzeav zzazt() {
        return zzhun;
    }

    static {
        zzeav zzeav = new zzeav();
        zzhun = zzeav;
        zzegp.zza(zzeav.class, zzeav);
    }
}
