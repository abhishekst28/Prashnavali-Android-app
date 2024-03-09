package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzds implements zzdrw {
    private final /* synthetic */ zzdpx zzwe;

    zzds(zzdp zzdp, zzdpx zzdpx) {
        this.zzwe = zzdpx;
    }

    public final boolean zzb(File file) {
        try {
            return this.zzwe.zzb(file);
        } catch (GeneralSecurityException e) {
            return false;
        }
    }
}
