package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfe {
    private final ArrayList<zzop> zzelg = new ArrayList<>();
    private long zzelh;

    zzbfe() {
    }

    /* access modifiers changed from: package-private */
    public final long zzaau() {
        Iterator<zzop> it = this.zzelg.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> responseHeaders = it.next().getResponseHeaders();
            if (responseHeaders != null) {
                for (Map.Entry next : responseHeaders.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.zzelh = Math.max(this.zzelh, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException e) {
                    }
                }
                it.remove();
            }
        }
        return this.zzelh;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzop zzop) {
        this.zzelg.add(zzop);
    }
}
