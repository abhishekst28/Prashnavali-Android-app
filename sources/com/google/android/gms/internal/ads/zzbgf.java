package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbgf extends FrameLayout implements zzbfq {
    /* access modifiers changed from: private */
    public final zzbfq zzenj;
    private final zzbcx zzenk;
    private final AtomicBoolean zzenl = new AtomicBoolean();

    public zzbgf(zzbfq zzbfq) {
        super(zzbfq.getContext());
        this.zzenj = zzbfq;
        this.zzenk = new zzbcx(zzbfq.zzaaz(), this, this);
        if (!zzabv()) {
            addView(this.zzenj.getView());
        }
    }

    public final zzbcx zzzn() {
        return this.zzenk;
    }

    public final View getView() {
        return this;
    }

    public final void onPause() {
        this.zzenk.onPause();
        this.zzenj.onPause();
    }

    public final void zzabk() {
        this.zzenk.onDestroy();
        this.zzenj.zzabk();
    }

    public final void zzabq() {
        setBackgroundColor(0);
        this.zzenj.setBackgroundColor(0);
    }

    public final int zzzu() {
        return getMeasuredHeight();
    }

    public final int zzzv() {
        return getMeasuredWidth();
    }

    public final void zzzw() {
        this.zzenj.zzzw();
    }

    public final WebView getWebView() {
        return this.zzenj.getWebView();
    }

    public final void zza(String str, Map<String, ?> map) {
        this.zzenj.zza(str, map);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.zzenj.zzb(str, jSONObject);
    }

    public final void zza(String str, zzahf<? super zzbfq> zzahf) {
        this.zzenj.zza(str, zzahf);
    }

    public final void zzb(String str, zzahf<? super zzbfq> zzahf) {
        this.zzenj.zzb(str, zzahf);
    }

    public final void zza(String str, Predicate<zzahf<? super zzbfq>> predicate) {
        this.zzenj.zza(str, predicate);
    }

    public final void zzaax() {
        this.zzenj.zzaax();
    }

    public final void zzdu(int i) {
        this.zzenj.zzdu(i);
    }

    public final void zzuv() {
        this.zzenj.zzuv();
    }

    public final void zzaay() {
        this.zzenj.zzaay();
    }

    public final void zza(boolean z, long j) {
        this.zzenj.zza(z, j);
    }

    public final void zzdc(String str) {
        this.zzenj.zzdc(str);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.zzenj.zza(str, jSONObject);
    }

    public final Activity zzzq() {
        return this.zzenj.zzzq();
    }

    public final Context zzaaz() {
        return this.zzenj.zzaaz();
    }

    public final zzb zzzr() {
        return this.zzenj.zzzr();
    }

    public final zzc zzaba() {
        return this.zzenj.zzaba();
    }

    public final IObjectWrapper zzabi() {
        return this.zzenj.zzabi();
    }

    public final zzc zzabb() {
        return this.zzenj.zzabb();
    }

    public final zzbhj zzabc() {
        return this.zzenj.zzabc();
    }

    public final String zzabd() {
        return this.zzenj.zzabd();
    }

    public final zzbhc zzabe() {
        return this.zzenj.zzabe();
    }

    public final WebViewClient zzabf() {
        return this.zzenj.zzabf();
    }

    public final boolean zzabg() {
        return this.zzenj.zzabg();
    }

    public final zzeg zzabh() {
        return this.zzenj.zzabh();
    }

    public final zzbbg zzzt() {
        return this.zzenj.zzzt();
    }

    public final boolean zzabj() {
        return this.zzenj.zzabj();
    }

    public final boolean isDestroyed() {
        return this.zzenj.isDestroyed();
    }

    public final boolean zzabl() {
        return this.zzenj.zzabl();
    }

    public final void zzkm() {
        this.zzenj.zzkm();
    }

    public final void zzkl() {
        this.zzenj.zzkl();
    }

    public final String getRequestId() {
        return this.zzenj.getRequestId();
    }

    public final zzabi zzzp() {
        return this.zzenj.zzzp();
    }

    public final zzabh zzzs() {
        return this.zzenj.zzzs();
    }

    public final zzbgk zzzo() {
        return this.zzenj.zzzo();
    }

    public final void zza(zzc zzc) {
        this.zzenj.zza(zzc);
    }

    public final void zzap(IObjectWrapper iObjectWrapper) {
        this.zzenj.zzap(iObjectWrapper);
    }

    public final void zza(zzbhj zzbhj) {
        this.zzenj.zza(zzbhj);
    }

    public final void zzax(boolean z) {
        this.zzenj.zzax(z);
    }

    public final void zzabn() {
        this.zzenj.zzabn();
    }

    public final void zzbv(Context context) {
        this.zzenj.zzbv(context);
    }

    public final void zzal(boolean z) {
        this.zzenj.zzal(z);
    }

    public final void setRequestedOrientation(int i) {
        this.zzenj.setRequestedOrientation(i);
    }

    public final void zzb(zzc zzc) {
        this.zzenj.zzb(zzc);
    }

    public final void zzay(boolean z) {
        this.zzenj.zzay(z);
    }

    public final void zza(String str, zzbev zzbev) {
        this.zzenj.zza(str, zzbev);
    }

    public final zzbev zzfj(String str) {
        return this.zzenj.zzfj(str);
    }

    public final void zzabo() {
        this.zzenj.zzabo();
    }

    public final void destroy() {
        IObjectWrapper zzabi = zzabi();
        if (zzabi != null) {
            zzayh.zzeaj.post(new zzbge(zzabi));
            zzayh.zzeaj.postDelayed(new zzbgh(this), (long) ((Integer) zzwe.zzpu().zzd(zzaat.zzctr)).intValue());
            return;
        }
        this.zzenj.destroy();
    }

    public final void loadData(String str, String str2, String str3) {
        this.zzenj.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zzenj.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.zzenj.loadUrl(str);
    }

    public final void zzb(String str, String str2, String str3) {
        this.zzenj.zzb(str, str2, str3);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzenj.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zzenj.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zzenj.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zzenj.setWebViewClient(webViewClient);
    }

    public final void onResume() {
        this.zzenj.onResume();
    }

    public final void zzabr() {
        String str;
        TextView textView = new TextView(getContext());
        Resources resources = zzp.zzkt().getResources();
        if (resources != null) {
            str = resources.getString(R.string.s7);
        } else {
            str = "Test Ad";
        }
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final void zzba(boolean z) {
        this.zzenj.zzba(z);
    }

    public final void zza(zzadf zzadf) {
        this.zzenj.zza(zzadf);
    }

    public final void zza(zzsc zzsc) {
        this.zzenj.zza(zzsc);
    }

    public final zzsc zzabs() {
        return this.zzenj.zzabs();
    }

    public final void zza(zzqr zzqr) {
        this.zzenj.zza(zzqr);
    }

    public final void zza(zzadk zzadk) {
        this.zzenj.zza(zzadk);
    }

    public final zzadk zzabp() {
        return this.zzenj.zzabp();
    }

    public final void zza(zzbgk zzbgk) {
        this.zzenj.zza(zzbgk);
    }

    public final boolean zzabm() {
        return this.zzenj.zzabm();
    }

    public final void zzaz(boolean z) {
        this.zzenj.zzaz(z);
    }

    public final void zzav(boolean z) {
        this.zzenj.zzav(z);
    }

    public final void zzuw() {
        this.zzenj.zzuw();
    }

    public final void zza(zzd zzd) {
        this.zzenj.zza(zzd);
    }

    public final void zzc(boolean z, int i) {
        this.zzenj.zzc(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.zzenj.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.zzenj.zza(z, i, str, str2);
    }

    public final boolean zzb(boolean z, int i) {
        if (!this.zzenl.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnu)).booleanValue()) {
            return false;
        }
        if (this.zzenj.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zzenj.getParent()).removeView(this.zzenj.getView());
        }
        return this.zzenj.zzb(z, i);
    }

    public final boolean zzabt() {
        return this.zzenl.get();
    }

    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.zzenj.zza(this, activity, str, str2);
    }

    public final zzsq zzabu() {
        return this.zzenj.zzabu();
    }

    public final boolean zzabv() {
        return this.zzenj.zzabv();
    }
}
