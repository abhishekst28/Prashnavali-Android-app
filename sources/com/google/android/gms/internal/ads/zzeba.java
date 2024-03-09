package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeba extends zzegp<zzeba, zza> implements zzeib {
    private static volatile zzeim<zzeba> zzel;
    /* access modifiers changed from: private */
    public static final zzeba zzhut;
    private zzebh zzhuq;
    private zzeav zzhur;
    private int zzhus;

    private zzeba() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeba, zza> implements zzeib {
        private zza() {
            super(zzeba.zzhut);
        }

        /* synthetic */ zza(zzebb zzebb) {
            this();
        }
    }

    public final zzebh zzazx() {
        zzebh zzebh = this.zzhuq;
        return zzebh == null ? zzebh.zzban() : zzebh;
    }

    public final zzeav zzazy() {
        zzeav zzeav = this.zzhur;
        return zzeav == null ? zzeav.zzazt() : zzeav;
    }

    public final zzeau zzazz() {
        zzeau zzey = zzeau.zzey(this.zzhus);
        return zzey == null ? zzeau.UNRECOGNIZED : zzey;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebb.zzdv[i - 1]) {
            case 1:
                return new zzeba();
            case 2:
                return new zza((zzebb) null);
            case 3:
                return zza((zzehz) zzhut, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzhuq", "zzhur", "zzhus"});
            case 4:
                return zzhut;
            case 5:
                zzeim<zzeba> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeba.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhut);
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

    public static zzeba zzbaa() {
        return zzhut;
    }

    static {
        zzeba zzeba = new zzeba();
        zzhut = zzeba;
        zzegp.zza(zzeba.class, zzeba);
    }
}
