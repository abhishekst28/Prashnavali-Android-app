package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeap extends zzegp<zzeap, zza> implements zzeib {
    private static volatile zzeim<zzeap> zzel;
    /* access modifiers changed from: private */
    public static final zzeap zzhud;
    private int zzhtf;
    private int zzhtj;

    private zzeap() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeap, zza> implements zzeib {
        private zza() {
            super(zzeap.zzhud);
        }

        /* synthetic */ zza(zzeao zzeao) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzhtj;
    }

    public static zzeap zzl(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzeap) zzegp.zza(zzhud, zzeff, zzegc);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeao.zzdv[i - 1]) {
            case 1:
                return new zzeap();
            case 2:
                return new zza((zzeao) null);
            case 3:
                return zza((zzehz) zzhud, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzhtj", "zzhtf"});
            case 4:
                return zzhud;
            case 5:
                zzeim<zzeap> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeap.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhud);
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
        zzeap zzeap = new zzeap();
        zzhud = zzeap;
        zzegp.zza(zzeap.class, zzeap);
    }
}
