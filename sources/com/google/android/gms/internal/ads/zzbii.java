package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbke;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzbii implements zzble {
    private static zzbii zzerm;

    /* access modifiers changed from: protected */
    public abstract zzdff zza(zzdgo zzdgo);

    public abstract Executor zzadj();

    public abstract ScheduledExecutorService zzadk();

    public abstract Executor zzadl();

    public abstract zzdvw zzadm();

    public abstract zzbvb zzadn();

    public abstract zzcji zzado();

    public abstract zzbkj zzadp();

    public abstract zzbod zzadq();

    public abstract zzbmv zzadr();

    public abstract zzdhq zzads();

    public abstract zzcau zzadt();

    public abstract zzcbq zzadu();

    public abstract zzcia zzadv();

    public abstract zzdko zzadw();

    public abstract zzcyh zzadx();

    public abstract zzcyk zzady();

    public abstract zzdma<zzchc> zzadz();

    public static zzbii zza(Context context, zzamu zzamu, int i) {
        zzbii zzf = zzf(context, i);
        zzf.zzado().zzb(zzamu);
        return zzf;
    }

    @Deprecated
    public static zzbii zzf(Context context, int i) {
        synchronized (zzbii.class) {
            if (zzerm == null) {
                return zza(new zzbbg(202006000, i, true, false), context, (zzbke.zza) new zzbjd());
            }
            zzbii zzbii = zzerm;
            return zzbii;
        }
    }

    @Deprecated
    private static zzbii zza(zzbbg zzbbg, Context context, zzbke.zza zza) {
        zzbii zzbii;
        synchronized (zzbii.class) {
            if (zzerm == null) {
                zzerm = new zzbjs().zzc(new zzbih(new zzbih.zza().zza(zzbbg).zzbw(context))).zza(new zzbke(zza)).zzafx();
                zzaat.initialize(context);
                zzp.zzkt().zzd(context, zzbbg);
                zzp.zzkv().initialize(context);
                zzp.zzkp().zzap(context);
                zzp.zzkp().zzaq(context);
                zzaxw.zzao(context);
                zzp.zzks().initialize(context);
                zzp.zzlk().initialize(context);
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue()) {
                    new zzcra(context, zzbbg, new zzto(new zztt(context)), new zzcqk(new zzcqi(context), zzerm.zzadm())).zzapt();
                }
            }
            zzbii = zzerm;
        }
        return zzbii;
    }

    public final zzdff zza(zzasp zzasp, int i) {
        return zza(new zzdgo(zzasp, i));
    }
}
