package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzafv extends zzgt implements zzafw {
    public zzafv() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x0189;
                case 3: goto L_0x017e;
                case 4: goto L_0x0173;
                case 5: goto L_0x0168;
                case 6: goto L_0x015d;
                case 7: goto L_0x0152;
                case 8: goto L_0x0147;
                case 9: goto L_0x013c;
                case 10: goto L_0x0131;
                case 11: goto L_0x0126;
                case 12: goto L_0x011a;
                case 13: goto L_0x0112;
                case 14: goto L_0x0106;
                case 15: goto L_0x00f6;
                case 16: goto L_0x00e2;
                case 17: goto L_0x00d2;
                case 18: goto L_0x00c6;
                case 19: goto L_0x00ba;
                case 20: goto L_0x00ae;
                case 21: goto L_0x0089;
                case 22: goto L_0x0081;
                case 23: goto L_0x0075;
                case 24: goto L_0x0069;
                case 25: goto L_0x0059;
                case 26: goto L_0x0049;
                case 27: goto L_0x0041;
                case 28: goto L_0x0039;
                case 29: goto L_0x002d;
                case 30: goto L_0x0021;
                case 31: goto L_0x0015;
                case 32: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzya r1 = com.google.android.gms.internal.ads.zzyd.zzi(r1)
            r0.zza((com.google.android.gms.internal.ads.zzya) r1)
            r3.writeNoException()
            goto L_0x0194
        L_0x0015:
            com.google.android.gms.internal.ads.zzyf r1 = r0.zzkg()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0194
        L_0x0021:
            boolean r1 = r0.isCustomClickGestureEnabled()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r3, r1)
            goto L_0x0194
        L_0x002d:
            com.google.android.gms.internal.ads.zzadr r1 = r0.zzss()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0194
        L_0x0039:
            r0.recordCustomClickGesture()
            r3.writeNoException()
            goto L_0x0194
        L_0x0041:
            r0.zzsr()
            r3.writeNoException()
            goto L_0x0194
        L_0x0049:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzxr r1 = com.google.android.gms.internal.ads.zzxq.zzf(r1)
            r0.zza((com.google.android.gms.internal.ads.zzxr) r1)
            r3.writeNoException()
            goto L_0x0194
        L_0x0059:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzxv r1 = com.google.android.gms.internal.ads.zzxu.zzg(r1)
            r0.zza((com.google.android.gms.internal.ads.zzxv) r1)
            r3.writeNoException()
            goto L_0x0194
        L_0x0069:
            boolean r1 = r0.isCustomMuteThisAdEnabled()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r3, r1)
            goto L_0x0194
        L_0x0075:
            java.util.List r1 = r0.getMuteThisAdReasons()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x0194
        L_0x0081:
            r0.cancelUnconfirmedClick()
            r3.writeNoException()
            goto L_0x0194
        L_0x0089:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0091
            r1 = 0
            goto L_0x00a5
        L_0x0091:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzafr
            if (r4 == 0) goto L_0x009f
            r1 = r2
            com.google.android.gms.internal.ads.zzafr r1 = (com.google.android.gms.internal.ads.zzafr) r1
            goto L_0x00a5
        L_0x009f:
            com.google.android.gms.internal.ads.zzaft r2 = new com.google.android.gms.internal.ads.zzaft
            r2.<init>(r1)
            r1 = r2
        L_0x00a5:
            r0.zza((com.google.android.gms.internal.ads.zzafr) r1)
            r3.writeNoException()
            goto L_0x0194
        L_0x00ae:
            android.os.Bundle r1 = r0.getExtras()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r3, r1)
            goto L_0x0194
        L_0x00ba:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzsj()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0194
        L_0x00c6:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzsg()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0194
        L_0x00d2:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.reportTouchEvent(r1)
            r3.writeNoException()
            goto L_0x0194
        L_0x00e2:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.recordImpression(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r3, r1)
            goto L_0x0194
        L_0x00f6:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.performClick(r1)
            r3.writeNoException()
            goto L_0x0194
        L_0x0106:
            com.google.android.gms.internal.ads.zzado r1 = r0.zzsi()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0194
        L_0x0112:
            r0.destroy()
            r3.writeNoException()
            goto L_0x0194
        L_0x011a:
            java.lang.String r1 = r0.getMediationAdapterClassName()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0194
        L_0x0126:
            com.google.android.gms.internal.ads.zzyg r1 = r0.getVideoController()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0194
        L_0x0131:
            java.lang.String r1 = r0.getPrice()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0194
        L_0x013c:
            java.lang.String r1 = r0.getStore()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0194
        L_0x0147:
            double r1 = r0.getStarRating()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x0194
        L_0x0152:
            java.lang.String r1 = r0.getAdvertiser()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0194
        L_0x015d:
            java.lang.String r1 = r0.getCallToAction()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0194
        L_0x0168:
            com.google.android.gms.internal.ads.zzadw r1 = r0.zzsh()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0194
        L_0x0173:
            java.lang.String r1 = r0.getBody()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0194
        L_0x017e:
            java.util.List r1 = r0.getImages()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x0194
        L_0x0189:
            java.lang.String r1 = r0.getHeadline()
            r3.writeNoException()
            r3.writeString(r1)
        L_0x0194:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafv.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
