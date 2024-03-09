package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzefx implements zzeip {
    private int tag;
    private final zzefq zzicd;
    private int zzice;
    private int zzicf = 0;

    public static zzefx zza(zzefq zzefq) {
        if (zzefq.zzibs != null) {
            return zzefq.zzibs;
        }
        return new zzefx(zzefq);
    }

    private zzefx(zzefq zzefq) {
        zzefq zzefq2 = (zzefq) zzegr.zza(zzefq, "input");
        this.zzicd = zzefq2;
        zzefq2.zzibs = this;
    }

    public final int zzber() throws IOException {
        int i = this.zzicf;
        if (i != 0) {
            this.tag = i;
            this.zzicf = 0;
        } else {
            this.tag = this.zzicd.zzbdt();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.zzice) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final int getTag() {
        return this.tag;
    }

    public final boolean zzbes() throws IOException {
        int i;
        if (this.zzicd.zzbej() || (i = this.tag) == this.zzice) {
            return false;
        }
        return this.zzicd.zzfz(i);
    }

    private final void zzgi(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzegz.zzbgg();
        }
    }

    public final double readDouble() throws IOException {
        zzgi(1);
        return this.zzicd.readDouble();
    }

    public final float readFloat() throws IOException {
        zzgi(5);
        return this.zzicd.readFloat();
    }

    public final long zzbdu() throws IOException {
        zzgi(0);
        return this.zzicd.zzbdu();
    }

    public final long zzbdv() throws IOException {
        zzgi(0);
        return this.zzicd.zzbdv();
    }

    public final int zzbdw() throws IOException {
        zzgi(0);
        return this.zzicd.zzbdw();
    }

    public final long zzbdx() throws IOException {
        zzgi(1);
        return this.zzicd.zzbdx();
    }

    public final int zzbdy() throws IOException {
        zzgi(5);
        return this.zzicd.zzbdy();
    }

    public final boolean zzbdz() throws IOException {
        zzgi(0);
        return this.zzicd.zzbdz();
    }

    public final String readString() throws IOException {
        zzgi(2);
        return this.zzicd.readString();
    }

    public final String zzbea() throws IOException {
        zzgi(2);
        return this.zzicd.zzbea();
    }

    public final <T> T zza(zzeiv<T> zzeiv, zzegc zzegc) throws IOException {
        zzgi(2);
        return zzc(zzeiv, zzegc);
    }

    public final <T> T zzb(zzeiv<T> zzeiv, zzegc zzegc) throws IOException {
        zzgi(3);
        return zzd(zzeiv, zzegc);
    }

    private final <T> T zzc(zzeiv<T> zzeiv, zzegc zzegc) throws IOException {
        int zzbec = this.zzicd.zzbec();
        if (this.zzicd.zzibp < this.zzicd.zzibq) {
            int zzga = this.zzicd.zzga(zzbec);
            T newInstance = zzeiv.newInstance();
            this.zzicd.zzibp++;
            zzeiv.zza(newInstance, this, zzegc);
            zzeiv.zzaj(newInstance);
            this.zzicd.zzfy(0);
            zzefq zzefq = this.zzicd;
            zzefq.zzibp--;
            this.zzicd.zzgb(zzga);
            return newInstance;
        }
        throw new zzegz("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final <T> T zzd(zzeiv<T> zzeiv, zzegc zzegc) throws IOException {
        int i = this.zzice;
        this.zzice = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzeiv.newInstance();
            zzeiv.zza(newInstance, this, zzegc);
            zzeiv.zzaj(newInstance);
            if (this.tag == this.zzice) {
                return newInstance;
            }
            throw zzegz.zzbgi();
        } finally {
            this.zzice = i;
        }
    }

    public final zzeff zzbeb() throws IOException {
        zzgi(2);
        return this.zzicd.zzbeb();
    }

    public final int zzbec() throws IOException {
        zzgi(0);
        return this.zzicd.zzbec();
    }

    public final int zzbed() throws IOException {
        zzgi(0);
        return this.zzicd.zzbed();
    }

    public final int zzbee() throws IOException {
        zzgi(5);
        return this.zzicd.zzbee();
    }

    public final long zzbef() throws IOException {
        zzgi(1);
        return this.zzicd.zzbef();
    }

    public final int zzbeg() throws IOException {
        zzgi(0);
        return this.zzicd.zzbeg();
    }

    public final long zzbeh() throws IOException {
        zzgi(0);
        return this.zzicd.zzbeh();
    }

    public final void zzk(List<Double> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzega) {
            zzega zzega = (zzega) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzega.zzd(this.zzicd.readDouble());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgj(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzega.zzd(this.zzicd.readDouble());
                } while (this.zzicd.zzbek() < zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.zzicd.readDouble()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbec2 = this.zzicd.zzbec();
                zzgj(zzbec2);
                int zzbek2 = this.zzicd.zzbek() + zzbec2;
                do {
                    list.add(Double.valueOf(this.zzicd.readDouble()));
                } while (this.zzicd.zzbek() < zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzl(List<Float> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzego) {
            zzego zzego = (zzego) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgk(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzego.zzh(this.zzicd.readFloat());
                } while (this.zzicd.zzbek() < zzbek);
            } else if (i == 5) {
                do {
                    zzego.zzh(this.zzicd.readFloat());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzbec2 = this.zzicd.zzbec();
                zzgk(zzbec2);
                int zzbek2 = this.zzicd.zzbek() + zzbec2;
                do {
                    list.add(Float.valueOf(this.zzicd.readFloat()));
                } while (this.zzicd.zzbek() < zzbek2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.zzicd.readFloat()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzm(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehn = (zzehn) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzehn.zzfs(this.zzicd.zzbdu());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzehn.zzfs(this.zzicd.zzbdu());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzicd.zzbdu()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    list.add(Long.valueOf(this.zzicd.zzbdu()));
                } while (this.zzicd.zzbek() < zzbek2);
                zzgl(zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzn(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehn = (zzehn) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzehn.zzfs(this.zzicd.zzbdv());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzehn.zzfs(this.zzicd.zzbdv());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzicd.zzbdv()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    list.add(Long.valueOf(this.zzicd.zzbdv()));
                } while (this.zzicd.zzbek() < zzbek2);
                zzgl(zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzo(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzegs.zzhc(this.zzicd.zzbdw());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzegs.zzhc(this.zzicd.zzbdw());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbdw()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbdw()));
                } while (this.zzicd.zzbek() < zzbek2);
                zzgl(zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzp(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehn = (zzehn) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzehn.zzfs(this.zzicd.zzbdx());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgj(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzehn.zzfs(this.zzicd.zzbdx());
                } while (this.zzicd.zzbek() < zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.zzicd.zzbdx()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbec2 = this.zzicd.zzbec();
                zzgj(zzbec2);
                int zzbek2 = this.zzicd.zzbek() + zzbec2;
                do {
                    list.add(Long.valueOf(this.zzicd.zzbdx()));
                } while (this.zzicd.zzbek() < zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzq(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgk(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzegs.zzhc(this.zzicd.zzbdy());
                } while (this.zzicd.zzbek() < zzbek);
            } else if (i == 5) {
                do {
                    zzegs.zzhc(this.zzicd.zzbdy());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzbec2 = this.zzicd.zzbec();
                zzgk(zzbec2);
                int zzbek2 = this.zzicd.zzbek() + zzbec2;
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbdy()));
                } while (this.zzicd.zzbek() < zzbek2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbdy()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzr(List<Boolean> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzefd) {
            zzefd zzefd = (zzefd) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzefd.addBoolean(this.zzicd.zzbdz());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzefd.addBoolean(this.zzicd.zzbdz());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zzicd.zzbdz()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    list.add(Boolean.valueOf(this.zzicd.zzbdz()));
                } while (this.zzicd.zzbek() < zzbek2);
                zzgl(zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    public final void zzs(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzbdt;
        int zzbdt2;
        if ((this.tag & 7) != 2) {
            throw zzegz.zzbgg();
        } else if (!(list instanceof zzehk) || z) {
            do {
                list.add(z ? zzbea() : readString());
                if (!this.zzicd.zzbej()) {
                    zzbdt = this.zzicd.zzbdt();
                } else {
                    return;
                }
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else {
            zzehk zzehk = (zzehk) list;
            do {
                zzehk.zzaj(zzbeb());
                if (!this.zzicd.zzbej()) {
                    zzbdt2 = this.zzicd.zzbdt();
                } else {
                    return;
                }
            } while (zzbdt2 == this.tag);
            this.zzicf = zzbdt2;
        }
    }

    public final <T> void zza(List<T> list, zzeiv<T> zzeiv, zzegc zzegc) throws IOException {
        int zzbdt;
        int i = this.tag;
        if ((i & 7) == 2) {
            do {
                list.add(zzc(zzeiv, zzegc));
                if (!this.zzicd.zzbej() && this.zzicf == 0) {
                    zzbdt = this.zzicd.zzbdt();
                } else {
                    return;
                }
            } while (zzbdt == i);
            this.zzicf = zzbdt;
            return;
        }
        throw zzegz.zzbgg();
    }

    public final <T> void zzb(List<T> list, zzeiv<T> zzeiv, zzegc zzegc) throws IOException {
        int zzbdt;
        int i = this.tag;
        if ((i & 7) == 3) {
            do {
                list.add(zzd(zzeiv, zzegc));
                if (!this.zzicd.zzbej() && this.zzicf == 0) {
                    zzbdt = this.zzicd.zzbdt();
                } else {
                    return;
                }
            } while (zzbdt == i);
            this.zzicf = zzbdt;
            return;
        }
        throw zzegz.zzbgg();
    }

    public final void zzt(List<zzeff> list) throws IOException {
        int zzbdt;
        if ((this.tag & 7) == 2) {
            do {
                list.add(zzbeb());
                if (!this.zzicd.zzbej()) {
                    zzbdt = this.zzicd.zzbdt();
                } else {
                    return;
                }
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
            return;
        }
        throw zzegz.zzbgg();
    }

    public final void zzu(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzegs.zzhc(this.zzicd.zzbec());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzegs.zzhc(this.zzicd.zzbec());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbec()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbec()));
                } while (this.zzicd.zzbek() < zzbek2);
                zzgl(zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzv(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzegs.zzhc(this.zzicd.zzbed());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzegs.zzhc(this.zzicd.zzbed());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbed()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbed()));
                } while (this.zzicd.zzbek() < zzbek2);
                zzgl(zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzw(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgk(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzegs.zzhc(this.zzicd.zzbee());
                } while (this.zzicd.zzbek() < zzbek);
            } else if (i == 5) {
                do {
                    zzegs.zzhc(this.zzicd.zzbee());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzbec2 = this.zzicd.zzbec();
                zzgk(zzbec2);
                int zzbek2 = this.zzicd.zzbek() + zzbec2;
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbee()));
                } while (this.zzicd.zzbek() < zzbek2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbee()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzx(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehn = (zzehn) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzehn.zzfs(this.zzicd.zzbef());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgj(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzehn.zzfs(this.zzicd.zzbef());
                } while (this.zzicd.zzbek() < zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.zzicd.zzbef()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbec2 = this.zzicd.zzbec();
                zzgj(zzbec2);
                int zzbek2 = this.zzicd.zzbek() + zzbec2;
                do {
                    list.add(Long.valueOf(this.zzicd.zzbef()));
                } while (this.zzicd.zzbek() < zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzy(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzegs.zzhc(this.zzicd.zzbeg());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzegs.zzhc(this.zzicd.zzbeg());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbeg()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    list.add(Integer.valueOf(this.zzicd.zzbeg()));
                } while (this.zzicd.zzbek() < zzbek2);
                zzgl(zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    public final void zzz(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehn = (zzehn) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzehn.zzfs(this.zzicd.zzbeh());
                    if (!this.zzicd.zzbej()) {
                        zzbdt2 = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzehn.zzfs(this.zzicd.zzbeh());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
            } else {
                throw zzegz.zzbgg();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzicd.zzbeh()));
                    if (!this.zzicd.zzbej()) {
                        zzbdt = this.zzicd.zzbdt();
                    } else {
                        return;
                    }
                } while (zzbdt == this.tag);
                this.zzicf = zzbdt;
            } else if (i2 == 2) {
                int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    list.add(Long.valueOf(this.zzicd.zzbeh()));
                } while (this.zzicd.zzbek() < zzbek2);
                zzgl(zzbek2);
            } else {
                throw zzegz.zzbgg();
            }
        }
    }

    private static void zzgj(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzegz.zzbgi();
        }
    }

    public final <K, V> void zza(Map<K, V> map, zzehu<K, V> zzehu, zzegc zzegc) throws IOException {
        zzgi(2);
        int zzga = this.zzicd.zzga(this.zzicd.zzbec());
        K k = zzehu.zzihv;
        V v = zzehu.zzckv;
        while (true) {
            try {
                int zzber = zzber();
                if (zzber == Integer.MAX_VALUE || this.zzicd.zzbej()) {
                    map.put(k, v);
                } else if (zzber == 1) {
                    k = zza(zzehu.zzihu, (Class<?>) null, (zzegc) null);
                } else if (zzber == 2) {
                    v = zza(zzehu.zzihw, zzehu.zzckv.getClass(), zzegc);
                } else if (!zzbes()) {
                    throw new zzegz("Unable to parse map entry.");
                }
            } catch (zzehc e) {
                if (!zzbes()) {
                    throw new zzegz("Unable to parse map entry.");
                }
            } catch (Throwable th) {
                this.zzicd.zzgb(zzga);
                throw th;
            }
        }
        map.put(k, v);
        this.zzicd.zzgb(zzga);
    }

    private final Object zza(zzeke zzeke, Class<?> cls, zzegc zzegc) throws IOException {
        switch (zzefw.zzicc[zzeke.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzbdz());
            case 2:
                return zzbeb();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzbed());
            case 5:
                return Integer.valueOf(zzbdy());
            case 6:
                return Long.valueOf(zzbdx());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzbdw());
            case 9:
                return Long.valueOf(zzbdv());
            case 10:
                zzgi(2);
                return zzc(zzeio.zzbhg().zzh(cls), zzegc);
            case 11:
                return Integer.valueOf(zzbee());
            case 12:
                return Long.valueOf(zzbef());
            case 13:
                return Integer.valueOf(zzbeg());
            case 14:
                return Long.valueOf(zzbeh());
            case 15:
                return zzbea();
            case 16:
                return Integer.valueOf(zzbec());
            case 17:
                return Long.valueOf(zzbdu());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzgk(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzegz.zzbgi();
        }
    }

    private final void zzgl(int i) throws IOException {
        if (this.zzicd.zzbek() != i) {
            throw zzegz.zzbgb();
        }
    }
}
