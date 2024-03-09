package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzaoz extends zzgt implements zzapa {
    public zzaoz() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzapa zzaf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzapa) {
            return (zzapa) queryLocalInterface;
        }
        return new zzapc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzapd zzapd;
        zzaoq zzaoq;
        zzaor zzaor;
        zzaox zzaox;
        zzaow zzaow;
        zzaox zzaox2;
        int i3 = i;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        if (i3 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzgw.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzgw.zza(parcel, Bundle.CREATOR);
            zzvj zzvj = (zzvj) zzgw.zza(parcel, zzvj.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzapd = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface instanceof zzapb) {
                    zzapd = (zzapb) queryLocalInterface;
                } else {
                    zzapd = new zzapd(readStrongBinder);
                }
            }
            zza(asInterface, readString, bundle, bundle2, zzvj, zzapd);
            parcel2.writeNoException();
        } else if (i3 == 2) {
            zzapo zztw = zztw();
            parcel2.writeNoException();
            zzgw.zzb(parcel4, zztw);
        } else if (i3 == 3) {
            zzapo zztx = zztx();
            parcel2.writeNoException();
            zzgw.zzb(parcel4, zztx);
        } else if (i3 == 5) {
            zzyg videoController = getVideoController();
            parcel2.writeNoException();
            zzgw.zza(parcel4, (IInterface) videoController);
        } else if (i3 == 10) {
            zzy(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i3 != 11) {
            switch (i3) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zzvc zzvc = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        zzaoq = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface2 instanceof zzaoo) {
                            zzaoq = (zzaoo) queryLocalInterface2;
                        } else {
                            zzaoq = new zzaoq(readStrongBinder2);
                        }
                    }
                    zza(readString2, readString3, zzvc, asInterface2, zzaoq, zzamz.zzad(parcel.readStrongBinder()), (zzvj) zzgw.zza(parcel, zzvj.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zzvc zzvc2 = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 == null) {
                        zzaor = null;
                    } else {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        if (queryLocalInterface3 instanceof zzaop) {
                            zzaor = (zzaop) queryLocalInterface3;
                        } else {
                            zzaor = new zzaor(readStrongBinder3);
                        }
                    }
                    zza(readString4, readString5, zzvc2, asInterface3, zzaor, zzamz.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean zzz = zzz(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzgw.writeBoolean(parcel4, zzz);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zzvc zzvc3 = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 == null) {
                        zzaox = null;
                    } else {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface4 instanceof zzaov) {
                            zzaox = (zzaov) queryLocalInterface4;
                        } else {
                            zzaox = new zzaox(readStrongBinder4);
                        }
                    }
                    zza(readString6, readString7, zzvc3, asInterface4, zzaox, zzamz.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zzaa = zzaa(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzgw.writeBoolean(parcel4, zzaa);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zzvc zzvc4 = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 == null) {
                        zzaow = null;
                    } else {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface5 instanceof zzaou) {
                            zzaow = (zzaou) queryLocalInterface5;
                        } else {
                            zzaow = new zzaow(readStrongBinder5);
                        }
                    }
                    zza(readString8, readString9, zzvc4, asInterface5, zzaow, zzamz.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    zzdr(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    zzvc zzvc5 = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 == null) {
                        zzaox2 = null;
                    } else {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface6 instanceof zzaov) {
                            zzaox2 = (zzaov) queryLocalInterface6;
                        } else {
                            zzaox2 = new zzaox(readStrongBinder6);
                        }
                    }
                    zzb(readString10, readString11, zzvc5, asInterface6, zzaox2, zzamz.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            zza(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
