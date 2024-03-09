package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzrq {
    private static MessageDigest zzbtz = null;
    protected Object mLock = new Object();

    /* access modifiers changed from: package-private */
    public abstract byte[] zzbu(String str);

    /* access modifiers changed from: protected */
    public final MessageDigest zzmq() {
        synchronized (this.mLock) {
            if (zzbtz != null) {
                MessageDigest messageDigest = zzbtz;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzbtz = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException e) {
                }
            }
            MessageDigest messageDigest2 = zzbtz;
            return messageDigest2;
        }
    }
}
