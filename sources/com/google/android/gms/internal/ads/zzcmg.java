package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzp;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcmg implements AppEventListener, zzbsu, zzbsz, zzbtm, zzbtp, zzbuj, zzbvj, zzdpl, zzut {
    private long startTime;
    private final List<Object> zzedm;
    private final zzclu zzgfy;

    public zzcmg(zzclu zzclu, zzbii zzbii) {
        this.zzgfy = zzclu;
        this.zzedm = Collections.singletonList(zzbii);
    }

    public final void zzbz(Context context) {
        zza((Class<?>) zzbtp.class, "onPause", context);
    }

    public final void zzca(Context context) {
        zza((Class<?>) zzbtp.class, "onResume", context);
    }

    public final void zzcb(Context context) {
        zza((Class<?>) zzbtp.class, "onDestroy", context);
    }

    public final void onAppEvent(String str, String str2) {
        zza((Class<?>) AppEventListener.class, "onAppEvent", str, str2);
    }

    public final void onAdLoaded() {
        long elapsedRealtime = zzp.zzkw().elapsedRealtime() - this.startTime;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        zzaxy.zzei(sb.toString());
        zza((Class<?>) zzbuj.class, "onAdLoaded", new Object[0]);
    }

    public final void zzg(zzuw zzuw) {
        zza((Class<?>) zzbsz.class, "onAdFailedToLoad", Integer.valueOf(zzuw.errorCode), zzuw.zzcgr, zzuw.zzcgs);
    }

    public final void onAdOpened() {
        zza((Class<?>) zzbsu.class, "onAdOpened", new Object[0]);
    }

    public final void onAdClosed() {
        zza((Class<?>) zzbsu.class, "onAdClosed", new Object[0]);
    }

    public final void onAdLeftApplication() {
        zza((Class<?>) zzbsu.class, "onAdLeftApplication", new Object[0]);
    }

    public final void onAdClicked() {
        zza((Class<?>) zzut.class, "onAdClicked", new Object[0]);
    }

    public final void onAdImpression() {
        zza((Class<?>) zzbtm.class, "onAdImpression", new Object[0]);
    }

    public final void onRewardedVideoStarted() {
        zza((Class<?>) zzbsu.class, "onRewardedVideoStarted", new Object[0]);
    }

    @ParametersAreNonnullByDefault
    public final void zzb(zzatj zzatj, String str, String str2) {
        zza((Class<?>) zzbsu.class, "onRewarded", zzatj, str, str2);
    }

    public final void onRewardedVideoCompleted() {
        zza((Class<?>) zzbsu.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zza(zzdpg zzdpg, String str) {
        zza((Class<?>) zzdpd.class, "onTaskCreated", str);
    }

    public final void zzb(zzdpg zzdpg, String str) {
        zza((Class<?>) zzdpd.class, "onTaskStarted", str);
    }

    public final void zza(zzdpg zzdpg, String str, Throwable th) {
        zza((Class<?>) zzdpd.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzc(zzdpg zzdpg, String str) {
        zza((Class<?>) zzdpd.class, "onTaskSucceeded", str);
    }

    private final void zza(Class<?> cls, String str, Object... objArr) {
        zzclu zzclu = this.zzgfy;
        List<Object> list = this.zzedm;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzclu.zza(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    public final void zzd(zzasp zzasp) {
        this.startTime = zzp.zzkw().elapsedRealtime();
        zza((Class<?>) zzbvj.class, "onAdRequest", new Object[0]);
    }

    public final void zzb(zzdlj zzdlj) {
    }
}
