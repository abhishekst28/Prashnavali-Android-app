package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzcyx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcyk extends zzawx {
    private static final List<String> zzgrl = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click"}));
    private static final List<String> zzgrm = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    private static final List<String> zzgrn = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion"}));
    private static final List<String> zzgro = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    /* access modifiers changed from: private */
    public zzbbg zzbop;
    private final ScheduledExecutorService zzflf;
    private zzeg zzflj;
    private Point zzfwd = new Point();
    private Point zzfwe = new Point();
    private final zzdvw zzgay;
    private zzdma<zzchc> zzgmr;
    private zzbii zzgrp;
    private zzarn zzgrq;
    private Context zzvr;

    public zzcyk(zzbii zzbii, Context context, zzeg zzeg, zzbbg zzbbg, zzdma<zzchc> zzdma, zzdvw zzdvw, ScheduledExecutorService scheduledExecutorService) {
        this.zzgrp = zzbii;
        this.zzvr = context;
        this.zzflj = zzeg;
        this.zzbop = zzbbg;
        this.zzgmr = zzdma;
        this.zzgay = zzdvw;
        this.zzflf = scheduledExecutorService;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaxa zzaxa, zzawt zzawt) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzvr = context;
        String str = zzaxa.zzbuo;
        String str2 = zzaxa.zzbqx;
        zzvj zzvj = zzaxa.zzdxj;
        zzvc zzvc = zzaxa.zzdxk;
        zzcyh zzadx = this.zzgrp.zzadx();
        zzbsg.zza zzcd = new zzbsg.zza().zzcd(context);
        zzdlp zzdlp = new zzdlp();
        if (str == null) {
            str = "adUnitId";
        }
        zzdlp zzgt = zzdlp.zzgt(str);
        if (zzvc == null) {
            zzvc = new zzvf().zzph();
        }
        zzdlp zzh = zzgt.zzh(zzvc);
        if (zzvj == null) {
            zzvj = new zzvj();
        }
        zzdvl.zza(zzadx.zzf(zzcd.zza(zzh.zze(zzvj).zzasu()).zzajj()).zza(new zzcyx(new zzcyx.zza().zzgs(str2))).zzf(new zzbxj.zza().zzake()).zzagm().zzagl(), new zzcyt(this, zzawt), this.zzgrp.zzadj());
    }

    public final void zzan(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxc)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzarn zzarn = this.zzgrq;
            this.zzfwd = zzbah.zza(motionEvent, zzarn == null ? null : zzarn.zzaat);
            if (motionEvent.getAction() == 0) {
                this.zzfwe = this.zzfwd;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) this.zzfwd.x, (float) this.zzfwd.y);
            this.zzflj.zza(obtain);
            obtain.recycle();
        }
    }

    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return null;
    }

    public final IObjectWrapper zzao(IObjectWrapper iObjectWrapper) {
        return null;
    }

    public final void zza(zzarn zzarn) {
        this.zzgrq = zzarn;
        this.zzgmr.zzed(1);
    }

    public final void zza(List<Uri> list, IObjectWrapper iObjectWrapper, zzarc zzarc) {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxc)).booleanValue()) {
            try {
                zzarc.onError("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                zzbbd.zzc("", e);
            }
        } else {
            zzdvt zze = this.zzgay.zze(new zzcyj(this, list, iObjectWrapper));
            if (zzaqo()) {
                zze = zzdvl.zzb(zze, new zzcym(this), (Executor) this.zzgay);
            } else {
                zzaxy.zzfd("Asset view map is empty.");
            }
            zzdvl.zza(zze, new zzcyw(this, zzarc), this.zzgrp.zzadj());
        }
    }

    public final void zzb(List<Uri> list, IObjectWrapper iObjectWrapper, zzarc zzarc) {
        try {
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxc)).booleanValue()) {
                zzarc.onError("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                zzarc.onError("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!zza(uri, zzgrl, zzgrm)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzaxy.zzfe(sb.toString());
                    zzarc.onSuccess(list);
                    return;
                }
                zzdvt zze = this.zzgay.zze(new zzcyl(this, uri, iObjectWrapper));
                if (zzaqo()) {
                    zze = zzdvl.zzb(zze, new zzcyo(this), (Executor) this.zzgay);
                } else {
                    zzaxy.zzfd("Asset view map is empty.");
                }
                zzdvl.zza(zze, new zzcyv(this, zzarc), this.zzgrp.zzadj());
            }
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    private static boolean zzk(Uri uri) {
        return zza(uri, zzgrn, zzgro);
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final Uri zzb(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzflj.zza(uri, this.zzvr, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
        } catch (zzef e) {
            zzbbd.zzd("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static boolean zza(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host == null || path == null) {
            return false;
        }
        for (String contains : list) {
            if (path.contains(contains)) {
                for (String endsWith : list2) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    private final zzdvt<String> zzgr(String str) {
        zzchc[] zzchcArr = new zzchc[1];
        zzdvt<O> zzb = zzdvl.zzb(this.zzgmr.zzasz(), new zzcyr(this, zzchcArr, str), (Executor) this.zzgay);
        zzb.addListener(new zzcyu(this, zzchcArr), this.zzgay);
        return zzdvc.zzg(zzb).zza((long) ((Integer) zzwe.zzpu().zzd(zzaat.zzcxd)).intValue(), TimeUnit.MILLISECONDS, this.zzflf).zza(zzcyp.zzdwg, this.zzgay).zza(Exception.class, zzcys.zzdwg, (Executor) this.zzgay);
    }

    private static Uri zza(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    private final boolean zzaqo() {
        zzarn zzarn = this.zzgrq;
        return (zzarn == null || zzarn.zzdpj == null || this.zzgrq.zzdpj.isEmpty()) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzchc[] zzchcArr) {
        if (zzchcArr[0] != null) {
            this.zzgmr.zzd(zzdvl.zzaf(zzchcArr[0]));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzchc[] zzchcArr, String str, zzchc zzchc) throws Exception {
        zzchcArr[0] = zzchc;
        JSONObject zza = zzbah.zza(this.zzvr, this.zzgrq.zzdpj, this.zzgrq.zzdpj, this.zzgrq.zzaat);
        JSONObject zza2 = zzbah.zza(this.zzvr, this.zzgrq.zzaat);
        JSONObject zzt = zzbah.zzt(this.zzgrq.zzaat);
        JSONObject zzb = zzbah.zzb(this.zzvr, this.zzgrq.zzaat);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zza);
        jSONObject.put("ad_view_signal", zza2);
        jSONObject.put("scroll_view_signal", zzt);
        jSONObject.put("lock_screen_signal", zzb);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzbah.zza((String) null, this.zzvr, this.zzfwe, this.zzfwd));
        }
        return zzchc.zzc(str, jSONObject);
    }

    static /* synthetic */ Uri zzc(Uri uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            return zza(uri, "nas", str);
        }
        return uri;
    }

    static /* synthetic */ ArrayList zza(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzk(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zza(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzl(Uri uri) throws Exception {
        return zzdvl.zzb(zzgr("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzcyq(this, uri), (Executor) this.zzgay);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzb(ArrayList arrayList) throws Exception {
        return zzdvl.zzb(zzgr("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzcyn(this, arrayList), (Executor) this.zzgay);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zza(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String str;
        if (this.zzflj.zzca() != null) {
            str = this.zzflj.zzca().zza(this.zzvr, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzk(uri)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzaxy.zzfe(sb.toString());
                    arrayList.add(uri);
                } else {
                    arrayList.add(zza(uri, "ms", str));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }
}
