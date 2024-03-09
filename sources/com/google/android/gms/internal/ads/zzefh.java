package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzefh implements Comparator<zzeff> {
    zzefh() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzeff zzeff = (zzeff) obj;
        zzeff zzeff2 = (zzeff) obj2;
        zzefk zzefk = (zzefk) zzeff.iterator();
        zzefk zzefk2 = (zzefk) zzeff2.iterator();
        while (zzefk.hasNext() && zzefk2.hasNext()) {
            int compare = Integer.compare(zzeff.zzb(zzefk.nextByte()), zzeff.zzb(zzefk2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzeff.size(), zzeff2.size());
    }
}
