package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcod {
    private final Executor executor;
    private final zzdln zzfqn;
    private final zzbbg zzghx;
    private final Context zzvr;

    public zzcod(Context context, zzbbg zzbbg, zzdln zzdln, Executor executor2) {
        this.zzvr = context;
        this.zzghx = zzbbg;
        this.zzfqn = zzdln;
        this.executor = executor2;
    }

    public final zzdvt<zzdlj> zzapk() {
        zzalm<I, O> zza = zzp.zzlc().zzb(this.zzvr, this.zzghx).zza("google.afma.response.normalize", zzalp.zzdhs, zzalp.zzdhs);
        return zzdvl.zzb(zzdvl.zzb(zzdvl.zzb(zzdvl.zzaf(""), new zzcog(this, this.zzfqn.zzhbu.zzchi), this.executor), new zzcof(zza), this.executor), new zzcoi(this), this.executor);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzo(JSONObject jSONObject) throws Exception {
        return zzdvl.zzaf(new zzdlj(new zzdle(this.zzfqn), zzdlh.zza(new StringReader(jSONObject.toString()))));
    }
}
