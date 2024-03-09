package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzapw extends zzaqg {
    private static final Set<String> zzdmi = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private int height = -1;
    private final Object lock = new Object();
    private int width = -1;
    private zzaqf zzdet;
    private final zzbfq zzdgc;
    private final Activity zzdly;
    private String zzdmj = "top-right";
    private boolean zzdmk = true;
    private int zzdml = 0;
    private int zzdmm = 0;
    private int zzdmn = 0;
    private int zzdmo = 0;
    private zzbhj zzdmp;
    private ImageView zzdmq;
    private LinearLayout zzdmr;
    private PopupWindow zzdms;
    private RelativeLayout zzdmt;
    private ViewGroup zzdmu;

    public zzapw(zzbfq zzbfq, zzaqf zzaqf) {
        super(zzbfq, "resize");
        this.zzdgc = zzbfq;
        this.zzdly = zzbfq.zzzq();
        this.zzdet = zzaqf;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024a A[Catch:{ RuntimeException -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x024c A[Catch:{ RuntimeException -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02ab A[Catch:{ RuntimeException -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02b2 A[Catch:{ RuntimeException -> 0x0477 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.Object r2 = r1.lock
            monitor-enter(r2)
            android.app.Activity r3 = r1.zzdly     // Catch:{ all -> 0x04cd }
            if (r3 != 0) goto L_0x0012
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r1.zzdx(r0)     // Catch:{ all -> 0x04cd }
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.zzbfq r3 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbhj r3 = r3.zzabc()     // Catch:{ all -> 0x04cd }
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r1.zzdx(r0)     // Catch:{ all -> 0x04cd }
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x0021:
            com.google.android.gms.internal.ads.zzbfq r3 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbhj r3 = r3.zzabc()     // Catch:{ all -> 0x04cd }
            boolean r3 = r3.zzacx()     // Catch:{ all -> 0x04cd }
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r1.zzdx(r0)     // Catch:{ all -> 0x04cd }
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x0034:
            com.google.android.gms.internal.ads.zzbfq r3 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            boolean r3 = r3.zzabj()     // Catch:{ all -> 0x04cd }
            if (r3 == 0) goto L_0x0043
            java.lang.String r0 = "Cannot resize an expanded banner."
            r1.zzdx(r0)     // Catch:{ all -> 0x04cd }
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x0043:
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04cd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04cd }
            if (r3 != 0) goto L_0x0063
            com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04cd }
            int r3 = com.google.android.gms.internal.ads.zzayh.zzen(r3)     // Catch:{ all -> 0x04cd }
            r1.width = r3     // Catch:{ all -> 0x04cd }
        L_0x0063:
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04cd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04cd }
            if (r3 != 0) goto L_0x0082
            com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04cd }
            int r3 = com.google.android.gms.internal.ads.zzayh.zzen(r3)     // Catch:{ all -> 0x04cd }
            r1.height = r3     // Catch:{ all -> 0x04cd }
        L_0x0082:
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04cd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04cd }
            if (r3 != 0) goto L_0x00a1
            com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04cd }
            int r3 = com.google.android.gms.internal.ads.zzayh.zzen(r3)     // Catch:{ all -> 0x04cd }
            r1.zzdmn = r3     // Catch:{ all -> 0x04cd }
        L_0x00a1:
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04cd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04cd }
            if (r3 != 0) goto L_0x00c0
            com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04cd }
            int r3 = com.google.android.gms.internal.ads.zzayh.zzen(r3)     // Catch:{ all -> 0x04cd }
            r1.zzdmo = r3     // Catch:{ all -> 0x04cd }
        L_0x00c0:
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04cd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04cd }
            if (r3 != 0) goto L_0x00dc
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04cd }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ all -> 0x04cd }
            r1.zzdmk = r3     // Catch:{ all -> 0x04cd }
        L_0x00dc:
            java.lang.String r3 = "customClosePosition"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x04cd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04cd }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x04cd }
            if (r3 != 0) goto L_0x00ec
            r1.zzdmj = r0     // Catch:{ all -> 0x04cd }
        L_0x00ec:
            int r0 = r1.width     // Catch:{ all -> 0x04cd }
            r3 = 1
            r4 = 0
            if (r0 < 0) goto L_0x00f9
            int r0 = r1.height     // Catch:{ all -> 0x04cd }
            if (r0 < 0) goto L_0x00f9
            r0 = 1
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r1.zzdx(r0)     // Catch:{ all -> 0x04cd }
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x0103:
            android.app.Activity r0 = r1.zzdly     // Catch:{ all -> 0x04cd }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x04cd }
            if (r0 == 0) goto L_0x04c6
            android.view.View r5 = r0.getDecorView()     // Catch:{ all -> 0x04cd }
            if (r5 != 0) goto L_0x0113
            goto L_0x04c6
        L_0x0113:
            com.google.android.gms.internal.ads.zzayh r5 = com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            android.app.Activity r6 = r1.zzdly     // Catch:{ all -> 0x04cd }
            int[] r5 = r5.zze((android.app.Activity) r6)     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzayh r6 = com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            android.app.Activity r7 = r1.zzdly     // Catch:{ all -> 0x04cd }
            int[] r6 = r6.zzf(r7)     // Catch:{ all -> 0x04cd }
            r7 = r5[r4]     // Catch:{ all -> 0x04cd }
            r5 = r5[r3]     // Catch:{ all -> 0x04cd }
            int r8 = r1.width     // Catch:{ all -> 0x04cd }
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = -1
            r13 = 2
            r14 = 50
            if (r8 < r14) goto L_0x0242
            int r8 = r1.width     // Catch:{ all -> 0x04cd }
            if (r8 <= r7) goto L_0x013e
            goto L_0x0242
        L_0x013e:
            int r8 = r1.height     // Catch:{ all -> 0x04cd }
            if (r8 < r14) goto L_0x023b
            int r8 = r1.height     // Catch:{ all -> 0x04cd }
            if (r8 <= r5) goto L_0x0148
            goto L_0x023b
        L_0x0148:
            int r8 = r1.height     // Catch:{ all -> 0x04cd }
            if (r8 != r5) goto L_0x0158
            int r5 = r1.width     // Catch:{ all -> 0x04cd }
            if (r5 != r7) goto L_0x0158
            java.lang.String r5 = "Cannot resize to a full-screen ad."
            com.google.android.gms.internal.ads.zzaxy.zzfe(r5)     // Catch:{ all -> 0x04cd }
            r5 = 0
            goto L_0x0248
        L_0x0158:
            boolean r5 = r1.zzdmk     // Catch:{ all -> 0x04cd }
            if (r5 == 0) goto L_0x0239
            java.lang.String r5 = r1.zzdmj     // Catch:{ all -> 0x04cd }
            int r8 = r5.hashCode()     // Catch:{ all -> 0x04cd }
            switch(r8) {
                case -1364013995: goto L_0x0199;
                case -1012429441: goto L_0x018f;
                case -655373719: goto L_0x0185;
                case 1163912186: goto L_0x017b;
                case 1288627767: goto L_0x0171;
                case 1755462605: goto L_0x0167;
                default: goto L_0x0166;
            }     // Catch:{ all -> 0x04cd }
        L_0x0166:
            goto L_0x01a3
        L_0x0167:
            java.lang.String r8 = "top-center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04cd }
            if (r5 == 0) goto L_0x0166
            r5 = 1
            goto L_0x01a4
        L_0x0171:
            java.lang.String r8 = "bottom-center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04cd }
            if (r5 == 0) goto L_0x0166
            r5 = 4
            goto L_0x01a4
        L_0x017b:
            java.lang.String r8 = "bottom-right"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04cd }
            if (r5 == 0) goto L_0x0166
            r5 = 5
            goto L_0x01a4
        L_0x0185:
            java.lang.String r8 = "bottom-left"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04cd }
            if (r5 == 0) goto L_0x0166
            r5 = 3
            goto L_0x01a4
        L_0x018f:
            java.lang.String r8 = "top-left"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04cd }
            if (r5 == 0) goto L_0x0166
            r5 = 0
            goto L_0x01a4
        L_0x0199:
            java.lang.String r8 = "center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04cd }
            if (r5 == 0) goto L_0x0166
            r5 = 2
            goto L_0x01a4
        L_0x01a3:
            r5 = -1
        L_0x01a4:
            if (r5 == 0) goto L_0x021e
            if (r5 == r3) goto L_0x020d
            if (r5 == r13) goto L_0x01f6
            if (r5 == r11) goto L_0x01e7
            if (r5 == r10) goto L_0x01d2
            if (r5 == r9) goto L_0x01bf
            int r5 = r1.zzdml     // Catch:{ all -> 0x04cd }
            int r8 = r1.zzdmn     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            int r8 = r1.width     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            int r5 = r5 - r14
            int r8 = r1.zzdmm     // Catch:{ all -> 0x04cd }
            int r15 = r1.zzdmo     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            goto L_0x0229
        L_0x01bf:
            int r5 = r1.zzdml     // Catch:{ all -> 0x04cd }
            int r8 = r1.zzdmn     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            int r8 = r1.width     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            int r5 = r5 - r14
            int r8 = r1.zzdmm     // Catch:{ all -> 0x04cd }
            int r15 = r1.zzdmo     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            int r15 = r1.height     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            int r8 = r8 - r14
            goto L_0x0229
        L_0x01d2:
            int r5 = r1.zzdml     // Catch:{ all -> 0x04cd }
            int r8 = r1.zzdmn     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            int r8 = r1.width     // Catch:{ all -> 0x04cd }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.zzdmm     // Catch:{ all -> 0x04cd }
            int r15 = r1.zzdmo     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            int r15 = r1.height     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            int r8 = r8 - r14
            goto L_0x0229
        L_0x01e7:
            int r5 = r1.zzdml     // Catch:{ all -> 0x04cd }
            int r8 = r1.zzdmn     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            int r8 = r1.zzdmm     // Catch:{ all -> 0x04cd }
            int r15 = r1.zzdmo     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            int r15 = r1.height     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            int r8 = r8 - r14
            goto L_0x0229
        L_0x01f6:
            int r5 = r1.zzdml     // Catch:{ all -> 0x04cd }
            int r8 = r1.zzdmn     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            int r8 = r1.width     // Catch:{ all -> 0x04cd }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.zzdmm     // Catch:{ all -> 0x04cd }
            int r15 = r1.zzdmo     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            int r15 = r1.height     // Catch:{ all -> 0x04cd }
            int r15 = r15 / r13
            int r8 = r8 + r15
            int r8 = r8 + -25
            goto L_0x0229
        L_0x020d:
            int r5 = r1.zzdml     // Catch:{ all -> 0x04cd }
            int r8 = r1.zzdmn     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            int r8 = r1.width     // Catch:{ all -> 0x04cd }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.zzdmm     // Catch:{ all -> 0x04cd }
            int r15 = r1.zzdmo     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            goto L_0x0229
        L_0x021e:
            int r5 = r1.zzdml     // Catch:{ all -> 0x04cd }
            int r8 = r1.zzdmn     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            int r8 = r1.zzdmm     // Catch:{ all -> 0x04cd }
            int r15 = r1.zzdmo     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
        L_0x0229:
            if (r5 < 0) goto L_0x0237
            int r5 = r5 + r14
            if (r5 > r7) goto L_0x0237
            r5 = r6[r4]     // Catch:{ all -> 0x04cd }
            if (r8 < r5) goto L_0x0237
            int r8 = r8 + r14
            r5 = r6[r3]     // Catch:{ all -> 0x04cd }
            if (r8 <= r5) goto L_0x0239
        L_0x0237:
            r5 = 0
            goto L_0x0248
        L_0x0239:
            r5 = 1
            goto L_0x0248
        L_0x023b:
            java.lang.String r5 = "Height is too small or too large."
            com.google.android.gms.internal.ads.zzaxy.zzfe(r5)     // Catch:{ all -> 0x04cd }
            r5 = 0
            goto L_0x0248
        L_0x0242:
            java.lang.String r5 = "Width is too small or too large."
            com.google.android.gms.internal.ads.zzaxy.zzfe(r5)     // Catch:{ all -> 0x04cd }
            r5 = 0
        L_0x0248:
            if (r5 != 0) goto L_0x024c
            r5 = 0
            goto L_0x02a8
        L_0x024c:
            boolean r5 = r1.zzdmk     // Catch:{ all -> 0x04cd }
            if (r5 == 0) goto L_0x0261
            int[] r5 = new int[r13]     // Catch:{ all -> 0x04cd }
            int r6 = r1.zzdml     // Catch:{ all -> 0x04cd }
            int r7 = r1.zzdmn     // Catch:{ all -> 0x04cd }
            int r6 = r6 + r7
            r5[r4] = r6     // Catch:{ all -> 0x04cd }
            int r6 = r1.zzdmm     // Catch:{ all -> 0x04cd }
            int r7 = r1.zzdmo     // Catch:{ all -> 0x04cd }
            int r6 = r6 + r7
            r5[r3] = r6     // Catch:{ all -> 0x04cd }
            goto L_0x02a8
        L_0x0261:
            com.google.android.gms.internal.ads.zzayh r5 = com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            android.app.Activity r6 = r1.zzdly     // Catch:{ all -> 0x04cd }
            int[] r5 = r5.zze((android.app.Activity) r6)     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzayh r6 = com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            android.app.Activity r7 = r1.zzdly     // Catch:{ all -> 0x04cd }
            int[] r6 = r6.zzf(r7)     // Catch:{ all -> 0x04cd }
            r5 = r5[r4]     // Catch:{ all -> 0x04cd }
            int r7 = r1.zzdml     // Catch:{ all -> 0x04cd }
            int r8 = r1.zzdmn     // Catch:{ all -> 0x04cd }
            int r7 = r7 + r8
            int r8 = r1.zzdmm     // Catch:{ all -> 0x04cd }
            int r15 = r1.zzdmo     // Catch:{ all -> 0x04cd }
            int r8 = r8 + r15
            if (r7 >= 0) goto L_0x0285
            r7 = 0
            goto L_0x028e
        L_0x0285:
            int r15 = r1.width     // Catch:{ all -> 0x04cd }
            int r15 = r15 + r7
            if (r15 <= r5) goto L_0x028e
            int r7 = r1.width     // Catch:{ all -> 0x04cd }
            int r7 = r5 - r7
        L_0x028e:
            r5 = r6[r4]     // Catch:{ all -> 0x04cd }
            if (r8 >= r5) goto L_0x0295
            r8 = r6[r4]     // Catch:{ all -> 0x04cd }
            goto L_0x02a2
        L_0x0295:
            int r5 = r1.height     // Catch:{ all -> 0x04cd }
            int r5 = r5 + r8
            r15 = r6[r3]     // Catch:{ all -> 0x04cd }
            if (r5 <= r15) goto L_0x02a2
            r5 = r6[r3]     // Catch:{ all -> 0x04cd }
            int r6 = r1.height     // Catch:{ all -> 0x04cd }
            int r8 = r5 - r6
        L_0x02a2:
            int[] r5 = new int[r13]     // Catch:{ all -> 0x04cd }
            r5[r4] = r7     // Catch:{ all -> 0x04cd }
            r5[r3] = r8     // Catch:{ all -> 0x04cd }
        L_0x02a8:
            if (r5 != 0) goto L_0x02b2
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r1.zzdx(r0)     // Catch:{ all -> 0x04cd }
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x02b2:
            com.google.android.gms.internal.ads.zzwe.zzpq()     // Catch:{ all -> 0x04cd }
            android.app.Activity r6 = r1.zzdly     // Catch:{ all -> 0x04cd }
            int r7 = r1.width     // Catch:{ all -> 0x04cd }
            int r6 = com.google.android.gms.internal.ads.zzbat.zzc(r6, r7)     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzwe.zzpq()     // Catch:{ all -> 0x04cd }
            android.app.Activity r7 = r1.zzdly     // Catch:{ all -> 0x04cd }
            int r8 = r1.height     // Catch:{ all -> 0x04cd }
            int r7 = com.google.android.gms.internal.ads.zzbat.zzc(r7, r8)     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbfq r8 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04cd }
            android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x04cd }
            if (r8 == 0) goto L_0x04bf
            boolean r15 = r8 instanceof android.view.ViewGroup     // Catch:{ all -> 0x04cd }
            if (r15 == 0) goto L_0x04bf
            r15 = r8
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbfq r9 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x04cd }
            r15.removeView(r9)     // Catch:{ all -> 0x04cd }
            android.widget.PopupWindow r9 = r1.zzdms     // Catch:{ all -> 0x04cd }
            if (r9 != 0) goto L_0x0315
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x04cd }
            r1.zzdmu = r8     // Catch:{ all -> 0x04cd }
            com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbfq r8 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04cd }
            android.graphics.Bitmap r8 = com.google.android.gms.internal.ads.zzayh.zzm(r8)     // Catch:{ all -> 0x04cd }
            android.widget.ImageView r9 = new android.widget.ImageView     // Catch:{ all -> 0x04cd }
            android.app.Activity r15 = r1.zzdly     // Catch:{ all -> 0x04cd }
            r9.<init>(r15)     // Catch:{ all -> 0x04cd }
            r1.zzdmq = r9     // Catch:{ all -> 0x04cd }
            r9.setImageBitmap(r8)     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbfq r8 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbhj r8 = r8.zzabc()     // Catch:{ all -> 0x04cd }
            r1.zzdmp = r8     // Catch:{ all -> 0x04cd }
            android.view.ViewGroup r8 = r1.zzdmu     // Catch:{ all -> 0x04cd }
            android.widget.ImageView r9 = r1.zzdmq     // Catch:{ all -> 0x04cd }
            r8.addView(r9)     // Catch:{ all -> 0x04cd }
            goto L_0x031a
        L_0x0315:
            android.widget.PopupWindow r8 = r1.zzdms     // Catch:{ all -> 0x04cd }
            r8.dismiss()     // Catch:{ all -> 0x04cd }
        L_0x031a:
            android.widget.RelativeLayout r8 = new android.widget.RelativeLayout     // Catch:{ all -> 0x04cd }
            android.app.Activity r9 = r1.zzdly     // Catch:{ all -> 0x04cd }
            r8.<init>(r9)     // Catch:{ all -> 0x04cd }
            r1.zzdmt = r8     // Catch:{ all -> 0x04cd }
            r8.setBackgroundColor(r4)     // Catch:{ all -> 0x04cd }
            android.widget.RelativeLayout r8 = r1.zzdmt     // Catch:{ all -> 0x04cd }
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x04cd }
            r9.<init>(r6, r7)     // Catch:{ all -> 0x04cd }
            r8.setLayoutParams(r9)     // Catch:{ all -> 0x04cd }
            com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            android.widget.RelativeLayout r8 = r1.zzdmt     // Catch:{ all -> 0x04cd }
            android.widget.PopupWindow r8 = com.google.android.gms.internal.ads.zzayh.zza((android.view.View) r8, (int) r6, (int) r7, (boolean) r4)     // Catch:{ all -> 0x04cd }
            r1.zzdms = r8     // Catch:{ all -> 0x04cd }
            r8.setOutsideTouchable(r3)     // Catch:{ all -> 0x04cd }
            android.widget.PopupWindow r8 = r1.zzdms     // Catch:{ all -> 0x04cd }
            r8.setTouchable(r3)     // Catch:{ all -> 0x04cd }
            android.widget.PopupWindow r8 = r1.zzdms     // Catch:{ all -> 0x04cd }
            boolean r9 = r1.zzdmk     // Catch:{ all -> 0x04cd }
            if (r9 != 0) goto L_0x034b
            r9 = 1
            goto L_0x034c
        L_0x034b:
            r9 = 0
        L_0x034c:
            r8.setClippingEnabled(r9)     // Catch:{ all -> 0x04cd }
            android.widget.RelativeLayout r8 = r1.zzdmt     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbfq r9 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x04cd }
            r8.addView(r9, r12, r12)     // Catch:{ all -> 0x04cd }
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch:{ all -> 0x04cd }
            android.app.Activity r9 = r1.zzdly     // Catch:{ all -> 0x04cd }
            r8.<init>(r9)     // Catch:{ all -> 0x04cd }
            r1.zzdmr = r8     // Catch:{ all -> 0x04cd }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzwe.zzpq()     // Catch:{ all -> 0x04cd }
            android.app.Activity r9 = r1.zzdly     // Catch:{ all -> 0x04cd }
            int r9 = com.google.android.gms.internal.ads.zzbat.zzc(r9, r14)     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzwe.zzpq()     // Catch:{ all -> 0x04cd }
            android.app.Activity r15 = r1.zzdly     // Catch:{ all -> 0x04cd }
            int r14 = com.google.android.gms.internal.ads.zzbat.zzc(r15, r14)     // Catch:{ all -> 0x04cd }
            r8.<init>(r9, r14)     // Catch:{ all -> 0x04cd }
            java.lang.String r9 = r1.zzdmj     // Catch:{ all -> 0x04cd }
            int r14 = r9.hashCode()     // Catch:{ all -> 0x04cd }
            switch(r14) {
                case -1364013995: goto L_0x03b6;
                case -1012429441: goto L_0x03ac;
                case -655373719: goto L_0x03a2;
                case 1163912186: goto L_0x0398;
                case 1288627767: goto L_0x038e;
                case 1755462605: goto L_0x0384;
                default: goto L_0x0383;
            }     // Catch:{ all -> 0x04cd }
        L_0x0383:
            goto L_0x03bf
        L_0x0384:
            java.lang.String r14 = "top-center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04cd }
            if (r9 == 0) goto L_0x0383
            r12 = 1
            goto L_0x03bf
        L_0x038e:
            java.lang.String r14 = "bottom-center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04cd }
            if (r9 == 0) goto L_0x0383
            r12 = 4
            goto L_0x03bf
        L_0x0398:
            java.lang.String r14 = "bottom-right"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04cd }
            if (r9 == 0) goto L_0x0383
            r12 = 5
            goto L_0x03bf
        L_0x03a2:
            java.lang.String r14 = "bottom-left"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04cd }
            if (r9 == 0) goto L_0x0383
            r12 = 3
            goto L_0x03bf
        L_0x03ac:
            java.lang.String r14 = "top-left"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04cd }
            if (r9 == 0) goto L_0x0383
            r12 = 0
            goto L_0x03bf
        L_0x03b6:
            java.lang.String r14 = "center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04cd }
            if (r9 == 0) goto L_0x0383
            r12 = 2
        L_0x03bf:
            r9 = 9
            r14 = 10
            if (r12 == 0) goto L_0x03ff
            r15 = 14
            if (r12 == r3) goto L_0x03f8
            if (r12 == r13) goto L_0x03f2
            r13 = 12
            if (r12 == r11) goto L_0x03eb
            if (r12 == r10) goto L_0x03e4
            r9 = 11
            r10 = 5
            if (r12 == r10) goto L_0x03dd
            r8.addRule(r14)     // Catch:{ all -> 0x04cd }
            r8.addRule(r9)     // Catch:{ all -> 0x04cd }
            goto L_0x0406
        L_0x03dd:
            r8.addRule(r13)     // Catch:{ all -> 0x04cd }
            r8.addRule(r9)     // Catch:{ all -> 0x04cd }
            goto L_0x0406
        L_0x03e4:
            r8.addRule(r13)     // Catch:{ all -> 0x04cd }
            r8.addRule(r15)     // Catch:{ all -> 0x04cd }
            goto L_0x0406
        L_0x03eb:
            r8.addRule(r13)     // Catch:{ all -> 0x04cd }
            r8.addRule(r9)     // Catch:{ all -> 0x04cd }
            goto L_0x0406
        L_0x03f2:
            r9 = 13
            r8.addRule(r9)     // Catch:{ all -> 0x04cd }
            goto L_0x0406
        L_0x03f8:
            r8.addRule(r14)     // Catch:{ all -> 0x04cd }
            r8.addRule(r15)     // Catch:{ all -> 0x04cd }
            goto L_0x0406
        L_0x03ff:
            r8.addRule(r14)     // Catch:{ all -> 0x04cd }
            r8.addRule(r9)     // Catch:{ all -> 0x04cd }
        L_0x0406:
            android.widget.LinearLayout r9 = r1.zzdmr     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzapv r10 = new com.google.android.gms.internal.ads.zzapv     // Catch:{ all -> 0x04cd }
            r10.<init>(r1)     // Catch:{ all -> 0x04cd }
            r9.setOnClickListener(r10)     // Catch:{ all -> 0x04cd }
            android.widget.LinearLayout r9 = r1.zzdmr     // Catch:{ all -> 0x04cd }
            java.lang.String r10 = "Close button"
            r9.setContentDescription(r10)     // Catch:{ all -> 0x04cd }
            android.widget.RelativeLayout r9 = r1.zzdmt     // Catch:{ all -> 0x04cd }
            android.widget.LinearLayout r10 = r1.zzdmr     // Catch:{ all -> 0x04cd }
            r9.addView(r10, r8)     // Catch:{ all -> 0x04cd }
            android.widget.PopupWindow r8 = r1.zzdms     // Catch:{ RuntimeException -> 0x0477 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x0477 }
            com.google.android.gms.internal.ads.zzwe.zzpq()     // Catch:{ RuntimeException -> 0x0477 }
            android.app.Activity r9 = r1.zzdly     // Catch:{ RuntimeException -> 0x0477 }
            r10 = r5[r4]     // Catch:{ RuntimeException -> 0x0477 }
            int r9 = com.google.android.gms.internal.ads.zzbat.zzc(r9, r10)     // Catch:{ RuntimeException -> 0x0477 }
            com.google.android.gms.internal.ads.zzwe.zzpq()     // Catch:{ RuntimeException -> 0x0477 }
            android.app.Activity r10 = r1.zzdly     // Catch:{ RuntimeException -> 0x0477 }
            r11 = r5[r3]     // Catch:{ RuntimeException -> 0x0477 }
            int r10 = com.google.android.gms.internal.ads.zzbat.zzc(r10, r11)     // Catch:{ RuntimeException -> 0x0477 }
            r8.showAtLocation(r0, r4, r9, r10)     // Catch:{ RuntimeException -> 0x0477 }
            r0 = r5[r4]     // Catch:{ all -> 0x04cd }
            r8 = r5[r3]     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzaqf r9 = r1.zzdet     // Catch:{ all -> 0x04cd }
            if (r9 == 0) goto L_0x044f
            com.google.android.gms.internal.ads.zzaqf r9 = r1.zzdet     // Catch:{ all -> 0x04cd }
            int r10 = r1.width     // Catch:{ all -> 0x04cd }
            int r11 = r1.height     // Catch:{ all -> 0x04cd }
            r9.zza(r0, r8, r10, r11)     // Catch:{ all -> 0x04cd }
        L_0x044f:
            com.google.android.gms.internal.ads.zzbfq r0 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbhj r6 = com.google.android.gms.internal.ads.zzbhj.zzq(r6, r7)     // Catch:{ all -> 0x04cd }
            r0.zza((com.google.android.gms.internal.ads.zzbhj) r6)     // Catch:{ all -> 0x04cd }
            r0 = r5[r4]     // Catch:{ all -> 0x04cd }
            r3 = r5[r3]     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzayh r5 = com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x04cd }
            android.app.Activity r6 = r1.zzdly     // Catch:{ all -> 0x04cd }
            int[] r5 = r5.zzf(r6)     // Catch:{ all -> 0x04cd }
            r4 = r5[r4]     // Catch:{ all -> 0x04cd }
            int r3 = r3 - r4
            int r4 = r1.width     // Catch:{ all -> 0x04cd }
            int r5 = r1.height     // Catch:{ all -> 0x04cd }
            r1.zzb(r0, r3, r4, r5)     // Catch:{ all -> 0x04cd }
            java.lang.String r0 = "resized"
            r1.zzdz(r0)     // Catch:{ all -> 0x04cd }
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x0477:
            r0 = move-exception
            java.lang.String r3 = "Cannot show popup window: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04cd }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04cd }
            int r4 = r0.length()     // Catch:{ all -> 0x04cd }
            if (r4 == 0) goto L_0x048d
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x04cd }
            goto L_0x0492
        L_0x048d:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x04cd }
            r0.<init>(r3)     // Catch:{ all -> 0x04cd }
        L_0x0492:
            r1.zzdx(r0)     // Catch:{ all -> 0x04cd }
            android.widget.RelativeLayout r0 = r1.zzdmt     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbfq r3 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x04cd }
            r0.removeView(r3)     // Catch:{ all -> 0x04cd }
            android.view.ViewGroup r0 = r1.zzdmu     // Catch:{ all -> 0x04cd }
            if (r0 == 0) goto L_0x04bd
            android.view.ViewGroup r0 = r1.zzdmu     // Catch:{ all -> 0x04cd }
            android.widget.ImageView r3 = r1.zzdmq     // Catch:{ all -> 0x04cd }
            r0.removeView(r3)     // Catch:{ all -> 0x04cd }
            android.view.ViewGroup r0 = r1.zzdmu     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbfq r3 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x04cd }
            r0.addView(r3)     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbfq r0 = r1.zzdgc     // Catch:{ all -> 0x04cd }
            com.google.android.gms.internal.ads.zzbhj r3 = r1.zzdmp     // Catch:{ all -> 0x04cd }
            r0.zza((com.google.android.gms.internal.ads.zzbhj) r3)     // Catch:{ all -> 0x04cd }
        L_0x04bd:
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x04bf:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r1.zzdx(r0)     // Catch:{ all -> 0x04cd }
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x04c6:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r1.zzdx(r0)     // Catch:{ all -> 0x04cd }
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            return
        L_0x04cd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04cd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapw.zzg(java.util.Map):void");
    }

    public final void zzac(boolean z) {
        synchronized (this.lock) {
            if (this.zzdms != null) {
                this.zzdms.dismiss();
                this.zzdmt.removeView(this.zzdgc.getView());
                if (this.zzdmu != null) {
                    this.zzdmu.removeView(this.zzdmq);
                    this.zzdmu.addView(this.zzdgc.getView());
                    this.zzdgc.zza(this.zzdmp);
                }
                if (z) {
                    zzdz("default");
                    if (this.zzdet != null) {
                        this.zzdet.zzum();
                    }
                }
                this.zzdms = null;
                this.zzdmt = null;
                this.zzdmu = null;
                this.zzdmr = null;
            }
        }
    }

    public final void zza(int i, int i2, boolean z) {
        synchronized (this.lock) {
            this.zzdml = i;
            this.zzdmm = i2;
            PopupWindow popupWindow = this.zzdms;
        }
    }

    public final boolean zzuk() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdms != null;
        }
        return z;
    }

    public final void zzi(int i, int i2) {
        this.zzdml = i;
        this.zzdmm = i2;
    }
}
