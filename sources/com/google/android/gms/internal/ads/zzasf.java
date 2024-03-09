package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzasf extends zzgt implements zzasc {
    public zzasf() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzash] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.google.android.gms.internal.ads.zzasj] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.ads.zzasj] */
    /* JADX WARNING: type inference failed for: r1v16, types: [com.google.android.gms.internal.ads.zzasj] */
    /* JADX WARNING: type inference failed for: r1v21, types: [com.google.android.gms.internal.ads.zzasj] */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x00df
            r0 = 2
            r1 = 0
            if (r4 == r0) goto L_0x00b5
            r0 = 4
            java.lang.String r2 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            if (r4 == r0) goto L_0x008d
            r0 = 5
            if (r4 == r0) goto L_0x0065
            r0 = 6
            if (r4 == r0) goto L_0x003c
            r0 = 7
            if (r4 == r0) goto L_0x0017
            r4 = 0
            return r4
        L_0x0017:
            java.lang.String r4 = r5.readString()
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0022
            goto L_0x0033
        L_0x0022:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzasj
            if (r1 == 0) goto L_0x002e
            r1 = r0
            com.google.android.gms.internal.ads.zzasj r1 = (com.google.android.gms.internal.ads.zzasj) r1
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.zzasl r1 = new com.google.android.gms.internal.ads.zzasl
            r1.<init>(r5)
        L_0x0033:
            r3.zza((java.lang.String) r4, (com.google.android.gms.internal.ads.zzasj) r1)
            r6.writeNoException()
            goto L_0x00f2
        L_0x003c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasp> r4 = com.google.android.gms.internal.ads.zzasp.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.zzasp r4 = (com.google.android.gms.internal.ads.zzasp) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x004b
            goto L_0x005c
        L_0x004b:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzasj
            if (r1 == 0) goto L_0x0057
            r1 = r0
            com.google.android.gms.internal.ads.zzasj r1 = (com.google.android.gms.internal.ads.zzasj) r1
            goto L_0x005c
        L_0x0057:
            com.google.android.gms.internal.ads.zzasl r1 = new com.google.android.gms.internal.ads.zzasl
            r1.<init>(r5)
        L_0x005c:
            r3.zzc(r4, r1)
            r6.writeNoException()
            goto L_0x00f2
        L_0x0065:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasp> r4 = com.google.android.gms.internal.ads.zzasp.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.zzasp r4 = (com.google.android.gms.internal.ads.zzasp) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0074
            goto L_0x0085
        L_0x0074:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzasj
            if (r1 == 0) goto L_0x0080
            r1 = r0
            com.google.android.gms.internal.ads.zzasj r1 = (com.google.android.gms.internal.ads.zzasj) r1
            goto L_0x0085
        L_0x0080:
            com.google.android.gms.internal.ads.zzasl r1 = new com.google.android.gms.internal.ads.zzasl
            r1.<init>(r5)
        L_0x0085:
            r3.zzb(r4, r1)
            r6.writeNoException()
            goto L_0x00f2
        L_0x008d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasp> r4 = com.google.android.gms.internal.ads.zzasp.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.zzasp r4 = (com.google.android.gms.internal.ads.zzasp) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x009c
            goto L_0x00ad
        L_0x009c:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzasj
            if (r1 == 0) goto L_0x00a8
            r1 = r0
            com.google.android.gms.internal.ads.zzasj r1 = (com.google.android.gms.internal.ads.zzasj) r1
            goto L_0x00ad
        L_0x00a8:
            com.google.android.gms.internal.ads.zzasl r1 = new com.google.android.gms.internal.ads.zzasl
            r1.<init>(r5)
        L_0x00ad:
            r3.zza((com.google.android.gms.internal.ads.zzasp) r4, (com.google.android.gms.internal.ads.zzasj) r1)
            r6.writeNoException()
            goto L_0x00f2
        L_0x00b5:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzarw> r4 = com.google.android.gms.internal.ads.zzarw.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.zzarw r4 = (com.google.android.gms.internal.ads.zzarw) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x00c4
            goto L_0x00d7
        L_0x00c4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdResponseListener"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzash
            if (r1 == 0) goto L_0x00d2
            r1 = r0
            com.google.android.gms.internal.ads.zzash r1 = (com.google.android.gms.internal.ads.zzash) r1
            goto L_0x00d7
        L_0x00d2:
            com.google.android.gms.internal.ads.zzasg r1 = new com.google.android.gms.internal.ads.zzasg
            r1.<init>(r5)
        L_0x00d7:
            r3.zza((com.google.android.gms.internal.ads.zzarw) r4, (com.google.android.gms.internal.ads.zzash) r1)
            r6.writeNoException()
            goto L_0x00f2
        L_0x00df:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzarw> r4 = com.google.android.gms.internal.ads.zzarw.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.zzarw r4 = (com.google.android.gms.internal.ads.zzarw) r4
            com.google.android.gms.internal.ads.zzary r4 = r3.zza(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r6, r4)
        L_0x00f2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasf.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
