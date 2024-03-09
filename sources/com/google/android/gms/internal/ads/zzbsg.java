package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbsg {
    private final zzdln zzfqn;
    private Bundle zzfsj;
    private final String zzfsk;
    private final zzdli zzfsl;
    private final Context zzvr;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static class zza {
        /* access modifiers changed from: private */
        public zzdln zzfqn;
        /* access modifiers changed from: private */
        public Bundle zzfsj;
        /* access modifiers changed from: private */
        public String zzfsk;
        /* access modifiers changed from: private */
        public zzdli zzfsl;
        /* access modifiers changed from: private */
        public Context zzvr;

        public final zza zzcd(Context context) {
            this.zzvr = context;
            return this;
        }

        public final zza zza(zzdln zzdln) {
            this.zzfqn = zzdln;
            return this;
        }

        public final zza zzf(Bundle bundle) {
            this.zzfsj = bundle;
            return this;
        }

        public final zza zzfx(String str) {
            this.zzfsk = str;
            return this;
        }

        public final zzbsg zzajj() {
            return new zzbsg(this);
        }

        public final zza zza(zzdli zzdli) {
            this.zzfsl = zzdli;
            return this;
        }
    }

    private zzbsg(zza zza2) {
        this.zzvr = zza2.zzvr;
        this.zzfqn = zza2.zzfqn;
        this.zzfsj = zza2.zzfsj;
        this.zzfsk = zza2.zzfsk;
        this.zzfsl = zza2.zzfsl;
    }

    /* access modifiers changed from: package-private */
    public final zza zzaje() {
        return new zza().zzcd(this.zzvr).zza(this.zzfqn).zzfx(this.zzfsk).zzf(this.zzfsj);
    }

    /* access modifiers changed from: package-private */
    public final zzdln zzajf() {
        return this.zzfqn;
    }

    /* access modifiers changed from: package-private */
    public final zzdli zzajg() {
        return this.zzfsl;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzajh() {
        return this.zzfsj;
    }

    /* access modifiers changed from: package-private */
    public final String zzaji() {
        return this.zzfsk;
    }

    /* access modifiers changed from: package-private */
    public final Context zzcc(Context context) {
        if (this.zzfsk != null) {
            return context;
        }
        return this.zzvr;
    }
}
