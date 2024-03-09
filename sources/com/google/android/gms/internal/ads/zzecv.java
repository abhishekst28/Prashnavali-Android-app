package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzecv implements zzeed {
    private static final ThreadLocal<Cipher> zzhxz = new zzecy();
    private final SecretKeySpec zzhya;
    private final int zzhyb;
    private final int zzhyc;

    public zzecv(byte[] bArr, int i) throws GeneralSecurityException {
        zzeej.zzfp(bArr.length);
        this.zzhya = new SecretKeySpec(bArr, "AES");
        int blockSize = zzhxz.get().getBlockSize();
        this.zzhyc = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzhyb = i;
    }

    public final byte[] zzo(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzhyb;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] zzfo = zzeei.zzfo(i);
            System.arraycopy(zzfo, 0, bArr2, 0, this.zzhyb);
            int length2 = bArr.length;
            int i2 = this.zzhyb;
            Cipher cipher = zzhxz.get();
            byte[] bArr3 = new byte[this.zzhyc];
            System.arraycopy(zzfo, 0, bArr3, 0, this.zzhyb);
            cipher.init(1, this.zzhya, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(Integer.MAX_VALUE - this.zzhyb);
        throw new GeneralSecurityException(sb.toString());
    }
}
