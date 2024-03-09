package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzic {
    private static final int[] zzaig = {1, 2, 3, 6};
    private static final int[] zzaih = {48000, 44100, 32000};
    private static final int[] zzaii = {24000, 22050, 16000};
    private static final int[] zzaij = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzaik = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzail = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzho zza(zzpk zzpk, String str, String str2, zzjn zzjn) {
        int i;
        int i2 = zzaih[(zzpk.readUnsignedByte() & 192) >> 6];
        int readUnsignedByte = zzpk.readUnsignedByte();
        int i3 = zzaij[(readUnsignedByte & 56) >> 3];
        if ((readUnsignedByte & 4) != 0) {
            i = i3 + 1;
        } else {
            i = i3;
        }
        return zzho.zza(str, "audio/ac3", (String) null, -1, -1, i, i2, (List<byte[]>) null, zzjn, 0, str2);
    }

    public static zzho zzb(zzpk zzpk, String str, String str2, zzjn zzjn) {
        int i;
        zzpk zzpk2 = zzpk;
        zzpk.zzbp(2);
        int i2 = zzaih[(zzpk.readUnsignedByte() & 192) >> 6];
        int readUnsignedByte = zzpk.readUnsignedByte();
        int i3 = zzaij[(readUnsignedByte & 14) >> 1];
        if ((readUnsignedByte & 1) != 0) {
            i = i3 + 1;
        } else {
            i = i3;
        }
        return zzho.zza(str, "audio/eac3", (String) null, -1, -1, i, i2, (List<byte[]>) null, zzjn, 0, str2);
    }

    public static int zzfg() {
        return 1536;
    }

    public static int zzm(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = zzaig[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }
}
