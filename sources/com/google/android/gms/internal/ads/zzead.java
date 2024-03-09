package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzead extends zzegp<zzead, zza> implements zzeib {
    private static volatile zzeim<zzead> zzel;
    /* access modifiers changed from: private */
    public static final zzead zzhtv;
    private int zzhtj;
    private zzeae zzhtt;

    private zzead() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzead, zza> implements zzeib {
        private zza() {
            super(zzead.zzhtv);
        }

        /* synthetic */ zza(zzeac zzeac) {
            this();
        }
    }

    public final zzeae zzayx() {
        zzeae zzeae = this.zzhtt;
        return zzeae == null ? zzeae.zzaze() : zzeae;
    }

    public final int getKeySize() {
        return this.zzhtj;
    }

    public static zzead zzh(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzead) zzegp.zza(zzhtv, zzeff, zzegc);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeac.zzdv[i - 1]) {
            case 1:
                return new zzead();
            case 2:
                return new zza((zzeac) null);
            case 3:
                return zza((zzehz) zzhtv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhtt", "zzhtj"});
            case 4:
                return zzhtv;
            case 5:
                zzeim<zzead> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzead.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhtv);
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

    public static zzead zzazb() {
        return zzhtv;
    }

    static {
        zzead zzead = new zzead();
        zzhtv = zzead;
        zzegp.zza(zzead.class, zzead);
    }
}
