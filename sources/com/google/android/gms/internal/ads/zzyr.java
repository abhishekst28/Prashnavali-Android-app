package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzyr {
    /* access modifiers changed from: private */
    public int zzadj = -1;
    /* access modifiers changed from: private */
    public int zzadk = -1;
    /* access modifiers changed from: private */
    public String zzadl;
    /* access modifiers changed from: private */
    public boolean zzbnu = false;
    /* access modifiers changed from: private */
    public int zzcgw = -1;
    /* access modifiers changed from: private */
    public String zzcgz;
    /* access modifiers changed from: private */
    public String zzchb;
    /* access modifiers changed from: private */
    public final Bundle zzchd = new Bundle();
    /* access modifiers changed from: private */
    public String zzchf;
    /* access modifiers changed from: private */
    public boolean zzchh;
    /* access modifiers changed from: private */
    public final List<String> zzchj = new ArrayList();
    /* access modifiers changed from: private */
    public final Bundle zzcjc = new Bundle();
    /* access modifiers changed from: private */
    public AdInfo zzcjh;
    /* access modifiers changed from: private */
    public final HashSet<String> zzcjp = new HashSet<>();
    /* access modifiers changed from: private */
    public final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzcjq = new HashMap<>();
    /* access modifiers changed from: private */
    public final HashSet<String> zzcjr = new HashSet<>();
    /* access modifiers changed from: private */
    public final HashSet<String> zzcjs = new HashSet<>();
    /* access modifiers changed from: private */
    public Date zzmx;
    /* access modifiers changed from: private */
    public Location zznb;

    public final void zzcj(String str) {
        this.zzcjp.add(str);
    }

    @Deprecated
    public final void zza(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zza(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzcjq.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zza(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.zzcjc.putBundle(cls.getName(), bundle);
    }

    public final void zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzcjc.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzcjc.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.zzcjc.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void zzck(String str) {
        this.zzcjr.add(str);
    }

    public final void zzcl(String str) {
        this.zzcjr.remove(str);
    }

    @Deprecated
    public final void zza(Date date) {
        this.zzmx = date;
    }

    public final void zzcm(String str) {
        this.zzchb = str;
    }

    public final void zzc(List<String> list) {
        this.zzchj.clear();
        for (String next : list) {
            if (TextUtils.isEmpty(next)) {
                zzbbd.zzfe("neighboring content URL should not be null or empty");
            } else {
                this.zzchj.add(next);
            }
        }
    }

    @Deprecated
    public final void zzda(int i) {
        this.zzcgw = i;
    }

    public final void zza(Location location) {
        this.zznb = location;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbnu = z;
    }

    public final void zzcn(String str) {
        this.zzcgz = str;
    }

    public final void zzco(String str) {
        this.zzchf = str;
    }

    @Deprecated
    public final void zzz(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        this.zzadj = i;
    }

    public final void zze(String str, String str2) {
        this.zzchd.putString(str, str2);
    }

    public final void zzcp(String str) {
        this.zzcjs.add(str);
    }

    @Deprecated
    public final void zzaa(boolean z) {
        this.zzchh = z;
    }

    public final void zza(AdInfo adInfo) {
        this.zzcjh = adInfo;
    }

    @Deprecated
    public final void zzdb(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.zzadk = i;
        }
    }

    @Deprecated
    public final void zzcq(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.zzadl = str;
        }
    }
}
