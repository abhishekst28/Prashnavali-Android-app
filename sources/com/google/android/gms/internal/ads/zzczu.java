package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczu implements zzden<zzczv> {
    private final zzaxk zzbps;
    private final zzdln zzfqn;
    private final zzden<zzdeq> zzgsl;
    private final Context zzvr;

    public zzczu(zzdbj<zzdeq> zzdbj, zzdln zzdln, Context context, zzaxk zzaxk) {
        this.zzgsl = zzdbj;
        this.zzfqn = zzdln;
        this.zzvr = context;
        this.zzbps = zzaxk;
    }

    public final zzdvt<zzczv> zzaqs() {
        return zzdvl.zzb(this.zzgsl.zzaqs(), new zzczx(this), (Executor) zzbbi.zzedz);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzczv zza(zzdeq zzdeq) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        int i4;
        int i5;
        DisplayMetrics displayMetrics;
        zzvj zzvj = this.zzfqn.zzbpb;
        if (zzvj.zzcho != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzvj zzvj2 : zzvj.zzcho) {
                if (!zzvj2.zzchp && !z2) {
                    str = zzvj2.zzacx;
                    z2 = true;
                }
                if (zzvj2.zzchp && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzvj.zzacx;
            z = zzvj.zzchp;
        }
        Resources resources = this.zzvr.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i6 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.zzbps.zzwj().zzxk();
            i2 = i6;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        if (zzvj.zzcho != null) {
            boolean z4 = false;
            for (zzvj zzvj3 : zzvj.zzcho) {
                if (zzvj3.zzchp) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    if (zzvj3.width != -1 || f == 0.0f) {
                        i4 = zzvj3.width;
                    } else {
                        i4 = (int) (((float) zzvj3.widthPixels) / f);
                    }
                    sb.append(i4);
                    sb.append("x");
                    if (zzvj3.height == -2) {
                        if (f != 0.0f) {
                            i5 = (int) (((float) zzvj3.heightPixels) / f);
                            sb.append(i5);
                        }
                    }
                    i5 = zzvj3.height;
                    sb.append(i5);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzczv(zzvj, str, z, sb.toString(), f, i2, i, str2, this.zzfqn.zzgso);
    }
}
