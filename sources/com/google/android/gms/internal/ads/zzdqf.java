package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdqf extends zzdqb {
    private String zzhix;
    private Boolean zzhiy;
    private Boolean zzhiz;

    zzdqf() {
    }

    public final zzdqb zzhb(String str) {
        if (str != null) {
            this.zzhix = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }

    public final zzdqb zzbq(boolean z) {
        this.zzhiy = Boolean.valueOf(z);
        return this;
    }

    public final zzdqb zzbr(boolean z) {
        this.zzhiz = true;
        return this;
    }

    public final zzdqc zzava() {
        String str = "";
        if (this.zzhix == null) {
            str = String.valueOf(str).concat(" clientVersion");
        }
        if (this.zzhiy == null) {
            str = String.valueOf(str).concat(" shouldGetAdvertisingId");
        }
        if (this.zzhiz == null) {
            str = String.valueOf(str).concat(" isGooglePlayServicesAvailable");
        }
        if (str.isEmpty()) {
            return new zzdqd(this.zzhix, this.zzhiy.booleanValue(), this.zzhiz.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }
}
