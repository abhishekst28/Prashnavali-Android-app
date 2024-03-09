package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcco extends zzbpd {
    private final zzbbg zzbpa;
    private final zzeg zzenn;
    private final Executor zzfmk;
    private final zzcdg zzfod;
    private final zzavy zzfpr;
    private final zzcxh zzftk;
    private final zzccv zzfvt;
    private final zzcdd zzfwx;
    private final zzcdr zzfwy;
    private final zzccz zzfwz;
    private final zzeli<zzcgu> zzfxa;
    private final zzeli<zzcgs> zzfxb;
    private final zzeli<zzcgx> zzfxc;
    private final zzeli<zzcgo> zzfxd;
    private final zzeli<zzcgw> zzfxe;
    private zzcep zzfxf;
    private boolean zzfxg;
    private final zzccu zzfxh;
    private final Context zzvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcco(zzbpg zzbpg, Executor executor, zzccv zzccv, zzcdd zzcdd, zzcdr zzcdr, zzccz zzccz, zzcdg zzcdg, zzeli<zzcgu> zzeli, zzeli<zzcgs> zzeli2, zzeli<zzcgx> zzeli3, zzeli<zzcgo> zzeli4, zzeli<zzcgw> zzeli5, zzavy zzavy, zzeg zzeg, zzbbg zzbbg, Context context, zzccu zzccu, zzcxh zzcxh) {
        super(zzbpg);
        this.zzfmk = executor;
        this.zzfvt = zzccv;
        this.zzfwx = zzcdd;
        this.zzfwy = zzcdr;
        this.zzfwz = zzccz;
        this.zzfod = zzcdg;
        this.zzfxa = zzeli;
        this.zzfxb = zzeli2;
        this.zzfxc = zzeli3;
        this.zzfxd = zzeli4;
        this.zzfxe = zzeli5;
        this.zzfpr = zzavy;
        this.zzenn = zzeg;
        this.zzbpa = zzbbg;
        this.zzvr = context;
        this.zzfxh = zzccu;
        this.zzftk = zzcxh;
    }

    public final void zzahw() {
        this.zzfmk.execute(new zzccn(this));
        if (this.zzfvt.zzaln() != 7) {
            Executor executor = this.zzfmk;
            zzcdd zzcdd = this.zzfwx;
            zzcdd.getClass();
            executor.execute(zzccq.zza(zzcdd));
        }
        super.zzahw();
    }

    public final synchronized void zzfz(String str) {
        this.zzfwx.zzfz(str);
    }

    public final synchronized void zzalc() {
        if (!this.zzfxg) {
            this.zzfwx.zzalc();
        }
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzfwx.zzg(bundle);
    }

    public final synchronized boolean zzi(Bundle bundle) {
        if (this.zzfxg) {
            return true;
        }
        boolean zzi = this.zzfwx.zzi(bundle);
        this.zzfxg = zzi;
        return zzi;
    }

    public final synchronized void zzh(Bundle bundle) {
        this.zzfwx.zzh(bundle);
    }

    public final synchronized void destroy() {
        this.zzfmk.execute(new zzccp(this));
        super.destroy();
    }

    public final synchronized void zza(zzcep zzcep) {
        zzdw zzca;
        this.zzfxf = zzcep;
        this.zzfwy.zza(zzcep);
        this.zzfwx.zza(zzcep.zzahq(), zzcep.zzamp(), zzcep.zzamq(), (View.OnTouchListener) zzcep, (View.OnClickListener) zzcep);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqn)).booleanValue() && (zzca = this.zzenn.zzca()) != null) {
            zzca.zzb(zzcep.zzahq());
        }
        if (zzcep.zzamt() != null) {
            zzcep.zzamt().zza((zzqu) this.zzfpr);
        }
    }

    public final synchronized void zzb(zzcep zzcep) {
        this.zzfwx.zza(zzcep.zzahq(), zzcep.zzamo());
        if (zzcep.zzams() != null) {
            zzcep.zzams().setClickable(false);
            zzcep.zzams().removeAllViews();
        }
        if (zzcep.zzamt() != null) {
            zzcep.zzamt().zzb(this.zzfpr);
        }
        this.zzfxf = null;
    }

    public final synchronized void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.zzfwy.zzc(this.zzfxf);
        this.zzfwx.zza(view, view2, map, map2, z);
    }

    public final synchronized void zza(View view, MotionEvent motionEvent, View view2) {
        this.zzfwx.zza(view, motionEvent, view2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5, boolean r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzfxg     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            if (r6 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzcdr r6 = r2.zzfwy     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.ads.zzcep r1 = r2.zzfxf     // Catch:{ all -> 0x006b }
            r6.zzd(r1)     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.ads.zzcdd r6 = r2.zzfwx     // Catch:{ all -> 0x006b }
            r6.zza((android.view.View) r3, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x006b }
            r2.zzfxg = r0     // Catch:{ all -> 0x006b }
            monitor-exit(r2)
            return
        L_0x001a:
            if (r6 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzaat.zzcrv     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x006b }
            java.lang.Object r6 = r1.zzd(r6)     // Catch:{ all -> 0x006b }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x006b }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0069
            if (r4 == 0) goto L_0x0069
            java.util.Set r6 = r4.entrySet()     // Catch:{ all -> 0x006b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x006b }
        L_0x0038:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0069
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x006b }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x006b }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x006b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0068
            boolean r1 = zzz(r1)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzcdr r6 = r2.zzfwy     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.ads.zzcep r1 = r2.zzfxf     // Catch:{ all -> 0x006b }
            r6.zzd(r1)     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.ads.zzcdd r6 = r2.zzfwx     // Catch:{ all -> 0x006b }
            r6.zza((android.view.View) r3, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x006b }
            r2.zzfxg = r0     // Catch:{ all -> 0x006b }
            monitor-exit(r2)
            return
        L_0x0068:
            goto L_0x0038
        L_0x0069:
            monitor-exit(r2)
            return
        L_0x006b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcco.zzb(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void setClickConfirmingView(View view) {
        this.zzfwx.setClickConfirmingView(view);
    }

    public final synchronized void zza(zzafr zzafr) {
        this.zzfwx.zza(zzafr);
    }

    public final synchronized void cancelUnconfirmedClick() {
        this.zzfwx.cancelUnconfirmedClick();
    }

    public final synchronized void zza(zzxv zzxv) {
        this.zzfwx.zza(zzxv);
    }

    public final synchronized void zza(zzxr zzxr) {
        this.zzfwx.zza(zzxr);
    }

    public final synchronized void zzsr() {
        this.zzfwx.zzsr();
    }

    public final synchronized void recordCustomClickGesture() {
        if (this.zzfxf == null) {
            zzaxy.zzef("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.zzfmk.execute(new zzccs(this, this.zzfxf instanceof zzcdq));
        }
    }

    public final synchronized boolean isCustomClickGestureEnabled() {
        return this.zzfwx.isCustomClickGestureEnabled();
    }

    public static boolean zzz(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
    }

    public final boolean zzali() {
        return this.zzfwz.zzama();
    }

    public final void zzh(String str, boolean z) {
        String str2;
        View view;
        if (this.zzfwz.zzalj()) {
            zzbfq zzalt = this.zzfvt.zzalt();
            zzbfq zzals = this.zzfvt.zzals();
            if (zzalt != null || zzals != null) {
                boolean z2 = true;
                boolean z3 = zzalt != null;
                if (zzals == null) {
                    z2 = false;
                }
                if (z3) {
                    str2 = null;
                } else if (z2) {
                    zzalt = zzals;
                    str2 = "javascript";
                } else {
                    zzalt = null;
                    str2 = null;
                }
                if (zzalt.getWebView() != null && zzp.zzle().zzp(this.zzvr)) {
                    int i = this.zzbpa.zzedq;
                    int i2 = this.zzbpa.zzedr;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    IObjectWrapper zza = zzp.zzle().zza(sb.toString(), zzalt.getWebView(), "", "javascript", str2, str);
                    if (zza != null) {
                        this.zzfvt.zzas(zza);
                        zzalt.zzap(zza);
                        if (z2 && (view = zzals.getView()) != null) {
                            zzp.zzle().zza(zza, view);
                        }
                        if (z) {
                            zzp.zzle().zzab(zza);
                        }
                    }
                }
            }
        }
    }

    public final boolean zzalj() {
        return this.zzfwz.zzalj();
    }

    public final void zzaa(View view) {
        IObjectWrapper zzalu = this.zzfvt.zzalu();
        boolean z = this.zzfvt.zzalt() != null;
        if (this.zzfwz.zzalj() && zzalu != null && z && view != null) {
            zzp.zzle().zza(zzalu, view);
        }
    }

    public final void zzab(View view) {
        IObjectWrapper zzalu = this.zzfvt.zzalu();
        if (this.zzfwz.zzalj() && zzalu != null && view != null) {
            zzp.zzle().zzb(zzalu, view);
        }
    }

    public final zzccu zzalk() {
        return this.zzfxh;
    }

    public final synchronized void zza(zzya zzya) {
        this.zzftk.zzb(zzya);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzbj(boolean z) {
        this.zzfwx.zza(this.zzfxf.zzahq(), this.zzfxf.zzamo(), this.zzfxf.zzamp(), z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzall() {
        this.zzfwx.destroy();
        this.zzfvt.destroy();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzalm() {
        try {
            int zzaln = this.zzfvt.zzaln();
            if (zzaln != 1) {
                if (zzaln != 2) {
                    if (zzaln != 3) {
                        if (zzaln != 6) {
                            if (zzaln != 7) {
                                zzaxy.zzfc("Wrong native template id!");
                            } else if (this.zzfod.zzamg() != null) {
                                this.zzfod.zzamg().zza(this.zzfxd.get());
                            }
                        } else if (this.zzfod.zzame() != null) {
                            zzh("Google", true);
                            this.zzfod.zzame().zza(this.zzfxc.get());
                        }
                    } else if (this.zzfod.zzgd(this.zzfvt.getCustomTemplateId()) != null) {
                        if (this.zzfvt.zzals() != null) {
                            zzh("Google", true);
                        }
                        this.zzfod.zzgd(this.zzfvt.getCustomTemplateId()).zza(this.zzfxe.get());
                    }
                } else if (this.zzfod.zzamd() != null) {
                    zzh("Google", true);
                    this.zzfod.zzamd().zza(this.zzfxb.get());
                }
            } else if (this.zzfod.zzamc() != null) {
                zzh("Google", true);
                this.zzfod.zzamc().zza(this.zzfxa.get());
            }
        } catch (RemoteException e) {
            zzaxy.zzc("RemoteException when notifyAdLoad is called", e);
        }
    }
}
