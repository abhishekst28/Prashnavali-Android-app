package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbes implements Iterable<zzbeq> {
    private final List<zzbeq> zzekq = new ArrayList();

    public static boolean zzc(zzbde zzbde) {
        zzbeq zzd = zzd(zzbde);
        if (zzd == null) {
            return false;
        }
        zzd.zzekp.abort();
        return true;
    }

    static zzbeq zzd(zzbde zzbde) {
        Iterator<zzbeq> it = zzp.zzll().iterator();
        while (it.hasNext()) {
            zzbeq next = it.next();
            if (next.zzefm == zzbde) {
                return next;
            }
        }
        return null;
    }

    public final void zza(zzbeq zzbeq) {
        this.zzekq.add(zzbeq);
    }

    public final void zzb(zzbeq zzbeq) {
        this.zzekq.remove(zzbeq);
    }

    public final Iterator<zzbeq> iterator() {
        return this.zzekq.iterator();
    }
}
