package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzth implements Runnable {
    private final zzti zzbvi;
    private final zzsx zzbvj;
    private final zzta zzbvk;
    private final zzbbq zzbvl;

    zzth(zzti zzti, zzsx zzsx, zzta zzta, zzbbq zzbbq) {
        this.zzbvi = zzti;
        this.zzbvj = zzsx;
        this.zzbvk = zzta;
        this.zzbvl = zzbbq;
    }

    public final void run() {
        zzti zzti = this.zzbvi;
        zzsx zzsx = this.zzbvj;
        zzta zzta = this.zzbvk;
        zzbbq zzbbq = this.zzbvl;
        try {
            zzsv zza = zzsx.zzmx().zza(zzta);
            if (!zza.zzmu()) {
                zzbbq.setException(new RuntimeException("No entry contents."));
                zzti.zzbvg.disconnect();
                return;
            }
            zztj zztj = new zztj(zzti, zza.zzmv(), 1);
            int read = zztj.read();
            if (read != -1) {
                zztj.unread(read);
                zzbbq.set(zztj);
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            zzaxy.zzc("Unable to obtain a cache service instance.", e);
            zzbbq.setException(e);
            zzti.zzbvg.disconnect();
        }
    }
}
