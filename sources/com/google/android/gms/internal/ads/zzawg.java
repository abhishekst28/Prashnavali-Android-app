package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzawg implements zzawo {
    static final zzawo zzdxg = new zzawg();

    private zzawg() {
    }

    public final Object zzb(zzbib zzbib) {
        String currentScreenName = zzbib.getCurrentScreenName();
        if (currentScreenName != null) {
            return currentScreenName;
        }
        String currentScreenClass = zzbib.getCurrentScreenClass();
        if (currentScreenClass != null) {
            return currentScreenClass;
        }
        return "";
    }
}
