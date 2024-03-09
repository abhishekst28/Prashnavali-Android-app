package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzcty<AdT> implements zzcre<AdT> {
    /* access modifiers changed from: protected */
    public abstract zzdvt<AdT> zza(zzdln zzdln, Bundle bundle);

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return !TextUtils.isEmpty(zzdkx.zzhar.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public final zzdvt<AdT> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        zzdkx zzdkx2 = zzdkx;
        String optString = zzdkx2.zzhar.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzdln zzdln = zzdlj.zzhbp.zzfqn;
        zzdlp zzgt = new zzdlp().zzc(zzdln).zzgt(optString);
        Bundle zzn = zzn(zzdln.zzhbu.zzchc);
        Bundle zzn2 = zzn(zzn.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzn2.putInt("gw", 1);
        String optString2 = zzdkx2.zzhar.optString("mad_hac", (String) null);
        if (optString2 != null) {
            zzn2.putString("mad_hac", optString2);
        }
        String optString3 = zzdkx2.zzhar.optString("adJson", (String) null);
        if (optString3 != null) {
            zzn2.putString("_ad", optString3);
        }
        zzn2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzdkx2.zzhau.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzdkx2.zzhau.optString(next, (String) null);
            if (next != null) {
                zzn2.putString(next, optString4);
            }
        }
        zzn.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzn2);
        zzvc zzvc = r5;
        zzvc zzvc2 = new zzvc(zzdln.zzhbu.versionCode, zzdln.zzhbu.zzcgv, zzn2, zzdln.zzhbu.zzcgw, zzdln.zzhbu.zzcgx, zzdln.zzhbu.zzcgy, zzdln.zzhbu.zzadj, zzdln.zzhbu.zzbnu, zzdln.zzhbu.zzcgz, zzdln.zzhbu.zzcha, zzdln.zzhbu.zznb, zzdln.zzhbu.zzchb, zzn, zzdln.zzhbu.zzchd, zzdln.zzhbu.zzche, zzdln.zzhbu.zzchf, zzdln.zzhbu.zzchg, zzdln.zzhbu.zzchh, zzdln.zzhbu.zzchi, zzdln.zzhbu.zzadk, zzdln.zzhbu.zzadl, zzdln.zzhbu.zzchj);
        zzdln zzasu = zzgt.zzh(zzvc).zzasu();
        Bundle bundle = new Bundle();
        zzdlj zzdlj2 = zzdlj;
        zzdkz zzdkz = zzdlj2.zzhbq.zzhbn;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzdkz.zzdiv));
        bundle2.putInt("refresh_interval", zzdkz.zzhbe);
        bundle2.putString("gws_query_id", zzdkz.zzdsg);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzdlj2.zzhbp.zzfqn.zzhbv;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        zzdkx zzdkx3 = zzdkx;
        bundle3.putString("allocation_id", zzdkx3.zzdjo);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzdkx3.zzdis));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzdkx3.zzdit));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzdkx3.zzdru));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzdkx3.zzhak));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzdkx3.zzdsi));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzdkx3.zzdsj));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzdkx3.zzhaj));
        bundle3.putString("transaction_id", zzdkx3.zzdjz);
        bundle3.putString("valid_from_timestamp", zzdkx3.zzdka);
        bundle3.putBoolean("is_closable_area_disabled", zzdkx3.zzboz);
        if (zzdkx3.zzdsh != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzdkx3.zzdsh.zzdva);
            bundle4.putString("rb_type", zzdkx3.zzdsh.type);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zza(zzasu, bundle);
    }

    private static Bundle zzn(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }
}
