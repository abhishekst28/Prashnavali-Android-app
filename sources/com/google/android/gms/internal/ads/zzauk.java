package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzauk extends zzgt implements zzaul {
    public zzauk() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzaul zzap(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzaul) {
            return (zzaul) queryLocalInterface;
        }
        return new zzaun(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzaut] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.zzaum] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.zzauu] */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.zzaut] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            r0 = 0
            switch(r2) {
                case 1: goto L_0x0103;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00d6;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00bc;
                case 6: goto L_0x0099;
                case 7: goto L_0x0089;
                case 8: goto L_0x0079;
                case 9: goto L_0x006d;
                case 10: goto L_0x0059;
                case 11: goto L_0x004d;
                case 12: goto L_0x0041;
                case 13: goto L_0x0031;
                case 14: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            return r2
        L_0x0008:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r2 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzvc r2 = (com.google.android.gms.internal.ads.zzvc) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzaut
            if (r0 == 0) goto L_0x0023
            r0 = r5
            com.google.android.gms.internal.ads.zzaut r0 = (com.google.android.gms.internal.ads.zzaut) r0
            goto L_0x0028
        L_0x0023:
            com.google.android.gms.internal.ads.zzauv r0 = new com.google.android.gms.internal.ads.zzauv
            r0.<init>(r3)
        L_0x0028:
            r1.zzb(r2, r0)
            r4.writeNoException()
            goto L_0x012b
        L_0x0031:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzya r2 = com.google.android.gms.internal.ads.zzyd.zzi(r2)
            r1.zza((com.google.android.gms.internal.ads.zzya) r2)
            r4.writeNoException()
            goto L_0x012b
        L_0x0041:
            com.google.android.gms.internal.ads.zzyf r2 = r1.zzkg()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r4, (android.os.IInterface) r2)
            goto L_0x012b
        L_0x004d:
            com.google.android.gms.internal.ads.zzaug r2 = r1.zzqw()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r4, (android.os.IInterface) r2)
            goto L_0x012b
        L_0x0059:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            boolean r3 = com.google.android.gms.internal.ads.zzgw.zza(r3)
            r1.zza((com.google.android.gms.dynamic.IObjectWrapper) r2, (boolean) r3)
            r4.writeNoException()
            goto L_0x012b
        L_0x006d:
            android.os.Bundle r2 = r1.getAdMetadata()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r4, r2)
            goto L_0x012b
        L_0x0079:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzxz r2 = com.google.android.gms.internal.ads.zzxy.zzh(r2)
            r1.zza((com.google.android.gms.internal.ads.zzxz) r2)
            r4.writeNoException()
            goto L_0x012b
        L_0x0089:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzavc> r2 = com.google.android.gms.internal.ads.zzavc.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzavc r2 = (com.google.android.gms.internal.ads.zzavc) r2
            r1.zza((com.google.android.gms.internal.ads.zzavc) r2)
            r4.writeNoException()
            goto L_0x012b
        L_0x0099:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00a0
            goto L_0x00b3
        L_0x00a0:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.zzauu
            if (r5 == 0) goto L_0x00ae
            r0 = r3
            com.google.android.gms.internal.ads.zzauu r0 = (com.google.android.gms.internal.ads.zzauu) r0
            goto L_0x00b3
        L_0x00ae:
            com.google.android.gms.internal.ads.zzaux r0 = new com.google.android.gms.internal.ads.zzaux
            r0.<init>(r2)
        L_0x00b3:
            r1.zza((com.google.android.gms.internal.ads.zzauu) r0)
            r4.writeNoException()
            goto L_0x012b
        L_0x00bc:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            r1.zzh(r2)
            r4.writeNoException()
            goto L_0x012b
        L_0x00cb:
            java.lang.String r2 = r1.getMediationAdapterClassName()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x012b
        L_0x00d6:
            boolean r2 = r1.isLoaded()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r4, r2)
            goto L_0x012b
        L_0x00e1:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00e8
            goto L_0x00fb
        L_0x00e8:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.zzaum
            if (r5 == 0) goto L_0x00f6
            r0 = r3
            com.google.android.gms.internal.ads.zzaum r0 = (com.google.android.gms.internal.ads.zzaum) r0
            goto L_0x00fb
        L_0x00f6:
            com.google.android.gms.internal.ads.zzauo r0 = new com.google.android.gms.internal.ads.zzauo
            r0.<init>(r2)
        L_0x00fb:
            r1.zza((com.google.android.gms.internal.ads.zzaum) r0)
            r4.writeNoException()
            goto L_0x012b
        L_0x0103:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r2 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzvc r2 = (com.google.android.gms.internal.ads.zzvc) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0112
            goto L_0x0123
        L_0x0112:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzaut
            if (r0 == 0) goto L_0x011e
            r0 = r5
            com.google.android.gms.internal.ads.zzaut r0 = (com.google.android.gms.internal.ads.zzaut) r0
            goto L_0x0123
        L_0x011e:
            com.google.android.gms.internal.ads.zzauv r0 = new com.google.android.gms.internal.ads.zzauv
            r0.<init>(r3)
        L_0x0123:
            r1.zza((com.google.android.gms.internal.ads.zzvc) r2, (com.google.android.gms.internal.ads.zzaut) r0)
            r4.writeNoException()
        L_0x012b:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauk.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
