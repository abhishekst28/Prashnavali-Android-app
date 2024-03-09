package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzeg;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzn extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ zzj zzbpi;

    private zzn(zzj zzj) {
        this.zzbpi = zzj;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzeg unused = this.zzbpi.zzbpg = (zzeg) this.zzbpi.zzbpc.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbbd.zzd("", e);
        }
        return this.zzbpi.zzkj();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.zzbpi.zzbpe != null && str != null) {
            this.zzbpi.zzbpe.loadUrl(str);
        }
    }

    /* synthetic */ zzn(zzj zzj, zzm zzm) {
        this(zzj);
    }
}
