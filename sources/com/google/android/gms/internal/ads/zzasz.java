package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzasz implements Callable<zzasu> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzasw zzdut;

    zzasz(zzasw zzasw, Context context) {
        this.zzdut = zzasw;
        this.val$context = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzasu zzasu;
        zzasy zzasy = (zzasy) this.zzdut.zzduq.get(this.val$context);
        if (zzasy != null) {
            if (!(zzasy.zzdur + zzacg.zzczs.get().longValue() < zzp.zzkw().currentTimeMillis())) {
                zzasu = new zzasx(this.val$context, zzasy.zzdus).zzvk();
                this.zzdut.zzduq.put(this.val$context, new zzasy(this.zzdut, zzasu));
                return zzasu;
            }
        }
        zzasu = new zzasx(this.val$context).zzvk();
        this.zzdut.zzduq.put(this.val$context, new zzasy(this.zzdut, zzasu));
        return zzasu;
    }
}
