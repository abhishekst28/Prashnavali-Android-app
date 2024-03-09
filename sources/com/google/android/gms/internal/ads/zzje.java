package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzje implements zzie {
    private int zzahi = -1;
    private float zzahw = 1.0f;
    private float zzahx = 1.0f;
    private ByteBuffer zzalb;
    private int zzame = -1;
    private ByteBuffer zzami;
    private boolean zzamj;
    private zzjf zzams;
    private ShortBuffer zzamt;
    private long zzamu;
    private long zzamv;

    public zzje() {
        ByteBuffer byteBuffer = zzaiu;
        this.zzami = byteBuffer;
        this.zzamt = byteBuffer.asShortBuffer();
        this.zzalb = zzaiu;
    }

    public final float zza(float f) {
        float zza = zzpq.zza(f, 0.1f, 8.0f);
        this.zzahw = zza;
        return zza;
    }

    public final float zzb(float f) {
        this.zzahx = zzpq.zza(f, 0.1f, 8.0f);
        return f;
    }

    public final long zzgd() {
        return this.zzamu;
    }

    public final long zzge() {
        return this.zzamv;
    }

    public final boolean zzb(int i, int i2, int i3) throws zzih {
        if (i3 != 2) {
            throw new zzih(i, i2, i3);
        } else if (this.zzame == i && this.zzahi == i2) {
            return false;
        } else {
            this.zzame = i;
            this.zzahi = i2;
            return true;
        }
    }

    public final boolean isActive() {
        return Math.abs(this.zzahw - 1.0f) >= 0.01f || Math.abs(this.zzahx - 1.0f) >= 0.01f;
    }

    public final int zzfh() {
        return this.zzahi;
    }

    public final int zzfi() {
        return 2;
    }

    public final void zzn(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzamu += (long) remaining;
            this.zzams.zza(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zzgf = (this.zzams.zzgf() * this.zzahi) << 1;
        if (zzgf > 0) {
            if (this.zzami.capacity() < zzgf) {
                ByteBuffer order = ByteBuffer.allocateDirect(zzgf).order(ByteOrder.nativeOrder());
                this.zzami = order;
                this.zzamt = order.asShortBuffer();
            } else {
                this.zzami.clear();
                this.zzamt.clear();
            }
            this.zzams.zzb(this.zzamt);
            this.zzamv += (long) zzgf;
            this.zzami.limit(zzgf);
            this.zzalb = this.zzami;
        }
    }

    public final void zzfj() {
        this.zzams.zzfj();
        this.zzamj = true;
    }

    public final ByteBuffer zzfk() {
        ByteBuffer byteBuffer = this.zzalb;
        this.zzalb = zzaiu;
        return byteBuffer;
    }

    public final boolean zzfc() {
        if (!this.zzamj) {
            return false;
        }
        zzjf zzjf = this.zzams;
        return zzjf == null || zzjf.zzgf() == 0;
    }

    public final void flush() {
        zzjf zzjf = new zzjf(this.zzame, this.zzahi);
        this.zzams = zzjf;
        zzjf.setSpeed(this.zzahw);
        this.zzams.zzc(this.zzahx);
        this.zzalb = zzaiu;
        this.zzamu = 0;
        this.zzamv = 0;
        this.zzamj = false;
    }

    public final void reset() {
        this.zzams = null;
        ByteBuffer byteBuffer = zzaiu;
        this.zzami = byteBuffer;
        this.zzamt = byteBuffer.asShortBuffer();
        this.zzalb = zzaiu;
        this.zzahi = -1;
        this.zzame = -1;
        this.zzamu = 0;
        this.zzamv = 0;
        this.zzamj = false;
    }
}
