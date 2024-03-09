package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzew implements zzdrz {
    private final zzfi zzxn;
    private final zzdqc zzyr;
    private final zzdqo zzys;
    private final zzev zzyt;

    zzew(zzdqc zzdqc, zzdqo zzdqo, zzfi zzfi, zzev zzev) {
        this.zzyr = zzdqc;
        this.zzys = zzdqo;
        this.zzxn = zzfi;
        this.zzyt = zzev;
    }

    /* access modifiers changed from: package-private */
    public final void zzc(View view) {
        this.zzxn.zze(view);
    }

    private final Map<String, Object> zzcc() {
        HashMap hashMap = new HashMap();
        zzcf.zza zzco = this.zzys.zzco();
        hashMap.put("v", this.zzyr.zzavb());
        hashMap.put("gms", Boolean.valueOf(this.zzyr.zzcm()));
        hashMap.put("int", zzco.zzaf());
        hashMap.put("up", Boolean.valueOf(this.zzyt.zzcb()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    public final Map<String, Object> zzcd() {
        Map<String, Object> zzcc = zzcc();
        zzcf.zza zzavi = this.zzys.zzavi();
        zzcc.put("gai", Boolean.valueOf(this.zzyr.zzavc()));
        zzcc.put("did", zzavi.zzal());
        zzcc.put("dst", Integer.valueOf(zzavi.zzam().zzv()));
        zzcc.put("doo", Boolean.valueOf(zzavi.zzan()));
        return zzcc;
    }

    public final Map<String, Object> zzce() {
        return zzcc();
    }

    public final Map<String, Object> zzcf() {
        Map<String, Object> zzcc = zzcc();
        zzcc.put("lts", Long.valueOf(this.zzxn.zzcu()));
        return zzcc;
    }
}
