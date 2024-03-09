package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzecj extends zzegp<zzecj, zza> implements zzeib {
    private static volatile zzeim<zzecj> zzel;
    /* access modifiers changed from: private */
    public static final zzecj zzhxj;
    private int zzhtf;
    private zzecm zzhxi;

    private zzecj() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzecj, zza> implements zzeib {
        private zza() {
            super(zzecj.zzhxj);
        }

        public final zza zzfl(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecj) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzb(zzecm zzecm) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecj) this.zzift).zza(zzecm);
            return this;
        }

        /* synthetic */ zza(zzeck zzeck) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzhtf;
    }

    /* access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzhtf = i;
    }

    public final zzecm zzbcd() {
        zzecm zzecm = this.zzhxi;
        return zzecm == null ? zzecm.zzbci() : zzecm;
    }

    /* access modifiers changed from: private */
    public final void zza(zzecm zzecm) {
        zzecm.getClass();
        this.zzhxi = zzecm;
    }

    public static zzecj zzv(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzecj) zzegp.zza(zzhxj, zzeff, zzegc);
    }

    public static zza zzbce() {
        return (zza) zzhxj.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeck.zzdv[i - 1]) {
            case 1:
                return new zzecj();
            case 2:
                return new zza((zzeck) null);
            case 3:
                return zza((zzehz) zzhxj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhtf", "zzhxi"});
            case 4:
                return zzhxj;
            case 5:
                zzeim<zzecj> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzecj.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhxj);
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
        zzecj zzecj = new zzecj();
        zzhxj = zzecj;
        zzegp.zza(zzecj.class, zzecj);
    }
}
