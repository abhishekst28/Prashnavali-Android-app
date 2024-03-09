package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvi();
    public final int height;
    public final int heightPixels;
    public final int width;
    public final int widthPixels;
    public final String zzacx;
    public final boolean zzbrc;
    public final boolean zzchn;
    public final zzvj[] zzcho;
    public final boolean zzchp;
    public boolean zzchq;
    public boolean zzchr;
    private boolean zzchs;
    public boolean zzcht;
    public boolean zzchu;

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (((float) zzd(displayMetrics)) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        if (i <= 720) {
            return 50;
        }
        return 90;
    }

    public static zzvj zzpi() {
        return new zzvj("320x50_mb", 0, 0, false, 0, 0, (zzvj[]) null, true, false, false, false, false, false, false);
    }

    public static zzvj zzpj() {
        return new zzvj("reward_mb", 0, 0, true, 0, 0, (zzvj[]) null, false, false, false, false, false, false, false);
    }

    public static zzvj zzpk() {
        return new zzvj("interstitial_mb", 0, 0, false, 0, 0, (zzvj[]) null, false, false, false, false, true, false, false);
    }

    public zzvj() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzvj[]) null, false, false, false, false, false, false, false);
    }

    public static zzvj zzpl() {
        return new zzvj("invalid", 0, 0, false, 0, 0, (zzvj[]) null, false, false, false, true, false, false, false);
    }

    public zzvj(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzvj(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.zzchn = r0
            boolean r2 = r1.isFluid()
            r12.zzchp = r2
            boolean r2 = com.google.android.gms.ads.zzb.zza(r1)
            r12.zzcht = r2
            boolean r2 = com.google.android.gms.ads.zzb.zzb(r1)
            r12.zzchu = r2
            boolean r3 = r12.zzchp
            if (r3 == 0) goto L_0x002f
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getWidth()
            r12.width = r2
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getHeight()
            r12.height = r2
            goto L_0x004a
        L_0x002f:
            if (r2 == 0) goto L_0x003e
            int r2 = r1.getWidth()
            r12.width = r2
            int r2 = com.google.android.gms.ads.zzb.zzc(r1)
            r12.height = r2
            goto L_0x004a
        L_0x003e:
            int r2 = r1.getWidth()
            r12.width = r2
            int r2 = r1.getHeight()
            r12.height = r2
        L_0x004a:
            int r2 = r12.width
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0052
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            int r3 = r12.height
            r5 = -2
            if (r3 != r5) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x00a0
            com.google.android.gms.internal.ads.zzwe.zzpq()
            boolean r6 = com.google.android.gms.internal.ads.zzbat.zzbp(r13)
            if (r6 == 0) goto L_0x0085
            com.google.android.gms.internal.ads.zzwe.zzpq()
            boolean r6 = com.google.android.gms.internal.ads.zzbat.zzbq(r13)
            if (r6 == 0) goto L_0x0085
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.zzwe.zzpq()
            int r7 = com.google.android.gms.internal.ads.zzbat.zzbr(r13)
            int r6 = r6 - r7
            r12.widthPixels = r6
            goto L_0x008a
        L_0x0085:
            int r6 = r5.widthPixels
            r12.widthPixels = r6
        L_0x008a:
            int r6 = r12.widthPixels
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x009f
            int r8 = r8 + 1
        L_0x009f:
            goto L_0x00ad
        L_0x00a0:
            int r8 = r12.width
            com.google.android.gms.internal.ads.zzwe.zzpq()
            int r6 = r12.width
            int r6 = com.google.android.gms.internal.ads.zzbat.zza((android.util.DisplayMetrics) r5, (int) r6)
            r12.widthPixels = r6
        L_0x00ad:
            if (r3 == 0) goto L_0x00b4
            int r6 = zzd(r5)
            goto L_0x00b6
        L_0x00b4:
            int r6 = r12.height
        L_0x00b6:
            com.google.android.gms.internal.ads.zzwe.zzpq()
            int r5 = com.google.android.gms.internal.ads.zzbat.zza((android.util.DisplayMetrics) r5, (int) r6)
            r12.heightPixels = r5
            java.lang.String r5 = "_as"
            java.lang.String r7 = "x"
            r9 = 26
            if (r2 != 0) goto L_0x00fa
            if (r3 == 0) goto L_0x00ca
            goto L_0x00fa
        L_0x00ca:
            boolean r2 = r12.zzchu
            if (r2 == 0) goto L_0x00ea
            int r1 = r12.width
            int r2 = r12.height
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            r3.append(r1)
            r3.append(r7)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r12.zzacx = r1
            goto L_0x0111
        L_0x00ea:
            boolean r2 = r12.zzchp
            if (r2 == 0) goto L_0x00f3
            java.lang.String r1 = "320x50_mb"
            r12.zzacx = r1
            goto L_0x0111
        L_0x00f3:
            java.lang.String r1 = r1.toString()
            r12.zzacx = r1
            goto L_0x0111
        L_0x00fa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r8)
            r1.append(r7)
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r12.zzacx = r1
        L_0x0111:
            int r1 = r14.length
            if (r1 <= r4) goto L_0x012c
            int r1 = r14.length
            com.google.android.gms.internal.ads.zzvj[] r1 = new com.google.android.gms.internal.ads.zzvj[r1]
            r12.zzcho = r1
            r1 = 0
        L_0x011a:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x012b
            com.google.android.gms.internal.ads.zzvj[] r2 = r12.zzcho
            com.google.android.gms.internal.ads.zzvj r3 = new com.google.android.gms.internal.ads.zzvj
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.AdSize) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x011a
        L_0x012b:
            goto L_0x012f
        L_0x012c:
            r13 = 0
            r12.zzcho = r13
        L_0x012f:
            r12.zzbrc = r0
            r12.zzchq = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvj.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    zzvj(String str, int i, int i2, boolean z, int i3, int i4, zzvj[] zzvjArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.zzacx = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzchn = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzcho = zzvjArr;
        this.zzbrc = z2;
        this.zzchp = z3;
        this.zzchq = z4;
        this.zzchr = z5;
        this.zzchs = z6;
        this.zzcht = z7;
        this.zzchu = z8;
    }

    public final AdSize zzpm() {
        return zzb.zza(this.width, this.height, this.zzacx);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzacx, false);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.heightPixels);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzchn);
        SafeParcelWriter.writeInt(parcel, 6, this.width);
        SafeParcelWriter.writeInt(parcel, 7, this.widthPixels);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzcho, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbrc);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzchp);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzchq);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzchr);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzchs);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzcht);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzchu);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
