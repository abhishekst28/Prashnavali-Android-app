package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdt implements Runnable {
    private final /* synthetic */ zzdu zzwf;

    zzdt(zzdu zzdu) {
        this.zzwf = zzdu;
    }

    public final void run() {
        boolean z;
        if (this.zzwf.zzwj == null) {
            synchronized (zzdu.zzwh) {
                if (this.zzwf.zzwj == null) {
                    boolean z2 = false;
                    try {
                        z = zzaat.zzcqi.get().booleanValue();
                    } catch (IllegalStateException e) {
                        z = false;
                    }
                    if (z) {
                        try {
                            zzdu.zzwi = new zztt(this.zzwf.zzwg.zzvr, "ADSHIELD", (String) null);
                        } catch (Throwable th) {
                        }
                    }
                    z2 = z;
                    this.zzwf.zzwj = Boolean.valueOf(z2);
                    zzdu.zzwh.open();
                }
            }
        }
    }
}
