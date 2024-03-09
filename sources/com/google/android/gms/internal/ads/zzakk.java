package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzp;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzakk {
    /* access modifiers changed from: private */
    public final Object lock;
    /* access modifiers changed from: private */
    public int status;
    private final zzbbg zzbpa;
    private final String zzdgn;
    /* access modifiers changed from: private */
    public zzazm<zzajx> zzdgo;
    private zzazm<zzajx> zzdgp;
    /* access modifiers changed from: private */
    public zzalb zzdgq;
    private final Context zzvr;

    public zzakk(Context context, zzbbg zzbbg, String str) {
        this.lock = new Object();
        this.status = 1;
        this.zzdgn = str;
        this.zzvr = context.getApplicationContext();
        this.zzbpa = zzbbg;
        this.zzdgo = new zzaky();
        this.zzdgp = new zzaky();
    }

    public zzakk(Context context, zzbbg zzbbg, String str, zzazm<zzajx> zzazm, zzazm<zzajx> zzazm2) {
        this(context, zzbbg, str);
        this.zzdgo = zzazm;
        this.zzdgp = zzazm2;
    }

    /* access modifiers changed from: protected */
    public final zzalb zza(zzeg zzeg) {
        zzalb zzalb = new zzalb(this.zzdgp);
        zzbbi.zzedy.execute(new zzakj(this, zzeg, zzalb));
        zzalb.zza(new zzakt(this, zzalb), new zzakw(this, zzalb));
        return zzalb;
    }

    public final zzakx zzb(zzeg zzeg) {
        synchronized (this.lock) {
            synchronized (this.lock) {
                if (this.zzdgq != null && this.status == 0) {
                    this.zzdgq.zza(new zzakm(this), zzakl.zzdgr);
                }
            }
            if (this.zzdgq != null) {
                if (this.zzdgq.getStatus() != -1) {
                    if (this.status == 0) {
                        zzakx zztg = this.zzdgq.zztg();
                        return zztg;
                    } else if (this.status == 1) {
                        this.status = 2;
                        zza((zzeg) null);
                        zzakx zztg2 = this.zzdgq.zztg();
                        return zztg2;
                    } else if (this.status == 2) {
                        zzakx zztg3 = this.zzdgq.zztg();
                        return zztg3;
                    } else {
                        zzakx zztg4 = this.zzdgq.zztg();
                        return zztg4;
                    }
                }
            }
            this.status = 2;
            zzalb zza = zza((zzeg) null);
            this.zzdgq = zza;
            zzakx zztg5 = zza.zztg();
            return zztg5;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzajx zzajx) {
        if (zzajx.isDestroyed()) {
            this.status = 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzeg zzeg, zzalb zzalb) {
        zzajx zzajx;
        try {
            Context context = this.zzvr;
            zzbbg zzbbg = this.zzbpa;
            if (zzacz.zzdca.get().booleanValue()) {
                zzajx = new zzajj(context, zzbbg);
            } else {
                zzajx = new zzajz(context, zzbbg, zzeg, (zzb) null);
            }
            zzajx.zza(new zzako(this, zzalb, zzajx));
            zzajx.zza("/jsLoaded", new zzakp(this, zzalb, zzajx));
            zzbai zzbai = new zzbai();
            zzaks zzaks = new zzaks(this, zzeg, zzajx, zzbai);
            zzbai.set(zzaks);
            zzajx.zza("/requestReload", zzaks);
            if (this.zzdgn.endsWith(".js")) {
                zzajx.zzcz(this.zzdgn);
            } else if (this.zzdgn.startsWith("<html>")) {
                zzajx.zzda(this.zzdgn);
            } else {
                zzajx.zzdb(this.zzdgn);
            }
            zzayh.zzeaj.postDelayed(new zzakr(this, zzalb, zzajx), (long) zzakv.zzdhb);
        } catch (Throwable th) {
            zzaxy.zzc("Error creating webview.", th);
            zzp.zzkt().zza(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzalb.reject();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzalb r4, com.google.android.gms.internal.ads.zzajx r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            int r1 = r4.getStatus()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.getStatus()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.reject()     // Catch:{ all -> 0x002a }
            com.google.android.gms.internal.ads.zzdvw r4 = com.google.android.gms.internal.ads.zzbbi.zzedy     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.zzakq.zzb(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.zzaxy.zzei(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakk.zza(com.google.android.gms.internal.ads.zzalb, com.google.android.gms.internal.ads.zzajx):void");
    }
}
