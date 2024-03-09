package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbcx {
    private final Context zzcle;
    private final zzbde zzefm;
    private final ViewGroup zzegh;
    private zzbcr zzegi;

    public zzbcx(Context context, ViewGroup viewGroup, zzbfq zzbfq) {
        this(context, viewGroup, zzbfq, (zzbcr) null);
    }

    private zzbcx(Context context, ViewGroup viewGroup, zzbde zzbde, zzbcr zzbcr) {
        this.zzcle = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzegh = viewGroup;
        this.zzefm = zzbde;
        this.zzegi = null;
    }

    public final void zze(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzbcr zzbcr = this.zzegi;
        if (zzbcr != null) {
            zzbcr.zzd(i, i2, i3, i4);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, int i5, boolean z, zzbdf zzbdf) {
        if (this.zzegi == null) {
            zzabb.zza(this.zzefm.zzzs().zzrm(), this.zzefm.zzzp(), "vpr2");
            Context context = this.zzcle;
            zzbde zzbde = this.zzefm;
            zzbcr zzbcr = new zzbcr(context, zzbde, i5, z, zzbde.zzzs().zzrm(), zzbdf);
            this.zzegi = zzbcr;
            this.zzegh.addView(zzbcr, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.zzegi.zzd(i, i2, i3, i4);
            this.zzefm.zzav(false);
        }
    }

    public final zzbcr zzzj() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzegi;
    }

    public final void onPause() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzbcr zzbcr = this.zzegi;
        if (zzbcr != null) {
            zzbcr.pause();
        }
    }

    public final void onDestroy() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzbcr zzbcr = this.zzegi;
        if (zzbcr != null) {
            zzbcr.destroy();
            this.zzegh.removeView(this.zzegi);
            this.zzegi = null;
        }
    }
}
