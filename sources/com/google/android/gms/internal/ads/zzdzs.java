package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdzs extends zzegp<zzdzs, zza> implements zzeib {
    private static volatile zzeim<zzdzs> zzel;
    /* access modifiers changed from: private */
    public static final zzdzs zzhtk;
    private zzdzv zzhth;
    private int zzhtj;

    private zzdzs() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzdzs, zza> implements zzeib {
        private zza() {
            super(zzdzs.zzhtk);
        }

        /* synthetic */ zza(zzdzt zzdzt) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzhtj;
    }

    public final zzdzv zzayj() {
        zzdzv zzdzv = this.zzhth;
        return zzdzv == null ? zzdzv.zzayo() : zzdzv;
    }

    public static zzdzs zzd(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzdzs) zzegp.zza(zzhtk, zzeff, zzegc);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzt.zzdv[i - 1]) {
            case 1:
                return new zzdzs();
            case 2:
                return new zza((zzdzt) null);
            case 3:
                return zza((zzehz) zzhtk, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhtj", "zzhth"});
            case 4:
                return zzhtk;
            case 5:
                zzeim<zzdzs> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzdzs.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhtk);
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
        zzdzs zzdzs = new zzdzs();
        zzhtk = zzdzs;
        zzegp.zza(zzdzs.class, zzdzs);
    }
}
