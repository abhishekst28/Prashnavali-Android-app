package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzp;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcol extends zzcoj {
    public zzcol(Context context) {
        this.zzgie = new zzarx(context, zzp.zzld().zzyf(), this, this);
    }

    public final zzdvt<InputStream> zzj(zzasp zzasp) {
        synchronized (this.mLock) {
            if (this.zzgib) {
                zzbbq zzbbq = this.zzdih;
                return zzbbq;
            }
            this.zzgib = true;
            this.zzgid = zzasp;
            this.zzgie.checkAvailabilityAndConnect();
            this.zzdih.addListener(new zzcoo(this), zzbbi.zzedz);
            zzbbq zzbbq2 = this.zzdih;
            return zzbbq2;
        }
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzgic) {
                this.zzgic = true;
                try {
                    this.zzgie.zzvb().zzb(this.zzgid, new zzcom(this));
                } catch (RemoteException e) {
                } catch (IllegalArgumentException e2) {
                } catch (Throwable th) {
                    zzp.zzkt().zza(th, "RemoteSignalsClientTask.onConnected");
                    this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                }
            }
        }
        this.zzdih.setException(new zzcpa(zzdmd.zzhco));
    }
}
