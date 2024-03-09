package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdze {
    public static void zza(zzeba zzeba) throws GeneralSecurityException {
        zzedq.zza(zza(zzeba.zzazx().zzbak()));
        zza(zzeba.zzazx().zzbal());
        if (zzeba.zzazz() != zzeau.UNKNOWN_FORMAT) {
            zzdxm.zza(zzeba.zzazy().zzazs());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String zza(zzebj zzebj) throws NoSuchAlgorithmException {
        int i = zzdzd.zzhsu[zzebj.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzebj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static zzeds zza(zzebi zzebi) throws GeneralSecurityException {
        int i = zzdzd.zzhsv[zzebi.ordinal()];
        if (i == 1) {
            return zzeds.NIST_P256;
        }
        if (i == 2) {
            return zzeds.NIST_P384;
        }
        if (i == 3) {
            return zzeds.NIST_P521;
        }
        String valueOf = String.valueOf(zzebi);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static zzedr zza(zzeau zzeau) throws GeneralSecurityException {
        int i = zzdzd.zzhsw[zzeau.ordinal()];
        if (i == 1) {
            return zzedr.UNCOMPRESSED;
        }
        if (i == 2) {
            return zzedr.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i == 3) {
            return zzedr.COMPRESSED;
        }
        String valueOf = String.valueOf(zzeau);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }
}
