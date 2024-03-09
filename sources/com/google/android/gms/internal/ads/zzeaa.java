package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzeaa extends zzegp<zzeaa, zza> implements zzeib {
    private static volatile zzeim<zzeaa> zzel;
    /* access modifiers changed from: private */
    public static final zzeaa zzhtu;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzeae zzhtt;

    private zzeaa() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp.zzb<zzeaa, zza> implements zzeib {
        private zza() {
            super(zzeaa.zzhtu);
        }

        public final zza zzeu(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaa) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzc(zzeae zzeae) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaa) this.zzift).zzb(zzeae);
            return this;
        }

        public final zza zzu(zzeff zzeff) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaa) this.zzift).zzs(zzeff);
            return this;
        }

        /* synthetic */ zza(zzeab zzeab) {
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

    public final zzeae zzayx() {
        zzeae zzeae = this.zzhtt;
        return zzeae == null ? zzeae.zzaze() : zzeae;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzeae zzeae) {
        zzeae.getClass();
        this.zzhtt = zzeae;
    }

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzeff zzeff) {
        zzeff.getClass();
        this.zzhtg = zzeff;
    }

    public static zzeaa zzg(zzeff zzeff, zzegc zzegc) throws zzegz {
        return (zzeaa) zzegp.zza(zzhtu, zzeff, zzegc);
    }

    public static zza zzayy() {
        return (zza) zzhtu.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeab.zzdv[i - 1]) {
            case 1:
                return new zzeaa();
            case 2:
                return new zza((zzeab) null);
            case 3:
                return zza((zzehz) zzhtu, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhtf", "zzhtt", "zzhtg"});
            case 4:
                return zzhtu;
            case 5:
                zzeim<zzeaa> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzeaa.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhtu);
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

    public static zzeaa zzayz() {
        return zzhtu;
    }

    static {
        zzeaa zzeaa = new zzeaa();
        zzhtu = zzeaa;
        zzegp.zza(zzeaa.class, zzeaa);
    }
}
