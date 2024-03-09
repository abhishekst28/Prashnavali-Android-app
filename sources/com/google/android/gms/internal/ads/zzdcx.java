package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdcx implements zzden<zzdcu> {
    private final zzdvw zzgse;
    private final Set<String> zzgss;
    private final Context zzvr;

    public zzdcx(zzdvw zzdvw, Context context, Set<String> set) {
        this.zzgse = zzdvw;
        this.zzvr = context;
        this.zzgss = set;
    }

    public final zzdvt<zzdcu> zzaqs() {
        return this.zzgse.zze(new zzdcw(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdcu zzarb() throws Exception {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue() || !zzdcu.zze(this.zzgss)) {
            return new zzdcu((String) null);
        }
        return new zzdcu(zzp.zzle().getVersion(this.zzvr));
    }
}
