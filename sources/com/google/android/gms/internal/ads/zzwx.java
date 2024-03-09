package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzwx extends zzgt implements zzwu {
    public zzwx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzwu zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzwu) {
            return (zzwu) queryLocalInterface;
        }
        return new zzww(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.zzwl] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.zzxc] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.zzwg] */
    /* JADX WARNING: type inference failed for: r4v17, types: [com.google.android.gms.internal.ads.zzxi] */
    /* JADX WARNING: type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.zzxb] */
    /* JADX WARNING: type inference failed for: r4v27, types: [com.google.android.gms.internal.ads.zzya] */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* JADX WARNING: type inference failed for: r4v37 */
    /* JADX WARNING: type inference failed for: r4v38 */
    /* JADX WARNING: type inference failed for: r4v39 */
    /* JADX WARNING: type inference failed for: r4v40 */
    /* JADX WARNING: type inference failed for: r4v41 */
    /* JADX WARNING: type inference failed for: r4v42 */
    /* JADX WARNING: type inference failed for: r4v43 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x025d;
                case 2: goto L_0x0256;
                case 3: goto L_0x024b;
                case 4: goto L_0x0238;
                case 5: goto L_0x0231;
                case 6: goto L_0x022a;
                case 7: goto L_0x0208;
                case 8: goto L_0x01e6;
                case 9: goto L_0x01de;
                case 10: goto L_0x01d6;
                case 11: goto L_0x01ce;
                case 12: goto L_0x01c2;
                case 13: goto L_0x01b2;
                case 14: goto L_0x01a2;
                case 15: goto L_0x018e;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x0182;
                case 19: goto L_0x0172;
                case 20: goto L_0x014f;
                case 21: goto L_0x012c;
                case 22: goto L_0x0120;
                case 23: goto L_0x0114;
                case 24: goto L_0x0104;
                case 25: goto L_0x00f8;
                case 26: goto L_0x00ec;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x00dc;
                case 30: goto L_0x00cc;
                case 31: goto L_0x00c0;
                case 32: goto L_0x00b4;
                case 33: goto L_0x00a8;
                case 34: goto L_0x009c;
                case 35: goto L_0x0090;
                case 36: goto L_0x006d;
                case 37: goto L_0x0061;
                case 38: goto L_0x0055;
                case 39: goto L_0x0045;
                case 40: goto L_0x0035;
                case 41: goto L_0x0029;
                case 42: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x000d
            goto L_0x0020
        L_0x000d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IOnPaidEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzya
            if (r4 == 0) goto L_0x001b
            r4 = r2
            com.google.android.gms.internal.ads.zzya r4 = (com.google.android.gms.internal.ads.zzya) r4
            goto L_0x0020
        L_0x001b:
            com.google.android.gms.internal.ads.zzyc r4 = new com.google.android.gms.internal.ads.zzyc
            r4.<init>(r1)
        L_0x0020:
            r0.zza((com.google.android.gms.internal.ads.zzya) r4)
            r3.writeNoException()
            goto L_0x0268
        L_0x0029:
            com.google.android.gms.internal.ads.zzyf r1 = r0.zzkg()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0268
        L_0x0035:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzsi r1 = com.google.android.gms.internal.ads.zzsh.zzb(r1)
            r0.zza((com.google.android.gms.internal.ads.zzsi) r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x0045:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvm> r1 = com.google.android.gms.internal.ads.zzvm.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzvm r1 = (com.google.android.gms.internal.ads.zzvm) r1
            r0.zza((com.google.android.gms.internal.ads.zzvm) r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x0055:
            java.lang.String r1 = r2.readString()
            r0.zzbp(r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x0061:
            android.os.Bundle r1 = r0.getAdMetadata()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r3, r1)
            goto L_0x0268
        L_0x006d:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0074
            goto L_0x0087
        L_0x0074:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzxb
            if (r4 == 0) goto L_0x0082
            r4 = r2
            com.google.android.gms.internal.ads.zzxb r4 = (com.google.android.gms.internal.ads.zzxb) r4
            goto L_0x0087
        L_0x0082:
            com.google.android.gms.internal.ads.zzxd r4 = new com.google.android.gms.internal.ads.zzxd
            r4.<init>(r1)
        L_0x0087:
            r0.zza((com.google.android.gms.internal.ads.zzxb) r4)
            r3.writeNoException()
            goto L_0x0268
        L_0x0090:
            java.lang.String r1 = r0.zzkf()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0268
        L_0x009c:
            boolean r1 = com.google.android.gms.internal.ads.zzgw.zza(r2)
            r0.setImmersiveMode(r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x00a8:
            com.google.android.gms.internal.ads.zzwl r1 = r0.zzki()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0268
        L_0x00b4:
            com.google.android.gms.internal.ads.zzxc r1 = r0.zzkh()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0268
        L_0x00c0:
            java.lang.String r1 = r0.getAdUnitId()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0268
        L_0x00cc:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzym> r1 = com.google.android.gms.internal.ads.zzym.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r0.zza((com.google.android.gms.internal.ads.zzym) r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x00dc:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaac> r1 = com.google.android.gms.internal.ads.zzaac.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzaac r1 = (com.google.android.gms.internal.ads.zzaac) r1
            r0.zza((com.google.android.gms.internal.ads.zzaac) r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x00ec:
            com.google.android.gms.internal.ads.zzyg r1 = r0.getVideoController()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0268
        L_0x00f8:
            java.lang.String r1 = r2.readString()
            r0.setUserId(r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x0104:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzatt r1 = com.google.android.gms.internal.ads.zzats.zzam(r1)
            r0.zza((com.google.android.gms.internal.ads.zzatt) r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x0114:
            boolean r1 = r0.isLoading()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r3, r1)
            goto L_0x0268
        L_0x0120:
            boolean r1 = com.google.android.gms.internal.ads.zzgw.zza(r2)
            r0.setManualImpressionsEnabled(r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x012c:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0133
            goto L_0x0146
        L_0x0133:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzxi
            if (r4 == 0) goto L_0x0141
            r4 = r2
            com.google.android.gms.internal.ads.zzxi r4 = (com.google.android.gms.internal.ads.zzxi) r4
            goto L_0x0146
        L_0x0141:
            com.google.android.gms.internal.ads.zzxl r4 = new com.google.android.gms.internal.ads.zzxl
            r4.<init>(r1)
        L_0x0146:
            r0.zza((com.google.android.gms.internal.ads.zzxi) r4)
            r3.writeNoException()
            goto L_0x0268
        L_0x014f:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0156
            goto L_0x0169
        L_0x0156:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwg
            if (r4 == 0) goto L_0x0164
            r4 = r2
            com.google.android.gms.internal.ads.zzwg r4 = (com.google.android.gms.internal.ads.zzwg) r4
            goto L_0x0169
        L_0x0164:
            com.google.android.gms.internal.ads.zzwi r4 = new com.google.android.gms.internal.ads.zzwi
            r4.<init>(r1)
        L_0x0169:
            r0.zza((com.google.android.gms.internal.ads.zzwg) r4)
            r3.writeNoException()
            goto L_0x0268
        L_0x0172:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzabq r1 = com.google.android.gms.internal.ads.zzabp.zzl(r1)
            r0.zza((com.google.android.gms.internal.ads.zzabq) r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x0182:
            java.lang.String r1 = r0.getMediationAdapterClassName()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0268
        L_0x018e:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzarb r1 = com.google.android.gms.internal.ads.zzara.zzaj(r1)
            java.lang.String r2 = r2.readString()
            r0.zza(r1, r2)
            r3.writeNoException()
            goto L_0x0268
        L_0x01a2:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaqv r1 = com.google.android.gms.internal.ads.zzaqu.zzah(r1)
            r0.zza((com.google.android.gms.internal.ads.zzaqv) r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x01b2:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvj> r1 = com.google.android.gms.internal.ads.zzvj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzvj r1 = (com.google.android.gms.internal.ads.zzvj) r1
            r0.zza((com.google.android.gms.internal.ads.zzvj) r1)
            r3.writeNoException()
            goto L_0x0268
        L_0x01c2:
            com.google.android.gms.internal.ads.zzvj r1 = r0.zzke()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r3, r1)
            goto L_0x0268
        L_0x01ce:
            r0.zzkd()
            r3.writeNoException()
            goto L_0x0268
        L_0x01d6:
            r0.stopLoading()
            r3.writeNoException()
            goto L_0x0268
        L_0x01de:
            r0.showInterstitial()
            r3.writeNoException()
            goto L_0x0268
        L_0x01e6:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x01ed
            goto L_0x0200
        L_0x01ed:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzxc
            if (r4 == 0) goto L_0x01fb
            r4 = r2
            com.google.android.gms.internal.ads.zzxc r4 = (com.google.android.gms.internal.ads.zzxc) r4
            goto L_0x0200
        L_0x01fb:
            com.google.android.gms.internal.ads.zzxe r4 = new com.google.android.gms.internal.ads.zzxe
            r4.<init>(r1)
        L_0x0200:
            r0.zza((com.google.android.gms.internal.ads.zzxc) r4)
            r3.writeNoException()
            goto L_0x0268
        L_0x0208:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x020f
            goto L_0x0222
        L_0x020f:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwl
            if (r4 == 0) goto L_0x021d
            r4 = r2
            com.google.android.gms.internal.ads.zzwl r4 = (com.google.android.gms.internal.ads.zzwl) r4
            goto L_0x0222
        L_0x021d:
            com.google.android.gms.internal.ads.zzwn r4 = new com.google.android.gms.internal.ads.zzwn
            r4.<init>(r1)
        L_0x0222:
            r0.zza((com.google.android.gms.internal.ads.zzwl) r4)
            r3.writeNoException()
            goto L_0x0268
        L_0x022a:
            r0.resume()
            r3.writeNoException()
            goto L_0x0268
        L_0x0231:
            r0.pause()
            r3.writeNoException()
            goto L_0x0268
        L_0x0238:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r1 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzvc r1 = (com.google.android.gms.internal.ads.zzvc) r1
            boolean r1 = r0.zza((com.google.android.gms.internal.ads.zzvc) r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r3, r1)
            goto L_0x0268
        L_0x024b:
            boolean r1 = r0.isReady()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r3, r1)
            goto L_0x0268
        L_0x0256:
            r0.destroy()
            r3.writeNoException()
            goto L_0x0268
        L_0x025d:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzkc()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
        L_0x0268:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
