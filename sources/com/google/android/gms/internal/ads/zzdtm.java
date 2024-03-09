package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzdtm<E> extends zzdte<E> {
    private int zzahr;
    @NullableDecl
    private Object[] zzhni;

    public zzdtm() {
        super(4);
    }

    zzdtm(int i) {
        super(i);
        this.zzhni = new Object[zzdtn.zzen(i)];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.zzdtw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.android.gms.internal.ads.zzdtn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.gms.internal.ads.zzdtw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.gms.internal.ads.zzdtw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzdtn<E> zzawx() {
        /*
            r8 = this;
            int r0 = r8.size
            if (r0 == 0) goto L_0x005b
            r1 = 1
            if (r0 == r1) goto L_0x0051
            java.lang.Object[] r0 = r8.zzhni
            if (r0 == 0) goto L_0x003d
            int r0 = r8.size
            int r0 = com.google.android.gms.internal.ads.zzdtn.zzen(r0)
            java.lang.Object[] r2 = r8.zzhni
            int r2 = r2.length
            if (r0 != r2) goto L_0x003d
            int r0 = r8.size
            java.lang.Object[] r2 = r8.zzhmy
            int r2 = r2.length
            boolean r0 = com.google.android.gms.internal.ads.zzdtn.zzv(r0, r2)
            if (r0 == 0) goto L_0x002a
            java.lang.Object[] r0 = r8.zzhmy
            int r2 = r8.size
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            goto L_0x002c
        L_0x002a:
            java.lang.Object[] r0 = r8.zzhmy
        L_0x002c:
            r3 = r0
            com.google.android.gms.internal.ads.zzdtw r0 = new com.google.android.gms.internal.ads.zzdtw
            int r4 = r8.zzahr
            java.lang.Object[] r5 = r8.zzhni
            int r2 = r5.length
            int r6 = r2 + -1
            int r7 = r8.size
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x004b
        L_0x003d:
            int r0 = r8.size
            java.lang.Object[] r2 = r8.zzhmy
            com.google.android.gms.internal.ads.zzdtn r0 = com.google.android.gms.internal.ads.zzdtn.zza(r0, r2)
            int r2 = r0.size()
            r8.size = r2
        L_0x004b:
            r8.zzhmz = r1
            r1 = 0
            r8.zzhni = r1
            return r0
        L_0x0051:
            java.lang.Object[] r0 = r8.zzhmy
            r1 = 0
            r0 = r0[r1]
            com.google.android.gms.internal.ads.zzdtn r0 = com.google.android.gms.internal.ads.zzdtn.zzad(r0)
            return r0
        L_0x005b:
            com.google.android.gms.internal.ads.zzdtw<java.lang.Object> r0 = com.google.android.gms.internal.ads.zzdtw.zzhnu
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdtm.zzawx():com.google.android.gms.internal.ads.zzdtn");
    }

    public final /* synthetic */ zzdth zzg(Iterable iterable) {
        zzdsv.checkNotNull(iterable);
        if (this.zzhni != null) {
            for (Object zzab : iterable) {
                zzab(zzab);
            }
        } else {
            super.zzg(iterable);
        }
        return this;
    }

    public final /* synthetic */ zzdte zzaa(Object obj) {
        return (zzdtm) zzab(obj);
    }

    public final /* synthetic */ zzdth zza(Iterator it) {
        zzdsv.checkNotNull(it);
        while (it.hasNext()) {
            zzab(it.next());
        }
        return this;
    }

    public final /* synthetic */ zzdth zzab(Object obj) {
        zzdsv.checkNotNull(obj);
        if (this.zzhni != null) {
            int zzen = zzdtn.zzen(this.size);
            Object[] objArr = this.zzhni;
            if (zzen <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zzel = zzdtc.zzel(hashCode);
                while (true) {
                    int i = zzel & length;
                    Object[] objArr2 = this.zzhni;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zzel = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zzahr += hashCode;
                        super.zzab(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzhni = null;
        super.zzab(obj);
        return this;
    }
}
