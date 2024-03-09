package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeca extends zzegp<zzeca, zza> implements zzeib {
    private static volatile zzeim<zzeca> zzel;
    /* access modifiers changed from: private */
    public static final zzeca zzhwt;
    private String zzhvw = "";
    private String zzhwp = "";
    private int zzhwq;
    private boolean zzhwr;
    private String zzhws = "";

    private zzeca() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeca, zza> implements zzeib {
        private zza() {
            super(zzeca.zzhwt);
        }

        /* synthetic */ zza(zzebz zzebz) {
            this();
        }
    }

    public final String zzbbg() {
        return this.zzhwp;
    }

    public final String zzbay() {
        return this.zzhvw;
    }

    public final int zzbbh() {
        return this.zzhwq;
    }

    public final boolean zzbbi() {
        return this.zzhwr;
    }

    public final String zzbbj() {
        return this.zzhws;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebz.zzdv[i - 1]) {
            case 1:
                return new zzeca();
            case 2:
                return new zza((zzebz) null);
            case 3:
                return zza((zzehz) zzhwt, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzhwp", "zzhvw", "zzhwq", "zzhwr", "zzhws"});
            case 4:
                return zzhwt;
            case 5:
                zzeim<zzeca> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeca.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhwt);
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
        zzeca zzeca = new zzeca();
        zzhwt = zzeca;
        zzegp.zza(zzeca.class, zzeca);
    }
}
