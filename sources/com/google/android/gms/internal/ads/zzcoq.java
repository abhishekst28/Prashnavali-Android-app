package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcoq extends zzcoj {
    private String zzgij;
    private int zzgik = zzcor.zzgil;

    public zzcoq(Context context) {
        this.zzgie = new zzarx(context, zzp.zzld().zzyf(), this, this);
    }

    public final zzdvt<InputStream> zzk(zzasp zzasp) {
        synchronized (this.mLock) {
            if (this.zzgik != zzcor.zzgil && this.zzgik != zzcor.zzgim) {
                zzdvt<InputStream> immediateFailedFuture = zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhcp));
                return immediateFailedFuture;
            } else if (this.zzgib) {
                zzbbq zzbbq = this.zzdih;
                return zzbbq;
            } else {
                this.zzgik = zzcor.zzgim;
                this.zzgib = true;
                this.zzgid = zzasp;
                this.zzgie.checkAvailabilityAndConnect();
                this.zzdih.addListener(new zzcop(this), zzbbi.zzedz);
                zzbbq zzbbq2 = this.zzdih;
                return zzbbq2;
            }
        }
    }

    public final zzdvt<InputStream> zzgm(String str) {
        synchronized (this.mLock) {
            if (this.zzgik != zzcor.zzgil && this.zzgik != zzcor.zzgin) {
                zzdvt<InputStream> immediateFailedFuture = zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhcp));
                return immediateFailedFuture;
            } else if (this.zzgib) {
                zzbbq zzbbq = this.zzdih;
                return zzbbq;
            } else {
                this.zzgik = zzcor.zzgin;
                this.zzgib = true;
                this.zzgij = str;
                this.zzgie.checkAvailabilityAndConnect();
                this.zzdih.addListener(new zzcos(this), zzbbi.zzedz);
                zzbbq zzbbq2 = this.zzdih;
                return zzbbq2;
            }
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
                    if (this.zzgik == zzcor.zzgim) {
                        this.zzgie.zzvb().zzc(this.zzgid, new zzcom(this));
                    } else if (this.zzgik == zzcor.zzgin) {
                        this.zzgie.zzvb().zza(this.zzgij, (zzasj) new zzcom(this));
                    } else {
                        this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                    }
                } catch (RemoteException e) {
                    this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                } catch (IllegalArgumentException e2) {
                    this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                } catch (Throwable th) {
                    zzp.zzkt().zza(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                }
            }
        }
    }
}
