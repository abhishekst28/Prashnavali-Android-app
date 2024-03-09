package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcuk<AdT> implements zzduv<zzdlj, AdT> {
    private final Executor executor;
    private final zzdps zzfli;
    private final ScheduledExecutorService zzfnh;
    private final zzdpf zzfqo;
    private final zzbsx zzfue;
    private final zzbpi<AdT> zzgnm;
    private final zzcud zzgnn;

    public zzcuk(zzdpf zzdpf, zzcud zzcud, zzbsx zzbsx, zzdps zzdps, zzbpi<AdT> zzbpi, Executor executor2, ScheduledExecutorService scheduledExecutorService) {
        this.zzfqo = zzdpf;
        this.zzgnn = zzcud;
        this.zzfue = zzbsx;
        this.zzfli = zzdps;
        this.zzgnm = zzbpi;
        this.executor = executor2;
        this.zzfnh = scheduledExecutorService;
    }

    public final /* synthetic */ zzdvt zzf(Object obj) throws Exception {
        zzdlj zzdlj = (zzdlj) obj;
        zzdos<E, I> zzauz = this.zzfqo.zzu(zzdpg.RENDER_CONFIG_INIT).zze(zzdvl.immediateFailedFuture(new zzcuh(zzdmd.zzhcq, "No ad config."))).zzauz();
        this.zzfue.zza(new zzblo(zzdlj, this.zzfli), this.executor);
        int i = 0;
        for (zzdkx next : zzdlj.zzhbq.zzhbm) {
            Iterator<String> it = next.zzhaf.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next2 = it.next();
                    zzcre<AdT> zze = this.zzgnm.zze(next.zzhag, next2);
                    if (zze != null && zze.zza(zzdlj, next)) {
                        zzdox<I> zza = this.zzfqo.zza(zzdpg.RENDER_CONFIG_WATERFALL, zzauz);
                        StringBuilder sb = new StringBuilder(String.valueOf(next2).length() + 26);
                        sb.append("render-config-");
                        sb.append(i);
                        sb.append("-");
                        sb.append(next2);
                        zzauz = zza.zzgx(sb.toString()).zza(Throwable.class, new zzcuj(this, zzdlj, next, zze)).zzauz();
                        break;
                    }
                } else {
                    break;
                }
            }
            i++;
        }
        return zzauz;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdlj zzdlj, zzdkx zzdkx, zzcre zzcre, Throwable th) throws Exception {
        return this.zzgnn.zza(zzdlj.zzhbq.zzhbn, zzdkx, zzdvl.zza(zzcre.zzb(zzdlj, zzdkx), (long) zzdkx.zzhax, TimeUnit.MILLISECONDS, this.zzfnh));
    }
}
