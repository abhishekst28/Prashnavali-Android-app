package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbeb implements zzhf, zzmy, zzpa<zzom>, zzqd {
    private static int zzeju;
    private static int zzejv;
    private int bytesTransferred;
    private final zzbdf zzeiw;
    private final zzbdy zzejw;
    private final zzhx zzejx;
    private final zzhx zzejy;
    private final zzoa zzejz;
    private zzhc zzeka;
    private ByteBuffer zzekb;
    private boolean zzekc;
    private zzbei zzekd;
    private Set<WeakReference<zzbdu>> zzeke = new HashSet();
    private final Context zzvr;

    public zzbeb(Context context, zzbdf zzbdf) {
        this.zzvr = context;
        this.zzeiw = zzbdf;
        this.zzejw = new zzbdy();
        this.zzejx = new zzpx(this.zzvr, zzlw.zzbcs, 0, zzayh.zzeaj, this, -1);
        this.zzejy = new zzjb(zzlw.zzbcs);
        this.zzejz = new zznv();
        if (zzaxy.zzww()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzaxy.zzei(sb.toString());
        }
        zzeju++;
        zzhc zza = zzhg.zza(new zzhx[]{this.zzejy, this.zzejx}, this.zzejz, this.zzejw);
        this.zzeka = zza;
        zza.zza((zzhf) this);
    }

    public final zzhc zzaaq() {
        return this.zzeka;
    }

    public static int zzaar() {
        return zzeju;
    }

    public static int zzaas() {
        return zzejv;
    }

    public final void zza(zzbei zzbei) {
        this.zzekd = zzbei;
    }

    public final zzbdy zzaat() {
        return this.zzejw;
    }

    public final void zza(Uri[] uriArr, String str) {
        zza(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zza(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzmz zzmz;
        if (this.zzeka != null) {
            this.zzekb = byteBuffer;
            this.zzekc = z;
            if (uriArr.length == 1) {
                zzmz = zzb(uriArr[0], str);
            } else {
                zzmz[] zzmzArr = new zzmz[uriArr.length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzmzArr[i] = zzb(uriArr[i], str);
                }
                zzmz = new zzne(zzmzArr);
            }
            this.zzeka.zza(zzmz);
            zzejv++;
        }
    }

    public final void release() {
        zzhc zzhc = this.zzeka;
        if (zzhc != null) {
            zzhc.zzb((zzhf) this);
            this.zzeka.release();
            this.zzeka = null;
            zzejv--;
        }
    }

    public final long getBytesTransferred() {
        return (long) this.bytesTransferred;
    }

    public final void zzb(IOException iOException) {
        zzbei zzbei = this.zzekd;
        if (zzbei != null) {
            zzbei.zza("onLoadError", iOException);
        }
    }

    public final void zze(zzjl zzjl) {
    }

    public final void zzd(String str, long j, long j2) {
    }

    public final void zzk(zzho zzho) {
    }

    public final void zze(int i, long j) {
    }

    public final void zza(int i, int i2, int i3, float f) {
        zzbei zzbei = this.zzekd;
        if (zzbei != null) {
            zzbei.zzn(i, i2);
        }
    }

    public final void zza(Surface surface) {
    }

    public final void zzf(zzjl zzjl) {
    }

    public final void zza(zzhy zzhy, Object obj) {
    }

    public final void zza(zznp zznp, zzod zzod) {
    }

    public final void zzg(boolean z) {
    }

    public final void zza(boolean z, int i) {
        zzbei zzbei = this.zzekd;
        if (zzbei != null) {
            zzbei.zzdq(i);
        }
    }

    public final void zza(zzhd zzhd) {
        zzbei zzbei = this.zzekd;
        if (zzbei != null) {
            zzbei.zza("onPlayerError", zzhd);
        }
    }

    public final void zzel() {
    }

    public final void zza(zzhu zzhu) {
    }

    public final void zzdp(int i) {
        for (WeakReference<zzbdu> weakReference : this.zzeke) {
            zzbdu zzbdu = (zzbdu) weakReference.get();
            if (zzbdu != null) {
                zzbdu.setReceiveBufferSize(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(Surface surface, boolean z) {
        if (this.zzeka != null) {
            zzhh zzhh = new zzhh(this.zzejx, 1, surface);
            if (z) {
                this.zzeka.zzb(zzhh);
                return;
            }
            this.zzeka.zza(zzhh);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(float f, boolean z) {
        if (this.zzeka != null) {
            zzhh zzhh = new zzhh(this.zzejy, 2, Float.valueOf(f));
            if (z) {
                this.zzeka.zzb(zzhh);
                return;
            }
            this.zzeka.zza(zzhh);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzaw(boolean z) {
        if (this.zzeka != null) {
            for (int i = 0; i < this.zzeka.zzej(); i++) {
                this.zzejz.zzf(i, !z);
            }
        }
    }

    private final zzmz zzb(Uri uri, String str) {
        zzbea zzbea;
        zzka zzka;
        zzbef zzbef;
        if (!this.zzekc || this.zzekb.limit() <= 0) {
            if (this.zzeiw.zzeic > 0) {
                zzbef = new zzbed(this, str);
            } else {
                zzbef = new zzbec(this, str);
            }
            if (this.zzeiw.zzeid) {
                zzbef = new zzbef(this, zzbef);
            }
            if (this.zzekb.limit() > 0) {
                byte[] bArr = new byte[this.zzekb.limit()];
                this.zzekb.get(bArr);
                zzbef = new zzbee(zzbef, bArr);
            }
            zzbea = zzbef;
        } else {
            byte[] bArr2 = new byte[this.zzekb.limit()];
            this.zzekb.get(bArr2);
            zzbea = new zzbea(bArr2);
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzclv)).booleanValue()) {
            zzka = zzbeh.zzeki;
        } else {
            zzka = zzbeg.zzeki;
        }
        return new zzmv(uri, zzbea, zzka, this.zzeiw.zzeie, zzayh.zzeaj, this, (String) null, this.zzeiw.zzeia);
    }

    public final void finalize() throws Throwable {
        zzeju--;
        if (zzaxy.zzww()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzaxy.zzei(sb.toString());
        }
    }

    public final /* bridge */ /* synthetic */ void zze(Object obj) {
    }

    public final /* synthetic */ void zzc(Object obj, int i) {
        this.bytesTransferred += i;
    }

    public final /* synthetic */ void zza(Object obj, zzon zzon) {
        this.bytesTransferred = 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzom zza(zzol zzol) {
        return new zzbdw(this.zzvr, zzol.zzin(), this, new zzbej(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(boolean z, long j) {
        zzbei zzbei = this.zzekd;
        if (zzbei != null) {
            zzbei.zzb(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzom zzfl(String str) {
        return new zzop(str, (zzpm<String>) null, this.zzeiw.zzeid ? null : this, this.zzeiw.zzehx, this.zzeiw.zzehz, true, (zzou) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzom zzfm(String str) {
        zzbdu zzbdu = new zzbdu(str, this.zzeiw.zzeid ? null : this, this.zzeiw.zzehx, this.zzeiw.zzehz, this.zzeiw.zzeic);
        this.zzeke.add(new WeakReference(zzbdu));
        return zzbdu;
    }
}
