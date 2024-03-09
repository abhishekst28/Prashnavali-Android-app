package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzhj implements zzhc {
    private int repeatMode;
    private final zzhx[] zzael;
    private final zzog zzaem;
    private final zzod zzaen;
    private final Handler zzaeo;
    private final zzhl zzaep;
    private final CopyOnWriteArraySet<zzhf> zzaeq;
    private final zzid zzaer;
    private final zzia zzaes;
    private boolean zzaet;
    private boolean zzaeu;
    private int zzaev;
    private int zzaew;
    private int zzaex;
    private boolean zzaey;
    private zzhy zzaez;
    private Object zzafa;
    private zznp zzafb;
    private zzod zzafc;
    private zzhu zzafd;
    private zzhn zzafe;
    private int zzaff;
    private int zzafg;
    private long zzafh;

    public zzhj(zzhx[] zzhxArr, zzog zzog, zzhs zzhs) {
        String str = zzpq.zzbki;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zzoz.checkState(zzhxArr.length > 0);
        this.zzael = (zzhx[]) zzoz.checkNotNull(zzhxArr);
        this.zzaem = (zzog) zzoz.checkNotNull(zzog);
        this.zzaeu = false;
        this.repeatMode = 0;
        this.zzaev = 1;
        this.zzaeq = new CopyOnWriteArraySet<>();
        this.zzaen = new zzod(new zzob[zzhxArr.length]);
        this.zzaez = zzhy.zzahz;
        this.zzaer = new zzid();
        this.zzaes = new zzia();
        this.zzafb = zznp.zzbgq;
        this.zzafc = this.zzaen;
        this.zzafd = zzhu.zzahv;
        this.zzaeo = new zzhi(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzafe = new zzhn(0, 0);
        this.zzaep = new zzhl(zzhxArr, zzog, zzhs, this.zzaeu, 0, this.zzaeo, this.zzafe, this);
    }

    public final void zza(zzhf zzhf) {
        this.zzaeq.add(zzhf);
    }

    public final void zzb(zzhf zzhf) {
        this.zzaeq.remove(zzhf);
    }

    public final int getPlaybackState() {
        return this.zzaev;
    }

    public final void zza(zzmz zzmz) {
        if (!this.zzaez.isEmpty() || this.zzafa != null) {
            this.zzaez = zzhy.zzahz;
            this.zzafa = null;
            Iterator<zzhf> it = this.zzaeq.iterator();
            while (it.hasNext()) {
                it.next().zza(this.zzaez, this.zzafa);
            }
        }
        if (this.zzaet) {
            this.zzaet = false;
            this.zzafb = zznp.zzbgq;
            this.zzafc = this.zzaen;
            this.zzaem.zzd((Object) null);
            Iterator<zzhf> it2 = this.zzaeq.iterator();
            while (it2.hasNext()) {
                it2.next().zza(this.zzafb, this.zzafc);
            }
        }
        this.zzaex++;
        this.zzaep.zza(zzmz, true);
    }

    public final void zzf(boolean z) {
        if (this.zzaeu != z) {
            this.zzaeu = z;
            this.zzaep.zzf(z);
            Iterator<zzhf> it = this.zzaeq.iterator();
            while (it.hasNext()) {
                it.next().zza(z, this.zzaev);
            }
        }
    }

    public final boolean zzei() {
        return this.zzaeu;
    }

    public final void seekTo(long j) {
        long j2;
        int zzem = zzem();
        if (zzem < 0 || (!this.zzaez.isEmpty() && zzem >= this.zzaez.zzfd())) {
            throw new zzht(this.zzaez, zzem, j);
        }
        this.zzaew++;
        this.zzaff = zzem;
        if (!this.zzaez.isEmpty()) {
            this.zzaez.zza(zzem, this.zzaer, false);
            if (j == -9223372036854775807L) {
                j2 = this.zzaer.zzais;
            } else {
                j2 = zzha.zzdn(j);
            }
            long j3 = this.zzaer.zzait + j2;
            long j4 = this.zzaez.zza(0, this.zzaes, false).zzaid;
            if (j4 != -9223372036854775807L) {
                int i = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
            }
        }
        this.zzafg = 0;
        if (j == -9223372036854775807L) {
            this.zzafh = 0;
            this.zzaep.zza(this.zzaez, zzem, -9223372036854775807L);
            return;
        }
        this.zzafh = j;
        this.zzaep.zza(this.zzaez, zzem, zzha.zzdn(j));
        Iterator<zzhf> it = this.zzaeq.iterator();
        while (it.hasNext()) {
            it.next().zzel();
        }
    }

    public final void stop() {
        this.zzaep.stop();
    }

    public final void release() {
        this.zzaep.release();
        this.zzaeo.removeCallbacksAndMessages((Object) null);
    }

    public final void zza(zzhh... zzhhArr) {
        this.zzaep.zza(zzhhArr);
    }

    public final void zzb(zzhh... zzhhArr) {
        this.zzaep.zzb(zzhhArr);
    }

    private final int zzem() {
        if (this.zzaez.isEmpty() || this.zzaew > 0) {
            return this.zzaff;
        }
        this.zzaez.zza(this.zzafe.zzafn, this.zzaes, false);
        return 0;
    }

    public final long getDuration() {
        if (this.zzaez.isEmpty()) {
            return -9223372036854775807L;
        }
        return zzha.zzdm(this.zzaez.zza(zzem(), this.zzaer, false).zzaid);
    }

    public final long zzek() {
        if (this.zzaez.isEmpty() || this.zzaew > 0) {
            return this.zzafh;
        }
        this.zzaez.zza(this.zzafe.zzafn, this.zzaes, false);
        return this.zzaes.zzff() + zzha.zzdm(this.zzafe.zzagr);
    }

    public final long getBufferedPosition() {
        if (this.zzaez.isEmpty() || this.zzaew > 0) {
            return this.zzafh;
        }
        this.zzaez.zza(this.zzafe.zzafn, this.zzaes, false);
        return this.zzaes.zzff() + zzha.zzdm(this.zzafe.zzags);
    }

    public final int zzej() {
        return this.zzael.length;
    }

    /* access modifiers changed from: package-private */
    public final void zza(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.zzaex--;
                return;
            case 1:
                this.zzaev = message.arg1;
                Iterator<zzhf> it = this.zzaeq.iterator();
                while (it.hasNext()) {
                    it.next().zza(this.zzaeu, this.zzaev);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.zzaey = z;
                Iterator<zzhf> it2 = this.zzaeq.iterator();
                while (it2.hasNext()) {
                    it2.next().zzg(this.zzaey);
                }
                return;
            case 3:
                if (this.zzaex == 0) {
                    zzoi zzoi = (zzoi) message.obj;
                    this.zzaet = true;
                    this.zzafb = zzoi.zzbhs;
                    this.zzafc = zzoi.zzbht;
                    this.zzaem.zzd(zzoi.zzbhu);
                    Iterator<zzhf> it3 = this.zzaeq.iterator();
                    while (it3.hasNext()) {
                        it3.next().zza(this.zzafb, this.zzafc);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzaew - 1;
                this.zzaew = i;
                if (i == 0) {
                    this.zzafe = (zzhn) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzhf> it4 = this.zzaeq.iterator();
                        while (it4.hasNext()) {
                            it4.next().zzel();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzaew == 0) {
                    this.zzafe = (zzhn) message.obj;
                    Iterator<zzhf> it5 = this.zzaeq.iterator();
                    while (it5.hasNext()) {
                        it5.next().zzel();
                    }
                    return;
                }
                return;
            case 6:
                zzhp zzhp = (zzhp) message.obj;
                this.zzaew -= zzhp.zzahs;
                if (this.zzaex == 0) {
                    this.zzaez = zzhp.zzaez;
                    this.zzafa = zzhp.zzafa;
                    this.zzafe = zzhp.zzafe;
                    Iterator<zzhf> it6 = this.zzaeq.iterator();
                    while (it6.hasNext()) {
                        it6.next().zza(this.zzaez, this.zzafa);
                    }
                    return;
                }
                return;
            case 7:
                zzhu zzhu = (zzhu) message.obj;
                if (!this.zzafd.equals(zzhu)) {
                    this.zzafd = zzhu;
                    Iterator<zzhf> it7 = this.zzaeq.iterator();
                    while (it7.hasNext()) {
                        it7.next().zza(zzhu);
                    }
                    return;
                }
                return;
            case 8:
                zzhd zzhd = (zzhd) message.obj;
                Iterator<zzhf> it8 = this.zzaeq.iterator();
                while (it8.hasNext()) {
                    it8.next().zza(zzhd);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
