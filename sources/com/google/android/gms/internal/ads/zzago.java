package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzago implements zzahf<Object> {
    private final zzagn zzddw;

    public zzago(zzagn zzagn) {
        this.zzddw = zzagn;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzaxy.zzfe("App event with no name parameter.");
        } else {
            this.zzddw.onAppEvent(str, map.get("info"));
        }
    }
}
