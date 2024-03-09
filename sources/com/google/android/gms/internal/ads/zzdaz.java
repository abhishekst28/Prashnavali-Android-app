package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdaz implements zzden<zzdaw> {
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzdaz(zzdvw zzdvw, Context context) {
        this.zzgay = zzdvw;
        this.zzvr = context;
    }

    public final zzdvt<zzdaw> zzaqs() {
        return this.zzgay.zze(new zzday(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdaw zzaqw() throws Exception {
        AudioManager audioManager = (AudioManager) this.zzvr.getSystemService("audio");
        return new zzdaw(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzp.zzku().zzqd(), zzp.zzku().zzqe());
    }
}
