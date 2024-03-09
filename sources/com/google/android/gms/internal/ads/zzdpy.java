package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzdpy {
    private static volatile zzbw.zza.zzc zzhiv = zzbw.zza.zzc.UNKNOWN;
    private final Executor executor;
    private final Task<zztt> zzhiu;
    private final Context zzvr;

    static void zzb(zzbw.zza.zzc zzc) {
        zzhiv = zzc;
    }

    public static zzdpy zza(Context context, Executor executor2) {
        return new zzdpy(context, executor2, Tasks.call(executor2, new zzdqa(context)));
    }

    private zzdpy(Context context, Executor executor2, Task<zztt> task) {
        this.zzvr = context;
        this.executor = executor2;
        this.zzhiu = task;
    }

    public final Task<Boolean> zzg(int i, long j) {
        return zza(i, j, (Exception) null, (String) null, (Map<String, String>) null, (String) null);
    }

    public final Task<Boolean> zza(int i, long j, Exception exc) {
        return zza(i, j, exc, (String) null, (Map<String, String>) null, (String) null);
    }

    public final Task<Boolean> zza(int i, long j, String str, Map<String, String> map) {
        return zza(i, j, (Exception) null, str, (Map<String, String>) null, (String) null);
    }

    public final Task<Boolean> zzg(int i, String str) {
        return zza(4007, 0, (Exception) null, (String) null, (Map<String, String>) null, str);
    }

    private final Task<Boolean> zza(int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        zzbw.zza.C0001zza zzc = zzbw.zza.zzs().zzk(this.zzvr.getPackageName()).zzc(j);
        zzc.zza(zzhiv);
        if (exc != null) {
            zzc.zzl(zzdsy.zza(exc)).zzm(exc.getClass().getName());
        }
        if (str2 != null) {
            zzc.zzn(str2);
        }
        if (str != null) {
            zzc.zzo(str);
        }
        return this.zzhiu.continueWith(this.executor, new zzdpz(zzc, i));
    }

    static final /* synthetic */ Boolean zza(zzbw.zza.C0001zza zza, int i, Task task) throws Exception {
        if (!task.isSuccessful()) {
            return false;
        }
        zztx zzf = ((zztt) task.getResult()).zzf(((zzbw.zza) ((zzegp) zza.zzbfx())).toByteArray());
        zzf.zzby(i);
        zzf.zzdv();
        return true;
    }

    static final /* synthetic */ zztt zzci(Context context) throws Exception {
        return new zztt(context, "GLAS", (String) null);
    }
}
