package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.ads.zztw;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcqt {
    private static final SparseArray<zztw.zzo.zzb> zzgkn;
    private final zzbrz zzfqu;
    private final zzcqq zzghq;
    private final TelephonyManager zzgkk;
    /* access modifiers changed from: private */
    public final zzcqk zzgkl;
    private zzug zzgkm;
    private final Context zzvr;

    zzcqt(Context context, zzbrz zzbrz, zzcqq zzcqq, zzcqk zzcqk) {
        this.zzvr = context;
        this.zzfqu = zzbrz;
        this.zzghq = zzcqq;
        this.zzgkl = zzcqk;
        this.zzgkk = (TelephonyManager) context.getSystemService("phone");
    }

    private static zzug zzbl(boolean z) {
        return z ? zzug.ENUM_TRUE : zzug.ENUM_FALSE;
    }

    /* access modifiers changed from: private */
    public final zztw.zzm zzk(Bundle bundle) {
        zztw.zzm.zzb zzb;
        zztw.zzm.zza zzoe = zztw.zzm.zzoe();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzgkm = zzug.ENUM_TRUE;
        } else {
            this.zzgkm = zzug.ENUM_FALSE;
            if (i == 0) {
                zzoe.zza(zztw.zzm.zzc.CELL);
            } else if (i != 1) {
                zzoe.zza(zztw.zzm.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzoe.zza(zztw.zzm.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzb = zztw.zzm.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzb = zztw.zzm.zzb.THREE_G;
                    break;
                case 13:
                    zzb = zztw.zzm.zzb.LTE;
                    break;
                default:
                    zzb = zztw.zzm.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzoe.zza(zzb);
        }
        return (zztw.zzm) ((zzegp) zzoe.zzbfx());
    }

    /* access modifiers changed from: private */
    public static zztw.zzo.zzb zzl(Bundle bundle) {
        return zzgkn.get(zzdlu.zza(zzdlu.zza(bundle, "device"), "network").getInt("active_network_state", -1), zztw.zzo.zzb.UNSPECIFIED);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.zztw.zzc.zza> zzm(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r7 = r7.get(r0)
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L_0x000e
            java.util.List r7 = (java.util.List) r7
            goto L_0x0018
        L_0x000e:
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x003e
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
        L_0x0018:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x0025:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0038
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
        L_0x0038:
            goto L_0x0025
        L_0x0039:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0042
        L_0x003e:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0042:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x004c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L_0x0083;
                case -1052618729: goto L_0x0079;
                case -239580146: goto L_0x006f;
                case 604727084: goto L_0x0065;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x008c
        L_0x0065:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
            r2 = 1
            goto L_0x008c
        L_0x006f:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
            r2 = 3
            goto L_0x008c
        L_0x0079:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
            r2 = 2
            goto L_0x008c
        L_0x0083:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
            r2 = 0
        L_0x008c:
            if (r2 == 0) goto L_0x00a0
            if (r2 == r6) goto L_0x009d
            if (r2 == r5) goto L_0x009a
            if (r2 == r4) goto L_0x0097
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x00a2
        L_0x0097:
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.REWARD_BASED_VIDEO_AD
            goto L_0x00a2
        L_0x009a:
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.NATIVE_APP_INSTALL
            goto L_0x00a2
        L_0x009d:
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.INTERSTITIAL
            goto L_0x00a2
        L_0x00a0:
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.BANNER
        L_0x00a2:
            r0.add(r1)
            goto L_0x004c
        L_0x00a6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqt.zzm(android.os.Bundle):java.util.ArrayList");
    }

    /* access modifiers changed from: private */
    public final byte[] zza(boolean z, ArrayList<zztw.zzc.zza> arrayList, zztw.zzm zzm, zztw.zzo.zzb zzb) {
        boolean z2 = true;
        zztw.zzo.zza.C0019zza zzes = zztw.zzo.zza.zzoi().zze(arrayList).zzh(zzbl(zzp.zzkr().zzb(this.zzvr.getContentResolver()) != 0)).zzi(zzp.zzkr().zza(this.zzvr, this.zzgkk)).zzet(this.zzghq.zzapp()).zzeu(this.zzghq.zzapr()).zzcm(this.zzghq.getResponseCode()).zzb(zzb).zzb(zzm).zzj(this.zzgkm).zzf(zzbl(z)).zzes(zzp.zzkw().currentTimeMillis());
        if (zzp.zzkr().zza(this.zzvr.getContentResolver()) == 0) {
            z2 = false;
        }
        return ((zztw.zzo.zza) ((zzegp) zzes.zzg(zzbl(z2)).zzbfx())).toByteArray();
    }

    public final void zzbk(boolean z) {
        zzdvl.zza(this.zzfqu.zzajc(), new zzcqw(this, z), zzbbi.zzedz);
    }

    static {
        SparseArray<zztw.zzo.zzb> sparseArray = new SparseArray<>();
        zzgkn = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zztw.zzo.zzb.CONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zztw.zzo.zzb.CONNECTING);
        zzgkn.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zztw.zzo.zzb.CONNECTING);
        zzgkn.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zztw.zzo.zzb.CONNECTING);
        zzgkn.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zztw.zzo.zzb.DISCONNECTING);
        zzgkn.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.FAILED.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.IDLE.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zztw.zzo.zzb.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            zzgkn.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zztw.zzo.zzb.CONNECTING);
        }
        zzgkn.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zztw.zzo.zzb.CONNECTING);
    }
}
