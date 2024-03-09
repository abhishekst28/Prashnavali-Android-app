package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzatp extends zzgt implements zzatm {
    public zzatp() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static zzatm zzal(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        if (queryLocalInterface instanceof zzatm) {
            return (zzatm) queryLocalInterface;
        }
        return new zzato(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzatt] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.zzatk] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x012d
            r0 = 2
            if (r3 == r0) goto L_0x0126
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L_0x0104
            r0 = 34
            if (r3 == r0) goto L_0x00f9
            switch(r3) {
                case 5: goto L_0x00ee;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00e0;
                case 8: goto L_0x00d9;
                case 9: goto L_0x00ca;
                case 10: goto L_0x00ba;
                case 11: goto L_0x00aa;
                case 12: goto L_0x009e;
                case 13: goto L_0x0092;
                case 14: goto L_0x0082;
                case 15: goto L_0x0076;
                case 16: goto L_0x0053;
                case 17: goto L_0x0047;
                case 18: goto L_0x0037;
                case 19: goto L_0x002b;
                case 20: goto L_0x001f;
                case 21: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            return r3
        L_0x0013:
            com.google.android.gms.internal.ads.zzyf r3 = r2.zzkg()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x013c
        L_0x001f:
            boolean r3 = r2.zzqx()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r5, r3)
            goto L_0x013c
        L_0x002b:
            java.lang.String r3 = r4.readString()
            r2.setCustomData(r3)
            r5.writeNoException()
            goto L_0x013c
        L_0x0037:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.zzi(r3)
            r5.writeNoException()
            goto L_0x013c
        L_0x0047:
            java.lang.String r3 = r4.readString()
            r2.setAppPackageName(r3)
            r5.writeNoException()
            goto L_0x013c
        L_0x0053:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x005a
            goto L_0x006d
        L_0x005a:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzatk
            if (r0 == 0) goto L_0x0068
            r1 = r4
            com.google.android.gms.internal.ads.zzatk r1 = (com.google.android.gms.internal.ads.zzatk) r1
            goto L_0x006d
        L_0x0068:
            com.google.android.gms.internal.ads.zzatn r1 = new com.google.android.gms.internal.ads.zzatn
            r1.<init>(r3)
        L_0x006d:
            r2.zza((com.google.android.gms.internal.ads.zzatk) r1)
            r5.writeNoException()
            goto L_0x013c
        L_0x0076:
            android.os.Bundle r3 = r2.getAdMetadata()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r5, r3)
            goto L_0x013c
        L_0x0082:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzxb r3 = com.google.android.gms.internal.ads.zzxa.zzd(r3)
            r2.zza((com.google.android.gms.internal.ads.zzxb) r3)
            r5.writeNoException()
            goto L_0x013c
        L_0x0092:
            java.lang.String r3 = r4.readString()
            r2.setUserId(r3)
            r5.writeNoException()
            goto L_0x013c
        L_0x009e:
            java.lang.String r3 = r2.getMediationAdapterClassName()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x013c
        L_0x00aa:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.zzl(r3)
            r5.writeNoException()
            goto L_0x013c
        L_0x00ba:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.zzk(r3)
            r5.writeNoException()
            goto L_0x013c
        L_0x00ca:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.zzj(r3)
            r5.writeNoException()
            goto L_0x013c
        L_0x00d9:
            r2.destroy()
            r5.writeNoException()
            goto L_0x013c
        L_0x00e0:
            r2.resume()
            r5.writeNoException()
            goto L_0x013c
        L_0x00e7:
            r2.pause()
            r5.writeNoException()
            goto L_0x013c
        L_0x00ee:
            boolean r3 = r2.isLoaded()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r5, r3)
            goto L_0x013c
        L_0x00f9:
            boolean r3 = com.google.android.gms.internal.ads.zzgw.zza(r4)
            r2.setImmersiveMode(r3)
            r5.writeNoException()
            goto L_0x013c
        L_0x0104:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x010b
            goto L_0x011e
        L_0x010b:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzatt
            if (r0 == 0) goto L_0x0119
            r1 = r4
            com.google.android.gms.internal.ads.zzatt r1 = (com.google.android.gms.internal.ads.zzatt) r1
            goto L_0x011e
        L_0x0119:
            com.google.android.gms.internal.ads.zzatv r1 = new com.google.android.gms.internal.ads.zzatv
            r1.<init>(r3)
        L_0x011e:
            r2.zza((com.google.android.gms.internal.ads.zzatt) r1)
            r5.writeNoException()
            goto L_0x013c
        L_0x0126:
            r2.show()
            r5.writeNoException()
            goto L_0x013c
        L_0x012d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzatz> r3 = com.google.android.gms.internal.ads.zzatz.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r4, r3)
            com.google.android.gms.internal.ads.zzatz r3 = (com.google.android.gms.internal.ads.zzatz) r3
            r2.zza((com.google.android.gms.internal.ads.zzatz) r3)
            r5.writeNoException()
        L_0x013c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatp.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
