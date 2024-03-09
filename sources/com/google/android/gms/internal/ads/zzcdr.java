package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcdr {
    private final Executor executor;
    private final zzadm zzdla;
    private final zzaya zzdza;
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzccv zzfvt;
    private final zzccz zzfwz;
    private final zzccu zzfxh;
    private final zzcdz zzfzh;
    private final zzceh zzfzi;

    public zzcdr(zzaya zzaya, zzdln zzdln, zzccz zzccz, zzccv zzccv, zzcdz zzcdz, zzceh zzceh, Executor executor2, Executor executor3, zzccu zzccu) {
        this.zzdza = zzaya;
        this.zzfqn = zzdln;
        this.zzdla = zzdln.zzdla;
        this.zzfwz = zzccz;
        this.zzfvt = zzccv;
        this.zzfzh = zzcdz;
        this.zzfzi = zzceh;
        this.zzfmk = executor2;
        this.executor = executor3;
        this.zzfxh = zzccu;
    }

    public final void zza(zzcep zzcep) {
        this.zzfmk.execute(new zzcdu(this, zzcep));
    }

    private static void zza(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void zzc(zzcep zzcep) {
        if (zzcep != null && this.zzfzh != null && zzcep.zzams() != null && this.zzfwz.zzalz()) {
            try {
                zzcep.zzams().addView(this.zzfzh.zzamy());
            } catch (zzbgc e) {
                zzaxy.zza("web view can not be obtained", e);
            }
        }
    }

    public final void zzd(zzcep zzcep) {
        if (zzcep != null) {
            Context context = zzcep.zzahq().getContext();
            if (zzbah.zza(this.zzfwz.zzfyh)) {
                if (!(context instanceof Activity)) {
                    zzaxy.zzef("Activity context is needed for policy validator.");
                } else if (this.zzfzi != null && zzcep.zzams() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.zzfzi.zza(zzcep.zzams(), windowManager), zzbah.zzyg());
                    } catch (zzbgc e) {
                        zzaxy.zza("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean zza(zzcep zzcep, String[] strArr) {
        Map<String, WeakReference<View>> zzamp = zzcep.zzamp();
        if (zzamp == null) {
            return false;
        }
        for (String str : strArr) {
            if (zzamp.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View zzalr = this.zzfvt.zzalr();
        if (zzalr == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzalr.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzalr.getParent()).removeView(zzalr);
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcru)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzalr, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.zzfvt.zzalr() == null) {
            return;
        }
        if (2 == this.zzfvt.zzaln() || 1 == this.zzfvt.zzaln()) {
            this.zzdza.zza(this.zzfqn.zzhbv, String.valueOf(this.zzfvt.zzaln()), z);
        } else if (6 == this.zzfvt.zzaln()) {
            this.zzdza.zza(this.zzfqn.zzhbv, "2", z);
            this.zzdza.zza(this.zzfqn.zzhbv, "1", z);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcep zzcep) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        IObjectWrapper iObjectWrapper;
        Drawable drawable;
        int i = 0;
        IObjectWrapper iObjectWrapper2 = null;
        if (this.zzfwz.zzamb() || this.zzfwz.zzama()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    viewGroup = null;
                    break;
                }
                View zzgf = zzcep.zzgf(strArr[i2]);
                if (zzgf != null && (zzgf instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzgf;
                    break;
                }
                i2++;
            }
        } else {
            viewGroup = null;
        }
        boolean z = viewGroup != null;
        Context context = zzcep.zzahq().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.zzfvt.zzalo() != null) {
            view = this.zzfvt.zzalo();
            zzadm zzadm = this.zzdla;
            if (zzadm != null && !z) {
                zza(layoutParams, zzadm.zzbnm);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(this.zzfvt.zzsi() instanceof zzadd)) {
            view = null;
        } else {
            zzadd zzadd = (zzadd) this.zzfvt.zzsi();
            if (!z) {
                zza(layoutParams, zzadd.zzsb());
            }
            zzadg zzadg = new zzadg(context, zzadd, layoutParams);
            zzadg.setContentDescription((CharSequence) zzwe.zzpu().zzd(zzaat.zzcrr));
            view = zzadg;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                AdChoicesView adChoicesView = new AdChoicesView(zzcep.zzahq().getContext());
                adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                adChoicesView.addView(view);
                FrameLayout zzams = zzcep.zzams();
                if (zzams != null) {
                    zzams.addView(adChoicesView);
                }
            }
            zzcep.zza(zzcep.zzamr(), view, true);
        }
        String[] strArr2 = zzcdp.zzfyv;
        int length = strArr2.length;
        while (true) {
            if (i >= length) {
                viewGroup2 = null;
                break;
            }
            View zzgf2 = zzcep.zzgf(strArr2[i]);
            if (zzgf2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzgf2;
                break;
            }
            i++;
        }
        this.executor.execute(new zzcdt(this, viewGroup2));
        if (viewGroup2 == null) {
            return;
        }
        if (!zza(viewGroup2)) {
            viewGroup2.removeAllViews();
            View zzahq = zzcep.zzahq();
            Context context2 = zzahq != null ? zzahq.getContext() : null;
            if (context2 != null) {
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcrq)).booleanValue()) {
                    zzadr zzss = this.zzfxh.zzss();
                    if (zzss != null) {
                        try {
                            iObjectWrapper = zzss.zzsf();
                        } catch (RemoteException e) {
                            zzaxy.zzfe("Could not get main image drawable");
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    zzadw zzalp = this.zzfvt.zzalp();
                    if (zzalp != null) {
                        try {
                            iObjectWrapper = zzalp.zzsd();
                        } catch (RemoteException e2) {
                            zzaxy.zzfe("Could not get drawable from image");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (iObjectWrapper != null && (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) != null) {
                    ImageView imageView = new ImageView(context2);
                    imageView.setImageDrawable(drawable);
                    if (zzcep != null) {
                        iObjectWrapper2 = zzcep.zzamu();
                    }
                    if (iObjectWrapper2 != null) {
                        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvw)).booleanValue()) {
                            imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapper2));
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    }
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
        } else if (this.zzfvt.zzals() != null) {
            this.zzfvt.zzals().zza((zzadk) new zzcdw(this, zzcep, viewGroup2));
        }
    }
}
