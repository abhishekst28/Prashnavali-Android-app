package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeat extends zzegp<zzeat, zza> implements zzeib {
    private static volatile zzeim<zzeat> zzel;
    /* access modifiers changed from: private */
    public static final zzeat zzhuf;

    private zzeat() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeat, zza> implements zzeib {
        private zza() {
            super(zzeat.zzhuf);
        }

        /* synthetic */ zza(zzeas zzeas) {
            this();
        }
    }

    public static zzeat zzn(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzeat) zzegp.zza(zzhuf, zzeff, zzegc);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeas.zzdv[i - 1]) {
            case 1:
                return new zzeat();
            case 2:
                return new zza((zzeas) null);
            case 3:
                return zza((zzehz) zzhuf, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhuf;
            case 5:
                zzeim<zzeat> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeat.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhuf);
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
        zzeat zzeat = new zzeat();
        zzhuf = zzeat;
        zzegp.zza(zzeat.class, zzeat);
    }
}
