package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeir extends zzefg {
    private final zzeit zziix = new zzeit(this.zziiz, (zzeir) null);
    private zzefk zziiy = zzbhj();
    private final /* synthetic */ zzeis zziiz;

    zzeir(zzeis zzeis) {
        this.zziiz = zzeis;
    }

    private final zzefk zzbhj() {
        if (this.zziix.hasNext()) {
            return (zzefk) ((zzefm) this.zziix.next()).iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zziiy != null;
    }

    public final byte nextByte() {
        zzefk zzefk = this.zziiy;
        if (zzefk != null) {
            byte nextByte = zzefk.nextByte();
            if (!this.zziiy.hasNext()) {
                this.zziiy = zzbhj();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
