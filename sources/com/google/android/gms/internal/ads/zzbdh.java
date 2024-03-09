package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbdh {
    private final zzbbg zzdpq;
    private final String zzdqg;
    private final zzabk zzefo;
    private boolean zzefs;
    private final zzabi zzeif;
    private final zzazp zzeig = new zzazq().zza("min_1", Double.MIN_VALUE, 1.0d).zza("1_5", 1.0d, 5.0d).zza("5_10", 5.0d, 10.0d).zza("10_20", 10.0d, 20.0d).zza("20_30", 20.0d, 30.0d).zza("30_max", 30.0d, Double.MAX_VALUE).zzye();
    private final long[] zzeih;
    private final String[] zzeii;
    private boolean zzeij = false;
    private boolean zzeik = false;
    private boolean zzeil = false;
    private boolean zzeim = false;
    private zzbcp zzein;
    private boolean zzeio;
    private boolean zzeip;
    private long zzeiq = -1;
    private final Context zzvr;

    public zzbdh(Context context, zzbbg zzbbg, String str, zzabk zzabk, zzabi zzabi) {
        this.zzvr = context;
        this.zzdpq = zzbbg;
        this.zzdqg = str;
        this.zzefo = zzabk;
        this.zzeif = zzabi;
        String str2 = (String) zzwe.zzpu().zzd(zzaat.zzcmc);
        if (str2 == null) {
            this.zzeii = new String[0];
            this.zzeih = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.zzeii = new String[split.length];
        this.zzeih = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzeih[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzaxy.zzd("Unable to parse frame hash target time number.", e);
                this.zzeih[i] = -1;
            }
        }
    }

    public final void zzb(zzbcp zzbcp) {
        zzabb.zza(this.zzefo, this.zzeif, "vpc2");
        this.zzeij = true;
        zzabk zzabk = this.zzefo;
        if (zzabk != null) {
            zzabk.zzh("vpn", zzbcp.zzyt());
        }
        this.zzein = zzbcp;
    }

    public final void zzez() {
        if (this.zzeij && !this.zzeik) {
            zzabb.zza(this.zzefo, this.zzeif, "vfr2");
            this.zzeik = true;
        }
    }

    public final void onStop() {
        if (zzada.zzdcb.get().booleanValue() && !this.zzeio) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.zzdqg);
            bundle.putString("player", this.zzein.zzyt());
            for (zzazr next : this.zzeig.zzyd()) {
                String valueOf = String.valueOf("fps_c_");
                String valueOf2 = String.valueOf(next.name);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(next.count));
                String valueOf3 = String.valueOf("fps_p_");
                String valueOf4 = String.valueOf(next.name);
                bundle.putString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), Double.toString(next.zzebt));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.zzeih;
                if (i < jArr.length) {
                    String str = this.zzeii[i];
                    if (str != null) {
                        String valueOf5 = String.valueOf(Long.valueOf(jArr[i]));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 3);
                        sb.append("fh_");
                        sb.append(valueOf5);
                        bundle.putString(sb.toString(), str);
                    }
                    i++;
                } else {
                    zzp.zzkp().zza(this.zzvr, this.zzdpq.zzbra, "gmob-apps", bundle, true);
                    this.zzeio = true;
                    return;
                }
            }
        }
    }

    public final void zzc(zzbcp zzbcp) {
        if (this.zzeil && !this.zzeim) {
            if (zzaxy.zzww() && !this.zzeim) {
                zzaxy.zzei("VideoMetricsMixin first frame");
            }
            zzabb.zza(this.zzefo, this.zzeif, "vff2");
            this.zzeim = true;
        }
        long nanoTime = zzp.zzkw().nanoTime();
        if (this.zzefs && this.zzeip && this.zzeiq != -1) {
            this.zzeig.zza(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (nanoTime - this.zzeiq)));
        }
        this.zzeip = this.zzefs;
        this.zzeiq = nanoTime;
        long longValue = ((Long) zzwe.zzpu().zzd(zzaat.zzcmd)).longValue();
        long currentPosition = (long) zzbcp.getCurrentPosition();
        int i = 0;
        while (true) {
            String[] strArr = this.zzeii;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] != null || longValue <= Math.abs(currentPosition - this.zzeih[i])) {
                zzbcp zzbcp2 = zzbcp;
                i++;
            } else {
                String[] strArr2 = this.zzeii;
                int i2 = 8;
                Bitmap bitmap = zzbcp.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    public final void zzzy() {
        this.zzefs = true;
        if (this.zzeik && !this.zzeil) {
            zzabb.zza(this.zzefo, this.zzeif, "vfp2");
            this.zzeil = true;
        }
    }

    public final void zzzz() {
        this.zzefs = false;
    }
}
