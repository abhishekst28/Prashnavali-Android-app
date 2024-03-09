package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcoh extends zzcoj {
    public zzcoh(Context context) {
        this.zzgie = new zzarx(context, zzp.zzld().zzyf(), this, this);
    }

    public final zzdvt<InputStream> zzi(zzasp zzasp) {
        synchronized (this.mLock) {
            if (this.zzgib) {
                zzbbq zzbbq = this.zzdih;
                return zzbbq;
            }
            this.zzgib = true;
            this.zzgid = zzasp;
            this.zzgie.checkAvailabilityAndConnect();
            this.zzdih.addListener(new zzcok(this), zzbbi.zzedz);
            zzbbq zzbbq2 = this.zzdih;
            return zzbbq2;
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzaxy.zzef("Cannot connect to remote service, fallback to local instance.");
        this.zzdih.setException(new zzcpa(zzdmd.zzhco));
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzgic) {
                this.zzgic = true;
                try {
                    this.zzgie.zzvb().zza(this.zzgid, (zzasj) new zzcom(this));
                } catch (RemoteException e) {
                } catch (IllegalArgumentException e2) {
                } catch (Throwable th) {
                    zzp.zzkt().zza(th, "RemoteAdRequestClientTask.onConnected");
                    this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                }
            }
        }
        this.zzdih.setException(new zzcpa(zzdmd.zzhco));
    }
}
