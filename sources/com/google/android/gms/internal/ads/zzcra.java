package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.ads.zztq;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcra {
    private zzbbg zzdpq;
    private zzcqk zzgkl;
    private zzto zzgkx;
    private Context zzvr;

    public zzcra(Context context, zzbbg zzbbg, zzto zzto, zzcqk zzcqk) {
        this.zzvr = context;
        this.zzdpq = zzbbg;
        this.zzgkx = zzto;
        this.zzgkl = zzcqk;
    }

    public final void zzapt() {
        try {
            this.zzgkl.zza(new zzcqz(this));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzaxy.zzfc(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzb(SQLiteDatabase sQLiteDatabase) throws Exception {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ArrayList<zztw.zzo.zza> zza = zzcqx.zza(sQLiteDatabase);
        int i = 0;
        zztw.zzo zzo = (zztw.zzo) ((zzegp) zztw.zzo.zzok().zzce(this.zzvr.getPackageName()).zzcf(Build.MODEL).zzco(zzcqx.zza(sQLiteDatabase2, 0)).zzf(zza).zzcp(zzcqx.zza(sQLiteDatabase2, 1)).zzev(zzp.zzkw().currentTimeMillis()).zzew(zzcqx.zzb(sQLiteDatabase2, 2)).zzbfx());
        ArrayList arrayList = zza;
        int size = arrayList.size();
        long j = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zztw.zzo.zza zza2 = (zztw.zzo.zza) obj;
            if (zza2.zzoh() == zzug.ENUM_TRUE && zza2.getTimestamp() > j) {
                j = zza2.getTimestamp();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
            sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
        this.zzgkx.zza((zztn) new zzcrc(zzo));
        zztw.zzu.zza zzcr = zztw.zzu.zzor().zzcq(this.zzdpq.zzedq).zzcr(this.zzdpq.zzedr);
        if (!this.zzdpq.zzeds) {
            i = 2;
        }
        this.zzgkx.zza((zztn) new zzcrb((zztw.zzu) ((zzegp) zzcr.zzcs(i).zzbfx())));
        this.zzgkx.zza(zztq.zza.zzb.OFFLINE_UPLOAD);
        sQLiteDatabase2.delete("offline_signal_contents", (String) null, (String[]) null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
