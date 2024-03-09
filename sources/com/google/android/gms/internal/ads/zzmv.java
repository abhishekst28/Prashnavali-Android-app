package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzmv implements zzmz, zznc {
    private final Uri uri;
    private final Handler zzaeo;
    private final zzia zzaes;
    private zzhy zzaez;
    private final int zzbdf;
    private final zzmy zzbdg;
    private zznc zzbdh;
    private final String zzbdj = null;
    private final zzol zzbep;
    private final zzka zzbeq;
    private final int zzber;
    private boolean zzbes;

    public zzmv(Uri uri2, zzol zzol, zzka zzka, int i, Handler handler, zzmy zzmy, String str, int i2) {
        this.uri = uri2;
        this.zzbep = zzol;
        this.zzbeq = zzka;
        this.zzbdf = i;
        this.zzaeo = handler;
        this.zzbdg = zzmy;
        this.zzber = i2;
        this.zzaes = new zzia();
    }

    public final void zza(zzhc zzhc, boolean z, zznc zznc) {
        this.zzbdh = zznc;
        zznn zznn = new zznn(-9223372036854775807L, false);
        this.zzaez = zznn;
        zznc.zzb(zznn, (Object) null);
    }

    public final void zzhx() throws IOException {
    }

    public final zzmx zza(int i, zzok zzok) {
        zzoz.checkArgument(i == 0);
        return new zzmn(this.uri, this.zzbep.zzin(), this.zzbeq.zzgr(), this.zzbdf, this.zzaeo, this.zzbdg, this, zzok, (String) null, this.zzber);
    }

    public final void zzb(zzmx zzmx) {
        ((zzmn) zzmx).release();
    }

    public final void zzhy() {
        this.zzbdh = null;
    }

    public final void zzb(zzhy zzhy, Object obj) {
        boolean z = false;
        if (zzhy.zza(0, this.zzaes, false).zzaid != -9223372036854775807L) {
            z = true;
        }
        if (!this.zzbes || z) {
            this.zzaez = zzhy;
            this.zzbes = z;
            this.zzbdh.zzb(zzhy, (Object) null);
        }
    }
}
