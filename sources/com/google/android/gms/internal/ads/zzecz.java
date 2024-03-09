package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzecz extends ThreadLocal<Cipher> {
    zzecz() {
    }

    private static Cipher zzbcr() {
        try {
            return zzedt.zzhzm.zzhs("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return zzbcr();
    }
}
