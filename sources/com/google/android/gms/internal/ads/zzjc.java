package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzjc implements zzie {
    private int zzahi = -1;
    private int zzajw = 0;
    private ByteBuffer zzalb = zzaiu;
    private int zzame = -1;
    private ByteBuffer zzami = zzaiu;
    private boolean zzamj;

    public final boolean zzb(int i, int i2, int i3) throws zzih {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new zzih(i, i2, i3);
        } else if (this.zzame == i && this.zzahi == i2 && this.zzajw == i3) {
            return false;
        } else {
            this.zzame = i;
            this.zzahi = i2;
            this.zzajw = i3;
            if (i3 != 2) {
                return true;
            }
            this.zzami = zzaiu;
            return true;
        }
    }

    public final boolean isActive() {
        int i = this.zzajw;
        return (i == 0 || i == 2) ? false : true;
    }

    public final int zzfh() {
        return this.zzahi;
    }

    public final int zzfi() {
        return 2;
    }

    public final void zzn(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzajw;
        if (i3 == Integer.MIN_VALUE) {
            i = (i2 / 3) << 1;
        } else if (i3 == 3) {
            i = i2 << 1;
        } else if (i3 == 1073741824) {
            i = i2 / 2;
        } else {
            throw new IllegalStateException();
        }
        if (this.zzami.capacity() < i) {
            this.zzami = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzami.clear();
        }
        int i4 = this.zzajw;
        if (i4 == Integer.MIN_VALUE) {
            while (position < limit) {
                this.zzami.put(byteBuffer.get(position + 1));
                this.zzami.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i4 == 3) {
            while (position < limit) {
                this.zzami.put((byte) 0);
                this.zzami.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        } else if (i4 == 1073741824) {
            while (position < limit) {
                this.zzami.put(byteBuffer.get(position + 2));
                this.zzami.put(byteBuffer.get(position + 3));
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        this.zzami.flip();
        this.zzalb = this.zzami;
    }

    public final void zzfj() {
        this.zzamj = true;
    }

    public final ByteBuffer zzfk() {
        ByteBuffer byteBuffer = this.zzalb;
        this.zzalb = zzaiu;
        return byteBuffer;
    }

    public final boolean zzfc() {
        return this.zzamj && this.zzalb == zzaiu;
    }

    public final void flush() {
        this.zzalb = zzaiu;
        this.zzamj = false;
    }

    public final void reset() {
        flush();
        this.zzami = zzaiu;
        this.zzame = -1;
        this.zzahi = -1;
        this.zzajw = 0;
    }
}
