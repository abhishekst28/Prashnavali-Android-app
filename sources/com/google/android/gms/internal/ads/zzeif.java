package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeif<T> implements zzeiv<T> {
    private final zzehz zziie;
    private final boolean zziif;
    private final zzejn<?, ?> zziio;
    private final zzege<?> zziip;

    private zzeif(zzejn<?, ?> zzejn, zzege<?> zzege, zzehz zzehz) {
        this.zziio = zzejn;
        this.zziif = zzege.zzj(zzehz);
        this.zziip = zzege;
        this.zziie = zzehz;
    }

    static <T> zzeif<T> zza(zzejn<?, ?> zzejn, zzege<?> zzege, zzehz zzehz) {
        return new zzeif<>(zzejn, zzege, zzehz);
    }

    public final T newInstance() {
        return this.zziie.zzbfq().zzbfw();
    }

    public final boolean equals(T t, T t2) {
        if (!this.zziio.zzax(t).equals(this.zziio.zzax(t2))) {
            return false;
        }
        if (this.zziif) {
            return this.zziip.zzah(t).equals(this.zziip.zzah(t2));
        }
        return true;
    }

    public final int hashCode(T t) {
        int hashCode = this.zziio.zzax(t).hashCode();
        if (this.zziif) {
            return (hashCode * 53) + this.zziip.zzah(t).hashCode();
        }
        return hashCode;
    }

    public final void zzg(T t, T t2) {
        zzeix.zza(this.zziio, t, t2);
        if (this.zziif) {
            zzeix.zza(this.zziip, t, t2);
        }
    }

    public final void zza(T t, zzekk zzekk) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zziip.zzah(t).iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            zzegk zzegk = (zzegk) next.getKey();
            if (zzegk.zzbff() != zzekh.MESSAGE || zzegk.zzbfg() || zzegk.zzbfh()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzehg) {
                zzekk.zzc(zzegk.zzv(), ((zzehg) next).zzbgm().zzbda());
            } else {
                zzekk.zzc(zzegk.zzv(), next.getValue());
            }
        }
        zzejn<?, ?> zzejn = this.zziio;
        zzejn.zzc(zzejn.zzax(t), zzekk);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.ads.zzegp$zzf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.zzefa r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzegp r0 = (com.google.android.gms.internal.ads.zzegp) r0
            com.google.android.gms.internal.ads.zzejq r1 = r0.zzifo
            com.google.android.gms.internal.ads.zzejq r2 = com.google.android.gms.internal.ads.zzejq.zzbhz()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.ads.zzejq r1 = com.google.android.gms.internal.ads.zzejq.zzbia()
            r0.zzifo = r1
        L_0x0011:
            com.google.android.gms.internal.ads.zzegp$zzd r10 = (com.google.android.gms.internal.ads.zzegp.zzd) r10
            r10.zzbfy()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00ac
            int r4 = com.google.android.gms.internal.ads.zzefb.zza(r11, r12, r14)
            int r2 = r14.zziaw
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0053
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004e
            com.google.android.gms.internal.ads.zzege<?> r12 = r9.zziip
            com.google.android.gms.internal.ads.zzegc r0 = r14.zziaz
            com.google.android.gms.internal.ads.zzehz r3 = r9.zziie
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzegp$zzf r0 = (com.google.android.gms.internal.ads.zzegp.zzf) r0
            if (r0 != 0) goto L_0x0045
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.zzefb.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.zzejq) r6, (com.google.android.gms.internal.ads.zzefa) r7)
            goto L_0x0018
        L_0x0045:
            com.google.android.gms.internal.ads.zzeio.zzbhg()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004e:
            int r12 = com.google.android.gms.internal.ads.zzefb.zza((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.ads.zzefa) r14)
            goto L_0x0018
        L_0x0053:
            r12 = 0
            r2 = r10
        L_0x0055:
            if (r4 >= r13) goto L_0x009f
            int r4 = com.google.android.gms.internal.ads.zzefb.zza(r11, r4, r14)
            int r5 = r14.zziaw
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x0081
            r8 = 3
            if (r6 == r8) goto L_0x006b
            goto L_0x0096
        L_0x006b:
            if (r0 != 0) goto L_0x0078
            if (r7 != r3) goto L_0x0096
            int r4 = com.google.android.gms.internal.ads.zzefb.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zziay
            com.google.android.gms.internal.ads.zzeff r2 = (com.google.android.gms.internal.ads.zzeff) r2
            goto L_0x0055
        L_0x0078:
            com.google.android.gms.internal.ads.zzeio.zzbhg()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x0081:
            if (r7 != 0) goto L_0x0096
            int r4 = com.google.android.gms.internal.ads.zzefb.zza(r11, r4, r14)
            int r12 = r14.zziaw
            com.google.android.gms.internal.ads.zzege<?> r0 = r9.zziip
            com.google.android.gms.internal.ads.zzegc r5 = r14.zziaz
            com.google.android.gms.internal.ads.zzehz r6 = r9.zziie
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.ads.zzegp$zzf r0 = (com.google.android.gms.internal.ads.zzegp.zzf) r0
            goto L_0x0055
        L_0x0096:
            r6 = 12
            if (r5 == r6) goto L_0x009f
            int r4 = com.google.android.gms.internal.ads.zzefb.zza((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.ads.zzefa) r14)
            goto L_0x0055
        L_0x009f:
            if (r2 == 0) goto L_0x00a9
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzd(r12, r2)
        L_0x00a9:
            r12 = r4
            goto L_0x0018
        L_0x00ac:
            if (r12 != r13) goto L_0x00af
            return
        L_0x00af:
            com.google.android.gms.internal.ads.zzegz r10 = com.google.android.gms.internal.ads.zzegz.zzbgi()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeif.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzefa):void");
    }

    public final void zza(T t, zzeip zzeip, zzegc zzegc) throws IOException {
        boolean z;
        zzejn<?, ?> zzejn = this.zziio;
        zzege<?> zzege = this.zziip;
        Object zzay = zzejn.zzay(t);
        zzegi<?> zzai = zzege.zzai(t);
        do {
            try {
                if (zzeip.zzber() == Integer.MAX_VALUE) {
                    zzejn.zzj(t, zzay);
                    return;
                }
                int tag = zzeip.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzeff zzeff = null;
                    while (zzeip.zzber() != Integer.MAX_VALUE) {
                        int tag2 = zzeip.getTag();
                        if (tag2 == 16) {
                            i = zzeip.zzbec();
                            obj = zzege.zza(zzegc, this.zziie, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzege.zza(zzeip, obj, zzegc, zzai);
                            } else {
                                zzeff = zzeip.zzbeb();
                            }
                        } else if (!zzeip.zzbes()) {
                            break;
                        }
                    }
                    if (zzeip.getTag() != 12) {
                        throw zzegz.zzbgf();
                    } else if (zzeff != null) {
                        if (obj != null) {
                            zzege.zza(zzeff, obj, zzegc, zzai);
                        } else {
                            zzejn.zza(zzay, i, zzeff);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzege.zza(zzegc, this.zziie, tag >>> 3);
                    if (zza != null) {
                        zzege.zza(zzeip, zza, zzegc, zzai);
                    } else {
                        z = zzejn.zza(zzay, zzeip);
                        continue;
                    }
                } else {
                    z = zzeip.zzbes();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzejn.zzj(t, zzay);
            }
        } while (z);
    }

    public final void zzaj(T t) {
        this.zziio.zzaj(t);
        this.zziip.zzaj(t);
    }

    public final boolean zzav(T t) {
        return this.zziip.zzah(t).isInitialized();
    }

    public final int zzat(T t) {
        zzejn<?, ?> zzejn = this.zziio;
        int zzaz = zzejn.zzaz(zzejn.zzax(t)) + 0;
        if (this.zziif) {
            return zzaz + this.zziip.zzah(t).zzbfd();
        }
        return zzaz;
    }
}
