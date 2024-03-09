package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzdsa {
    private static final HashMap<String, Class<?>> zzhld = new HashMap<>();
    private final zzdrz zzhkr;
    private final zzdpx zzhle;
    private zzdro zzhlf;
    private final Object zzhlg = new Object();
    private final Context zzvr;
    private final zzdpy zzvw;

    public zzdsa(Context context, zzdrz zzdrz, zzdpy zzdpy, zzdpx zzdpx) {
        this.zzvr = context;
        this.zzhkr = zzdrz;
        this.zzvw = zzdpy;
        this.zzhle = zzdpx;
    }

    private final synchronized Class<?> zza(zzdrn zzdrn) throws zzdrx {
        if (zzdrn.zzavw() != null) {
            String zzdg = zzdrn.zzavw().zzdg();
            Class<?> cls = zzhld.get(zzdg);
            if (cls != null) {
                return cls;
            }
            try {
                if (this.zzhle.zzb(zzdrn.zzavx())) {
                    File zzavy = zzdrn.zzavy();
                    if (!zzavy.exists()) {
                        zzavy.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzdrn.zzavx().getAbsolutePath(), zzavy.getAbsolutePath(), (String) null, this.zzvr.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    zzhld.put(zzdg, loadClass);
                    return loadClass;
                }
                throw new zzdrx(2026, "VM did not pass signature verification");
            } catch (GeneralSecurityException e) {
                throw new zzdrx(2026, (Throwable) e);
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
                throw new zzdrx(2008, e2);
            }
        } else {
            throw new zzdrx(4010, "mc");
        }
    }

    private final Object zza(Class<?> cls, zzdrn zzdrn) throws zzdrx {
        try {
            return cls.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.zzvr, "msa-r", zzdrn.zzavz(), null, new Bundle(), 2});
        } catch (Exception e) {
            throw new zzdrx(2004, (Throwable) e);
        }
    }

    public final void zzb(zzdrn zzdrn) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzdro zzdro = new zzdro(zza(zza(zzdrn), zzdrn), zzdrn, this.zzhkr, this.zzvw);
            if (zzdro.zzawb()) {
                int zzawc = zzdro.zzawc();
                if (zzawc == 0) {
                    synchronized (this.zzhlg) {
                        if (this.zzhlf != null) {
                            try {
                                this.zzhlf.close();
                            } catch (zzdrx e) {
                                this.zzvw.zza(e.zzawg(), -1, (Exception) e);
                            }
                        }
                        this.zzhlf = zzdro;
                    }
                    this.zzvw.zzg((int) PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                    return;
                }
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(zzawc);
                throw new zzdrx(4001, sb.toString());
            }
            throw new zzdrx(4000, "init failed");
        } catch (zzdrx e2) {
            this.zzvw.zza(e2.zzawg(), System.currentTimeMillis() - currentTimeMillis, (Exception) e2);
        } catch (Exception e3) {
            this.zzvw.zza(4010, System.currentTimeMillis() - currentTimeMillis, e3);
        }
    }

    public final zzdqe zzawh() {
        zzdro zzdro;
        synchronized (this.zzhlg) {
            zzdro = this.zzhlf;
        }
        return zzdro;
    }

    public final zzdrn zzawi() {
        synchronized (this.zzhlg) {
            if (this.zzhlf == null) {
                return null;
            }
            zzdrn zzawa = this.zzhlf.zzawa();
            return zzawa;
        }
    }
}
