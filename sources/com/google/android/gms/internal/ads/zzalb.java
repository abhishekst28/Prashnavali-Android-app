package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzalb extends zzbbx<zzajx> {
    private final Object lock = new Object();
    /* access modifiers changed from: private */
    public zzazm<zzajx> zzdgp;
    private boolean zzdhg;
    private int zzdhh;

    public zzalb(zzazm<zzajx> zzazm) {
        this.zzdgp = zzazm;
        this.zzdhg = false;
        this.zzdhh = 0;
    }

    public final zzakx zztg() {
        zzakx zzakx = new zzakx(this);
        synchronized (this.lock) {
            zza(new zzale(this, zzakx), new zzald(this, zzakx));
            Preconditions.checkState(this.zzdhh >= 0);
            this.zzdhh++;
        }
        return zzakx;
    }

    /* access modifiers changed from: protected */
    public final void zzth() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdhh > 0);
            zzaxy.zzei("Releasing 1 reference for JS Engine");
            this.zzdhh--;
            zztj();
        }
    }

    public final void zzti() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdhh >= 0);
            zzaxy.zzei("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzdhg = true;
            zztj();
        }
    }

    private final void zztj() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdhh >= 0);
            if (!this.zzdhg || this.zzdhh != 0) {
                zzaxy.zzei("There are still references to the engine. Not destroying.");
            } else {
                zzaxy.zzei("No reference is left (including root). Cleaning up engine.");
                zza(new zzalg(this), new zzbbv());
            }
        }
    }
}
