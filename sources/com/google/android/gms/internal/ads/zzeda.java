package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzeda extends ThreadLocal<Cipher> {
    zzeda() {
    }

    private static Cipher zzbcr() {
        try {
            return zzedt.zzhzm.zzhs("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return zzbcr();
    }
}
