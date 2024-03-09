package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzrp {
    private final int zzbtv;
    private final int zzbtw;
    private final int zzbtx;
    private final zzrq zzbty = new zzrt();

    public zzrp(int i) {
        this.zzbtw = i;
        this.zzbtv = 6;
        this.zzbtx = 0;
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            sb.append(((String) obj).toLowerCase(Locale.US));
            sb.append(10);
        }
        return zzbt(sb.toString());
    }

    private final String zzbt(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        zzrr zzrr = new zzrr();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzbtw, new zzrs(this));
        for (String zze : split) {
            String[] zze2 = zzru.zze(zze, false);
            if (zze2.length != 0) {
                zzrv.zza(zze2, this.zzbtw, this.zzbtv, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzrr.write(this.zzbty.zzbu(((zzry) it.next()).zzbuf));
            } catch (IOException e) {
                zzaxy.zzc("Error while writing hash to byteStream", e);
            }
        }
        return zzrr.toString();
    }
}
