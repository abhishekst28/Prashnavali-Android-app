package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzif {
    private static final zzif zzaiv = new zzif(new int[]{2}, 2);
    private final int[] zzaiw;
    private final int zzaix = 2;

    private zzif(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzaiw = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean zzw(int i) {
        return Arrays.binarySearch(this.zzaiw, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzif)) {
            return false;
        }
        zzif zzif = (zzif) obj;
        if (!Arrays.equals(this.zzaiw, zzif.zzaiw) || this.zzaix != zzif.zzaix) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzaix + (Arrays.hashCode(this.zzaiw) * 31);
    }

    public final String toString() {
        int i = this.zzaix;
        String arrays = Arrays.toString(this.zzaiw);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
