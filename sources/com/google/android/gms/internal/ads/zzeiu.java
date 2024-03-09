package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeiu {
    private final ArrayDeque<zzeff> zziji;

    private zzeiu() {
        this.zziji = new ArrayDeque<>();
    }

    /* access modifiers changed from: private */
    public final zzeff zzc(zzeff zzeff, zzeff zzeff2) {
        zzal(zzeff);
        zzal(zzeff2);
        zzeff pop = this.zziji.pop();
        while (!this.zziji.isEmpty()) {
            pop = new zzeis(this.zziji.pop(), pop, (zzeir) null);
        }
        return pop;
    }

    private final void zzal(zzeff zzeff) {
        while (!zzeff.zzbdo()) {
            if (zzeff instanceof zzeis) {
                zzeis zzeis = (zzeis) zzeff;
                zzal(zzeis.zzijc);
                zzeff = zzeis.zzijd;
            } else {
                String valueOf = String.valueOf(zzeff.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int zzhn = zzhn(zzeff.size());
        int zzhm = zzeis.zzhm(zzhn + 1);
        if (this.zziji.isEmpty() || this.zziji.peek().size() >= zzhm) {
            this.zziji.push(zzeff);
            return;
        }
        int zzhm2 = zzeis.zzhm(zzhn);
        zzeff pop = this.zziji.pop();
        while (!this.zziji.isEmpty() && this.zziji.peek().size() < zzhm2) {
            pop = new zzeis(this.zziji.pop(), pop, (zzeir) null);
        }
        zzeis zzeis2 = new zzeis(pop, zzeff, (zzeir) null);
        while (!this.zziji.isEmpty() && this.zziji.peek().size() < zzeis.zzhm(zzhn(zzeis2.size()) + 1)) {
            zzeis2 = new zzeis(this.zziji.pop(), zzeis2, (zzeir) null);
        }
        this.zziji.push(zzeis2);
    }

    private static int zzhn(int i) {
        int binarySearch = Arrays.binarySearch(zzeis.zzija, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    /* synthetic */ zzeiu(zzeir zzeir) {
        this();
    }
}
