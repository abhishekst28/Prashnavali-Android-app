package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzwq extends zzgt implements zzwr {
    public zzwq() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.zzwl] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.zzxi] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00eb;
                case 2: goto L_0x00c9;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00ab;
                case 5: goto L_0x0090;
                case 6: goto L_0x0081;
                case 7: goto L_0x005e;
                case 8: goto L_0x0046;
                case 9: goto L_0x0036;
                case 10: goto L_0x0026;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0016;
                case 14: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaiz r1 = com.google.android.gms.internal.ads.zzajc.zzab(r1)
            r0.zza((com.google.android.gms.internal.ads.zzaiz) r1)
            r3.writeNoException()
            goto L_0x00f6
        L_0x0016:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzair> r1 = com.google.android.gms.internal.ads.zzair.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzair r1 = (com.google.android.gms.internal.ads.zzair) r1
            r0.zza((com.google.android.gms.internal.ads.zzair) r1)
            r3.writeNoException()
            goto L_0x00f6
        L_0x0026:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzafl r1 = com.google.android.gms.internal.ads.zzafo.zzx(r1)
            r0.zza((com.google.android.gms.internal.ads.zzafl) r1)
            r3.writeNoException()
            goto L_0x00f6
        L_0x0036:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> r1 = com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.ads.formats.PublisherAdViewOptions r1 = (com.google.android.gms.ads.formats.PublisherAdViewOptions) r1
            r0.zza((com.google.android.gms.ads.formats.PublisherAdViewOptions) r1)
            r3.writeNoException()
            goto L_0x00f6
        L_0x0046:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzafk r1 = com.google.android.gms.internal.ads.zzafj.zzw(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvj> r4 = com.google.android.gms.internal.ads.zzvj.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r4)
            com.google.android.gms.internal.ads.zzvj r2 = (com.google.android.gms.internal.ads.zzvj) r2
            r0.zza(r1, r2)
            r3.writeNoException()
            goto L_0x00f6
        L_0x005e:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0065
            goto L_0x0078
        L_0x0065:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzxi
            if (r4 == 0) goto L_0x0073
            r4 = r2
            com.google.android.gms.internal.ads.zzxi r4 = (com.google.android.gms.internal.ads.zzxi) r4
            goto L_0x0078
        L_0x0073:
            com.google.android.gms.internal.ads.zzxl r4 = new com.google.android.gms.internal.ads.zzxl
            r4.<init>(r1)
        L_0x0078:
            r0.zzb((com.google.android.gms.internal.ads.zzxi) r4)
            r3.writeNoException()
            goto L_0x00f6
        L_0x0081:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzadm> r1 = com.google.android.gms.internal.ads.zzadm.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzadm r1 = (com.google.android.gms.internal.ads.zzadm) r1
            r0.zza((com.google.android.gms.internal.ads.zzadm) r1)
            r3.writeNoException()
            goto L_0x00f6
        L_0x0090:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzafd r4 = com.google.android.gms.internal.ads.zzafg.zzv(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzafc r2 = com.google.android.gms.internal.ads.zzafb.zzu(r2)
            r0.zza(r1, r4, r2)
            r3.writeNoException()
            goto L_0x00f6
        L_0x00ab:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaex r1 = com.google.android.gms.internal.ads.zzafa.zzt(r1)
            r0.zza((com.google.android.gms.internal.ads.zzaex) r1)
            r3.writeNoException()
            goto L_0x00f6
        L_0x00ba:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaew r1 = com.google.android.gms.internal.ads.zzaev.zzs(r1)
            r0.zza((com.google.android.gms.internal.ads.zzaew) r1)
            r3.writeNoException()
            goto L_0x00f6
        L_0x00c9:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00d0
            goto L_0x00e3
        L_0x00d0:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwl
            if (r4 == 0) goto L_0x00de
            r4 = r2
            com.google.android.gms.internal.ads.zzwl r4 = (com.google.android.gms.internal.ads.zzwl) r4
            goto L_0x00e3
        L_0x00de:
            com.google.android.gms.internal.ads.zzwn r4 = new com.google.android.gms.internal.ads.zzwn
            r4.<init>(r1)
        L_0x00e3:
            r0.zzb((com.google.android.gms.internal.ads.zzwl) r4)
            r3.writeNoException()
            goto L_0x00f6
        L_0x00eb:
            com.google.android.gms.internal.ads.zzwm r1 = r0.zzqc()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
        L_0x00f6:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwq.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
