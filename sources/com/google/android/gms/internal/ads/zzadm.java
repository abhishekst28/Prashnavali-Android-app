package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzadm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzadm> CREATOR = new zzadl();
    public final int versionCode;
    public final int zzbnj;
    public final int zzbnk;
    public final boolean zzbnl;
    public final int zzbnm;
    public final boolean zzbno;
    public final boolean zzdcs;
    public final zzaac zzdct;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzadm(com.google.android.gms.ads.formats.NativeAdOptions r10) {
        /*
            r9 = this;
            boolean r2 = r10.shouldReturnUrlsForImageAssets()
            int r3 = r10.getImageOrientation()
            boolean r4 = r10.shouldRequestMultipleImages()
            int r5 = r10.getAdChoicesPlacement()
            com.google.android.gms.ads.VideoOptions r0 = r10.getVideoOptions()
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzaac r0 = new com.google.android.gms.internal.ads.zzaac
            com.google.android.gms.ads.VideoOptions r1 = r10.getVideoOptions()
            r0.<init>(r1)
            r6 = r0
            goto L_0x0024
        L_0x0022:
            r0 = 0
            r6 = r0
        L_0x0024:
            boolean r7 = r10.zzjr()
            int r8 = r10.getMediaAspectRatio()
            r1 = 4
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadm.<init>(com.google.android.gms.ads.formats.NativeAdOptions):void");
    }

    public zzadm(int i, boolean z, int i2, boolean z2, int i3, zzaac zzaac, boolean z3, int i4) {
        this.versionCode = i;
        this.zzdcs = z;
        this.zzbnj = i2;
        this.zzbnl = z2;
        this.zzbnm = i3;
        this.zzdct = zzaac;
        this.zzbno = z3;
        this.zzbnk = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdcs);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbnj);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzbnl);
        SafeParcelWriter.writeInt(parcel, 5, this.zzbnm);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdct, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzbno);
        SafeParcelWriter.writeInt(parcel, 8, this.zzbnk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
