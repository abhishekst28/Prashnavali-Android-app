package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzop implements zzom {
    private static final Pattern zzbia = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzbib = new AtomicReference<>();
    private final boolean zzbic;
    private final int zzbid;
    private final int zzbie;
    private final String zzbif;
    private final zzpm<String> zzbig = null;
    private final zzou zzbih;
    private final zzou zzbii;
    private final zzpa<? super zzop> zzbij;
    private zzon zzbik;
    private HttpURLConnection zzbil;
    private InputStream zzbim;
    private boolean zzbin;
    private long zzbio;
    private long zzbip;
    private long zzbiq;
    private long zzcq;

    public zzop(String str, zzpm<String> zzpm, zzpa<? super zzop> zzpa, int i, int i2, boolean z, zzou zzou) {
        this.zzbif = zzoz.checkNotEmpty(str);
        this.zzbij = zzpa;
        this.zzbii = new zzou();
        this.zzbid = i;
        this.zzbie = i2;
        this.zzbic = true;
        this.zzbih = null;
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.zzbil;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.zzbil;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final long zza(zzon zzon) throws zzos {
        HttpURLConnection httpURLConnection;
        HttpURLConnection zza;
        zzon zzon2 = zzon;
        this.zzbik = zzon2;
        long j = 0;
        this.zzcq = 0;
        this.zzbiq = 0;
        try {
            URL url = new URL(zzon2.uri.toString());
            byte[] bArr = zzon2.zzbhy;
            long j2 = zzon2.position;
            long j3 = zzon2.zzcp;
            boolean isFlagSet = zzon2.isFlagSet(1);
            if (!this.zzbic) {
                httpURLConnection = zza(url, bArr, j2, j3, isFlagSet, true);
            } else {
                URL url2 = url;
                byte[] bArr2 = bArr;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i <= 20) {
                        URL url3 = url2;
                        int i3 = i2;
                        long j4 = j3;
                        long j5 = j2;
                        zza = zza(url2, bArr2, j2, j3, isFlagSet, false);
                        int responseCode = zza.getResponseCode();
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303) {
                            if (bArr2 != null || (responseCode != 307 && responseCode != 308)) {
                                httpURLConnection = zza;
                            }
                        }
                        bArr2 = null;
                        String headerField = zza.getHeaderField("Location");
                        zza.disconnect();
                        if (headerField != null) {
                            url2 = new URL(url3, headerField);
                            String protocol = url2.getProtocol();
                            if ("https".equals(protocol) || "http".equals(protocol)) {
                                i = i3;
                                j3 = j4;
                                j2 = j5;
                            } else {
                                String valueOf = String.valueOf(protocol);
                                throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
                            }
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i2);
                        throw new NoRouteToHostException(sb.toString());
                    }
                }
                httpURLConnection = zza;
            }
            this.zzbil = httpURLConnection;
            try {
                int responseCode2 = httpURLConnection.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map headerFields = this.zzbil.getHeaderFields();
                    zzio();
                    zzor zzor = new zzor(responseCode2, headerFields, zzon2);
                    if (responseCode2 == 416) {
                        zzor.initCause(new zzoo(0));
                    }
                    throw zzor;
                }
                this.zzbil.getContentType();
                if (responseCode2 == 200 && zzon2.position != 0) {
                    j = zzon2.position;
                }
                this.zzbio = j;
                if (!zzon2.isFlagSet(1)) {
                    long j6 = -1;
                    if (zzon2.zzcp != -1) {
                        this.zzbip = zzon2.zzcp;
                    } else {
                        long zzc = zzc(this.zzbil);
                        if (zzc != -1) {
                            j6 = zzc - this.zzbio;
                        }
                        this.zzbip = j6;
                    }
                } else {
                    this.zzbip = zzon2.zzcp;
                }
                try {
                    this.zzbim = this.zzbil.getInputStream();
                    this.zzbin = true;
                    zzpa<? super zzop> zzpa = this.zzbij;
                    if (zzpa != null) {
                        zzpa.zza(this, zzon2);
                    }
                    return this.zzbip;
                } catch (IOException e) {
                    zzio();
                    throw new zzos(e, zzon2, 1);
                }
            } catch (IOException e2) {
                IOException iOException = e2;
                zzio();
                String valueOf2 = String.valueOf(zzon2.uri.toString());
                throw new zzos(valueOf2.length() != 0 ? "Unable to connect to ".concat(valueOf2) : new String("Unable to connect to "), iOException, zzon2, 1);
            }
        } catch (IOException e3) {
            String valueOf3 = String.valueOf(zzon2.uri.toString());
            throw new zzos(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e3, zzon2, 1);
        }
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
            java.io.InputStream r2 = r9.zzbim     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x007e
            java.net.HttpURLConnection r2 = r9.zzbil     // Catch:{ all -> 0x0092 }
            long r3 = r9.zzbip     // Catch:{ all -> 0x0092 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r9.zzbip     // Catch:{ all -> 0x0092 }
            goto L_0x0018
        L_0x0013:
            long r3 = r9.zzbip     // Catch:{ all -> 0x0092 }
            long r7 = r9.zzcq     // Catch:{ all -> 0x0092 }
            long r3 = r3 - r7
        L_0x0018:
            int r7 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ all -> 0x0092 }
            r8 = 19
            if (r7 == r8) goto L_0x0025
            int r7 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ all -> 0x0092 }
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
            com.google.android.gms.internal.ads.zzos r3 = new com.google.android.gms.internal.ads.zzos     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzon r4 = r9.zzbik     // Catch:{ all -> 0x0092 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.zzon) r4, (int) r5)     // Catch:{ all -> 0x0092 }
            throw r3     // Catch:{ all -> 0x0092 }
        L_0x007e:
            r9.zzbim = r0
            r9.zzio()
            boolean r0 = r9.zzbin
            if (r0 == 0) goto L_0x0091
            r9.zzbin = r1
            com.google.android.gms.internal.ads.zzpa<? super com.google.android.gms.internal.ads.zzop> r0 = r9.zzbij
            if (r0 == 0) goto L_0x0091
            r0.zze(r9)
            return
        L_0x0091:
            return
        L_0x0092:
            r2 = move-exception
            r9.zzbim = r0
            r9.zzio()
            boolean r0 = r9.zzbin
            if (r0 == 0) goto L_0x00a5
            r9.zzbin = r1
            com.google.android.gms.internal.ads.zzpa<? super com.google.android.gms.internal.ads.zzop> r0 = r9.zzbij
            if (r0 == 0) goto L_0x00a5
            r0.zze(r9)
        L_0x00a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzop.close():void");
    }

    private final HttpURLConnection zza(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzbid);
        httpURLConnection.setReadTimeout(this.zzbie);
        for (Map.Entry next : this.zzbii.zzir().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j + j2) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.zzbif);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long zzc(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x0038
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0016 }
            goto L_0x003a
        L_0x0016:
            r1 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r3, r1)
        L_0x0038:
            r4 = -1
        L_0x003a:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00ce
            java.util.regex.Pattern r1 = zzbia
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00ce
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x00ac }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00ac }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x00ac }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00ac }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0070
            r4 = r6
            goto L_0x00ce
        L_0x0070:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ac }
            int r1 = r1.length()     // Catch:{ NumberFormatException -> 0x00ac }
            int r1 = r1 + 26
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00ac }
            int r8 = r8.length()     // Catch:{ NumberFormatException -> 0x00ac }
            int r1 = r1 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00ac }
            r8.<init>(r1)     // Catch:{ NumberFormatException -> 0x00ac }
            java.lang.String r1 = "Inconsistent headers ["
            r8.append(r1)     // Catch:{ NumberFormatException -> 0x00ac }
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00ac }
            java.lang.String r0 = "] ["
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00ac }
            r8.append(r10)     // Catch:{ NumberFormatException -> 0x00ac }
            r8.append(r2)     // Catch:{ NumberFormatException -> 0x00ac }
            java.lang.String r0 = r8.toString()     // Catch:{ NumberFormatException -> 0x00ac }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x00ac }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x00ac }
            r4 = r0
        L_0x00ab:
            goto L_0x00ce
        L_0x00ac:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            android.util.Log.e(r3, r10)
        L_0x00ce:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzop.zzc(java.net.HttpURLConnection):long");
    }

    private final void zzio() {
        HttpURLConnection httpURLConnection = this.zzbil;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzbil = null;
        }
    }
}
