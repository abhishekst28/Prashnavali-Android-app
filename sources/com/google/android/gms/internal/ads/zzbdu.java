package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbdu implements zzom {
    private static final Pattern zzbia = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzbib = new AtomicReference<>();
    private final int zzbid;
    private final int zzbie;
    private final String zzbif;
    private final zzou zzbii;
    private final zzpa<? super zzbdu> zzbij;
    private zzon zzbik;
    private HttpURLConnection zzbil;
    private InputStream zzbim;
    private boolean zzbin;
    private long zzbio;
    private long zzbip;
    private long zzbiq;
    private long zzcq;
    private SSLSocketFactory zzeje = new zzbdx(this);
    /* access modifiers changed from: private */
    public int zzejf;
    private Set<Socket> zzejg = new HashSet();

    zzbdu(String str, zzpa<? super zzbdu> zzpa, int i, int i2, int i3) {
        this.zzbif = zzoz.checkNotEmpty(str);
        this.zzbij = zzpa;
        this.zzbii = new zzou();
        this.zzbid = i;
        this.zzbie = i2;
        this.zzejf = i3;
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.zzbil;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f6 A[Catch:{ IOException -> 0x0257 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0236 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00db A[Catch:{ IOException -> 0x0257 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e8 A[Catch:{ IOException -> 0x0257 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ea A[Catch:{ IOException -> 0x0257 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0 A[Catch:{ IOException -> 0x0257 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0123 A[Catch:{ IOException -> 0x0257 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zza(com.google.android.gms.internal.ads.zzon r24) throws com.google.android.gms.internal.ads.zzos {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "Unable to connect to "
            r1.zzbik = r2
            r4 = 0
            r1.zzcq = r4
            r1.zzbiq = r4
            r6 = 1
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0257 }
            android.net.Uri r7 = r2.uri     // Catch:{ IOException -> 0x0257 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0257 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0257 }
            byte[] r7 = r2.zzbhy     // Catch:{ IOException -> 0x0257 }
            long r8 = r2.position     // Catch:{ IOException -> 0x0257 }
            long r10 = r2.zzcp     // Catch:{ IOException -> 0x0257 }
            boolean r12 = r2.isFlagSet(r6)     // Catch:{ IOException -> 0x0257 }
            r14 = 0
        L_0x0026:
            int r15 = r14 + 1
            r6 = 20
            if (r14 > r6) goto L_0x023e
            java.net.URLConnection r14 = r0.openConnection()     // Catch:{ IOException -> 0x0257 }
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch:{ IOException -> 0x0257 }
            boolean r13 = r14 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0257 }
            if (r13 == 0) goto L_0x003f
            r13 = r14
            javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch:{ IOException -> 0x0257 }
            javax.net.ssl.SSLSocketFactory r6 = r1.zzeje     // Catch:{ IOException -> 0x0257 }
            r13.setSSLSocketFactory(r6)     // Catch:{ IOException -> 0x0257 }
        L_0x003f:
            int r6 = r1.zzbid     // Catch:{ IOException -> 0x0257 }
            r14.setConnectTimeout(r6)     // Catch:{ IOException -> 0x0257 }
            int r6 = r1.zzbie     // Catch:{ IOException -> 0x0257 }
            r14.setReadTimeout(r6)     // Catch:{ IOException -> 0x0257 }
            com.google.android.gms.internal.ads.zzou r6 = r1.zzbii     // Catch:{ IOException -> 0x0257 }
            java.util.Map r6 = r6.zzir()     // Catch:{ IOException -> 0x0257 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ IOException -> 0x0257 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x0257 }
        L_0x0057:
            boolean r13 = r6.hasNext()     // Catch:{ IOException -> 0x0257 }
            if (r13 == 0) goto L_0x0077
            java.lang.Object r13 = r6.next()     // Catch:{ IOException -> 0x0257 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ IOException -> 0x0257 }
            java.lang.Object r17 = r13.getKey()     // Catch:{ IOException -> 0x0257 }
            r4 = r17
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0257 }
            java.lang.Object r5 = r13.getValue()     // Catch:{ IOException -> 0x0257 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0257 }
            r14.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0257 }
            r4 = 0
            goto L_0x0057
        L_0x0077:
            r4 = -1
            r17 = 0
            int r6 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r6 != 0) goto L_0x0087
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            r16 = r8
            goto L_0x00d2
        L_0x0087:
            r6 = 27
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0257 }
            r13.<init>(r6)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r6 = "bytes="
            r13.append(r6)     // Catch:{ IOException -> 0x0257 }
            r13.append(r8)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r6 = "-"
            r13.append(r6)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r6 = r13.toString()     // Catch:{ IOException -> 0x0257 }
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00cb
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0257 }
            long r19 = r8 + r10
            r21 = 1
            long r4 = r19 - r21
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0257 }
            int r13 = r13.length()     // Catch:{ IOException -> 0x0257 }
            r16 = 20
            int r13 = r13 + 20
            r16 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0257 }
            r8.<init>(r13)     // Catch:{ IOException -> 0x0257 }
            r8.append(r6)     // Catch:{ IOException -> 0x0257 }
            r8.append(r4)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r6 = r8.toString()     // Catch:{ IOException -> 0x0257 }
            goto L_0x00cd
        L_0x00cb:
            r16 = r8
        L_0x00cd:
            java.lang.String r4 = "Range"
            r14.setRequestProperty(r4, r6)     // Catch:{ IOException -> 0x0257 }
        L_0x00d2:
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = r1.zzbif     // Catch:{ IOException -> 0x0257 }
            r14.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0257 }
            if (r12 != 0) goto L_0x00e2
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "identity"
            r14.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0257 }
        L_0x00e2:
            r4 = 0
            r14.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x0257 }
            if (r7 == 0) goto L_0x00ea
            r4 = 1
            goto L_0x00eb
        L_0x00ea:
            r4 = 0
        L_0x00eb:
            r14.setDoOutput(r4)     // Catch:{ IOException -> 0x0257 }
            if (r7 == 0) goto L_0x010a
            java.lang.String r4 = "POST"
            r14.setRequestMethod(r4)     // Catch:{ IOException -> 0x0257 }
            int r4 = r7.length     // Catch:{ IOException -> 0x0257 }
            if (r4 == 0) goto L_0x010a
            int r4 = r7.length     // Catch:{ IOException -> 0x0257 }
            r14.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x0257 }
            r14.connect()     // Catch:{ IOException -> 0x0257 }
            java.io.OutputStream r4 = r14.getOutputStream()     // Catch:{ IOException -> 0x0257 }
            r4.write(r7)     // Catch:{ IOException -> 0x0257 }
            r4.close()     // Catch:{ IOException -> 0x0257 }
            goto L_0x010d
        L_0x010a:
            r14.connect()     // Catch:{ IOException -> 0x0257 }
        L_0x010d:
            int r4 = r14.getResponseCode()     // Catch:{ IOException -> 0x0257 }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x01e6
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x01e6
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x01e6
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x01e6
            if (r7 != 0) goto L_0x0132
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x012d
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x0132
        L_0x012d:
            r5 = 0
            r7 = 0
            goto L_0x01e9
        L_0x0132:
            r1.zzbil = r14     // Catch:{ IOException -> 0x0257 }
            int r0 = r14.getResponseCode()     // Catch:{ IOException -> 0x01bf }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x01a3
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 <= r4) goto L_0x0144
            goto L_0x01a3
        L_0x0144:
            if (r0 != r3) goto L_0x0151
            long r3 = r2.position
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0153
            long r4 = r2.position
            goto L_0x0154
        L_0x0151:
            r5 = 0
        L_0x0153:
            r4 = r5
        L_0x0154:
            r1.zzbio = r4
            r3 = 1
            boolean r0 = r2.isFlagSet(r3)
            if (r0 != 0) goto L_0x017e
            long r3 = r2.zzcp
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x016a
            long r3 = r2.zzcp
            r1.zzbip = r3
            goto L_0x0182
        L_0x016a:
            java.net.HttpURLConnection r0 = r1.zzbil
            long r3 = zzc(r0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x017a
            long r5 = r1.zzbio
            long r4 = r3 - r5
            goto L_0x017b
        L_0x017a:
            r4 = r5
        L_0x017b:
            r1.zzbip = r4
            goto L_0x0182
        L_0x017e:
            long r3 = r2.zzcp
            r1.zzbip = r3
        L_0x0182:
            java.net.HttpURLConnection r0 = r1.zzbil     // Catch:{ IOException -> 0x0198 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0198 }
            r1.zzbim = r0     // Catch:{ IOException -> 0x0198 }
            r3 = 1
            r1.zzbin = r3
            com.google.android.gms.internal.ads.zzpa<? super com.google.android.gms.internal.ads.zzbdu> r0 = r1.zzbij
            if (r0 == 0) goto L_0x0195
            r0.zza(r1, r2)
        L_0x0195:
            long r2 = r1.zzbip
            return r2
        L_0x0198:
            r0 = move-exception
            r23.zzio()
            com.google.android.gms.internal.ads.zzos r3 = new com.google.android.gms.internal.ads.zzos
            r4 = 1
            r3.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.zzon) r2, (int) r4)
            throw r3
        L_0x01a3:
            java.net.HttpURLConnection r3 = r1.zzbil
            java.util.Map r3 = r3.getHeaderFields()
            r23.zzio()
            com.google.android.gms.internal.ads.zzor r4 = new com.google.android.gms.internal.ads.zzor
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x01be
            com.google.android.gms.internal.ads.zzoo r0 = new com.google.android.gms.internal.ads.zzoo
            r7 = 0
            r0.<init>(r7)
            r4.initCause(r0)
        L_0x01be:
            throw r4
        L_0x01bf:
            r0 = move-exception
            r4 = r0
            r23.zzio()
            com.google.android.gms.internal.ads.zzos r0 = new com.google.android.gms.internal.ads.zzos
            android.net.Uri r5 = r2.uri
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x01db
            java.lang.String r3 = r3.concat(r5)
            goto L_0x01e1
        L_0x01db:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x01e1:
            r5 = 1
            r0.<init>(r3, r4, r2, r5)
            throw r0
        L_0x01e6:
            r5 = 0
            r7 = 0
        L_0x01e9:
            r4 = 0
            java.lang.String r8 = "Location"
            java.lang.String r8 = r14.getHeaderField(r8)     // Catch:{ IOException -> 0x0257 }
            r14.disconnect()     // Catch:{ IOException -> 0x0257 }
            if (r8 == 0) goto L_0x0236
            java.net.URL r9 = new java.net.URL     // Catch:{ IOException -> 0x0257 }
            r9.<init>(r0, r8)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r0 = r9.getProtocol()     // Catch:{ IOException -> 0x0257 }
            java.lang.String r8 = "https"
            boolean r8 = r8.equals(r0)     // Catch:{ IOException -> 0x0257 }
            if (r8 != 0) goto L_0x022b
            java.lang.String r8 = "http"
            boolean r8 = r8.equals(r0)     // Catch:{ IOException -> 0x0257 }
            if (r8 != 0) goto L_0x022b
            java.net.ProtocolException r4 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0257 }
            java.lang.String r5 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0257 }
            int r6 = r0.length()     // Catch:{ IOException -> 0x0257 }
            if (r6 == 0) goto L_0x0222
            java.lang.String r0 = r5.concat(r0)     // Catch:{ IOException -> 0x0257 }
            goto L_0x0227
        L_0x0222:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0257 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0257 }
        L_0x0227:
            r4.<init>(r0)     // Catch:{ IOException -> 0x0257 }
            throw r4     // Catch:{ IOException -> 0x0257 }
        L_0x022b:
            r7 = r4
            r4 = r5
            r0 = r9
            r14 = r15
            r8 = r16
            r6 = 1
            goto L_0x0026
        L_0x0236:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0257 }
            java.lang.String r4 = "Null location redirect"
            r0.<init>(r4)     // Catch:{ IOException -> 0x0257 }
            throw r0     // Catch:{ IOException -> 0x0257 }
        L_0x023e:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0257 }
            r4 = 31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0257 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r4 = "Too many redirects: "
            r5.append(r4)     // Catch:{ IOException -> 0x0257 }
            r5.append(r15)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x0257 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0257 }
            throw r0     // Catch:{ IOException -> 0x0257 }
        L_0x0257:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzos r4 = new com.google.android.gms.internal.ads.zzos
            android.net.Uri r5 = r2.uri
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x026f
            java.lang.String r3 = r3.concat(r5)
            goto L_0x0275
        L_0x026f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x0275:
            r5 = 1
            r4.<init>(r3, r0, r2, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdu.zza(com.google.android.gms.internal.ads.zzon):long");
    }

    public final int read(byte[] bArr, int i, int i2) throws zzos {
        try {
            if (this.zzbiq != this.zzbio) {
                byte[] andSet = zzbib.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.zzbiq != this.zzbio) {
                    int read = this.zzbim.read(andSet, 0, (int) Math.min(this.zzbio - this.zzbiq, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.zzbiq += (long) read;
                        if (this.zzbij != null) {
                            this.zzbij.zzc(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                zzbib.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.zzbip != -1) {
                long j = this.zzbip - this.zzcq;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j);
            }
            int read2 = this.zzbim.read(bArr, i, i2);
            if (read2 != -1) {
                this.zzcq += (long) read2;
                if (this.zzbij != null) {
                    this.zzbij.zzc(this, read2);
                }
                return read2;
            } else if (this.zzbip == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new zzos(e, this.zzbik, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r3 > 2048) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() throws com.google.android.gms.internal.ads.zzos {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.zzbim     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x007e
            java.net.HttpURLConnection r2 = r9.zzbil     // Catch:{ all -> 0x0096 }
            long r3 = r9.zzbip     // Catch:{ all -> 0x0096 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r9.zzbip     // Catch:{ all -> 0x0096 }
            goto L_0x0018
        L_0x0013:
            long r3 = r9.zzbip     // Catch:{ all -> 0x0096 }
            long r7 = r9.zzcq     // Catch:{ all -> 0x0096 }
            long r3 = r3 - r7
        L_0x0018:
            int r7 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ all -> 0x0096 }
            r8 = 19
            if (r7 == r8) goto L_0x0025
            int r7 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ all -> 0x0096 }
            r8 = 20
            if (r7 != r8) goto L_0x006e
        L_0x0025:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x006d }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0035
            int r3 = r2.read()     // Catch:{ Exception -> 0x006d }
            r4 = -1
            if (r3 != r4) goto L_0x003b
            goto L_0x006e
        L_0x0035:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x006e
        L_0x003b:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006d }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x006d }
            if (r4 != 0) goto L_0x0053
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x006d }
            if (r3 == 0) goto L_0x006c
        L_0x0053:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006d }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006d }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006d }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006d }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x006d }
        L_0x006c:
            goto L_0x006e
        L_0x006d:
            r2 = move-exception
        L_0x006e:
            java.io.InputStream r2 = r9.zzbim     // Catch:{ IOException -> 0x0074 }
            r2.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x007e
        L_0x0074:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzos r3 = new com.google.android.gms.internal.ads.zzos     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.zzon r4 = r9.zzbik     // Catch:{ all -> 0x0096 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.zzon) r4, (int) r5)     // Catch:{ all -> 0x0096 }
            throw r3     // Catch:{ all -> 0x0096 }
        L_0x007e:
            r9.zzbim = r0
            r9.zzio()
            boolean r0 = r9.zzbin
            if (r0 == 0) goto L_0x0090
            r9.zzbin = r1
            com.google.android.gms.internal.ads.zzpa<? super com.google.android.gms.internal.ads.zzbdu> r0 = r9.zzbij
            if (r0 == 0) goto L_0x0090
            r0.zze(r9)
        L_0x0090:
            java.util.Set<java.net.Socket> r0 = r9.zzejg
            r0.clear()
            return
        L_0x0096:
            r2 = move-exception
            r9.zzbim = r0
            r9.zzio()
            boolean r0 = r9.zzbin
            if (r0 == 0) goto L_0x00a9
            r9.zzbin = r1
            com.google.android.gms.internal.ads.zzpa<? super com.google.android.gms.internal.ads.zzbdu> r0 = r9.zzbij
            if (r0 == 0) goto L_0x00a9
            r0.zze(r9)
        L_0x00a9:
            java.util.Set<java.net.Socket> r0 = r9.zzejg
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdu.close():void");
    }

    /* access modifiers changed from: package-private */
    public final void setReceiveBufferSize(int i) {
        this.zzejf = i;
        for (Socket next : this.zzejg) {
            if (!next.isClosed()) {
                try {
                    next.setReceiveBufferSize(this.zzejf);
                } catch (SocketException e) {
                    zzaxy.zzd("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zza(Socket socket) {
        this.zzejg.add(socket);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long zzc(java.net.HttpURLConnection r9) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r9.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            if (r1 != 0) goto L_0x0036
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0014 }
            goto L_0x0038
        L_0x0014:
            r1 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzaxy.zzfc(r1)
        L_0x0036:
            r3 = -1
        L_0x0038:
            java.lang.String r1 = "Content-Range"
            java.lang.String r9 = r9.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x00cc
            java.util.regex.Pattern r1 = zzbia
            java.util.regex.Matcher r1 = r1.matcher(r9)
            boolean r5 = r1.find()
            if (r5 == 0) goto L_0x00cc
            r5 = 2
            java.lang.String r5 = r1.group(r5)     // Catch:{ NumberFormatException -> 0x00aa }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x00aa }
            r7 = 1
            java.lang.String r1 = r1.group(r7)     // Catch:{ NumberFormatException -> 0x00aa }
            long r7 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x006e
            r3 = r5
            goto L_0x00cc
        L_0x006e:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00a9
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + 26
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch:{ NumberFormatException -> 0x00aa }
            int r7 = r7.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00aa }
            r7.<init>(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r1 = "Inconsistent headers ["
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = "] ["
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            r7.append(r9)     // Catch:{ NumberFormatException -> 0x00aa }
            r7.append(r2)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = r7.toString()     // Catch:{ NumberFormatException -> 0x00aa }
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            long r0 = java.lang.Math.max(r3, r5)     // Catch:{ NumberFormatException -> 0x00aa }
            r3 = r0
        L_0x00a9:
            goto L_0x00cc
        L_0x00aa:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            com.google.android.gms.internal.ads.zzaxy.zzfc(r9)
        L_0x00cc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdu.zzc(java.net.HttpURLConnection):long");
    }

    private final void zzio() {
        HttpURLConnection httpURLConnection = this.zzbil;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzaxy.zzc("Unexpected error while disconnecting", e);
            }
            this.zzbil = null;
        }
    }
}
