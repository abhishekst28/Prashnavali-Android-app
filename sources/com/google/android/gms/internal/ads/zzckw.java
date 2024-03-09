package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.zzp;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzckw implements zzbsy, zzbtm, zzbwt {
    private final zzdlj zzeua;
    private final zzdkx zzflh;
    private final zzcli zzfns;
    private final zzdlt zzgex;
    private Boolean zzgey;
    private final boolean zzgez = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcwz)).booleanValue();
    private final Context zzvr;

    public zzckw(Context context, zzdlt zzdlt, zzcli zzcli, zzdlj zzdlj, zzdkx zzdkx) {
        this.zzvr = context;
        this.zzgex = zzdlt;
        this.zzfns = zzcli;
        this.zzeua = zzdlj;
        this.zzflh = zzdkx;
    }

    public final void onAdImpression() {
        if (zzaol()) {
            zzgh("impression").zzaop();
        }
    }

    public final void zzaiy() {
        if (zzaol()) {
            zzgh("adapter_impression").zzaop();
        }
    }

    public final void zzaja() {
        if (zzaol()) {
            zzgh("adapter_shown").zzaop();
        }
    }

    public final void zzh(zzuw zzuw) {
        if (this.zzgez) {
            zzclh zzgh = zzgh("ifts");
            zzgh.zzq("reason", "adapter");
            if (zzuw.errorCode >= 0) {
                zzgh.zzq("arec", String.valueOf(zzuw.errorCode));
            }
            String zzgu = this.zzgex.zzgu(zzuw.zzcgr);
            if (zzgu != null) {
                zzgh.zzq("areec", zzgu);
            }
            zzgh.zzaop();
        }
    }

    public final void zza(zzcbc zzcbc) {
        if (this.zzgez) {
            zzclh zzgh = zzgh("ifts");
            zzgh.zzq("reason", "exception");
            if (!TextUtils.isEmpty(zzcbc.getMessage())) {
                zzgh.zzq(NotificationCompat.CATEGORY_MESSAGE, zzcbc.getMessage());
            }
            zzgh.zzaop();
        }
    }

    public final void zzajk() {
        if (this.zzgez) {
            zzclh zzgh = zzgh("ifts");
            zzgh.zzq("reason", "blocked");
            zzgh.zzaop();
        }
    }

    private final boolean zzaol() {
        if (this.zzgey == null) {
            synchronized (this) {
                if (this.zzgey == null) {
                    zzaai zzaai = zzaat.zzcpv;
                    zzp.zzkp();
                    this.zzgey = Boolean.valueOf(zzf((String) zzwe.zzpu().zzd(zzaai), zzayh.zzbd(this.zzvr)));
                }
            }
        }
        return this.zzgey.booleanValue();
    }

    private static boolean zzf(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        try {
            return Pattern.matches(str, str2);
        } catch (RuntimeException e) {
            zzp.zzkt().zza(e, "CsiActionsListener.isPatternMatched");
            return false;
        }
    }

    private final zzclh zzgh(String str) {
        zzclh zzd = this.zzfns.zzaor().zza(this.zzeua.zzhbq.zzhbn).zzd(this.zzflh);
        zzd.zzq("action", str);
        if (!this.zzflh.zzhap.isEmpty()) {
            zzd.zzq("ancn", this.zzflh.zzhap.get(0));
        }
        return zzd;
    }
}
