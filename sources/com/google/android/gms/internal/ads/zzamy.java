package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzamy extends zzgt implements zzamv {
    public zzamy() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.android.gms.internal.ads.zzanc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.gms.internal.ads.zzanc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.android.gms.internal.ads.zzanc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.google.android.gms.internal.ads.zzanc} */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
        /*
            r9 = this;
            r13 = 0
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            switch(r10) {
                case 1: goto L_0x02f1;
                case 2: goto L_0x02e6;
                case 3: goto L_0x02b3;
                case 4: goto L_0x02ab;
                case 5: goto L_0x02a3;
                case 6: goto L_0x025c;
                case 7: goto L_0x021e;
                case 8: goto L_0x0216;
                case 9: goto L_0x020e;
                case 10: goto L_0x01e4;
                case 11: goto L_0x01d0;
                case 12: goto L_0x01c8;
                case 13: goto L_0x01bc;
                case 14: goto L_0x0172;
                case 15: goto L_0x0166;
                case 16: goto L_0x015a;
                case 17: goto L_0x014e;
                case 18: goto L_0x0142;
                case 19: goto L_0x0136;
                case 20: goto L_0x011e;
                case 21: goto L_0x010e;
                case 22: goto L_0x0102;
                case 23: goto L_0x00e6;
                case 24: goto L_0x00da;
                case 25: goto L_0x00ce;
                case 26: goto L_0x00c2;
                case 27: goto L_0x00b6;
                case 28: goto L_0x0082;
                case 29: goto L_0x0006;
                case 30: goto L_0x0072;
                case 31: goto L_0x0054;
                case 32: goto L_0x0020;
                case 33: goto L_0x0014;
                case 34: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r10 = 0
            return r10
        L_0x0008:
            com.google.android.gms.internal.ads.zzapo r10 = r9.zztx()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r12, r10)
            goto L_0x0333
        L_0x0014:
            com.google.android.gms.internal.ads.zzapo r10 = r9.zztw()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r12, r10)
            goto L_0x0333
        L_0x0020:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r1 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r1)
            com.google.android.gms.internal.ads.zzvc r1 = (com.google.android.gms.internal.ads.zzvc) r1
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x003b
            goto L_0x004b
        L_0x003b:
            android.os.IInterface r13 = r11.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.zzana
            if (r0 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzana r13 = (com.google.android.gms.internal.ads.zzana) r13
            goto L_0x004b
        L_0x0046:
            com.google.android.gms.internal.ads.zzanc r13 = new com.google.android.gms.internal.ads.zzanc
            r13.<init>(r11)
        L_0x004b:
            r9.zzc(r10, r1, r2, r13)
            r12.writeNoException()
            goto L_0x0333
        L_0x0054:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.IBinder r13 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzaih r13 = com.google.android.gms.internal.ads.zzaik.zzz(r13)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaip> r0 = com.google.android.gms.internal.ads.zzaip.CREATOR
            java.util.ArrayList r11 = r11.createTypedArrayList(r0)
            r9.zza((com.google.android.gms.dynamic.IObjectWrapper) r10, (com.google.android.gms.internal.ads.zzaih) r13, (java.util.List<com.google.android.gms.internal.ads.zzaip>) r11)
            r12.writeNoException()
            goto L_0x0333
        L_0x0072:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            r9.zzt(r10)
            r12.writeNoException()
            goto L_0x0333
        L_0x0082:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r1 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r1)
            com.google.android.gms.internal.ads.zzvc r1 = (com.google.android.gms.internal.ads.zzvc) r1
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x009d
            goto L_0x00ad
        L_0x009d:
            android.os.IInterface r13 = r11.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.zzana
            if (r0 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.zzana r13 = (com.google.android.gms.internal.ads.zzana) r13
            goto L_0x00ad
        L_0x00a8:
            com.google.android.gms.internal.ads.zzanc r13 = new com.google.android.gms.internal.ads.zzanc
            r13.<init>(r11)
        L_0x00ad:
            r9.zzb(r10, r1, r2, r13)
            r12.writeNoException()
            goto L_0x0333
        L_0x00b6:
            com.google.android.gms.internal.ads.zzanj r10 = r9.zztv()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x0333
        L_0x00c2:
            com.google.android.gms.internal.ads.zzyg r10 = r9.getVideoController()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x0333
        L_0x00ce:
            boolean r10 = com.google.android.gms.internal.ads.zzgw.zza(r11)
            r9.setImmersiveMode(r10)
            r12.writeNoException()
            goto L_0x0333
        L_0x00da:
            com.google.android.gms.internal.ads.zzaes r10 = r9.zztu()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x0333
        L_0x00e6:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.IBinder r13 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzaua r13 = com.google.android.gms.internal.ads.zzaud.zzan(r13)
            java.util.ArrayList r11 = r11.createStringArrayList()
            r9.zza((com.google.android.gms.dynamic.IObjectWrapper) r10, (com.google.android.gms.internal.ads.zzaua) r13, (java.util.List<java.lang.String>) r11)
            r12.writeNoException()
            goto L_0x0333
        L_0x0102:
            boolean r10 = r9.zztt()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r12, r10)
            goto L_0x0333
        L_0x010e:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            r9.zzs(r10)
            r12.writeNoException()
            goto L_0x0333
        L_0x011e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r10 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            com.google.android.gms.internal.ads.zzvc r10 = (com.google.android.gms.internal.ads.zzvc) r10
            java.lang.String r13 = r11.readString()
            java.lang.String r11 = r11.readString()
            r9.zza((com.google.android.gms.internal.ads.zzvc) r10, (java.lang.String) r13, (java.lang.String) r11)
            r12.writeNoException()
            goto L_0x0333
        L_0x0136:
            android.os.Bundle r10 = r9.zzts()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r12, r10)
            goto L_0x0333
        L_0x0142:
            android.os.Bundle r10 = r9.getInterstitialAdapterInfo()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r12, r10)
            goto L_0x0333
        L_0x014e:
            android.os.Bundle r10 = r9.zztr()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zzb(r12, r10)
            goto L_0x0333
        L_0x015a:
            com.google.android.gms.internal.ads.zzani r10 = r9.zztq()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x0333
        L_0x0166:
            com.google.android.gms.internal.ads.zzand r10 = r9.zztp()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x0333
        L_0x0172:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r10 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.zzvc r3 = (com.google.android.gms.internal.ads.zzvc) r3
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0193
            r6 = r13
            goto L_0x01a5
        L_0x0193:
            android.os.IInterface r13 = r10.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.zzana
            if (r0 == 0) goto L_0x019f
            com.google.android.gms.internal.ads.zzana r13 = (com.google.android.gms.internal.ads.zzana) r13
            r6 = r13
            goto L_0x01a5
        L_0x019f:
            com.google.android.gms.internal.ads.zzanc r13 = new com.google.android.gms.internal.ads.zzanc
            r13.<init>(r10)
            r6 = r13
        L_0x01a5:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzadm> r10 = com.google.android.gms.internal.ads.zzadm.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            r7 = r10
            com.google.android.gms.internal.ads.zzadm r7 = (com.google.android.gms.internal.ads.zzadm) r7
            java.util.ArrayList r8 = r11.createStringArrayList()
            r1 = r9
            r1.zza(r2, r3, r4, r5, r6, r7, r8)
            r12.writeNoException()
            goto L_0x0333
        L_0x01bc:
            boolean r10 = r9.isInitialized()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r12, r10)
            goto L_0x0333
        L_0x01c8:
            r9.showVideo()
            r12.writeNoException()
            goto L_0x0333
        L_0x01d0:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r10 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            com.google.android.gms.internal.ads.zzvc r10 = (com.google.android.gms.internal.ads.zzvc) r10
            java.lang.String r11 = r11.readString()
            r9.zza(r10, r11)
            r12.writeNoException()
            goto L_0x0333
        L_0x01e4:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r10 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            r2 = r10
            com.google.android.gms.internal.ads.zzvc r2 = (com.google.android.gms.internal.ads.zzvc) r2
            java.lang.String r3 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzaua r4 = com.google.android.gms.internal.ads.zzaud.zzan(r10)
            java.lang.String r5 = r11.readString()
            r0 = r9
            r0.zza((com.google.android.gms.dynamic.IObjectWrapper) r1, (com.google.android.gms.internal.ads.zzvc) r2, (java.lang.String) r3, (com.google.android.gms.internal.ads.zzaua) r4, (java.lang.String) r5)
            r12.writeNoException()
            goto L_0x0333
        L_0x020e:
            r9.resume()
            r12.writeNoException()
            goto L_0x0333
        L_0x0216:
            r9.pause()
            r12.writeNoException()
            goto L_0x0333
        L_0x021e:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r10 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.zzvc r3 = (com.google.android.gms.internal.ads.zzvc) r3
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x023f
            r6 = r13
            goto L_0x0252
        L_0x023f:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof com.google.android.gms.internal.ads.zzana
            if (r13 == 0) goto L_0x024c
            r13 = r11
            com.google.android.gms.internal.ads.zzana r13 = (com.google.android.gms.internal.ads.zzana) r13
            r6 = r13
            goto L_0x0252
        L_0x024c:
            com.google.android.gms.internal.ads.zzanc r13 = new com.google.android.gms.internal.ads.zzanc
            r13.<init>(r10)
            r6 = r13
        L_0x0252:
            r1 = r9
            r1.zza((com.google.android.gms.dynamic.IObjectWrapper) r2, (com.google.android.gms.internal.ads.zzvc) r3, (java.lang.String) r4, (java.lang.String) r5, (com.google.android.gms.internal.ads.zzana) r6)
            r12.writeNoException()
            goto L_0x0333
        L_0x025c:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvj> r10 = com.google.android.gms.internal.ads.zzvj.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.zzvj r3 = (com.google.android.gms.internal.ads.zzvj) r3
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r10 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            r4 = r10
            com.google.android.gms.internal.ads.zzvc r4 = (com.google.android.gms.internal.ads.zzvc) r4
            java.lang.String r5 = r11.readString()
            java.lang.String r6 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0286
            r7 = r13
            goto L_0x0299
        L_0x0286:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof com.google.android.gms.internal.ads.zzana
            if (r13 == 0) goto L_0x0293
            r13 = r11
            com.google.android.gms.internal.ads.zzana r13 = (com.google.android.gms.internal.ads.zzana) r13
            r7 = r13
            goto L_0x0299
        L_0x0293:
            com.google.android.gms.internal.ads.zzanc r13 = new com.google.android.gms.internal.ads.zzanc
            r13.<init>(r10)
            r7 = r13
        L_0x0299:
            r1 = r9
            r1.zza(r2, r3, r4, r5, r6, r7)
            r12.writeNoException()
            goto L_0x0333
        L_0x02a3:
            r9.destroy()
            r12.writeNoException()
            goto L_0x0333
        L_0x02ab:
            r9.showInterstitial()
            r12.writeNoException()
            goto L_0x0333
        L_0x02b3:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r1 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r1)
            com.google.android.gms.internal.ads.zzvc r1 = (com.google.android.gms.internal.ads.zzvc) r1
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x02ce
            goto L_0x02de
        L_0x02ce:
            android.os.IInterface r13 = r11.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.zzana
            if (r0 == 0) goto L_0x02d9
            com.google.android.gms.internal.ads.zzana r13 = (com.google.android.gms.internal.ads.zzana) r13
            goto L_0x02de
        L_0x02d9:
            com.google.android.gms.internal.ads.zzanc r13 = new com.google.android.gms.internal.ads.zzanc
            r13.<init>(r11)
        L_0x02de:
            r9.zza(r10, r1, r2, r13)
            r12.writeNoException()
            goto L_0x0333
        L_0x02e6:
            com.google.android.gms.dynamic.IObjectWrapper r10 = r9.zzto()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x0333
        L_0x02f1:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvj> r10 = com.google.android.gms.internal.ads.zzvj.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.zzvj r3 = (com.google.android.gms.internal.ads.zzvj) r3
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r10 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r11, r10)
            r4 = r10
            com.google.android.gms.internal.ads.zzvc r4 = (com.google.android.gms.internal.ads.zzvc) r4
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0317
            r6 = r13
            goto L_0x032a
        L_0x0317:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof com.google.android.gms.internal.ads.zzana
            if (r13 == 0) goto L_0x0324
            r13 = r11
            com.google.android.gms.internal.ads.zzana r13 = (com.google.android.gms.internal.ads.zzana) r13
            r6 = r13
            goto L_0x032a
        L_0x0324:
            com.google.android.gms.internal.ads.zzanc r13 = new com.google.android.gms.internal.ads.zzanc
            r13.<init>(r10)
            r6 = r13
        L_0x032a:
            r1 = r9
            r1.zza((com.google.android.gms.dynamic.IObjectWrapper) r2, (com.google.android.gms.internal.ads.zzvj) r3, (com.google.android.gms.internal.ads.zzvc) r4, (java.lang.String) r5, (com.google.android.gms.internal.ads.zzana) r6)
            r12.writeNoException()
        L_0x0333:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamy.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
