package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbke {
    private zza zzfki;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static abstract class zza {
        public abstract zzbfd zzaed();

        public abstract zzbco zzaee();

        public abstract zztt zzaef();

        public abstract zzavw zzaeg();

        public abstract zzaqs zzaeh();

        public abstract zzamh zzaei();

        public abstract zzaby zzaej();
    }

    public zzbke(zza zza2) {
        this.zzfki = zza2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzavx, com.google.android.gms.internal.ads.zzavr] */
    public final zzb zzagn() {
        zza zza2 = this.zzfki;
        return new zzb(zza2.zzaed(), zza2.zzaee(), new zzavr(zza2.zzaeg()), zza2.zzaef(), zza2.zzaeh(), zza2.zzaej());
    }

    public final zzavw zzaeg() {
        return this.zzfki.zzaeg();
    }

    public final zzaqs zzaeh() {
        return this.zzfki.zzaeh();
    }

    public final zzamh zzaei() {
        return this.zzfki.zzaei();
    }

    public final zzaby zzaej() {
        return this.zzfki.zzaej();
    }
}
