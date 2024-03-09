package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzceu implements zzcdd {
    private final zzbbg zzbpa;
    private final zzdkx zzfpf;
    private final zzdln zzfqn;
    private final zzbtl zzfvu;
    private final zzbst zzfvv;
    private boolean zzfvz = false;
    private boolean zzfwc = false;
    private final zzand zzgaq;
    private final zzani zzgar;
    private final zzanj zzgas;
    private final Context zzvr;

    public zzceu(zzand zzand, zzani zzani, zzanj zzanj, zzbtl zzbtl, zzbst zzbst, Context context, zzdkx zzdkx, zzbbg zzbbg, zzdln zzdln) {
        this.zzgaq = zzand;
        this.zzgar = zzani;
        this.zzgas = zzanj;
        this.zzfvu = zzbtl;
        this.zzfvv = zzbst;
        this.zzvr = context;
        this.zzfpf = zzdkx;
        this.zzbpa = zzbbg;
        this.zzfqn = zzdln;
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            HashMap<String, View> zzb = zzb(map);
            HashMap<String, View> zzb2 = zzb(map2);
            if (this.zzgas != null) {
                this.zzgas.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
            } else if (this.zzgaq != null) {
                this.zzgaq.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzgaq.zzv(wrap);
            } else if (this.zzgar != null) {
                this.zzgar.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzgar.zzv(wrap);
            }
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to call trackView", e);
        }
    }

    private static HashMap<String, View> zzb(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    public final void zza(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            if (this.zzgas != null) {
                this.zzgas.zzw(wrap);
            } else if (this.zzgaq != null) {
                this.zzgaq.zzw(wrap);
            } else if (this.zzgar != null) {
                this.zzgar.zzw(wrap);
            }
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to call untrackView", e);
        }
    }

    public final void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfwc || !this.zzfpf.zzdjh) {
            zzad(view);
        }
    }

    private final void zzad(View view) {
        try {
            if (this.zzgas != null && !this.zzgas.getOverrideClickHandling()) {
                this.zzgas.zzu(ObjectWrapper.wrap(view));
                this.zzfvv.onAdClicked();
            } else if (this.zzgaq != null && !this.zzgaq.getOverrideClickHandling()) {
                this.zzgaq.zzu(ObjectWrapper.wrap(view));
                this.zzfvv.onAdClicked();
            } else if (this.zzgar != null && !this.zzgar.getOverrideClickHandling()) {
                this.zzgar.zzu(ObjectWrapper.wrap(view));
                this.zzfvv.onAdClicked();
            }
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to call handleClick", e);
        }
    }

    public final void zzg(Bundle bundle) {
    }

    public final void zzfz(String str) {
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfwc) {
            zzaxy.zzfe("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzfpf.zzdjh) {
            zzaxy.zzfe("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
        } else {
            zzad(view);
        }
    }

    public final void zzsr() {
        this.zzfwc = true;
    }

    public final boolean isCustomClickGestureEnabled() {
        return this.zzfpf.zzdjh;
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.zzfvz && this.zzfpf.zzhat != null) {
                this.zzfvz |= zzp.zzkz().zzb(this.zzvr, this.zzbpa.zzbra, this.zzfpf.zzhat.toString(), this.zzfqn.zzhbv);
            }
            if (this.zzgas != null && !this.zzgas.getOverrideImpressionRecording()) {
                this.zzgas.recordImpression();
                this.zzfvu.onAdImpression();
            } else if (this.zzgaq != null && !this.zzgaq.getOverrideImpressionRecording()) {
                this.zzgaq.recordImpression();
                this.zzfvu.onAdImpression();
            } else if (this.zzgar != null && !this.zzgar.getOverrideImpressionRecording()) {
                this.zzgar.recordImpression();
                this.zzfvu.onAdImpression();
            }
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to call recordImpression", e);
        }
    }

    public final void zzale() {
    }

    public final boolean zzi(Bundle bundle) {
        return false;
    }

    public final void zzalc() {
    }

    public final void zza(View view, MotionEvent motionEvent, View view2) {
    }

    public final void zzh(Bundle bundle) {
    }

    public final void setClickConfirmingView(View view) {
    }

    public final void zza(zzafr zzafr) {
    }

    public final void cancelUnconfirmedClick() {
    }

    public final void zza(zzxv zzxv) {
        zzaxy.zzfe("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zza(zzxr zzxr) {
        zzaxy.zzfe("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzald() {
        zzaxy.zzfe("Mute This Ad is not supported for 3rd party ads");
    }

    public final void destroy() {
    }
}
