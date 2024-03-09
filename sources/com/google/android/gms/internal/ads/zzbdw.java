package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbdw implements zzom {
    private boolean isOpen;
    private Uri uri;
    private InputStream zzeji;
    private final zzom zzejj;
    private final zzpa<zzom> zzejk;
    private final zzbdz zzejl;
    private final Context zzvr;

    public zzbdw(Context context, zzom zzom, zzpa<zzom> zzpa, zzbdz zzbdz) {
        this.zzvr = context;
        this.zzejj = zzom;
        this.zzejk = zzpa;
        this.zzejl = zzbdz;
    }

    public final void close() throws IOException {
        if (this.isOpen) {
            this.isOpen = false;
            this.uri = null;
            InputStream inputStream = this.zzeji;
            if (inputStream != null) {
                IOUtils.closeQuietly((Closeable) inputStream);
                this.zzeji = null;
            } else {
                this.zzejj.close();
            }
            zzpa<zzom> zzpa = this.zzejk;
            if (zzpa != null) {
                zzpa.zze(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    public final long zza(zzon zzon) throws IOException {
        zzon zzon2;
        Long l;
        zzon zzon3 = zzon;
        if (!this.isOpen) {
            boolean z = true;
            this.isOpen = z;
            this.uri = zzon3.uri;
            zzpa<zzom> zzpa = this.zzejk;
            if (zzpa != null) {
                zzpa.zza(this, zzon3);
            }
            zzta zzd = zzta.zzd(zzon3.uri);
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcsr)).booleanValue()) {
                zzsv zzsv = null;
                if (zzd != null) {
                    zzd.zzbvf = zzon3.position;
                    zzsv = zzp.zzkv().zza(zzd);
                }
                if (zzsv != null && zzsv.zzmu()) {
                    this.zzeji = zzsv.zzmv();
                    return -1;
                }
            } else if (zzd != null) {
                zzd.zzbvf = zzon3.position;
                if (zzd.zzbve) {
                    l = (Long) zzwe.zzpu().zzd(zzaat.zzcst);
                } else {
                    l = (Long) zzwe.zzpu().zzd(zzaat.zzcss);
                }
                long longValue = l.longValue();
                long elapsedRealtime = zzp.zzkw().elapsedRealtime();
                zzp.zzlj();
                Future<InputStream> zza = zztl.zza(this.zzvr, zzd);
                z = false;
                try {
                    this.zzeji = zza.get(longValue, TimeUnit.MILLISECONDS);
                    return -1;
                } catch (ExecutionException | TimeoutException e) {
                    zza.cancel(z);
                } catch (InterruptedException e2) {
                    zza.cancel(z);
                    Thread.currentThread().interrupt();
                } finally {
                    long j = zzp.zzkw().elapsedRealtime() - elapsedRealtime;
                    this.zzejl.zzb(z, j);
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Cache connection took ");
                    sb.append(j);
                    sb.append("ms");
                    zzaxy.zzei(sb.toString());
                }
            }
            if (zzd != null) {
                zzon2 = new zzon(Uri.parse(zzd.url), zzon3.zzbhy, zzon3.zzbhz, zzon3.position, zzon3.zzcp, zzon3.zzcn, zzon3.flags);
            } else {
                zzon2 = zzon3;
            }
            return this.zzejj.zza(zzon2);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.isOpen) {
            InputStream inputStream = this.zzeji;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.zzejj.read(bArr, i, i2);
            }
            zzpa<zzom> zzpa = this.zzejk;
            if (zzpa != null) {
                zzpa.zzc(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    public final Uri getUri() {
        return this.uri;
    }
}
