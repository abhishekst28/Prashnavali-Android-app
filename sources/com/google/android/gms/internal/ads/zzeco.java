package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeco extends zzegp<zzeco, zza> implements zzeib {
    private static volatile zzeim<zzeco> zzel;
    /* access modifiers changed from: private */
    public static final zzeco zzhxw;
    private String zzhxu = "";
    private zzeha<zzeca> zzhxv = zzbfo();

    private zzeco() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeco, zza> implements zzeib {
        private zza() {
            super(zzeco.zzhxw);
        }

        /* synthetic */ zza(zzecq zzecq) {
            this();
        }
    }

    public final List<zzeca> zzbck() {
        return this.zzhxv;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecq.zzdv[i - 1]) {
            case 1:
                return new zzeco();
            case 2:
                return new zza((zzecq) null);
            case 3:
                return zza((zzehz) zzhxw, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzhxu", "zzhxv", zzeca.class});
            case 4:
                return zzhxw;
            case 5:
                zzeim<zzeco> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeco.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhxw);
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

    public static zzeco zzbcl() {
        return zzhxw;
    }

    static {
        zzeco zzeco = new zzeco();
        zzhxw = zzeco;
        zzegp.zza(zzeco.class, zzeco);
    }
}
