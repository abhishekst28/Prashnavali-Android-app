package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzazv implements zzai {
    private final /* synthetic */ String zzeca;
    private final /* synthetic */ zzazw zzecb;

    zzazv(zzazt zzazt, String str, zzazw zzazw) {
        this.zzeca = str;
        this.zzecb = zzazw;
    }

    public final void zzc(zzao zzao) {
        String str = this.zzeca;
        String zzao2 = zzao.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzao2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzao2);
        zzaxy.zzfe(sb.toString());
        this.zzecb.zzb(null);
    }
}
