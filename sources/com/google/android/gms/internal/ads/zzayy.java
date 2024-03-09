package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzayy {
    private Handler handler;
    private int state;
    private String zzbra;
    private String zzbuo;
    private String zzdox;
    private String zzdsn;
    private int zzeas;
    private PointF zzeat;
    private PointF zzeau;
    private Runnable zzeav;
    private final Context zzvr;

    public zzayy(Context context) {
        this.state = 0;
        this.zzeav = new zzazb(this);
        this.zzvr = context;
        this.zzeas = ViewConfiguration.get(context).getScaledTouchSlop();
        zzp.zzld().zzyf();
        this.handler = zzp.zzld().getHandler();
    }

    public zzayy(Context context, String str) {
        this(context);
        this.zzdox = str;
    }

    public final void zzd(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        boolean z = false;
        if (actionMasked == 0) {
            this.state = 0;
            this.zzeat = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.state;
        if (i != -1) {
            if (i == 0 && actionMasked == 5) {
                this.state = 5;
                this.zzeau = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.handler.postDelayed(this.zzeav, ((Long) zzwe.zzpu().zzd(zzaat.zzcsz)).longValue());
            } else if (this.state == 5) {
                if (pointerCount != 2) {
                    z = true;
                } else if (actionMasked == 2) {
                    boolean z2 = false;
                    for (int i2 = 0; i2 < historySize; i2++) {
                        if (!zza(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2))) {
                            z2 = true;
                        }
                    }
                    if (!zza(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                        z = true;
                    } else {
                        z = z2;
                    }
                }
                if (z) {
                    this.state = -1;
                    this.handler.removeCallbacks(this.zzeav);
                }
            }
        }
    }

    private final boolean zza(float f, float f2, float f3, float f4) {
        return Math.abs(this.zzeat.x - f) < ((float) this.zzeas) && Math.abs(this.zzeat.y - f2) < ((float) this.zzeas) && Math.abs(this.zzeau.x - f3) < ((float) this.zzeas) && Math.abs(this.zzeau.y - f4) < ((float) this.zzeas);
    }

    public final void showDialog() {
        String str;
        String str2;
        try {
            if (!(this.zzvr instanceof Activity)) {
                zzaxy.zzfd("Can not create dialog without Activity Context");
                return;
            }
            if (!TextUtils.isEmpty(zzp.zzkz().zzyb())) {
                str = "Creative Preview (Enabled)";
            } else {
                str = "Creative Preview";
            }
            if (zzp.zzkz().zzyc()) {
                str2 = "Troubleshooting (Enabled)";
            } else {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int zza = zza((List<String>) arrayList, "Ad Information", true);
            int zza2 = zza((List<String>) arrayList, str, true);
            int zza3 = zza((List<String>) arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zzvr, zzp.zzkr().zzxv());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zzaza(this, zza, zza2, zza3));
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            zzaxy.zza("", e);
        }
    }

    public final void setAdUnitId(String str) {
        this.zzbuo = str;
    }

    public final void zzae(String str) {
        this.zzbra = str;
    }

    public final void zzet(String str) {
        this.zzdox = str;
    }

    public final void zzeu(String str) {
        this.zzdsn = str;
    }

    private static int zza(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzdox);
        sb.append(",DebugSignal: ");
        sb.append(this.zzdsn);
        sb.append(",AFMA Version: ");
        sb.append(this.zzbra);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzbuo);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzxx() {
        zzp.zzkz().zza(this.zzvr, this.zzbuo, this.zzbra, this.zzdsn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzxy() {
        zzp.zzkz().zze(this.zzvr, this.zzbuo, this.zzbra);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, DialogInterface dialogInterface, int i) {
        zzp.zzkp();
        zzayh.zza(this.zzvr, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zza(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L_0x009e
            android.content.Context r1 = r0.zzvr
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.zzaxy.zzfd(r1)
            return
        L_0x000f:
            java.lang.String r1 = r0.zzdox
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0073
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.zzp.zzkp()
            java.util.Map r1 = com.google.android.gms.internal.ads.zzayh.zzj((android.net.Uri) r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0040:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L_0x0040
        L_0x0064:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            java.lang.String r1 = "No debug information"
        L_0x0075:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.zzvr
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.internal.ads.zzazd r3 = new com.google.android.gms.internal.ads.zzazd
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.internal.ads.zzazc.zzeba
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L_0x009e:
            if (r5 != r2) goto L_0x00b1
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.zzaxy.zzef(r1)
            com.google.android.gms.internal.ads.zzdvw r1 = com.google.android.gms.internal.ads.zzbbi.zzedu
            com.google.android.gms.internal.ads.zzazf r2 = new com.google.android.gms.internal.ads.zzazf
            r2.<init>(r0)
            r1.execute(r2)
            return
        L_0x00b1:
            if (r5 != r3) goto L_0x00c3
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.zzaxy.zzef(r1)
            com.google.android.gms.internal.ads.zzdvw r1 = com.google.android.gms.internal.ads.zzbbi.zzedu
            com.google.android.gms.internal.ads.zzaze r2 = new com.google.android.gms.internal.ads.zzaze
            r2.<init>(r0)
            r1.execute(r2)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayy.zza(int, int, int, android.content.DialogInterface, int):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzxz() {
        this.state = 4;
        showDialog();
    }
}
