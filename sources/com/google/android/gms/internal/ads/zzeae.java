package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeae extends zzegp<zzeae, zza> implements zzeib {
    private static volatile zzeim<zzeae> zzel;
    /* access modifiers changed from: private */
    public static final zzeae zzhtx;
    private int zzhtw;

    private zzeae() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeae, zza> implements zzeib {
        private zza() {
            super(zzeae.zzhtx);
        }

        /* synthetic */ zza(zzeaf zzeaf) {
            this();
        }
    }

    public final int zzazd() {
        return this.zzhtw;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeaf.zzdv[i - 1]) {
            case 1:
                return new zzeae();
            case 2:
                return new zza((zzeaf) null);
            case 3:
                return zza((zzehz) zzhtx, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhtw"});
            case 4:
                return zzhtx;
            case 5:
                zzeim<zzeae> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeae.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhtx);
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

    public static zzeae zzaze() {
        return zzhtx;
    }

    static {
        zzeae zzeae = new zzeae();
        zzhtx = zzeae;
        zzegp.zza(zzeae.class, zzeae);
    }
}
