package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzclm implements zzdpl {
    private final Clock zzbpw;
    private final Map<zzdpg, Long> zzgfj = new HashMap();
    private final zzclg zzgfk;
    private final Map<zzdpg, zzcll> zzgfl = new HashMap();

    public zzclm(zzclg zzclg, Set<zzcll> set, Clock clock) {
        this.zzgfk = zzclg;
        for (zzcll next : set) {
            this.zzgfl.put(next.zzgfi, next);
        }
        this.zzbpw = clock;
    }

    public final void zza(zzdpg zzdpg, String str) {
    }

    public final void zzb(zzdpg zzdpg, String str) {
        this.zzgfj.put(zzdpg, Long.valueOf(this.zzbpw.elapsedRealtime()));
    }

    public final void zza(zzdpg zzdpg, String str, Throwable th) {
        if (this.zzgfj.containsKey(zzdpg)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzgfj.get(zzdpg).longValue();
            Map<String, String> zzrr = this.zzgfk.zzrr();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzrr.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.zzgfl.containsKey(zzdpg)) {
            zza(zzdpg, false);
        }
    }

    public final void zzc(zzdpg zzdpg, String str) {
        if (this.zzgfj.containsKey(zzdpg)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzgfj.get(zzdpg).longValue();
            Map<String, String> zzrr = this.zzgfk.zzrr();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzrr.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.zzgfl.containsKey(zzdpg)) {
            zza(zzdpg, true);
        }
    }

    private final void zza(zzdpg zzdpg, boolean z) {
        zzdpg zzb = this.zzgfl.get(zzdpg).zzgfh;
        String str = z ? "s." : "f.";
        if (this.zzgfj.containsKey(zzb)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzgfj.get(zzb).longValue();
            Map<String, String> zzrr = this.zzgfk.zzrr();
            String valueOf = String.valueOf(this.zzgfl.get(zzdpg).label);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(str);
            String valueOf3 = String.valueOf(Long.toString(elapsedRealtime));
            zzrr.put(concat, valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
        }
    }
}
