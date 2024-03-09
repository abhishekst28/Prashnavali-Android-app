package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzabk {
    private final Object lock = new Object();
    boolean zzcys = true;
    private final List<zzabi> zzcyt = new LinkedList();
    private final Map<String, String> zzcyu = new LinkedHashMap();
    private zzabk zzcyv;

    public zzabk(boolean z, String str, String str2) {
        this.zzcyu.put("action", str);
        this.zzcyu.put("ad_format", str2);
    }

    public final void zzc(zzabk zzabk) {
        synchronized (this.lock) {
            this.zzcyv = zzabk;
        }
    }

    public final zzabi zzex(long j) {
        if (!this.zzcys) {
            return null;
        }
        return new zzabi(j, (String) null, (zzabi) null);
    }

    public final boolean zza(zzabi zzabi, long j, String... strArr) {
        synchronized (this.lock) {
            for (String zzabi2 : strArr) {
                this.zzcyt.add(new zzabi(j, zzabi2, zzabi));
            }
        }
        return true;
    }

    public final String zzrq() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.lock) {
            for (zzabi next : this.zzcyt) {
                long time = next.getTime();
                String zzrn = next.zzrn();
                zzabi zzro = next.zzro();
                if (zzro != null && time > 0) {
                    sb2.append(zzrn);
                    sb2.append('.');
                    sb2.append(time - zzro.getTime());
                    sb2.append(',');
                }
            }
            this.zzcyt.clear();
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final void zzh(String str, String str2) {
        zzaba zzwd;
        if (this.zzcys && !TextUtils.isEmpty(str2) && (zzwd = zzp.zzkt().zzwd()) != null) {
            synchronized (this.lock) {
                zzabe zzcu = zzwd.zzcu(str);
                Map<String, String> map = this.zzcyu;
                map.put(str, zzcu.zzg(map.get(str), str2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> zzrr() {
        synchronized (this.lock) {
            zzaba zzwd = zzp.zzkt().zzwd();
            if (zzwd != null) {
                if (this.zzcyv != null) {
                    Map<String, String> zza = zzwd.zza(this.zzcyu, this.zzcyv.zzrr());
                    return zza;
                }
            }
            Map<String, String> map = this.zzcyu;
            return map;
        }
    }
}
