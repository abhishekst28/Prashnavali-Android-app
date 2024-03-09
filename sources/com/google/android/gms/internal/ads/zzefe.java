package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzefe extends zzefg {
    private final int limit = this.zzibc.size();
    private int position = 0;
    private final /* synthetic */ zzeff zzibc;

    zzefe(zzeff zzeff) {
        this.zzibc = zzeff;
    }

    public final boolean hasNext() {
        return this.position < this.limit;
    }

    public final byte nextByte() {
        int i = this.position;
        if (i < this.limit) {
            this.position = i + 1;
            return this.zzibc.zzfv(i);
        }
        throw new NoSuchElementException();
    }
}
