package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzaxv implements zzrh {
    private final Object lock = new Object();
    private final zzaya zzdza;
    private final zzaxt zzdzg;
    private final zzaxr zzdzh;
    private final HashSet<zzaxj> zzdzi = new HashSet<>();
    private final HashSet<zzaxs> zzdzj = new HashSet<>();

    public zzaxv(String str, zzaya zzaya) {
        this.zzdzh = new zzaxr(str, zzaya);
        this.zzdza = zzaya;
        this.zzdzg = new zzaxt();
    }

    public final void zzb(zzaxj zzaxj) {
        synchronized (this.lock) {
            this.zzdzi.add(zzaxj);
        }
    }

    public final void zzb(HashSet<zzaxj> hashSet) {
        synchronized (this.lock) {
            this.zzdzi.addAll(hashSet);
        }
    }

    public final Bundle zza(Context context, zzaxq zzaxq) {
        HashSet hashSet = new HashSet();
        synchronized (this.lock) {
            hashSet.addAll(this.zzdzi);
            this.zzdzi.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zzdzh.zzp(context, this.zzdzg.zzwu()));
        Bundle bundle2 = new Bundle();
        Iterator<zzaxs> it = this.zzdzj.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzaxj) it2.next()).toBundle());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzaxq.zza(hashSet);
            return bundle;
        }
        zzaxs next = it.next();
        throw new NoSuchMethodError();
    }

    public final void zzp(boolean z) {
        long currentTimeMillis = zzp.zzkw().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zzdza.zzxf() > ((Long) zzwe.zzpu().zzd(zzaat.zzcof)).longValue()) {
                this.zzdzh.zzdyx = -1;
                return;
            }
            this.zzdzh.zzdyx = this.zzdza.zzxg();
            return;
        }
        this.zzdza.zzez(currentTimeMillis);
        this.zzdza.zzdg(this.zzdzh.zzdyx);
    }

    public final void zzwa() {
        synchronized (this.lock) {
            this.zzdzh.zzwa();
        }
    }

    public final void zzvz() {
        synchronized (this.lock) {
            this.zzdzh.zzvz();
        }
    }

    public final void zza(zzvc zzvc, long j) {
        synchronized (this.lock) {
            this.zzdzh.zza(zzvc, j);
        }
    }

    public final zzaxj zza(Clock clock, String str) {
        return new zzaxj(clock, this, this.zzdzg.zzwt(), str);
    }
}
