package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdzv extends zzegp<zzdzv, zza> implements zzeib {
    private static volatile zzeim<zzdzv> zzel;
    /* access modifiers changed from: private */
    public static final zzdzv zzhtm;
    private int zzhtl;

    private zzdzv() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzdzv, zza> implements zzeib {
        private zza() {
            super(zzdzv.zzhtm);
        }

        /* synthetic */ zza(zzdzu zzdzu) {
            this();
        }
    }

    public final int zzayn() {
        return this.zzhtl;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzu.zzdv[i - 1]) {
            case 1:
                return new zzdzv();
            case 2:
                return new zza((zzdzu) null);
            case 3:
                return zza((zzehz) zzhtm, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhtl"});
            case 4:
                return zzhtm;
            case 5:
                zzeim<zzdzv> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzdzv.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhtm);
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

    public static zzdzv zzayo() {
        return zzhtm;
    }

    static {
        zzdzv zzdzv = new zzdzv();
        zzhtm = zzdzv;
        zzegp.zza(zzdzv.class, zzdzv);
    }
}
