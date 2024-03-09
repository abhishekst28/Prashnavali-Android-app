package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbdx extends SSLSocketFactory {
    private SSLSocketFactory zzejm = ((SSLSocketFactory) SSLSocketFactory.getDefault());
    private final /* synthetic */ zzbdu zzejn;

    zzbdx(zzbdu zzbdu) {
        this.zzejn = zzbdu;
    }

    public final String[] getDefaultCipherSuites() {
        return this.zzejm.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.zzejm.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return zzb(this.zzejm.createSocket(socket, str, i, z));
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return zzb(this.zzejm.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return zzb(this.zzejm.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return zzb(this.zzejm.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return zzb(this.zzejm.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private final Socket zzb(Socket socket) throws SocketException {
        if (this.zzejn.zzejf > 0) {
            socket.setReceiveBufferSize(this.zzejn.zzejf);
        }
        this.zzejn.zza(socket);
        return socket;
    }
}
