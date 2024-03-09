package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbyr extends zzbxe<zzqu> implements zzqu {
    private final zzdkx zzfpf;
    private Map<View, zzqq> zzful = new WeakHashMap(1);
    private final Context zzvr;

    public zzbyr(Context context, Set<zzbys<zzqu>> set, zzdkx zzdkx) {
        super(set);
        this.zzvr = context;
        this.zzfpf = zzdkx;
    }

    public final synchronized void zza(zzqr zzqr) {
        zza(new zzbyu(zzqr));
    }

    public final synchronized void zzv(View view) {
        zzqq zzqq = this.zzful.get(view);
        if (zzqq == null) {
            zzqq = new zzqq(this.zzvr, view);
            zzqq.zza((zzqu) this);
            this.zzful.put(view, zzqq);
        }
        if (this.zzfpf != null && this.zzfpf.zzdsv) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpm)).booleanValue()) {
                zzqq.zzen(((Long) zzwe.zzpu().zzd(zzaat.zzcpl)).longValue());
                return;
            }
        }
        zzqq.zzlu();
    }

    public final synchronized void zzw(View view) {
        if (this.zzful.containsKey(view)) {
            this.zzful.get(view).zzb(this);
            this.zzful.remove(view);
        }
    }
}
