package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public class zzfs {
    private static final zzeq zza = zzeq.zza();
    private zzdv zzb;
    private volatile zzgn zzc;
    private volatile zzdv zzd;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfs)) {
            return false;
        }
        zzfs zzfs = (zzfs) obj;
        zzgn zzgn = this.zzc;
        zzgn zzgn2 = zzfs.zzc;
        if (zzgn == null && zzgn2 == null) {
            return zzc().equals(zzfs.zzc());
        }
        if (zzgn != null && zzgn2 != null) {
            return zzgn.equals(zzgn2);
        }
        if (zzgn != null) {
            return zzgn.equals(zzfs.zzb(zzgn.zzv()));
        }
        return zzb(zzgn2.zzv()).equals(zzgn2);
    }

    public int hashCode() {
        return 1;
    }

    private final zzgn zzb(zzgn zzgn) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzgn;
                        this.zzd = zzdv.zza;
                    } catch (zzfn e) {
                        this.zzc = zzgn;
                        this.zzd = zzdv.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public final zzgn zza(zzgn zzgn) {
        zzgn zzgn2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzgn;
        return zzgn2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzbl();
        }
        return 0;
    }

    public final zzdv zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                zzdv zzdv = this.zzd;
                return zzdv;
            }
            if (this.zzc == null) {
                this.zzd = zzdv.zza;
            } else {
                this.zzd = this.zzc.zzbg();
            }
            zzdv zzdv2 = this.zzd;
            return zzdv2;
        }
    }
}
