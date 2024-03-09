package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcqm implements zzdvi<SQLiteDatabase> {
    private final /* synthetic */ zzdoq zzgjw;

    zzcqm(zzcqk zzcqk, zzdoq zzdoq) {
        this.zzgjw = zzdoq;
    }

    public final void zzb(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        zzaxy.zzfc(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        try {
            this.zzgjw.apply((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzaxy.zzfc(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }
}
