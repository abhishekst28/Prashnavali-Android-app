package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zznb implements zzmx, zzna {
    private zznp zzafb;
    private zzna zzbdr;
    public final zzmx[] zzbet;
    private final IdentityHashMap<zznm, Integer> zzbeu = new IdentityHashMap<>();
    private int zzbev;
    private zzmx[] zzbew;
    private zznl zzbex;

    public zznb(zzmx... zzmxArr) {
        this.zzbet = zzmxArr;
    }

    public final void zza(zzna zzna, long j) {
        this.zzbdr = zzna;
        zzmx[] zzmxArr = this.zzbet;
        this.zzbev = zzmxArr.length;
        for (zzmx zza : zzmxArr) {
            zza.zza(this, j);
        }
    }

    public final void zzhl() throws IOException {
        for (zzmx zzhl : this.zzbet) {
            zzhl.zzhl();
        }
    }

    public final zznp zzhm() {
        return this.zzafb;
    }

    public final long zza(zzob[] zzobArr, boolean[] zArr, zznm[] zznmArr, boolean[] zArr2, long j) {
        int i;
        zzob[] zzobArr2 = zzobArr;
        zznm[] zznmArr2 = zznmArr;
        int[] iArr = new int[zzobArr2.length];
        int[] iArr2 = new int[zzobArr2.length];
        for (int i2 = 0; i2 < zzobArr2.length; i2++) {
            if (zznmArr2[i2] == null) {
                i = -1;
            } else {
                i = this.zzbeu.get(zznmArr2[i2]).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (zzobArr2[i2] != null) {
                zznq zzij = zzobArr2[i2].zzij();
                int i3 = 0;
                while (true) {
                    zzmx[] zzmxArr = this.zzbet;
                    if (i3 >= zzmxArr.length) {
                        break;
                    } else if (zzmxArr[i3].zzhm().zza(zzij) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.zzbeu.clear();
        int length = zzobArr2.length;
        zznm[] zznmArr3 = new zznm[length];
        zznm[] zznmArr4 = new zznm[zzobArr2.length];
        zzob[] zzobArr3 = new zzob[zzobArr2.length];
        ArrayList arrayList = new ArrayList(this.zzbet.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.zzbet.length) {
            for (int i5 = 0; i5 < zzobArr2.length; i5++) {
                zzob zzob = null;
                zznmArr4[i5] = iArr[i5] == i4 ? zznmArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzob = zzobArr2[i5];
                }
                zzobArr3[i5] = zzob;
            }
            int i6 = i4;
            zzob[] zzobArr4 = zzobArr3;
            ArrayList arrayList2 = arrayList;
            long zza = this.zzbet[i4].zza(zzobArr3, zArr, zznmArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = zza;
            } else if (zza != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzobArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zzoz.checkState(zznmArr4[i7] != null);
                    zznmArr3[i7] = zznmArr4[i7];
                    this.zzbeu.put(zznmArr4[i7], Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zznmArr4[i7] != null) {
                        z2 = false;
                    }
                    zzoz.checkState(z2);
                }
            }
            if (z) {
                arrayList2.add(this.zzbet[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzobArr3 = zzobArr4;
            zznmArr2 = zznmArr;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zznmArr3, 0, zznmArr, 0, length);
        zzmx[] zzmxArr2 = new zzmx[arrayList3.size()];
        this.zzbew = zzmxArr2;
        arrayList3.toArray(zzmxArr2);
        this.zzbex = new zzmo(this.zzbew);
        return j2;
    }

    public final void zzee(long j) {
        for (zzmx zzee : this.zzbew) {
            zzee.zzee(j);
        }
    }

    public final boolean zzef(long j) {
        return this.zzbex.zzef(j);
    }

    public final long zzhn() {
        return this.zzbex.zzhn();
    }

    public final long zzho() {
        long zzho = this.zzbet[0].zzho();
        int i = 1;
        while (true) {
            zzmx[] zzmxArr = this.zzbet;
            if (i >= zzmxArr.length) {
                if (zzho != -9223372036854775807L) {
                    zzmx[] zzmxArr2 = this.zzbew;
                    int length = zzmxArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        zzmx zzmx = zzmxArr2[i2];
                        if (zzmx == this.zzbet[0] || zzmx.zzeg(zzho) == zzho) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzho;
            } else if (zzmxArr[i].zzho() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    public final long zzhp() {
        long j = Long.MAX_VALUE;
        for (zzmx zzhp : this.zzbew) {
            long zzhp2 = zzhp.zzhp();
            if (zzhp2 != Long.MIN_VALUE) {
                j = Math.min(j, zzhp2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzeg(long j) {
        long zzeg = this.zzbew[0].zzeg(j);
        int i = 1;
        while (true) {
            zzmx[] zzmxArr = this.zzbew;
            if (i >= zzmxArr.length) {
                return zzeg;
            }
            if (zzmxArr[i].zzeg(zzeg) == zzeg) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    public final void zza(zzmx zzmx) {
        int i = this.zzbev - 1;
        this.zzbev = i;
        if (i <= 0) {
            int i2 = 0;
            for (zzmx zzhm : this.zzbet) {
                i2 += zzhm.zzhm().length;
            }
            zznq[] zznqArr = new zznq[i2];
            int i3 = 0;
            for (zzmx zzhm2 : this.zzbet) {
                zznp zzhm3 = zzhm2.zzhm();
                int i4 = zzhm3.length;
                int i5 = 0;
                while (i5 < i4) {
                    zznqArr[i3] = zzhm3.zzbd(i5);
                    i5++;
                    i3++;
                }
            }
            this.zzafb = new zznp(zznqArr);
            this.zzbdr.zza(this);
        }
    }

    public final /* synthetic */ void zza(zznl zznl) {
        if (this.zzafb != null) {
            this.zzbdr.zza(this);
        }
    }
}
