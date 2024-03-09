package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzadu extends zzgt implements zzadr {
    public zzadu() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public static zzadr zzn(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        if (queryLocalInterface instanceof zzadr) {
            return (zzadr) queryLocalInterface;
        }
        return new zzadt(iBinder);
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
                case 2: goto L_0x006f;
                case 3: goto L_0x0060;
                case 4: goto L_0x0055;
                case 5: goto L_0x004a;
                case 6: goto L_0x003f;
                case 7: goto L_0x0034;
                case 8: goto L_0x0029;
                case 9: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x000d
            r1 = 0
            goto L_0x0021
        L_0x000d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzafi
            if (r4 == 0) goto L_0x001b
            r1 = r2
            com.google.android.gms.internal.ads.zzafi r1 = (com.google.android.gms.internal.ads.zzafi) r1
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.zzafh r2 = new com.google.android.gms.internal.ads.zzafh
            r2.<init>(r1)
            r1 = r2
        L_0x0021:
            r0.zza(r1)
            r3.writeNoException()
            goto L_0x007a
        L_0x0029:
            boolean r1 = r0.hasVideoContent()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.writeBoolean(r3, r1)
            goto L_0x007a
        L_0x0034:
            com.google.android.gms.internal.ads.zzyg r1 = r0.getVideoController()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x007a
        L_0x003f:
            float r1 = r0.getCurrentTime()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x007a
        L_0x004a:
            float r1 = r0.getDuration()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x007a
        L_0x0055:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzsf()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x007a
        L_0x0060:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r0.zzo(r1)
            r3.writeNoException()
            goto L_0x007a
        L_0x006f:
            float r1 = r0.getAspectRatio()
            r3.writeNoException()
            r3.writeFloat(r1)
        L_0x007a:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadu.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
