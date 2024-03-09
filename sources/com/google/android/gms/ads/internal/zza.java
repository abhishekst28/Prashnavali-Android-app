package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzayh;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zza {
    private boolean zzbob;
    private zzavu zzboc;
    private zzasa zzbod = null;
    private final Context zzvr;

    public zza(Context context, zzavu zzavu, zzasa zzasa) {
        this.zzvr = context;
        this.zzboc = zzavu;
        if (0 == 0) {
            this.zzbod = new zzasa();
        }
    }

    private final boolean zzjw() {
        zzavu zzavu = this.zzboc;
        return (zzavu != null && zzavu.zzvn().zzdwm) || this.zzbod.zzdsw;
    }

    public final void recordClick() {
        this.zzbob = true;
    }

    public final boolean zzjx() {
        return !zzjw() || this.zzbob;
    }

    public final void zzbo(String str) {
        if (zzjw()) {
            if (str == null) {
                str = "";
            }
            zzavu zzavu = this.zzboc;
            if (zzavu != null) {
                zzavu.zza(str, (Map<String, String>) null, 3);
            } else if (this.zzbod.zzdsw && this.zzbod.zzdsx != null) {
                for (String next : this.zzbod.zzdsx) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzp.zzkp();
                        zzayh.zzb(this.zzvr, "", replace);
                    }
                }
            }
        }
    }
}
