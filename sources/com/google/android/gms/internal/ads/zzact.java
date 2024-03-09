package com.google.android.gms.internal.ads;

import com.example.cutsomnavigation.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzact {
    public static zzaca<Long> zzdbh = zzaca.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static zzaca<Boolean> zzdbi = zzaca.zzg("gads:report_dynamite_crash_in_background_thread", false);
    public static zzaca<String> zzdbj = zzaca.zzi("gads:public_beta:traffic_multiplier", BuildConfig.VERSION_NAME);
    public static zzaca<String> zzdbk = zzaca.zzi("gads:sdk_crash_report_class_prefix", "com.google.");
    public static zzaca<Boolean> zzdbl = zzaca.zzg("gads:sdk_crash_report_enabled", false);
    public static zzaca<Boolean> zzdbm = zzaca.zzg("gads:sdk_crash_report_full_stacktrace", false);
    public static zzaca<Double> zzdbn = zzaca.zzb("gads:trapped_exception_sample_rate", 0.01d);
}
