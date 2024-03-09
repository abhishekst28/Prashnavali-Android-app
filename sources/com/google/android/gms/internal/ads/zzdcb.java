package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdcb implements Callable {
    private final zzdby zzgty;

    zzdcb(zzdby zzdby) {
        this.zzgty = zzdby;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        zzp.zzkp();
        zzrk zzwx = zzp.zzkt().zzwj().zzwx();
        Bundle bundle = null;
        if (!(zzwx == null || zzwx == null || (zzp.zzkt().zzwj().zzwy() && zzp.zzkt().zzwj().zzxa()))) {
            if (zzwx.zzmk()) {
                zzwx.wakeup();
            }
            zzre zzmi = zzwx.zzmi();
            if (zzmi != null) {
                str2 = zzmi.zzlx();
                str = zzmi.zzly();
                str3 = zzmi.zzlz();
                if (str2 != null) {
                    zzp.zzkt().zzwj().zzej(str2);
                }
                if (str3 != null) {
                    zzp.zzkt().zzwj().zzek(str3);
                }
            } else {
                str2 = zzp.zzkt().zzwj().zzwz();
                str3 = zzp.zzkt().zzwj().zzxb();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!zzp.zzkt().zzwj().zzxa()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", str3);
                }
            }
            if (str2 != null && !zzp.zzkt().zzwj().zzwy()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new zzdbz(bundle);
    }
}
