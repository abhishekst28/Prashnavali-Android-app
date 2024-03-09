package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbzr extends zzbpd {
    private final WeakReference<zzbfq> zzfur;
    private final zzbyg zzfus;
    private final zzcaz zzfut;
    private final zzbpx zzfuu;
    private final zzdqm zzfuv;
    private final zzbtb zzfuw;
    private boolean zzfux = false;
    private final Context zzvr;

    zzbzr(zzbpg zzbpg, Context context, @Nullable zzbfq zzbfq, zzbyg zzbyg, zzcaz zzcaz, zzbpx zzbpx, zzdqm zzdqm, zzbtb zzbtb) {
        super(zzbpg);
        this.zzvr = context;
        this.zzfur = new WeakReference<>(zzbfq);
        this.zzfus = zzbyg;
        this.zzfut = zzcaz;
        this.zzfuu = zzbpx;
        this.zzfuv = zzdqm;
        this.zzfuw = zzbtb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzbi(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcnp
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.ads.internal.zzp.zzkp()
            android.content.Context r0 = r4.zzvr
            boolean r0 = com.google.android.gms.internal.ads.zzayh.zzav(r0)
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)
            com.google.android.gms.internal.ads.zzbtb r0 = r4.zzfuw
            r0.zzajk()
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcnq
            com.google.android.gms.internal.ads.zzaap r3 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r0 = r3.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.zzdqm r0 = r4.zzfuv
            com.google.android.gms.internal.ads.zzdlj r3 = r4.zzflg
            com.google.android.gms.internal.ads.zzdlh r3 = r3.zzhbq
            com.google.android.gms.internal.ads.zzdkz r3 = r3.zzhbn
            java.lang.String r3 = r3.zzdsg
            r0.zzhc(r3)
        L_0x0049:
            r0 = 0
            goto L_0x0052
        L_0x004b:
            boolean r0 = r4.zzfux
            if (r0 != 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 != 0) goto L_0x0055
            return r2
        L_0x0055:
            com.google.android.gms.internal.ads.zzbyg r0 = r4.zzfus
            r0.zzaiz()
            com.google.android.gms.internal.ads.zzcaz r0 = r4.zzfut     // Catch:{ zzcbc -> 0x006a }
            android.content.Context r3 = r4.zzvr     // Catch:{ zzcbc -> 0x006a }
            r0.zza(r5, r3)     // Catch:{ zzcbc -> 0x006a }
            com.google.android.gms.internal.ads.zzbyg r5 = r4.zzfus     // Catch:{ zzcbc -> 0x006a }
            r5.zzaix()     // Catch:{ zzcbc -> 0x006a }
            r4.zzfux = r1
            return r1
        L_0x006a:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzbtb r0 = r4.zzfuw
            r0.zza(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzr.zzbi(boolean):boolean");
    }

    public final boolean isClosed() {
        return this.zzfuu.isClosed();
    }

    public final void finalize() throws Throwable {
        try {
            zzbfq zzbfq = (zzbfq) this.zzfur.get();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcww)).booleanValue()) {
                if (!this.zzfux && zzbfq != null) {
                    zzdvw zzdvw = zzbbi.zzedy;
                    zzbfq.getClass();
                    zzdvw.execute(zzbzu.zzh(zzbfq));
                }
            } else if (zzbfq != null) {
                zzbfq.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
