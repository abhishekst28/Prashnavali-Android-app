package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzalu {
    private static final zzazm<zzajx> zzdhv = new zzalt();
    private static final zzazm<zzajx> zzdhw = new zzalw();
    private final zzakk zzdhx;

    public zzalu(Context context, zzbbg zzbbg, String str) {
        this.zzdhx = new zzakk(context, zzbbg, str, zzdhv, zzdhw);
    }

    public final <I, O> zzalm<I, O> zza(String str, zzaln<I> zzaln, zzalo<O> zzalo) {
        return new zzalv(this.zzdhx, str, zzaln, zzalo);
    }

    public final zzalz zztl() {
        return new zzalz(this.zzdhx);
    }
}
