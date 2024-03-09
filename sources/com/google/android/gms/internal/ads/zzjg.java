package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzjg {
    public byte[] iv;
    private byte[] key;
    private int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    private int numSubSamples;
    private int zzanr;
    private int zzans;
    private final MediaCodec.CryptoInfo zzant;
    private final zzji zzanu;

    public zzjg() {
        MediaCodec.CryptoInfo cryptoInfo;
        zzji zzji = null;
        if (zzpq.SDK_INT >= 16) {
            cryptoInfo = new MediaCodec.CryptoInfo();
        } else {
            cryptoInfo = null;
        }
        this.zzant = cryptoInfo;
        this.zzanu = zzpq.SDK_INT >= 24 ? new zzji(this.zzant) : zzji;
    }

    public final void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.numSubSamples = i;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.iv = bArr2;
        this.mode = i2;
        this.zzanr = 0;
        this.zzans = 0;
        if (zzpq.SDK_INT >= 16) {
            this.zzant.numSubSamples = this.numSubSamples;
            this.zzant.numBytesOfClearData = this.numBytesOfClearData;
            this.zzant.numBytesOfEncryptedData = this.numBytesOfEncryptedData;
            this.zzant.key = this.key;
            this.zzant.iv = this.iv;
            this.zzant.mode = this.mode;
            if (zzpq.SDK_INT >= 24) {
                this.zzanu.set(0, 0);
            }
        }
    }

    public final MediaCodec.CryptoInfo zzgh() {
        return this.zzant;
    }
}
