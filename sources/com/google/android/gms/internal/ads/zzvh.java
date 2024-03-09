package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzvh {
    public static final zzvh zzchm = new zzvh();

    protected zzvh() {
    }

    public static zzvc zza(Context context, zzyo zzyo) {
        long j;
        List list;
        zzuu zzuu;
        String str;
        String str2;
        zzyo zzyo2 = zzyo;
        Date birthday = zzyo.getBirthday();
        if (birthday != null) {
            j = birthday.getTime();
        } else {
            j = -1;
        }
        String contentUrl = zzyo.getContentUrl();
        int gender = zzyo.getGender();
        Set<String> keywords = zzyo.getKeywords();
        if (!keywords.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(keywords));
        } else {
            list = null;
        }
        boolean isTestDevice = zzyo2.isTestDevice(context);
        Location location = zzyo.getLocation();
        Bundle networkExtrasBundle = zzyo2.getNetworkExtrasBundle(AdMobAdapter.class);
        if (zzyo.zzqr() != null) {
            if (zzwe.zzpy().containsKey(zzyo.zzqr().getQueryInfo())) {
                str2 = zzwe.zzpy().get(zzyo.zzqr().getQueryInfo());
            } else {
                str2 = "";
            }
            zzuu = new zzuu(zzyo.zzqr().getAdString(), str2);
        } else {
            zzuu = null;
        }
        boolean manualImpressionsEnabled = zzyo.getManualImpressionsEnabled();
        String publisherProvidedId = zzyo.getPublisherProvidedId();
        SearchAdRequest zzqm = zzyo.zzqm();
        zzzy zzzy = zzqm != null ? new zzzy(zzqm) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzwe.zzpq();
            str = zzbat.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean isDesignedForFamilies = zzyo.isDesignedForFamilies();
        RequestConfiguration requestConfiguration = zzyv.zzqt().getRequestConfiguration();
        return new zzvc(8, j, networkExtrasBundle, gender, list, isTestDevice, Math.max(zzyo.zzqp(), requestConfiguration.getTagForChildDirectedTreatment()), manualImpressionsEnabled, publisherProvidedId, zzzy, location, contentUrl, zzyo.zzqo(), zzyo.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzyo.zzqq())), zzyo.zzql(), str, isDesignedForFamilies, zzuu, Math.max(zzyo.zzqs(), requestConfiguration.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(new String[]{zzyo.getMaxAdContentRating(), requestConfiguration.getMaxAdContentRating()}), zzvg.zzchl), zzyo.zzqk());
    }

    public static zzatz zza(Context context, zzyo zzyo, String str) {
        return new zzatz(zza(context, zzyo), str);
    }

    static final /* synthetic */ int zzd(String str, String str2) {
        return RequestConfiguration.zzadn.indexOf(str) - RequestConfiguration.zzadn.indexOf(str2);
    }
}
