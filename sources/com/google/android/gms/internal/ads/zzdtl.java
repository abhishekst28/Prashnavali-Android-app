package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdtl extends zzdtg<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzdtg zzhnh;

    zzdtl(zzdtg zzdtg, int i, int i2) {
        this.zzhnh = zzdtg;
        this.offset = i;
        this.length = i2;
    }

    public final int size() {
        return this.length;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzawo() {
        return this.zzhnh.zzawo();
    }

    /* access modifiers changed from: package-private */
    public final int zzawp() {
        return this.zzhnh.zzawp() + this.offset;
    }

    /* access modifiers changed from: package-private */
    public final int zzawq() {
        return this.zzhnh.zzawp() + this.offset + this.length;
    }

    public final E get(int i) {
        zzdsv.zzs(i, this.length);
        return this.zzhnh.get(i + this.offset);
    }

    public final zzdtg<E> zzu(int i, int i2) {
        zzdsv.zzf(i, i2, this.length);
        zzdtg zzdtg = this.zzhnh;
        int i3 = this.offset;
        return (zzdtg) zzdtg.subList(i + i3, i2 + i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaws() {
        return true;
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
