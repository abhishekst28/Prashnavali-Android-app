package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczi implements zzden<zzczj> {
    private final zzdln zzfqn;
    private final zzdvw zzgse;
    private final View zzgsf;
    private final Context zzvr;

    public zzczi(zzdvw zzdvw, Context context, zzdln zzdln, ViewGroup viewGroup) {
        this.zzgse = zzdvw;
        this.zzvr = context;
        this.zzfqn = zzdln;
        this.zzgsf = viewGroup;
    }

    public final zzdvt<zzczj> zzaqs() {
        return this.zzgse.zze(new zzczl(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzczj zzaqt() throws Exception {
        Context context = this.zzvr;
        zzvj zzvj = this.zzfqn.zzbpb;
        ArrayList arrayList = new ArrayList();
        View view = this.zzgsf;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int i = -1;
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzczj(context, zzvj, arrayList);
    }
}
