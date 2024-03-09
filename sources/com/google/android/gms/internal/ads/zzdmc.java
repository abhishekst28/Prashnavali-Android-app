package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdmc implements Runnable {
    private final InputStream zzhcm;
    private final ParcelFileDescriptor zzhcn;

    zzdmc(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.zzhcm = inputStream;
        this.zzhcn = parcelFileDescriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        com.google.android.gms.internal.ads.zzeeo.zza(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0012, B:21:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.zzhcm
            android.os.ParcelFileDescriptor r1 = r3.zzhcn
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r2 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ all -> 0x0021 }
            r2.<init>(r1)     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.util.IOUtils.copyStream(r0, r2)     // Catch:{ all -> 0x0017 }
            r2.close()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0016
            r0.close()     // Catch:{ IOException -> 0x002d }
            return
        L_0x0016:
            return
        L_0x0017:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x001c }
            goto L_0x0020
        L_0x001c:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzeeo.zza((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0021 }
        L_0x0020:
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r1 = move-exception
            if (r0 == 0) goto L_0x002c
            r0.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzeeo.zza((java.lang.Throwable) r1, (java.lang.Throwable) r0)     // Catch:{ IOException -> 0x002d }
        L_0x002c:
            throw r1     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r0 = move-exception
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmc.run():void");
    }
}
