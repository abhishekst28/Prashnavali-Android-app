package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbdb implements SensorEventListener {
    private final SensorManager zzegn;
    private final Object zzego = new Object();
    private final Display zzegp;
    private final float[] zzegq = new float[9];
    private final float[] zzegr = new float[9];
    private float[] zzegs;
    private Handler zzegt;
    private zzbdd zzegu;

    zzbdb(Context context) {
        this.zzegn = (SensorManager) context.getSystemService("sensor");
        this.zzegp = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* access modifiers changed from: package-private */
    public final void start() {
        if (this.zzegt == null) {
            Sensor defaultSensor = this.zzegn.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzaxy.zzfc("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            zzdsf zzdsf = new zzdsf(handlerThread.getLooper());
            this.zzegt = zzdsf;
            if (!this.zzegn.registerListener(this, defaultSensor, 0, zzdsf)) {
                zzaxy.zzfc("SensorManager.registerListener failed.");
                stop();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void stop() {
        if (this.zzegt != null) {
            this.zzegn.unregisterListener(this);
            this.zzegt.post(new zzbda(this));
            this.zzegt = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbdd zzbdd) {
        this.zzegu = zzbdd;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.zzego) {
                if (this.zzegs == null) {
                    this.zzegs = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.zzegq, fArr);
            int rotation = this.zzegp.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.zzegq, 2, 129, this.zzegr);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.zzegq, 129, 130, this.zzegr);
            } else if (rotation != 3) {
                System.arraycopy(this.zzegq, 0, this.zzegr, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.zzegq, 130, 1, this.zzegr);
            }
            zzl(1, 3);
            zzl(2, 6);
            zzl(5, 7);
            synchronized (this.zzego) {
                System.arraycopy(this.zzegr, 0, this.zzegs, 0, 9);
            }
            zzbdd zzbdd = this.zzegu;
            if (zzbdd != null) {
                zzbdd.zzuu();
            }
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(float[] fArr) {
        synchronized (this.zzego) {
            if (this.zzegs == null) {
                return false;
            }
            System.arraycopy(this.zzegs, 0, fArr, 0, this.zzegs.length);
            return true;
        }
    }

    private final void zzl(int i, int i2) {
        float[] fArr = this.zzegr;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }
}
