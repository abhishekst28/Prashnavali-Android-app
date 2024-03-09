package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzp;
import java.io.InputStream;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zztg {
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    /* access modifiers changed from: private */
    public zzsx zzbuw;
    /* access modifiers changed from: private */
    public boolean zzbvh;
    private final Context zzvr;

    zztg(Context context) {
        this.zzvr = context;
    }

    /* access modifiers changed from: package-private */
    public final Future<InputStream> zzb(zzta zzta) {
        zztf zztf = new zztf(this);
        zzti zzti = new zzti(this, zzta, zztf);
        zztm zztm = new zztm(this, zztf);
        synchronized (this.lock) {
            zzsx zzsx = new zzsx(this.zzvr, zzp.zzld().zzyf(), zzti, zztm);
            this.zzbuw = zzsx;
            zzsx.checkAvailabilityAndConnect();
        }
        return zztf;
    }

    /* access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbuw != null) {
                this.zzbuw.disconnect();
                this.zzbuw = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
