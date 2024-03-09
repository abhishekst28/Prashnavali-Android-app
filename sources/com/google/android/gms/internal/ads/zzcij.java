package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zza;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcij {
    private final zzavu zzboc;
    private final zzeg zzenn;
    private final Executor zzfmk;
    /* access modifiers changed from: private */
    public final zzbtu zzfqj;
    private final zzbur zzfvb;
    private final zzbst zzfvv;
    private final zzbma zzfvw;
    private final zzbyr zzfvy;
    private final zzbui zzgcs;
    private final zzbws zzgct;
    private final zza zzgdh;
    private final zzbto zzgdi;
    /* access modifiers changed from: private */
    public final zzbwl zzgdj;

    public zzcij(zzbst zzbst, zzbtu zzbtu, zzbui zzbui, zzbur zzbur, zzbws zzbws, Executor executor, zzbyr zzbyr, zzbma zzbma, zza zza, zzbto zzbto, zzavu zzavu, zzeg zzeg, zzbwl zzbwl) {
        this.zzfvv = zzbst;
        this.zzfqj = zzbtu;
        this.zzgcs = zzbui;
        this.zzfvb = zzbur;
        this.zzgct = zzbws;
        this.zzfmk = executor;
        this.zzfvy = zzbyr;
        this.zzfvw = zzbma;
        this.zzgdh = zza;
        this.zzgdi = zzbto;
        this.zzboc = zzavu;
        this.zzenn = zzeg;
        this.zzgdj = zzbwl;
    }

    public final void zzb(zzbfq zzbfq, boolean z) {
        zzdw zzca;
        zzbfq.zzabe().zza(new zzcim(this), this.zzgcs, this.zzfvb, new zzcil(this), new zzcio(this), z, (zzahi) null, this.zzgdh, new zzcit(this), this.zzboc);
        zzbfq.setOnTouchListener(new zzcin(this));
        zzbfq.setOnClickListener(new zzciq(this));
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqn)).booleanValue() && (zzca = this.zzenn.zzca()) != null) {
            zzca.zzb(zzbfq.getView());
        }
        this.zzfvy.zza(zzbfq, this.zzfmk);
        this.zzfvy.zza(new zzcip(zzbfq), this.zzfmk);
        this.zzfvy.zzv(zzbfq.getView());
        zzbfq.zza("/trackActiveViewUnit", (zzahf<? super zzbfq>) new zzcis(this, zzbfq));
        this.zzfvw.zzo(zzbfq);
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcnx)).booleanValue()) {
            zzbto zzbto = this.zzgdi;
            zzbfq.getClass();
            zzbto.zza(zzcir.zzn(zzbfq), this.zzfmk);
        }
    }

    public static zzdvt<?> zza(zzbfq zzbfq, String str, String str2) {
        zzbbq zzbbq = new zzbbq();
        zzbfq.zzabe().zza((zzbhf) new zzciu(zzbbq));
        zzbfq.zzb(str, str2, (String) null);
        return zzbbq;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbfq zzbfq, zzbfq zzbfq2, Map map) {
        this.zzfvw.zzf(zzbfq);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzae(View view) {
        this.zzgdh.recordClick();
        zzavu zzavu = this.zzboc;
        if (zzavu != null) {
            zzavu.zzvp();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zza(View view, MotionEvent motionEvent) {
        this.zzgdh.recordClick();
        zzavu zzavu = this.zzboc;
        if (zzavu == null) {
            return false;
        }
        zzavu.zzvp();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzann() {
        this.zzfqj.onAdLeftApplication();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str, String str2) {
        this.zzgct.onAppEvent(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzano() {
        this.zzfvv.onAdClicked();
    }
}
