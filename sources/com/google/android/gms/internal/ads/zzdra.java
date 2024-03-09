package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqt;
import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzdra extends zzegp<zzdra, zzb> implements zzeib {
    private static volatile zzeim<zzdra> zzel;
    /* access modifiers changed from: private */
    public static final zzdra zzhkb;
    private int zzdw;
    private String zzdx = "";
    private int zzhjy;
    private String zzhjz = "";
    private zzdqt zzhka;

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    public enum zza implements zzegu {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        
        private static final zzegt<zza> zzes = null;
        private final int value;

        public final int zzv() {
            return this.value;
        }

        public static zza zzeh(int i) {
            if (i == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        public static zzegw zzw() {
            return zzdrb.zzeu;
        }

        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        private zza(int i) {
            this.value = i;
        }

        static {
            zzes = new zzdrc();
        }
    }

    private zzdra() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    public static final class zzb extends zzegp.zzb<zzdra, zzb> implements zzeib {
        private zzb() {
            super(zzdra.zzhkb);
        }

        public final zzb zzb(zza zza) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdra) this.zzift).zza(zza);
            return this;
        }

        public final zzb zzhf(String str) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdra) this.zzift).zzp(str);
            return this;
        }

        public final zzb zza(zzdqt.zzb zzb) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdra) this.zzift).zza((zzdqt) ((zzegp) zzb.zzbfx()));
            return this;
        }

        /* synthetic */ zzb(zzdqz zzdqz) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final void zza(zza zza2) {
        this.zzhjy = zza2.zzv();
        this.zzdw |= 1;
    }

    /* access modifiers changed from: private */
    public final void zzp(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzdx = str;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdqt zzdqt) {
        zzdqt.getClass();
        this.zzhka = zzdqt;
        this.zzdw |= 8;
    }

    public static zzb zzavo() {
        return (zzb) zzhkb.zzbfj();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdqz.zzdv[i - 1]) {
            case 1:
                return new zzdra();
            case 2:
                return new zzb((zzdqz) null);
            case 3:
                return zza((zzehz) zzhkb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzdw", "zzhjy", zza.zzw(), "zzdx", "zzhjz", "zzhka"});
            case 4:
                return zzhkb;
            case 5:
                zzeim<zzdra> zzeim = zzel;
                if (zzeim == null) {
                    synchronized (zzdra.class) {
                        zzeim = zzel;
                        if (zzeim == null) {
                            zzeim = new zzegp.zza<>(zzhkb);
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
        zzdra zzdra = new zzdra();
        zzhkb = zzdra;
        zzegp.zza(zzdra.class, zzdra);
    }
}
