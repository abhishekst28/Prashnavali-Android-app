package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzzc extends zzxu {
    private final String description;
    private final String zzckh;

    public zzzc(String str, String str2) {
        this.description = str;
        this.zzckh = str2;
    }

    public final String getDescription() throws RemoteException {
        return this.description;
    }

    public final String zzqh() throws RemoteException {
        return this.zzckh;
    }
}
