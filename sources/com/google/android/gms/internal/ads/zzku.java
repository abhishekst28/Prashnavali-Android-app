package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzku extends zzkr {
    public final long zzawf;
    public final List<zzkt> zzawg = new ArrayList();
    public final List<zzku> zzawh = new ArrayList();

    public zzku(int i, long j) {
        super(i);
        this.zzawf = j;
    }

    public final void zza(zzkt zzkt) {
        this.zzawg.add(zzkt);
    }

    public final void zza(zzku zzku) {
        this.zzawh.add(zzku);
    }

    public final zzkt zzau(int i) {
        int size = this.zzawg.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzkt zzkt = this.zzawg.get(i2);
            if (zzkt.type == i) {
                return zzkt;
            }
        }
        return null;
    }

    public final zzku zzav(int i) {
        int size = this.zzawh.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzku zzku = this.zzawh.get(i2);
            if (zzku.type == i) {
                return zzku;
            }
        }
        return null;
    }

    public final String toString() {
        String zzas = zzas(this.type);
        String arrays = Arrays.toString(this.zzawg.toArray());
        String arrays2 = Arrays.toString(this.zzawh.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(zzas).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(zzas);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
