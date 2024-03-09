package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.zzp;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbdc extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzbdd {
    private static final float[] zzegv = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private int height;
    private int width;
    private final float[] zzegs = new float[9];
    private final zzbdb zzegw;
    private final float[] zzegx = new float[9];
    private final float[] zzegy = new float[9];
    private final float[] zzegz = new float[9];
    private final float[] zzeha = new float[9];
    private final float[] zzehb = new float[9];
    private final float[] zzehc = new float[9];
    private float zzehd = Float.NaN;
    private float zzehe;
    private float zzehf;
    private SurfaceTexture zzehg;
    private SurfaceTexture zzehh;
    private int zzehi;
    private int zzehj;
    private int zzehk;
    private FloatBuffer zzehl;
    private final CountDownLatch zzehm;
    private final Object zzehn;
    private EGL10 zzeho;
    private EGLDisplay zzehp;
    private EGLContext zzehq;
    private EGLSurface zzehr;
    private volatile boolean zzehs;
    private volatile boolean zzeht;

    public zzbdc(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(zzegv.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzehl = asFloatBuffer;
        asFloatBuffer.put(zzegv).position(0);
        zzbdb zzbdb = new zzbdb(context);
        this.zzegw = zzbdb;
        zzbdb.zza((zzbdd) this);
        this.zzehm = new CountDownLatch(1);
        this.zzehn = new Object();
    }

    public final void zza(SurfaceTexture surfaceTexture, int i, int i2) {
        this.width = i;
        this.height = i2;
        this.zzehh = surfaceTexture;
    }

    public final void zzm(int i, int i2) {
        synchronized (this.zzehn) {
            this.width = i;
            this.height = i2;
            this.zzehs = true;
            this.zzehn.notifyAll();
        }
    }

    public final void zzzk() {
        synchronized (this.zzehn) {
            this.zzeht = true;
            this.zzehh = null;
            this.zzehn.notifyAll();
        }
    }

    public final SurfaceTexture zzzl() {
        if (this.zzehh == null) {
            return null;
        }
        try {
            this.zzehm.await();
        } catch (InterruptedException e) {
        }
        return this.zzehg;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzehk++;
        synchronized (this.zzehn) {
            this.zzehn.notifyAll();
        }
    }

    public final void zzuu() {
        synchronized (this.zzehn) {
            this.zzehn.notifyAll();
        }
    }

    public final void run() {
        boolean z;
        String str;
        int i;
        String str2;
        EGLConfig eGLConfig;
        if (this.zzehh == null) {
            zzaxy.zzfc("SphericalVideoProcessor started with no output texture.");
            this.zzehm.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.zzeho = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.zzehp = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            z = false;
        } else {
            if (!this.zzeho.eglInitialize(this.zzehp, new int[2])) {
                z = false;
            } else {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.zzeho.eglChooseConfig(this.zzehp, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) || iArr[0] <= 0) {
                    eGLConfig = null;
                } else {
                    eGLConfig = eGLConfigArr[0];
                }
                if (eGLConfig == null) {
                    z = false;
                } else {
                    EGLContext eglCreateContext = this.zzeho.eglCreateContext(this.zzehp, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    this.zzehq = eglCreateContext;
                    if (eglCreateContext == null || eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                        z = false;
                    } else {
                        EGLSurface eglCreateWindowSurface = this.zzeho.eglCreateWindowSurface(this.zzehp, eGLConfig, this.zzehh, (int[]) null);
                        this.zzehr = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            z = false;
                        } else {
                            EGL10 egl102 = this.zzeho;
                            EGLDisplay eGLDisplay = this.zzehp;
                            EGLSurface eGLSurface = this.zzehr;
                            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.zzehq)) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        zzaai zzaai = zzaat.zzcph;
        if (!((String) zzwe.zzpu().zzd(zzaai)).equals(zzaai.zzrc())) {
            str = (String) zzwe.zzpu().zzd(zzaai);
        } else {
            str = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
        }
        int zzd = zzd(35633, str);
        if (zzd == 0) {
            i = 0;
        } else {
            zzaai zzaai2 = zzaat.zzcpi;
            if (!((String) zzwe.zzpu().zzd(zzaai2)).equals(zzaai2.zzrc())) {
                str2 = (String) zzwe.zzpu().zzd(zzaai2);
            } else {
                str2 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
            }
            int zzd2 = zzd(35632, str2);
            if (zzd2 == 0) {
                i = 0;
            } else {
                i = GLES20.glCreateProgram();
                zzfi("createProgram");
                if (i != 0) {
                    GLES20.glAttachShader(i, zzd);
                    zzfi("attachShader");
                    GLES20.glAttachShader(i, zzd2);
                    zzfi("attachShader");
                    GLES20.glLinkProgram(i);
                    zzfi("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(i, 35714, iArr2, 0);
                    zzfi("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(i));
                        GLES20.glDeleteProgram(i);
                        zzfi("deleteProgram");
                        i = 0;
                    } else {
                        GLES20.glValidateProgram(i);
                        zzfi("validateProgram");
                    }
                }
            }
        }
        this.zzehi = i;
        GLES20.glUseProgram(i);
        zzfi("useProgram");
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.zzehi, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, this.zzehl);
        zzfi("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        zzfi("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        zzfi("genTextures");
        int i2 = iArr3[0];
        GLES20.glBindTexture(36197, i2);
        zzfi("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        zzfi("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        zzfi("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        zzfi("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        zzfi("texParameteri");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.zzehi, "uVMat");
        this.zzehj = glGetUniformLocation;
        GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        boolean z2 = this.zzehi != 0;
        if (!z || !z2) {
            String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.zzeho.eglGetError()));
            String concat = valueOf.length() != 0 ? "EGL initialization failed: ".concat(valueOf) : new String("EGL initialization failed: ");
            zzaxy.zzfc(concat);
            zzp.zzkt().zza(new Throwable(concat), "SphericalVideoProcessor.run.1");
            zzzm();
            this.zzehm.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i2);
        this.zzehg = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.zzehm.countDown();
        this.zzegw.start();
        try {
            this.zzehs = true;
            while (!this.zzeht) {
                while (this.zzehk > 0) {
                    this.zzehg.updateTexImage();
                    this.zzehk--;
                }
                if (this.zzegw.zza(this.zzegs)) {
                    if (Float.isNaN(this.zzehd)) {
                        float[] fArr = this.zzegs;
                        float[] fArr2 = {0.0f, 1.0f, 0.0f};
                        float[] fArr3 = {(fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]), (fArr[3] * fArr2[0]) + (fArr[4] * fArr2[1]) + (fArr[5] * fArr2[2]), (fArr[6] * fArr2[0]) + (fArr[7] * fArr2[1]) + (fArr[8] * fArr2[2])};
                        this.zzehd = -(((float) Math.atan2((double) fArr3[1], (double) fArr3[0])) - 1.5707964f);
                    }
                    zzb(this.zzehb, this.zzehd + this.zzehe);
                } else {
                    zza(this.zzegs, -1.5707964f);
                    zzb(this.zzehb, this.zzehe);
                }
                zza(this.zzegx, 1.5707964f);
                zza(this.zzegy, this.zzehb, this.zzegx);
                zza(this.zzegz, this.zzegs, this.zzegy);
                zza(this.zzeha, this.zzehf);
                zza(this.zzehc, this.zzeha, this.zzegz);
                GLES20.glUniformMatrix3fv(this.zzehj, 1, false, this.zzehc, 0);
                GLES20.glDrawArrays(5, 0, 4);
                zzfi("drawArrays");
                GLES20.glFinish();
                this.zzeho.eglSwapBuffers(this.zzehp, this.zzehr);
                if (this.zzehs) {
                    GLES20.glViewport(0, 0, this.width, this.height);
                    zzfi("viewport");
                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.zzehi, "uFOVx");
                    int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.zzehi, "uFOVy");
                    if (this.width > this.height) {
                        GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                        GLES20.glUniform1f(glGetUniformLocation3, (((float) this.height) * 0.87266463f) / ((float) this.width));
                    } else {
                        GLES20.glUniform1f(glGetUniformLocation2, (((float) this.width) * 0.87266463f) / ((float) this.height));
                        GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                    }
                    this.zzehs = false;
                }
                try {
                    synchronized (this.zzehn) {
                        if (!this.zzeht && !this.zzehs && this.zzehk == 0) {
                            this.zzehn.wait();
                        }
                    }
                } catch (InterruptedException e) {
                }
            }
        } catch (IllegalStateException e2) {
            zzaxy.zzfe("SphericalVideoProcessor halted unexpectedly.");
        } catch (Throwable th) {
            zzaxy.zzc("SphericalVideoProcessor died.", th);
            zzp.zzkt().zza(th, "SphericalVideoProcessor.run.2");
        } finally {
            this.zzegw.stop();
            this.zzehg.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            this.zzehg = null;
            zzzm();
        }
    }

    public final void zzb(float f, float f2) {
        float f3;
        float f4;
        int i = this.width;
        int i2 = this.height;
        if (i > i2) {
            f4 = (f * 1.7453293f) / ((float) i);
            f3 = (f2 * 1.7453293f) / ((float) i);
        } else {
            f4 = (f * 1.7453293f) / ((float) i2);
            f3 = (f2 * 1.7453293f) / ((float) i2);
        }
        this.zzehe -= f4;
        float f5 = this.zzehf - f3;
        this.zzehf = f5;
        if (f5 < -1.5707964f) {
            this.zzehf = -1.5707964f;
        }
        if (this.zzehf > 1.5707964f) {
            this.zzehf = 1.5707964f;
        }
    }

    private static void zza(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void zza(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static void zzb(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static int zzd(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzfi("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        zzfi("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        zzfi("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        zzfi("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        zzfi("deleteShader");
        return 0;
    }

    private final boolean zzzm() {
        EGLSurface eGLSurface = this.zzehr;
        boolean z = false;
        if (!(eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE)) {
            z = this.zzeho.eglDestroySurface(this.zzehp, this.zzehr) | this.zzeho.eglMakeCurrent(this.zzehp, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false;
            this.zzehr = null;
        }
        EGLContext eGLContext = this.zzehq;
        if (eGLContext != null) {
            z |= this.zzeho.eglDestroyContext(this.zzehp, eGLContext);
            this.zzehq = null;
        }
        EGLDisplay eGLDisplay = this.zzehp;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = z | this.zzeho.eglTerminate(eGLDisplay);
        this.zzehp = null;
        return eglTerminate;
    }

    private static void zzfi(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }
}
