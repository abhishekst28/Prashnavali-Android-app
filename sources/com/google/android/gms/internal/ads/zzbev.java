package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzbev implements Releasable {
    protected Context mContext;
    protected String zzecp;
    protected WeakReference<zzbde> zzekx;

    public zzbev(zzbde zzbde) {
        this.mContext = zzbde.getContext();
        this.zzecp = zzp.zzkp().zzs(this.mContext, zzbde.zzzt().zzbra);
        this.zzekx = new WeakReference<>(zzbde);
    }

    public abstract void abort();

    public abstract boolean zzfn(String str);

    public boolean zze(String str, String[] strArr) {
        return zzfn(str);
    }

    /* access modifiers changed from: protected */
    public void zzdm(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzdl(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzdn(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzdo(int i) {
    }

    public void release() {
    }

    public final void zza(String str, String str2, long j, long j2, boolean z, int i, int i2) {
        zzbat.zzaah.post(new zzbex(this, str, str2, j, j2, z, i, i2));
    }

    public final void zza(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzbat.zzaah.post(new zzbew(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* access modifiers changed from: protected */
    public final void zza(String str, String str2, int i) {
        zzbat.zzaah.post(new zzbez(this, str, str2, i));
    }

    public final void zzc(String str, String str2, long j) {
        zzbat.zzaah.post(new zzbey(this, str, str2, j));
    }

    public final void zza(String str, String str2, String str3, String str4) {
        zzbat.zzaah.post(new zzbfb(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    public String zzfo(String str) {
        zzwe.zzpq();
        return zzbat.zzex(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zzfp(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1947652542: goto L_0x007e;
                case -1396664534: goto L_0x0073;
                case -1347010958: goto L_0x0069;
                case -918817863: goto L_0x005e;
                case -659376217: goto L_0x0054;
                case -642208130: goto L_0x004a;
                case -354048396: goto L_0x003f;
                case -32082395: goto L_0x0034;
                case 3387234: goto L_0x002a;
                case 96784904: goto L_0x0020;
                case 580119100: goto L_0x0015;
                case 725497484: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0088
        L_0x000a:
            java.lang.String r0 = "noCacheDir"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 7
            goto L_0x0089
        L_0x0015:
            java.lang.String r0 = "expireFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 6
            goto L_0x0089
        L_0x0020:
            java.lang.String r0 = "error"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 1
            goto L_0x0089
        L_0x002a:
            java.lang.String r0 = "noop"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 4
            goto L_0x0089
        L_0x0034:
            java.lang.String r0 = "externalAbort"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 10
            goto L_0x0089
        L_0x003f:
            java.lang.String r0 = "sizeExceeded"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 11
            goto L_0x0089
        L_0x004a:
            java.lang.String r0 = "playerFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 5
            goto L_0x0089
        L_0x0054:
            java.lang.String r0 = "contentLengthMissing"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x0089
        L_0x005e:
            java.lang.String r0 = "downloadTimeout"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 9
            goto L_0x0089
        L_0x0069:
            java.lang.String r0 = "inProgress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 2
            goto L_0x0089
        L_0x0073:
            java.lang.String r0 = "badUrl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 8
            goto L_0x0089
        L_0x007e:
            java.lang.String r0 = "interrupted"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0008
            r1 = 3
            goto L_0x0089
        L_0x0088:
            r1 = -1
        L_0x0089:
            java.lang.String r0 = "internal"
            switch(r1) {
                case 0: goto L_0x009a;
                case 1: goto L_0x009a;
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 4: goto L_0x009a;
                case 5: goto L_0x009a;
                case 6: goto L_0x0096;
                case 7: goto L_0x0096;
                case 8: goto L_0x0092;
                case 9: goto L_0x0092;
                case 10: goto L_0x008f;
                case 11: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x009c
        L_0x008f:
            java.lang.String r0 = "policy"
            goto L_0x009c
        L_0x0092:
            java.lang.String r0 = "network"
            goto L_0x009c
        L_0x0096:
            java.lang.String r0 = "io"
            goto L_0x009c
        L_0x009a:
        L_0x009c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbev.zzfp(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    public final void zza(String str, Map<String, String> map) {
        zzbde zzbde = (zzbde) this.zzekx.get();
        if (zzbde != null) {
            zzbde.zza(str, map);
        }
    }
}
