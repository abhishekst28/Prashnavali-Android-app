package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.ads.zzegp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class zzegc {
    private static volatile boolean zzick = false;
    private static boolean zzicl = true;
    private static volatile zzegc zzicm;
    private static volatile zzegc zzicn;
    private static final zzegc zzico = new zzegc(true);
    private final Map<zza, zzegp.zzf<?, ?>> zzicp;

    public static zzegc zzbex() {
        zzegc zzegc = zzicm;
        if (zzegc == null) {
            synchronized (zzegc.class) {
                zzegc = zzicm;
                if (zzegc == null) {
                    zzegc = zzico;
                    zzicm = zzegc;
                }
            }
        }
        return zzegc;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * SupportMenu.USER_MASK) + this.number;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            if (this.object == zza.object && this.number == zza.number) {
                return true;
            }
            return false;
        }
    }

    public static zzegc zzbey() {
        Class<zzegc> cls = zzegc.class;
        zzegc zzegc = zzicn;
        if (zzegc != null) {
            return zzegc;
        }
        synchronized (cls) {
            zzegc zzegc2 = zzicn;
            if (zzegc2 != null) {
                return zzegc2;
            }
            zzegc zzc = zzegn.zzc(cls);
            zzicn = zzc;
            return zzc;
        }
    }

    public final <ContainingType extends zzehz> zzegp.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return this.zzicp.get(new zza(containingtype, i));
    }

    zzegc() {
        this.zzicp = new HashMap();
    }

    private zzegc(boolean z) {
        this.zzicp = Collections.emptyMap();
    }
}
