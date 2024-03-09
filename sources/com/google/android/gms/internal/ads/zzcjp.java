package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zztw;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcjp implements zzelo<zzto> {
    private final zzelx<Context> zzert;
    private final zzelx<zztw.zza.C0016zza> zzfne;
    private final zzelx<String> zzfsc;
    private final zzelx<zzbbg> zzfsr;
    private final zzelx<String> zzgec;

    private zzcjp(zzelx<Context> zzelx, zzelx<String> zzelx2, zzelx<zzbbg> zzelx3, zzelx<zztw.zza.C0016zza> zzelx4, zzelx<String> zzelx5) {
        this.zzert = zzelx;
        this.zzfsc = zzelx2;
        this.zzfsr = zzelx3;
        this.zzfne = zzelx4;
        this.zzgec = zzelx5;
    }

    public static zzcjp zze(zzelx<Context> zzelx, zzelx<String> zzelx2, zzelx<zzbbg> zzelx3, zzelx<zztw.zza.C0016zza> zzelx4, zzelx<String> zzelx5) {
        return new zzcjp(zzelx, zzelx2, zzelx3, zzelx4, zzelx5);
    }

    public final /* synthetic */ Object get() {
        String str = this.zzfsc.get();
        zzbbg zzbbg = this.zzfsr.get();
        zztw.zza.C0016zza zza = this.zzfne.get();
        String str2 = this.zzgec.get();
        zzto zzto = new zzto(new zztt(this.zzert.get()));
        zzto.zza((zztn) new zzcjq(zza, str, (zztw.zzu) ((zzegp) zztw.zzu.zzor().zzcq(zzbbg.zzedq).zzcr(zzbbg.zzedr).zzcs(zzbbg.zzeds ? 0 : 2).zzbfx()), str2));
        return (zzto) zzelu.zza(zzto, "Cannot return null from a non-@Nullable @Provides method");
    }
}
