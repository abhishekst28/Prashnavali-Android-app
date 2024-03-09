package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class zzapg {
    public static zzapa zzdu(String str) throws RemoteException {
        try {
            return new zzapf((RtbAdapter) Class.forName(str, false, zzapg.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable th) {
            throw new RemoteException();
        }
    }
}
