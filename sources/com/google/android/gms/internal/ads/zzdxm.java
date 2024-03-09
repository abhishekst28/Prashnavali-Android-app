package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecb;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdxm {
    private static final Logger logger = Logger.getLogger(zzdxm.class.getName());
    private static final ConcurrentMap<String, zzb> zzhrk = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zza> zzhrl = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzhrm = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzdwp<?>> zzhrn = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzdxh<?>> zzhro = new ConcurrentHashMap();

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    interface zza {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    interface zzb {
        Set<Class<?>> zzaxt();

        zzdww<?> zzayd();

        Class<?> zzaye();

        Class<?> zzayf();

        <P> zzdww<P> zzb(Class<P> cls) throws GeneralSecurityException;
    }

    private static <KeyProtoT extends zzehz> zzb zza(zzdwx<KeyProtoT> zzdwx) {
        return new zzdxo(zzdwx);
    }

    private static <KeyProtoT extends zzehz> zza zzb(zzdwx<KeyProtoT> zzdwx) {
        return new zzdxp(zzdwx);
    }

    private static synchronized zzb zzhm(String str) throws GeneralSecurityException {
        zzb zzb2;
        synchronized (zzdxm.class) {
            if (!zzhrk.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            zzb2 = (zzb) zzhrk.get(str);
        }
        return zzb2;
    }

    @Deprecated
    public static zzdwp<?> zzhn(String str) throws GeneralSecurityException {
        if (str != null) {
            zzdwp<?> zzdwp = (zzdwp) zzhrn.get(str.toLowerCase());
            if (zzdwp != null) {
                return zzdwp;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    private static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void zza(java.lang.String r8, java.lang.Class<?> r9, boolean r10) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zzdxm> r0 = com.google.android.gms.internal.ads.zzdxm.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.ads.zzdxm$zzb> r1 = zzhrk     // Catch:{ all -> 0x0093 }
            boolean r1 = r1.containsKey(r8)     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.ads.zzdxm$zzb> r1 = zzhrk     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0093 }
            com.google.android.gms.internal.ads.zzdxm$zzb r1 = (com.google.android.gms.internal.ads.zzdxm.zzb) r1     // Catch:{ all -> 0x0093 }
            java.lang.Class r2 = r1.zzaye()     // Catch:{ all -> 0x0093 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0093 }
            if (r2 != 0) goto L_0x0065
            java.util.logging.Logger r10 = logger     // Catch:{ all -> 0x0093 }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "com.google.crypto.tink.Registry"
            java.lang.String r4 = "ensureKeyManagerInsertable"
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0093 }
            int r7 = r6.length()     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x0038
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x0093 }
            goto L_0x003e
        L_0x0038:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0093 }
            r6.<init>(r5)     // Catch:{ all -> 0x0093 }
            r5 = r6
        L_0x003e:
            r10.logp(r2, r3, r4, r5)     // Catch:{ all -> 0x0093 }
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0093 }
            r4 = 0
            r3[r4] = r8     // Catch:{ all -> 0x0093 }
            r8 = 1
            java.lang.Class r1 = r1.zzaye()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0093 }
            r3[r8] = r1     // Catch:{ all -> 0x0093 }
            r8 = 2
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0093 }
            r3[r8] = r9     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0093 }
            r10.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r10     // Catch:{ all -> 0x0093 }
        L_0x0065:
            if (r10 == 0) goto L_0x0091
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r9 = zzhrm     // Catch:{ all -> 0x0093 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x0093 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0093 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0093 }
            if (r9 != 0) goto L_0x0091
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0093 }
            java.lang.String r10 = "New keys are already disallowed for key type "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0093 }
            int r1 = r8.length()     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0088
            java.lang.String r8 = r10.concat(r8)     // Catch:{ all -> 0x0093 }
            goto L_0x008d
        L_0x0088:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0093 }
            r8.<init>(r10)     // Catch:{ all -> 0x0093 }
        L_0x008d:
            r9.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x0091:
            monitor-exit(r0)
            return
        L_0x0093:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxm.zza(java.lang.String, java.lang.Class, boolean):void");
    }

    public static synchronized <P> void zza(zzdww<P> zzdww, boolean z) throws GeneralSecurityException {
        synchronized (zzdxm.class) {
            if (zzdww != null) {
                String keyType = zzdww.getKeyType();
                zza(keyType, zzdww.getClass(), z);
                if (!zzhrk.containsKey(keyType)) {
                    zzhrk.put(keyType, new zzdxl(zzdww));
                }
                zzhrm.put(keyType, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <KeyProtoT extends zzehz> void zza(zzdwx<KeyProtoT> zzdwx, boolean z) throws GeneralSecurityException {
        synchronized (zzdxm.class) {
            String keyType = zzdwx.getKeyType();
            zza(keyType, zzdwx.getClass(), true);
            if (!zzhrk.containsKey(keyType)) {
                zzhrk.put(keyType, zza(zzdwx));
                zzhrl.put(keyType, zzb(zzdwx));
            }
            zzhrm.put(keyType, true);
        }
    }

    public static synchronized <KeyProtoT extends zzehz, PublicKeyProtoT extends zzehz> void zza(zzdxj<KeyProtoT, PublicKeyProtoT> zzdxj, zzdwx<PublicKeyProtoT> zzdwx, boolean z) throws GeneralSecurityException {
        Class<?> zzayf;
        synchronized (zzdxm.class) {
            String keyType = zzdxj.getKeyType();
            String keyType2 = zzdwx.getKeyType();
            zza(keyType, zzdxj.getClass(), true);
            zza(keyType2, zzdwx.getClass(), false);
            if (!keyType.equals(keyType2)) {
                if (zzhrk.containsKey(keyType) && (zzayf = ((zzb) zzhrk.get(keyType)).zzayf()) != null) {
                    if (!zzayf.equals(zzdwx.getClass())) {
                        Logger logger2 = logger;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder(String.valueOf(keyType).length() + 96 + String.valueOf(keyType2).length());
                        sb.append("Attempted overwrite of a registered key manager for key type ");
                        sb.append(keyType);
                        sb.append(" with inconsistent public key type ");
                        sb.append(keyType2);
                        logger2.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzdxj.getClass().getName(), zzayf.getName(), zzdwx.getClass().getName()}));
                    }
                }
                if (!zzhrk.containsKey(keyType) || ((zzb) zzhrk.get(keyType)).zzayf() == null) {
                    zzhrk.put(keyType, new zzdxn(zzdxj, zzdwx));
                    zzhrl.put(keyType, zzb(zzdxj));
                }
                zzhrm.put(keyType, true);
                if (!zzhrk.containsKey(keyType2)) {
                    zzhrk.put(keyType2, zza(zzdwx));
                }
                zzhrm.put(keyType2, false);
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized <P> void zza(zzdxh<P> zzdxh) throws GeneralSecurityException {
        synchronized (zzdxm.class) {
            if (zzdxh != null) {
                Class<P> zzaxp = zzdxh.zzaxp();
                if (zzhro.containsKey(zzaxp)) {
                    zzdxh zzdxh2 = (zzdxh) zzhro.get(zzaxp);
                    if (!zzdxh.getClass().equals(zzdxh2.getClass())) {
                        Logger logger2 = logger;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(zzaxp.toString());
                        logger2.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzaxp.getName(), zzdxh2.getClass().getName(), zzdxh.getClass().getName()}));
                    }
                }
                zzhro.put(zzaxp, zzdxh);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static zzdww<?> zzho(String str) throws GeneralSecurityException {
        return zzhm(str).zzayd();
    }

    private static <P> zzdww<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzb zzhm = zzhm(str);
        if (cls == null) {
            return zzhm.zzayd();
        }
        if (zzhm.zzaxt().contains(cls)) {
            return zzhm.zzb(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzhm.zzaye());
        Set<Class<?>> zzaxt = zzhm.zzaxt();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : zzaxt) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static synchronized zzebt zza(zzebw zzebw) throws GeneralSecurityException {
        zzebt zzo;
        synchronized (zzdxm.class) {
            zzdww<?> zzho = zzho(zzebw.zzbay());
            if (((Boolean) zzhrm.get(zzebw.zzbay())).booleanValue()) {
                zzo = zzho.zzo(zzebw.zzbaz());
            } else {
                String valueOf = String.valueOf(zzebw.zzbay());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzo;
    }

    public static synchronized zzehz zzb(zzebw zzebw) throws GeneralSecurityException {
        zzehz zzn;
        synchronized (zzdxm.class) {
            zzdww<?> zzho = zzho(zzebw.zzbay());
            if (((Boolean) zzhrm.get(zzebw.zzbay())).booleanValue()) {
                zzn = zzho.zzn(zzebw.zzbaz());
            } else {
                String valueOf = String.valueOf(zzebw.zzbay());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzn;
    }

    public static <P> P zza(String str, zzehz zzehz, Class<P> cls) throws GeneralSecurityException {
        return zza(str, (Class) checkNotNull(cls)).zza(zzehz);
    }

    private static <P> P zza(String str, zzeff zzeff, Class<P> cls) throws GeneralSecurityException {
        return zza(str, cls).zzm(zzeff);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return zza(str, zzeff.zzu(bArr), (Class) checkNotNull(cls));
    }

    public static <P> zzdxf<P> zza(zzdxc zzdxc, zzdww<P> zzdww, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) checkNotNull(cls);
        zzdxq.zzc(zzdxc.zzaxx());
        zzdxf<P> zza2 = zzdxf.zza(cls2);
        for (zzecb.zzb next : zzdxc.zzaxx().zzbbm()) {
            if (next.zzaya() == zzebu.ENABLED) {
                zzdxi<P> zza3 = zza2.zza(zza(next.zzbbq().zzbay(), next.zzbbq().zzbaz(), cls2), next);
                if (next.zzbbr() == zzdxc.zzaxx().zzbbl()) {
                    zza2.zza(zza3);
                }
            }
        }
        return zza2;
    }

    public static <P> P zza(zzdxf<P> zzdxf) throws GeneralSecurityException {
        zzdxh zzdxh = (zzdxh) zzhro.get(zzdxf.zzaxp());
        if (zzdxh != null) {
            return zzdxh.zza(zzdxf);
        }
        String valueOf = String.valueOf(zzdxf.zzaxp().getName());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
    }
}
