package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczn implements zzdek<Bundle> {
    private final zzdln zzfqn;

    public zzczn(zzdln zzdln) {
        Preconditions.checkNotNull(zzdln, "the targeting must not be null");
        this.zzfqn = zzdln;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzvc zzvc = this.zzfqn.zzhbu;
        bundle.putString("slotname", this.zzfqn.zzhbv);
        boolean z = true;
        int i = zzczm.zzgdc[this.zzfqn.zzhcb.zzhbf - 1];
        if (i == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        zzdlu.zza(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzvc.zzcgv)), zzvc.zzcgv != -1);
        zzdlu.zza(bundle, "extras", zzvc.extras);
        zzdlu.zza(bundle, "cust_gender", Integer.valueOf(zzvc.zzcgw), zzvc.zzcgw != -1);
        zzdlu.zza(bundle, "kw", zzvc.zzcgx);
        zzdlu.zza(bundle, "tag_for_child_directed_treatment", Integer.valueOf(zzvc.zzadj), zzvc.zzadj != -1);
        if (zzvc.zzcgy) {
            bundle.putBoolean("test_request", zzvc.zzcgy);
        }
        zzdlu.zza(bundle, "d_imp_hdr", (Integer) 1, zzvc.versionCode >= 2 && zzvc.zzbnu);
        zzdlu.zza(bundle, "ppid", zzvc.zzcgz, zzvc.versionCode >= 2 && !TextUtils.isEmpty(zzvc.zzcgz));
        if (zzvc.zznb != null) {
            Location location = zzvc.zznb;
            Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long valueOf2 = Long.valueOf(location.getTime() * 1000);
            Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", valueOf.floatValue());
            bundle2.putLong("lat", valueOf3.longValue());
            bundle2.putLong("long", valueOf4.longValue());
            bundle2.putLong("time", valueOf2.longValue());
            bundle.putBundle("uule", bundle2);
        }
        zzdlu.zza(bundle, ImagesContract.URL, zzvc.zzchb);
        zzdlu.zza(bundle, "neighboring_content_urls", zzvc.zzchj);
        zzdlu.zza(bundle, "custom_targeting", zzvc.zzchd);
        zzdlu.zza(bundle, "category_exclusions", zzvc.zzche);
        zzdlu.zza(bundle, "request_agent", zzvc.zzchf);
        zzdlu.zza(bundle, "request_pkg", zzvc.zzchg);
        zzdlu.zza(bundle, "is_designed_for_families", Boolean.valueOf(zzvc.zzchh), zzvc.versionCode >= 7);
        if (zzvc.versionCode >= 8) {
            Integer valueOf5 = Integer.valueOf(zzvc.zzadk);
            if (zzvc.zzadk == -1) {
                z = false;
            }
            zzdlu.zza(bundle, "tag_for_under_age_of_consent", valueOf5, z);
            zzdlu.zza(bundle, "max_ad_content_rating", zzvc.zzadl);
        }
    }
}
