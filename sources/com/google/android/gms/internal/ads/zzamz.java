package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzamz extends zzgt implements zzana {
    public zzamz() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzana zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzana) {
            return (zzana) queryLocalInterface;
        }
        return new zzanc(iBinder);
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
                case 1: goto L_0x00d2;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00be;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0099;
                case 8: goto L_0x0095;
                case 9: goto L_0x0089;
                case 10: goto L_0x0079;
                case 11: goto L_0x0075;
                case 12: goto L_0x006c;
                case 13: goto L_0x0067;
                case 14: goto L_0x005a;
                case 15: goto L_0x0055;
                case 16: goto L_0x0048;
                case 17: goto L_0x003f;
                case 18: goto L_0x003a;
                case 19: goto L_0x002d;
                case 20: goto L_0x0028;
                case 21: goto L_0x001f;
                case 22: goto L_0x0012;
                case 23: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzuw> r1 = com.google.android.gms.internal.ads.zzuw.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzuw r1 = (com.google.android.gms.internal.ads.zzuw) r1
            r0.zzb((com.google.android.gms.internal.ads.zzuw) r1)
            goto L_0x00d6
        L_0x0012:
            int r1 = r2.readInt()
            java.lang.String r2 = r2.readString()
            r0.zzc(r1, r2)
            goto L_0x00d6
        L_0x001f:
            java.lang.String r1 = r2.readString()
            r0.zzdo(r1)
            goto L_0x00d6
        L_0x0028:
            r0.onVideoPlay()
            goto L_0x00d6
        L_0x002d:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.zzb((android.os.Bundle) r1)
            goto L_0x00d6
        L_0x003a:
            r0.zztz()
            goto L_0x00d6
        L_0x003f:
            int r1 = r2.readInt()
            r0.zzdd(r1)
            goto L_0x00d6
        L_0x0048:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaug r1 = com.google.android.gms.internal.ads.zzauj.zzao(r1)
            r0.zza((com.google.android.gms.internal.ads.zzaug) r1)
            goto L_0x00d6
        L_0x0055:
            r0.onVideoPause()
            goto L_0x00d6
        L_0x005a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaue> r1 = com.google.android.gms.internal.ads.zzaue.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzaue r1 = (com.google.android.gms.internal.ads.zzaue) r1
            r0.zzb((com.google.android.gms.internal.ads.zzaue) r1)
            goto L_0x00d6
        L_0x0067:
            r0.zzty()
            goto L_0x00d6
        L_0x006c:
            java.lang.String r1 = r2.readString()
            r0.zzdn(r1)
            goto L_0x00d6
        L_0x0075:
            r0.onVideoEnd()
            goto L_0x00d6
        L_0x0079:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaes r1 = com.google.android.gms.internal.ads.zzaer.zzr(r1)
            java.lang.String r2 = r2.readString()
            r0.zza(r1, r2)
            goto L_0x00d6
        L_0x0089:
            java.lang.String r1 = r2.readString()
            java.lang.String r2 = r2.readString()
            r0.onAppEvent(r1, r2)
            goto L_0x00d6
        L_0x0095:
            r0.onAdImpression()
            goto L_0x00d6
        L_0x0099:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00a1
            r1 = 0
            goto L_0x00b5
        L_0x00a1:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzanb
            if (r4 == 0) goto L_0x00af
            r1 = r2
            com.google.android.gms.internal.ads.zzanb r1 = (com.google.android.gms.internal.ads.zzanb) r1
            goto L_0x00b5
        L_0x00af:
            com.google.android.gms.internal.ads.zzane r2 = new com.google.android.gms.internal.ads.zzane
            r2.<init>(r1)
            r1 = r2
        L_0x00b5:
            r0.zza((com.google.android.gms.internal.ads.zzanb) r1)
            goto L_0x00d6
        L_0x00ba:
            r0.onAdLoaded()
            goto L_0x00d6
        L_0x00be:
            r0.onAdOpened()
            goto L_0x00d6
        L_0x00c2:
            r0.onAdLeftApplication()
            goto L_0x00d6
        L_0x00c6:
            int r1 = r2.readInt()
            r0.onAdFailedToLoad(r1)
            goto L_0x00d6
        L_0x00ce:
            r0.onAdClosed()
            goto L_0x00d6
        L_0x00d2:
            r0.onAdClicked()
        L_0x00d6:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamz.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
