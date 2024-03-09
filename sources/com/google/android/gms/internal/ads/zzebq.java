package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzebq extends zzegp<zzebq, zza> implements zzeib {
    private static volatile zzeim<zzebq> zzel;
    /* access modifiers changed from: private */
    public static final zzebq zzhvv;
    private int zzhtl;
    private int zzhvu;

    private zzebq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzebq, zza> implements zzeib {
        private zza() {
            super(zzebq.zzhvv);
        }

        /* synthetic */ zza(zzebr zzebr) {
            this();
        }
    }

    public final zzebj zzbav() {
        zzebj zzfc = zzebj.zzfc(this.zzhvu);
        return zzfc == null ? zzebj.UNRECOGNIZED : zzfc;
    }

    public final int zzayn() {
        return this.zzhtl;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebr.zzdv[i - 1]) {
            case 1:
                return new zzebq();
            case 2:
                return new zza((zzebr) null);
            case 3:
                return zza((zzehz) zzhvv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzhvu", "zzhtl"});
            case 4:
                return zzhvv;
            case 5:
                zzeim<zzebq> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzebq.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhvv);
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

    public static zzebq zzbaw() {
        return zzhvv;
    }

    static {
        zzebq zzebq = new zzebq();
        zzhvv = zzebq;
        zzegp.zza(zzebq.class, zzebq);
    }
}
