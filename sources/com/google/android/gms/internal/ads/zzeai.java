package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeai extends zzegp<zzeai, zza> implements zzeib {
    private static volatile zzeim<zzeai> zzel;
    /* access modifiers changed from: private */
    public static final zzeai zzhua;
    private int zzhtj;
    private zzeal zzhty;

    private zzeai() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeai, zza> implements zzeib {
        private zza() {
            super(zzeai.zzhua);
        }

        /* synthetic */ zza(zzeaj zzeaj) {
            this();
        }
    }

    public final zzeal zzazg() {
        zzeal zzeal = this.zzhty;
        return zzeal == null ? zzeal.zzazk() : zzeal;
    }

    public final int getKeySize() {
        return this.zzhtj;
    }

    public static zzeai zzj(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzeai) zzegp.zza(zzhua, zzeff, zzegc);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeaj.zzdv[i - 1]) {
            case 1:
                return new zzeai();
            case 2:
                return new zza((zzeaj) null);
            case 3:
                return zza((zzehz) zzhua, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhty", "zzhtj"});
            case 4:
                return zzhua;
            case 5:
                zzeim<zzeai> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeai.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhua);
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
        zzeai zzeai = new zzeai();
        zzhua = zzeai;
        zzegp.zza(zzeai.class, zzeai);
    }
}
