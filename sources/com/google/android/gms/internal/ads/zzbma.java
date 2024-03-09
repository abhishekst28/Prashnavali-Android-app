package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbma implements zzo, zzbtm, zzbtp, zzqu {
    private final Clock zzbpw;
    private final zzblr zzfmg;
    private final zzbly zzfmh;
    private final Set<zzbfq> zzfmi = new HashSet();
    private final zzamg<JSONObject, JSONObject> zzfmj;
    private final Executor zzfmk;
    private final AtomicBoolean zzfml = new AtomicBoolean(false);
    private final zzbmc zzfmm = new zzbmc();
    private boolean zzfmn = false;
    private WeakReference<?> zzfmo = new WeakReference<>(this);

    public zzbma(zzalz zzalz, zzbly zzbly, Executor executor, zzblr zzblr, Clock clock) {
        this.zzfmg = zzblr;
        this.zzfmj = zzalz.zzb("google.afma.activeView.handleUpdate", zzalp.zzdhs, zzalp.zzdhs);
        this.zzfmh = zzbly;
        this.zzfmk = executor;
        this.zzbpw = clock;
    }

    public final synchronized void zzagy() {
        if (!(this.zzfmo.get() != null)) {
            zzaha();
        } else if (!this.zzfmn && this.zzfml.get()) {
            try {
                this.zzfmm.timestamp = this.zzbpw.elapsedRealtime();
                JSONObject zza = this.zzfmh.zzj(this.zzfmm);
                for (zzbfq zzblz : this.zzfmi) {
                    this.zzfmk.execute(new zzblz(zzblz, zza));
                }
                zzbbm.zzb(this.zzfmj.zzf(zza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                zzaxy.zza("Failed to call ActiveViewJS", e);
            }
        }
    }

    private final void zzagz() {
        for (zzbfq zze : this.zzfmi) {
            this.zzfmg.zze(zze);
        }
        this.zzfmg.zzagx();
    }

    public final synchronized void zzaha() {
        zzagz();
        this.zzfmn = true;
    }

    public final synchronized void zzf(zzbfq zzbfq) {
        this.zzfmi.add(zzbfq);
        this.zzfmg.zzd(zzbfq);
    }

    public final void zzo(Object obj) {
        this.zzfmo = new WeakReference<>(obj);
    }

    public final synchronized void zza(zzqr zzqr) {
        this.zzfmm.zzbrk = zzqr.zzbrk;
        this.zzfmm.zzfmw = zzqr;
        zzagy();
    }

    public final synchronized void zzbz(Context context) {
        this.zzfmm.zzfmt = true;
        zzagy();
    }

    public final synchronized void zzca(Context context) {
        this.zzfmm.zzfmt = false;
        zzagy();
    }

    public final synchronized void zzcb(Context context) {
        this.zzfmm.zzfmv = "u";
        zzagy();
        zzagz();
        this.zzfmn = true;
    }

    public final void zzui() {
    }

    public final synchronized void onPause() {
        this.zzfmm.zzfmt = true;
        zzagy();
    }

    public final synchronized void onResume() {
        this.zzfmm.zzfmt = false;
        zzagy();
    }

    public final void zzuj() {
    }

    public final synchronized void onAdImpression() {
        if (this.zzfml.compareAndSet(false, true)) {
            this.zzfmg.zza(this);
            zzagy();
        }
    }
}
