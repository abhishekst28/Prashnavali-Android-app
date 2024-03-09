package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzakb implements Predicate {
    private final zzahf zzdgd;

    zzakb(zzahf zzahf) {
        this.zzdgd = zzahf;
    }

    public final boolean apply(Object obj) {
        zzahf zzahf = (zzahf) obj;
        return (zzahf instanceof zzaki) && zzaki.zza((zzaki) zzahf).equals(this.zzdgd);
    }
}
