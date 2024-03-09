package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzdrq {
    private final SharedPreferences zzcld;
    private final File zzhks;
    private final File zzhkt;
    private final zzgo zzvy;

    public zzdrq(Context context, zzgo zzgo) {
        this.zzcld = context.getSharedPreferences("pcvmspf", 0);
        this.zzhks = zzdrp.zza(context.getDir("pccache", 0), false);
        this.zzhkt = zzdrp.zza(context.getDir("tmppccache", 0), true);
        this.zzvy = zzgo;
    }

    public final zzdrn zzp(int i) {
        zzgr zzei = zzei(i);
        if (zzei == null) {
            return null;
        }
        String zzdg = zzei.zzdg();
        return new zzdrn(zzei, zzdrp.zza(zzdg, "pcam", zzawd()), zzdrp.zza(zzdg, "pcbc", zzawd()), zzdrp.zza(zzdg, "pcopt", zzawd()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0145, code lost:
        if (r0.commit() != false) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.zzgq r9, com.google.android.gms.internal.ads.zzdrw r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzgr r0 = r9.zzdc()
            java.lang.String r0 = r0.zzdg()
            com.google.android.gms.internal.ads.zzeff r1 = r9.zzdd()
            byte[] r1 = r1.toByteArray()
            com.google.android.gms.internal.ads.zzeff r2 = r9.zzde()
            byte[] r2 = r2.toByteArray()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r4 = "pcbc"
            java.lang.String r5 = "pcam"
            r6 = 0
            if (r3 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x005b
            int r3 = r2.length
            if (r3 != 0) goto L_0x002a
            goto L_0x005b
        L_0x002a:
            java.io.File r3 = r8.zzhkt
            com.google.android.gms.internal.ads.zzdrp.zze(r3)
            java.io.File r3 = r8.zzhkt
            r3.mkdirs()
            java.io.File r3 = r8.zzhkt
            java.io.File r3 = com.google.android.gms.internal.ads.zzdrp.zza((java.lang.String) r0, (java.io.File) r3)
            r3.mkdirs()
            java.io.File r3 = r8.zzhkt
            java.io.File r3 = com.google.android.gms.internal.ads.zzdrp.zza(r0, r5, r3)
            if (r1 == 0) goto L_0x0050
            int r7 = r1.length
            if (r7 <= 0) goto L_0x0050
            boolean r1 = com.google.android.gms.internal.ads.zzdrp.zza((java.io.File) r3, (byte[]) r1)
            if (r1 != 0) goto L_0x0050
            r0 = 0
            goto L_0x005c
        L_0x0050:
            java.io.File r1 = r8.zzhkt
            java.io.File r0 = com.google.android.gms.internal.ads.zzdrp.zza(r0, r4, r1)
            boolean r0 = com.google.android.gms.internal.ads.zzdrp.zza((java.io.File) r0, (byte[]) r2)
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 != 0) goto L_0x005f
            return r6
        L_0x005f:
            com.google.android.gms.internal.ads.zzgr r0 = r9.zzdc()
            java.lang.String r0 = r0.zzdg()
            java.io.File r1 = r8.zzhkt
            java.io.File r0 = com.google.android.gms.internal.ads.zzdrp.zza(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x007d
            if (r10 == 0) goto L_0x007d
            boolean r10 = r10.zzb(r0)
            if (r10 != 0) goto L_0x007d
            return r6
        L_0x007d:
            com.google.android.gms.internal.ads.zzgr r10 = r9.zzdc()
            java.lang.String r10 = r10.zzdg()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 1
            if (r0 != 0) goto L_0x00c3
            java.io.File r0 = r8.zzhkt
            java.io.File r0 = com.google.android.gms.internal.ads.zzdrp.zza(r10, r5, r0)
            java.io.File r2 = r8.zzhkt
            java.io.File r2 = com.google.android.gms.internal.ads.zzdrp.zza(r10, r4, r2)
            java.io.File r3 = r8.zzawd()
            java.io.File r3 = com.google.android.gms.internal.ads.zzdrp.zza(r10, r5, r3)
            java.io.File r5 = r8.zzawd()
            java.io.File r10 = com.google.android.gms.internal.ads.zzdrp.zza(r10, r4, r5)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L_0x00b5
            boolean r0 = r0.renameTo(r3)
            if (r0 == 0) goto L_0x00c3
        L_0x00b5:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00c3
            boolean r10 = r2.renameTo(r10)
            if (r10 == 0) goto L_0x00c3
            r10 = 1
            goto L_0x00c4
        L_0x00c3:
            r10 = 0
        L_0x00c4:
            if (r10 == 0) goto L_0x0148
            com.google.android.gms.internal.ads.zzgr$zza r10 = com.google.android.gms.internal.ads.zzgr.zzdl()
            com.google.android.gms.internal.ads.zzgr r0 = r9.zzdc()
            java.lang.String r0 = r0.zzdg()
            com.google.android.gms.internal.ads.zzgr$zza r10 = r10.zzaw(r0)
            com.google.android.gms.internal.ads.zzgr r0 = r9.zzdc()
            java.lang.String r0 = r0.zzdh()
            com.google.android.gms.internal.ads.zzgr$zza r10 = r10.zzax(r0)
            com.google.android.gms.internal.ads.zzgr r0 = r9.zzdc()
            long r2 = r0.zzdj()
            com.google.android.gms.internal.ads.zzgr$zza r10 = r10.zzdk(r2)
            com.google.android.gms.internal.ads.zzgr r0 = r9.zzdc()
            long r2 = r0.zzdk()
            com.google.android.gms.internal.ads.zzgr$zza r10 = r10.zzdl(r2)
            com.google.android.gms.internal.ads.zzgr r9 = r9.zzdc()
            long r2 = r9.zzdi()
            com.google.android.gms.internal.ads.zzgr$zza r9 = r10.zzdj(r2)
            com.google.android.gms.internal.ads.zzehz r9 = r9.zzbfx()
            com.google.android.gms.internal.ads.zzegp r9 = (com.google.android.gms.internal.ads.zzegp) r9
            com.google.android.gms.internal.ads.zzgr r9 = (com.google.android.gms.internal.ads.zzgr) r9
            int r10 = com.google.android.gms.internal.ads.zzdry.zzhkz
            com.google.android.gms.internal.ads.zzgr r10 = r8.zzei(r10)
            android.content.SharedPreferences r0 = r8.zzcld
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r10 == 0) goto L_0x0136
            java.lang.String r2 = r9.zzdg()
            java.lang.String r3 = r10.zzdg()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0136
            java.lang.String r2 = r8.zzawe()
            java.lang.String r10 = zza(r10)
            r0.putString(r2, r10)
        L_0x0136:
            java.lang.String r10 = r8.zzawf()
            java.lang.String r9 = zza(r9)
            r0.putString(r10, r9)
            boolean r9 = r0.commit()
            if (r9 == 0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r1 = 0
        L_0x0149:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            int r10 = com.google.android.gms.internal.ads.zzdry.zzhkz
            com.google.android.gms.internal.ads.zzgr r10 = r8.zzei(r10)
            if (r10 == 0) goto L_0x015e
            java.lang.String r10 = r10.zzdg()
            r9.add(r10)
        L_0x015e:
            int r10 = com.google.android.gms.internal.ads.zzdry.zzhla
            com.google.android.gms.internal.ads.zzgr r10 = r8.zzei(r10)
            if (r10 == 0) goto L_0x016d
            java.lang.String r10 = r10.zzdg()
            r9.add(r10)
        L_0x016d:
            java.io.File r10 = r8.zzawd()
            java.io.File[] r10 = r10.listFiles()
            int r0 = r10.length
        L_0x0176:
            if (r6 >= r0) goto L_0x0194
            r2 = r10[r6]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0191
            java.io.File r3 = r8.zzawd()
            java.io.File r2 = com.google.android.gms.internal.ads.zzdrp.zza((java.lang.String) r2, (java.io.File) r3)
            com.google.android.gms.internal.ads.zzdrp.zze(r2)
        L_0x0191:
            int r6 = r6 + 1
            goto L_0x0176
        L_0x0194:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrq.zza(com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzdrw):boolean");
    }

    private final File zzawd() {
        File file = new File(this.zzhks, Integer.toString(this.zzvy.zzv()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static String zza(zzgr zzgr) {
        return Hex.bytesToStringLowercase(zzgr.zzbda().toByteArray());
    }

    private final String zzawe() {
        int zzv = this.zzvy.zzv();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(zzv);
        return sb.toString();
    }

    private final String zzawf() {
        int zzv = this.zzvy.zzv();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(zzv);
        return sb.toString();
    }

    private final zzgr zzei(int i) {
        String str;
        if (i == zzdry.zzhkz) {
            str = this.zzcld.getString(zzawf(), (String) null);
        } else if (i == zzdry.zzhla) {
            str = this.zzcld.getString(zzawe(), (String) null);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            zzgr zzl = zzgr.zzl(zzeff.zzu(Hex.stringToBytes(str)));
            String zzdg = zzl.zzdg();
            if (zzdrp.zza(zzdg, "pcam", zzawd()).exists() && zzdrp.zza(zzdg, "pcbc", zzawd()).exists()) {
                return zzl;
            }
            return null;
        } catch (zzegz e) {
        }
    }
}
