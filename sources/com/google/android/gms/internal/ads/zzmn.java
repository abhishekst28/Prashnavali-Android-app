package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzmn implements zzjx, zzmx, zznj, zzow<zzmu> {
    /* access modifiers changed from: private */
    public final Handler handler;
    private final Uri uri;
    private final Handler zzaeo;
    private boolean zzafq;
    /* access modifiers changed from: private */
    public boolean zzage;
    private long zzaid;
    private final zzom zzaoo;
    private final int zzbdf;
    /* access modifiers changed from: private */
    public final zzmy zzbdg;
    private final zznc zzbdh;
    private final zzok zzbdi;
    /* access modifiers changed from: private */
    public final String zzbdj;
    /* access modifiers changed from: private */
    public final long zzbdk;
    private final zzot zzbdl = new zzot("Loader:ExtractorMediaPeriod");
    private final zzmt zzbdm;
    private final zzpb zzbdn;
    private final Runnable zzbdo;
    /* access modifiers changed from: private */
    public final Runnable zzbdp;
    /* access modifiers changed from: private */
    public final SparseArray<zznh> zzbdq;
    /* access modifiers changed from: private */
    public zzna zzbdr;
    private zzke zzbds;
    private boolean zzbdt;
    private boolean zzbdu;
    private boolean zzbdv;
    private int zzbdw;
    private zznp zzbdx;
    private boolean[] zzbdy;
    private boolean[] zzbdz;
    private boolean zzbea;
    private long zzbeb;
    private long zzbec;
    private int zzbed;
    private boolean zzbee;
    private long zzcp;

    public zzmn(Uri uri2, zzom zzom, zzjv[] zzjvArr, int i, Handler handler2, zzmy zzmy, zznc zznc, zzok zzok, String str, int i2) {
        this.uri = uri2;
        this.zzaoo = zzom;
        this.zzbdf = i;
        this.zzaeo = handler2;
        this.zzbdg = zzmy;
        this.zzbdh = zznc;
        this.zzbdi = zzok;
        this.zzbdj = str;
        this.zzbdk = (long) i2;
        this.zzbdm = new zzmt(zzjvArr, this);
        this.zzbdn = new zzpb();
        this.zzbdo = new zzmq(this);
        this.zzbdp = new zzmp(this);
        this.handler = new Handler();
        this.zzbec = -9223372036854775807L;
        this.zzbdq = new SparseArray<>();
        this.zzcp = -1;
    }

    public final void release() {
        this.zzbdl.zza((Runnable) new zzms(this, this.zzbdm));
        this.handler.removeCallbacksAndMessages((Object) null);
        this.zzage = true;
    }

    public final void zza(zzna zzna, long j) {
        this.zzbdr = zzna;
        this.zzbdn.open();
        startLoading();
    }

    public final void zzhl() throws IOException {
        this.zzbdl.zzbj(Integer.MIN_VALUE);
    }

    public final zznp zzhm() {
        return this.zzbdx;
    }

    public final long zza(zzob[] zzobArr, boolean[] zArr, zznm[] zznmArr, boolean[] zArr2, long j) {
        zzoz.checkState(this.zzafq);
        for (int i = 0; i < zzobArr.length; i++) {
            if (zznmArr[i] != null && (zzobArr[i] == null || !zArr[i])) {
                int zza = zznmArr[i].track;
                zzoz.checkState(this.zzbdy[zza]);
                this.zzbdw--;
                this.zzbdy[zza] = false;
                this.zzbdq.valueAt(zza).disable();
                zznmArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < zzobArr.length; i2++) {
            if (zznmArr[i2] == null && zzobArr[i2] != null) {
                zzob zzob = zzobArr[i2];
                zzoz.checkState(zzob.length() == 1);
                zzoz.checkState(zzob.zzbf(0) == 0);
                int zza2 = this.zzbdx.zza(zzob.zzij());
                zzoz.checkState(!this.zzbdy[zza2]);
                this.zzbdw++;
                this.zzbdy[zza2] = true;
                zznmArr[i2] = new zzmw(this, zza2);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.zzbdu) {
            int size = this.zzbdq.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.zzbdy[i3]) {
                    this.zzbdq.valueAt(i3).disable();
                }
            }
        }
        if (this.zzbdw == 0) {
            this.zzbdv = false;
            if (this.zzbdl.isLoading()) {
                this.zzbdl.zziq();
            }
        } else if (!this.zzbdu ? j != 0 : z) {
            j = zzeg(j);
            for (int i4 = 0; i4 < zznmArr.length; i4++) {
                if (zznmArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.zzbdu = true;
        return j;
    }

    public final void zzee(long j) {
    }

    public final boolean zzef(long j) {
        if (this.zzbee) {
            return false;
        }
        if (this.zzafq && this.zzbdw == 0) {
            return false;
        }
        boolean open = this.zzbdn.open();
        if (this.zzbdl.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    public final long zzhn() {
        if (this.zzbdw == 0) {
            return Long.MIN_VALUE;
        }
        return zzhp();
    }

    public final long zzho() {
        if (!this.zzbdv) {
            return -9223372036854775807L;
        }
        this.zzbdv = false;
        return this.zzbeb;
    }

    public final long zzhp() {
        long j;
        if (this.zzbee) {
            return Long.MIN_VALUE;
        }
        if (zzhu()) {
            return this.zzbec;
        }
        if (this.zzbea) {
            j = Long.MAX_VALUE;
            int size = this.zzbdq.size();
            for (int i = 0; i < size; i++) {
                if (this.zzbdz[i]) {
                    j = Math.min(j, this.zzbdq.valueAt(i).zzht());
                }
            }
        } else {
            j = zzht();
        }
        if (j == Long.MIN_VALUE) {
            return this.zzbeb;
        }
        return j;
    }

    public final long zzeg(long j) {
        if (!this.zzbds.isSeekable()) {
            j = 0;
        }
        this.zzbeb = j;
        int size = this.zzbdq.size();
        boolean z = !zzhu();
        int i = 0;
        while (z && i < size) {
            if (this.zzbdy[i]) {
                z = this.zzbdq.valueAt(i).zze(j, false);
            }
            i++;
        }
        if (!z) {
            this.zzbec = j;
            this.zzbee = false;
            if (this.zzbdl.isLoading()) {
                this.zzbdl.zziq();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.zzbdq.valueAt(i2).zzk(this.zzbdy[i2]);
                }
            }
        }
        this.zzbdv = false;
        return j;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzbb(int i) {
        if (!this.zzbee) {
            return !zzhu() && this.zzbdq.valueAt(i).zzic();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void zzhq() throws IOException {
        this.zzbdl.zzbj(Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    public final int zza(int i, zzhq zzhq, zzjk zzjk, boolean z) {
        if (this.zzbdv || zzhu()) {
            return -3;
        }
        return this.zzbdq.valueAt(i).zza(zzhq, zzjk, z, this.zzbee, this.zzbeb);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(int i, long j) {
        zznh valueAt = this.zzbdq.valueAt(i);
        if (!this.zzbee || j <= valueAt.zzht()) {
            valueAt.zze(j, true);
        } else {
            valueAt.zzif();
        }
    }

    public final zzkg zzc(int i, int i2) {
        zznh zznh = this.zzbdq.get(i);
        if (zznh != null) {
            return zznh;
        }
        zznh zznh2 = new zznh(this.zzbdi);
        zznh2.zza(this);
        this.zzbdq.put(i, zznh2);
        return zznh2;
    }

    public final void zzgp() {
        this.zzbdt = true;
        this.handler.post(this.zzbdo);
    }

    public final void zza(zzke zzke) {
        this.zzbds = zzke;
        this.handler.post(this.zzbdo);
    }

    public final void zzf(zzho zzho) {
        this.handler.post(this.zzbdo);
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final void zzhr() {
        /*
            r8 = this;
            boolean r0 = r8.zzage
            if (r0 != 0) goto L_0x009e
            boolean r0 = r8.zzafq
            if (r0 != 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzke r0 = r8.zzbds
            if (r0 == 0) goto L_0x009e
            boolean r0 = r8.zzbdt
            if (r0 != 0) goto L_0x0012
            goto L_0x009e
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.zznh> r0 = r8.zzbdq
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.internal.ads.zznh> r3 = r8.zzbdq
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zznh r3 = (com.google.android.gms.internal.ads.zznh) r3
            com.google.android.gms.internal.ads.zzho r3 = r3.zzid()
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002e:
            com.google.android.gms.internal.ads.zzpb r2 = r8.zzbdn
            r2.zzis()
            com.google.android.gms.internal.ads.zznq[] r2 = new com.google.android.gms.internal.ads.zznq[r0]
            boolean[] r3 = new boolean[r0]
            r8.zzbdz = r3
            boolean[] r3 = new boolean[r0]
            r8.zzbdy = r3
            com.google.android.gms.internal.ads.zzke r3 = r8.zzbds
            long r3 = r3.getDurationUs()
            r8.zzaid = r3
            r3 = 0
        L_0x0046:
            r4 = 1
            if (r3 >= r0) goto L_0x007c
            android.util.SparseArray<com.google.android.gms.internal.ads.zznh> r5 = r8.zzbdq
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.zznh r5 = (com.google.android.gms.internal.ads.zznh) r5
            com.google.android.gms.internal.ads.zzho r5 = r5.zzid()
            com.google.android.gms.internal.ads.zznq r6 = new com.google.android.gms.internal.ads.zznq
            com.google.android.gms.internal.ads.zzho[] r7 = new com.google.android.gms.internal.ads.zzho[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.zzagy
            boolean r6 = com.google.android.gms.internal.ads.zzpg.zzbg(r5)
            if (r6 != 0) goto L_0x0070
            boolean r5 = com.google.android.gms.internal.ads.zzpg.zzbf(r5)
            if (r5 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            boolean[] r5 = r8.zzbdz
            r5[r3] = r4
            boolean r5 = r8.zzbea
            r4 = r4 | r5
            r8.zzbea = r4
            int r3 = r3 + 1
            goto L_0x0046
        L_0x007c:
            com.google.android.gms.internal.ads.zznp r0 = new com.google.android.gms.internal.ads.zznp
            r0.<init>(r2)
            r8.zzbdx = r0
            r8.zzafq = r4
            com.google.android.gms.internal.ads.zznc r0 = r8.zzbdh
            com.google.android.gms.internal.ads.zznn r1 = new com.google.android.gms.internal.ads.zznn
            long r2 = r8.zzaid
            com.google.android.gms.internal.ads.zzke r4 = r8.zzbds
            boolean r4 = r4.isSeekable()
            r1.<init>(r2, r4)
            r2 = 0
            r0.zzb(r1, r2)
            com.google.android.gms.internal.ads.zzna r0 = r8.zzbdr
            r0.zza(r8)
            return
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmn.zzhr():void");
    }

    private final void zza(zzmu zzmu) {
        if (this.zzcp == -1) {
            this.zzcp = zzmu.zzcp;
        }
    }

    private final void startLoading() {
        zzke zzke;
        zzmu zzmu = new zzmu(this, this.uri, this.zzaoo, this.zzbdm, this.zzbdn);
        if (this.zzafq) {
            zzoz.checkState(zzhu());
            long j = this.zzaid;
            if (j == -9223372036854775807L || this.zzbec < j) {
                zzmu.zze(this.zzbds.zzdz(this.zzbec), this.zzbec);
                this.zzbec = -9223372036854775807L;
            } else {
                this.zzbee = true;
                this.zzbec = -9223372036854775807L;
                return;
            }
        }
        this.zzbed = zzhs();
        int i = this.zzbdf;
        if (i == -1) {
            if (this.zzafq && this.zzcp == -1 && ((zzke = this.zzbds) == null || zzke.getDurationUs() == -9223372036854775807L)) {
                i = 6;
            } else {
                i = 3;
            }
        }
        this.zzbdl.zza(zzmu, this, i);
    }

    private final int zzhs() {
        int size = this.zzbdq.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.zzbdq.valueAt(i2).zzib();
        }
        return i;
    }

    private final long zzht() {
        int size = this.zzbdq.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.zzbdq.valueAt(i).zzht());
        }
        return j;
    }

    private final boolean zzhu() {
        return this.zzbec != -9223372036854775807L;
    }

    public final /* synthetic */ int zza(zzoy zzoy, long j, long j2, IOException iOException) {
        zzke zzke;
        zzmu zzmu = (zzmu) zzoy;
        zza(zzmu);
        Handler handler2 = this.zzaeo;
        if (!(handler2 == null || this.zzbdg == null)) {
            handler2.post(new zzmr(this, iOException));
        }
        if (iOException instanceof zzns) {
            return 3;
        }
        boolean z = zzhs() > this.zzbed;
        if (this.zzcp == -1 && ((zzke = this.zzbds) == null || zzke.getDurationUs() == -9223372036854775807L)) {
            this.zzbeb = 0;
            this.zzbdv = this.zzafq;
            int size = this.zzbdq.size();
            for (int i = 0; i < size; i++) {
                this.zzbdq.valueAt(i).zzk(!this.zzafq || this.zzbdy[i]);
            }
            zzmu.zze(0, 0);
        }
        this.zzbed = zzhs();
        return z ? 1 : 0;
    }

    public final /* synthetic */ void zza(zzoy zzoy, long j, long j2, boolean z) {
        zza((zzmu) zzoy);
        if (!z && this.zzbdw > 0) {
            int size = this.zzbdq.size();
            for (int i = 0; i < size; i++) {
                this.zzbdq.valueAt(i).zzk(this.zzbdy[i]);
            }
            this.zzbdr.zza(this);
        }
    }

    public final /* synthetic */ void zza(zzoy zzoy, long j, long j2) {
        long j3;
        zza((zzmu) zzoy);
        this.zzbee = true;
        if (this.zzaid == -9223372036854775807L) {
            long zzht = zzht();
            if (zzht == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = zzht + 10000;
            }
            this.zzaid = j3;
            this.zzbdh.zzb(new zznn(this.zzaid, this.zzbds.isSeekable()), (Object) null);
        }
        this.zzbdr.zza(this);
    }
}
