package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public interface zzbfq extends zzk, zzajk, zzakh, zzbde, zzbgs, zzbgt, zzbgw, zzbha, zzbhb, zzbhd, zzqu {
    void destroy();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    View getView();

    WebView getWebView();

    int getWidth();

    boolean isDestroyed();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void zza(ViewGroup viewGroup, Activity activity, String str, String str2);

    void zza(zzc zzc);

    void zza(zzadf zzadf);

    void zza(zzadk zzadk);

    void zza(zzbgk zzbgk);

    void zza(zzbhj zzbhj);

    void zza(zzsc zzsc);

    void zza(String str, Predicate<zzahf<? super zzbfq>> predicate);

    void zza(String str, zzahf<? super zzbfq> zzahf);

    void zza(String str, zzbev zzbev);

    void zzaax();

    void zzaay();

    Context zzaaz();

    zzc zzaba();

    zzc zzabb();

    zzbhj zzabc();

    String zzabd();

    zzbhc zzabe();

    WebViewClient zzabf();

    boolean zzabg();

    zzeg zzabh();

    IObjectWrapper zzabi();

    boolean zzabj();

    void zzabk();

    boolean zzabl();

    boolean zzabm();

    void zzabn();

    void zzabo();

    zzadk zzabp();

    void zzabq();

    void zzabr();

    zzsc zzabs();

    boolean zzabt();

    zzsq zzabu();

    boolean zzabv();

    void zzal(boolean z);

    void zzap(IObjectWrapper iObjectWrapper);

    void zzax(boolean z);

    void zzay(boolean z);

    void zzaz(boolean z);

    void zzb(zzc zzc);

    void zzb(String str, zzahf<? super zzbfq> zzahf);

    void zzb(String str, String str2, String str3);

    boolean zzb(boolean z, int i);

    void zzba(boolean z);

    void zzbv(Context context);

    void zzdu(int i);

    void zzuv();

    zzbgk zzzo();

    Activity zzzq();

    zzb zzzr();

    zzabh zzzs();

    zzbbg zzzt();
}
