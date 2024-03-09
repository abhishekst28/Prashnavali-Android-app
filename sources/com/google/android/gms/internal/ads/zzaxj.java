package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzaxj {
    private final Object lock = new Object();
    /* access modifiers changed from: private */
    public final Clock zzbpw;
    private final String zzdqi;
    private boolean zzdrs = false;
    private long zzdrw = -1;
    private final zzaxv zzdxp;
    private final LinkedList<zzaxi> zzdxq;
    private final String zzdxr;
    private long zzdxs = -1;
    private long zzdxt = -1;
    private long zzdxu = 0;
    private long zzdxv = -1;
    private long zzdxw = -1;

    zzaxj(Clock clock, zzaxv zzaxv, String str, String str2) {
        this.zzbpw = clock;
        this.zzdxp = zzaxv;
        this.zzdxr = str;
        this.zzdqi = str2;
        this.zzdxq = new LinkedList<>();
    }

    public final void zze(zzvc zzvc) {
        synchronized (this.lock) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime();
            this.zzdxv = elapsedRealtime;
            this.zzdxp.zza(zzvc, elapsedRealtime);
        }
    }

    public final void zzey(long j) {
        synchronized (this.lock) {
            this.zzdxw = j;
            if (j != -1) {
                this.zzdxp.zzb(this);
            }
        }
    }

    public final void zzvz() {
        synchronized (this.lock) {
            if (this.zzdxw != -1 && this.zzdxs == -1) {
                this.zzdxs = this.zzbpw.elapsedRealtime();
                this.zzdxp.zzb(this);
            }
            this.zzdxp.zzvz();
        }
    }

    public final void zzwa() {
        synchronized (this.lock) {
            if (this.zzdxw != -1) {
                zzaxi zzaxi = new zzaxi(this);
                zzaxi.zzvy();
                this.zzdxq.add(zzaxi);
                this.zzdxu++;
                this.zzdxp.zzwa();
                this.zzdxp.zzb(this);
            }
        }
    }

    public final void zzwb() {
        synchronized (this.lock) {
            if (this.zzdxw != -1 && !this.zzdxq.isEmpty()) {
                zzaxi last = this.zzdxq.getLast();
                if (last.zzvw() == -1) {
                    last.zzvx();
                    this.zzdxp.zzb(this);
                }
            }
        }
    }

    public final void zzan(boolean z) {
        synchronized (this.lock) {
            if (this.zzdxw != -1) {
                this.zzdxt = this.zzbpw.elapsedRealtime();
            }
        }
    }

    public final Bundle toBundle() {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zzdxr);
            bundle.putString("slotid", this.zzdqi);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzdxv);
            bundle.putLong("tresponse", this.zzdxw);
            bundle.putLong("timp", this.zzdxs);
            bundle.putLong("tload", this.zzdxt);
            bundle.putLong("pcc", this.zzdxu);
            bundle.putLong("tfetch", this.zzdrw);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzdxq.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzaxi) it.next()).toBundle());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzwc() {
        return this.zzdxr;
    }
}
