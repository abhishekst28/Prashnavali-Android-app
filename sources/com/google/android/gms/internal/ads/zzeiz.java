package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeiz extends zzeja<FieldDescriptorType, Object> {
    zzeiz(int i) {
        super(i, (zzeiz) null);
    }

    public final void zzbdg() {
        if (!isImmutable()) {
            for (int i = 0; i < zzbhq(); i++) {
                Map.Entry zzhp = zzhp(i);
                if (((zzegk) zzhp.getKey()).zzbfg()) {
                    zzhp.setValue(Collections.unmodifiableList((List) zzhp.getValue()));
                }
            }
            for (Map.Entry entry : zzbhr()) {
                if (((zzegk) entry.getKey()).zzbfg()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzbdg();
    }
}
