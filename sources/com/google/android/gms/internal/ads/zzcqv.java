package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.ads.zztw;
import com.google.firebase.database.core.ServerValues;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcqv implements zzdoq {
    private final boolean zzegf;
    private final zzcqw zzgkp;
    private final ArrayList zzgkq;
    private final zztw.zzm zzgkr;
    private final zztw.zzo.zzb zzgks;

    zzcqv(zzcqw zzcqw, boolean z, ArrayList arrayList, zztw.zzm zzm, zztw.zzo.zzb zzb) {
        this.zzgkp = zzcqw;
        this.zzegf = z;
        this.zzgkq = arrayList;
        this.zzgkr = zzm;
        this.zzgks = zzb;
    }

    public final Object apply(Object obj) {
        zzcqw zzcqw = this.zzgkp;
        boolean z = this.zzegf;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte[] zza = zzcqw.zzgku.zza(z, this.zzgkq, this.zzgkr, this.zzgks);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(zzp.zzkw().currentTimeMillis()));
        contentValues.put("serialized_proto_data", zza);
        sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
        if (!z) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
        }
        return null;
    }
}
