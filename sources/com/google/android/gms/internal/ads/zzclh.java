package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzclh {
    private final Map<String, String> zzcyu = new ConcurrentHashMap();
    private final /* synthetic */ zzcli zzgfe;

    zzclh(zzcli zzcli) {
        this.zzgfe = zzcli;
    }

    /* access modifiers changed from: private */
    public final zzclh zzaoo() {
        this.zzcyu.putAll(this.zzgfe.zzgff);
        return this;
    }

    public final zzclh zza(zzdkz zzdkz) {
        this.zzcyu.put("gqi", zzdkz.zzdsg);
        return this;
    }

    public final zzclh zzd(zzdkx zzdkx) {
        this.zzcyu.put("aai", zzdkx.zzdjo);
        return this;
    }

    public final zzclh zzq(String str, String str2) {
        this.zzcyu.put(str, str2);
        return this;
    }

    public final void zzaop() {
        this.zzgfe.executor.execute(new zzclk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaoq() {
        this.zzgfe.zzgfb.zzn(this.zzcyu);
    }
}
