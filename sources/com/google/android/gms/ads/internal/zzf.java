package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzcw;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdw;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzwe;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzf implements zzdw, Runnable {
    private final List<Object[]> zzbom = new Vector();
    private final AtomicReference<zzdw> zzbon = new AtomicReference<>();
    private final AtomicReference<zzdw> zzboo = new AtomicReference<>();
    private zzbbg zzbop;
    private CountDownLatch zzboq = new CountDownLatch(1);
    private Context zzvr;
    private final int zzxo;

    public zzf(Context context, zzbbg zzbbg) {
        this.zzvr = context;
        this.zzbop = zzbbg;
        int intValue = ((Integer) zzwe.zzpu().zzd(zzaat.zzcqg)).intValue();
        if (intValue == 1) {
            this.zzxo = zzcw.zznk;
        } else if (intValue != 2) {
            this.zzxo = zzcw.zznj;
        } else {
            this.zzxo = zzcw.zznl;
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqw)).booleanValue()) {
            zzbbi.zzedu.execute(this);
            return;
        }
        zzwe.zzpq();
        if (zzbat.zzyn()) {
            zzbbi.zzedu.execute(this);
        } else {
            run();
        }
    }

    private final boolean zzjy() {
        try {
            this.zzboq.await();
            return true;
        } catch (InterruptedException e) {
            zzaxy.zzd("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void zzjz() {
        zzdw zzca = zzca();
        if (!this.zzbom.isEmpty() && zzca != null) {
            for (Object[] next : this.zzbom) {
                if (next.length == 1) {
                    zzca.zza((MotionEvent) next[0]);
                } else if (next.length == 3) {
                    zzca.zza(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.zzbom.clear();
        }
    }

    private static Context zze(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final String zzb(Context context) {
        zzdw zzdw;
        if (!zzjy()) {
            return "";
        }
        if (this.zzxo == zzcw.zznk || this.zzxo == zzcw.zznl) {
            zzdw = this.zzboo.get();
        } else {
            zzdw = this.zzbon.get();
        }
        if (zzdw == null) {
            return "";
        }
        zzjz();
        return zzdw.zzb(zze(context));
    }

    public final String zza(Context context, View view, Activity activity) {
        zzdw zzca = zzca();
        if (zzca != null) {
            return zzca.zza(context, view, activity);
        }
        return "";
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        zzdw zzca;
        if (!zzjy() || (zzca = zzca()) == null) {
            return "";
        }
        zzjz();
        return zzca.zza(zze(context), str, view, activity);
    }

    public final void zzb(View view) {
        zzdw zzca = zzca();
        if (zzca != null) {
            zzca.zzb(view);
        }
    }

    public final void zza(MotionEvent motionEvent) {
        zzdw zzca = zzca();
        if (zzca != null) {
            zzjz();
            zzca.zza(motionEvent);
            return;
        }
        this.zzbom.add(new Object[]{motionEvent});
    }

    public final void zza(int i, int i2, int i3) {
        zzdw zzca = zzca();
        if (zzca != null) {
            zzjz();
            zzca.zza(i, i2, i3);
            return;
        }
        this.zzbom.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void run() {
        boolean z;
        try {
            boolean z2 = true;
            if (this.zzbop.zzeds) {
                z = true;
            } else {
                z = false;
            }
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcoi)).booleanValue() || !z) {
                z2 = false;
            }
            if (this.zzxo != zzcw.zznk) {
                this.zzbon.set(zzed.zzb(this.zzbop.zzbra, zze(this.zzvr), z2, this.zzxo));
            }
            if (this.zzxo != zzcw.zznj) {
                this.zzboo.set(zzdp.zza(this.zzbop.zzbra, zze(this.zzvr), z2));
            }
        } finally {
            this.zzboq.countDown();
            this.zzvr = null;
            this.zzbop = null;
        }
    }

    private final zzdw zzca() {
        if (this.zzxo == zzcw.zznk) {
            return this.zzboo.get();
        }
        return this.zzbon.get();
    }
}
