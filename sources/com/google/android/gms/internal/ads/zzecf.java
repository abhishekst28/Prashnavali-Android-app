package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzecf extends zzegp<zzecf, zza> implements zzeib {
    private static volatile zzeim<zzecf> zzel;
    /* access modifiers changed from: private */
    public static final zzecf zzhxf;
    private int zzhtf;
    private zzeci zzhxe;

    private zzecf() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzecf, zza> implements zzeib {
        private zza() {
            super(zzecf.zzhxf);
        }

        public final zza zzfk(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecf) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzb(zzeci zzeci) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecf) this.zzift).zza(zzeci);
            return this;
        }

        /* synthetic */ zza(zzecg zzecg) {
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

    public final zzeci zzbbx() {
        zzeci zzeci = this.zzhxe;
        return zzeci == null ? zzeci.zzbcb() : zzeci;
    }

    /* access modifiers changed from: private */
    public final void zza(zzeci zzeci) {
        zzeci.getClass();
        this.zzhxe = zzeci;
    }

    public static zzecf zzt(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzecf) zzegp.zza(zzhxf, zzeff, zzegc);
    }

    public static zza zzbby() {
        return (zza) zzhxf.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecg.zzdv[i - 1]) {
            case 1:
                return new zzecf();
            case 2:
                return new zza((zzecg) null);
            case 3:
                return zza((zzehz) zzhxf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhtf", "zzhxe"});
            case 4:
                return zzhxf;
            case 5:
                zzeim<zzecf> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzecf.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhxf);
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
        zzecf zzecf = new zzecf();
        zzhxf = zzecf;
        zzegp.zza(zzecf.class, zzecf);
    }
}
