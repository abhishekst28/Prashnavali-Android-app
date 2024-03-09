package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzhb implements zzhw, zzhx {
    private int index;
    private int state;
    private final int zzaea;
    private zzhz zzaeb;
    private zznm zzaec;
    private long zzaed;
    private boolean zzaee = true;
    private boolean zzaef;

    public zzhb(int i) {
        this.zzaea = i;
    }

    public final int getTrackType() {
        return this.zzaea;
    }

    public final zzhw zzdx() {
        return this;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public zzpd zzdy() {
        return null;
    }

    public final int getState() {
        return this.state;
    }

    public final void zza(zzhz zzhz, zzho[] zzhoArr, zznm zznm, long j, boolean z, long j2) throws zzhd {
        zzoz.checkState(this.state == 0);
        this.zzaeb = zzhz;
        this.state = 1;
        zze(z);
        zza(zzhoArr, zznm, j2);
        zza(j, z);
    }

    public final void start() throws zzhd {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        zzoz.checkState(z);
        this.state = 2;
        onStarted();
    }

    public final void zza(zzho[] zzhoArr, zznm zznm, long j) throws zzhd {
        zzoz.checkState(!this.zzaef);
        this.zzaec = zznm;
        this.zzaee = false;
        this.zzaed = j;
        zza(zzhoArr, j);
    }

    public final zznm zzdz() {
        return this.zzaec;
    }

    public final boolean zzea() {
        return this.zzaee;
    }

    public final void zzeb() {
        this.zzaef = true;
    }

    public final boolean zzec() {
        return this.zzaef;
    }

    public final void zzed() throws IOException {
        this.zzaec.zzhq();
    }

    public final void zzdo(long j) throws zzhd {
        this.zzaef = false;
        this.zzaee = false;
        zza(j, false);
    }

    public final void stop() throws zzhd {
        zzoz.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    public final void disable() {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        zzoz.checkState(z);
        this.state = 0;
        this.zzaec = null;
        this.zzaef = false;
        zzef();
    }

    public int zzee() throws zzhd {
        return 0;
    }

    public void zza(int i, Object obj) throws zzhd {
    }

    /* access modifiers changed from: protected */
    public void zze(boolean z) throws zzhd {
    }

    /* access modifiers changed from: protected */
    public void zza(zzho[] zzhoArr, long j) throws zzhd {
    }

    /* access modifiers changed from: protected */
    public void zza(long j, boolean z) throws zzhd {
    }

    /* access modifiers changed from: protected */
    public void onStarted() throws zzhd {
    }

    /* access modifiers changed from: protected */
    public void onStopped() throws zzhd {
    }

    /* access modifiers changed from: protected */
    public void zzef() {
    }

    /* access modifiers changed from: protected */
    public final zzhz zzeg() {
        return this.zzaeb;
    }

    /* access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    /* access modifiers changed from: protected */
    public final int zza(zzhq zzhq, zzjk zzjk, boolean z) {
        int zzb = this.zzaec.zzb(zzhq, zzjk, z);
        if (zzb == -4) {
            if (zzjk.zzgj()) {
                this.zzaee = true;
                if (this.zzaef) {
                    return -4;
                }
                return -3;
            }
            zzjk.zzanx += this.zzaed;
        } else if (zzb == -5) {
            zzho zzho = zzhq.zzaht;
            if (zzho.zzahn != Long.MAX_VALUE) {
                zzhq.zzaht = zzho.zzds(zzho.zzahn + this.zzaed);
            }
        }
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final void zzdp(long j) {
        this.zzaec.zzeh(j - this.zzaed);
    }

    /* access modifiers changed from: protected */
    public final boolean zzeh() {
        return this.zzaee ? this.zzaef : this.zzaec.isReady();
    }
}
