package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeci extends zzegp<zzeci, zza> implements zzeib {
    private static volatile zzeim<zzeci> zzel;
    /* access modifiers changed from: private */
    public static final zzeci zzhxh;
    private String zzhxg = "";

    private zzeci() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeci, zza> implements zzeib {
        private zza() {
            super(zzeci.zzhxh);
        }

        /* synthetic */ zza(zzech zzech) {
            this();
        }
    }

    public final String zzbca() {
        return this.zzhxg;
    }

    public static zzeci zzu(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzeci) zzegp.zza(zzhxh, zzeff, zzegc);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzech.zzdv[i - 1]) {
            case 1:
                return new zzeci();
            case 2:
                return new zza((zzech) null);
            case 3:
                return zza((zzehz) zzhxh, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzhxg"});
            case 4:
                return zzhxh;
            case 5:
                zzeim<zzeci> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeci.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhxh);
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

    public static zzeci zzbcb() {
        return zzhxh;
    }

    static {
        zzeci zzeci = new zzeci();
        zzhxh = zzeci;
        zzegp.zza(zzeci.class, zzeci);
    }
}
