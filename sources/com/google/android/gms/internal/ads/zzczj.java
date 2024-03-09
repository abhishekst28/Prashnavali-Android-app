package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczj implements zzdek<Bundle> {
    private final zzvj zzbpb;
    private final List<Parcelable> zzgsg;
    private final Context zzvr;

    public zzczj(Context context, zzvj zzvj, List<Parcelable> list) {
        this.zzvr = context;
        this.zzbpb = zzvj;
        this.zzgsg = list;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (zzacq.zzdbc.get().booleanValue()) {
            Bundle bundle2 = new Bundle();
            zzp.zzkp();
            bundle2.putString("activity", zzayh.zzau(this.zzvr));
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.zzbpb.width);
            bundle3.putInt("height", this.zzbpb.height);
            bundle2.putBundle("size", bundle3);
            if (this.zzgsg.size() > 0) {
                List<Parcelable> list = this.zzgsg;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
