package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeiq implements zzehx {
    private final int flags;
    private final String info;
    private final Object[] zziib;
    private final zzehz zziie;

    zzeiq(zzehz zzehz, String str, Object[] objArr) {
        this.zziie = zzehz;
        this.info = str;
        this.zziib = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.flags = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzbhh() {
        return this.info;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzbhi() {
        return this.zziib;
    }

    public final zzehz zzbgy() {
        return this.zziie;
    }

    public final int zzbgw() {
        return (this.flags & 1) == 1 ? zzegp.zze.zzige : zzegp.zze.zzigf;
    }

    public final boolean zzbgx() {
        return (this.flags & 2) == 2;
    }
}
