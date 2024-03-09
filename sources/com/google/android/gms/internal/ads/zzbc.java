package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbc {
    public static zzn zzb(zzy zzy) {
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7;
        zzy zzy2 = zzy;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = zzy2.zzam;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long j8 = 0;
        if (str != null) {
            j = zzg(str);
        } else {
            j = 0;
        }
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            j3 = 0;
            j2 = 0;
            int i2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception e) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j3 = 0;
            j2 = 0;
            z = false;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j4 = zzg(str3);
        } else {
            j4 = 0;
        }
        String str4 = map.get("Last-Modified");
        if (str4 != null) {
            j5 = zzg(str4);
        } else {
            j5 = 0;
        }
        String str5 = map.get("ETag");
        if (z) {
            long j9 = currentTimeMillis + (j3 * 1000);
            if (i != 0) {
                j7 = j9;
            } else {
                Long.signum(j2);
                j7 = j9 + (j2 * 1000);
            }
            long j10 = j9;
            j6 = j7;
            j8 = j10;
        } else if (j <= 0 || j4 < j) {
            j6 = 0;
        } else {
            j8 = currentTimeMillis + (j4 - j);
            j6 = j8;
        }
        zzn zzn = new zzn();
        zzn.data = zzy2.data;
        zzn.zzr = str5;
        zzn.zzv = j8;
        zzn.zzu = j6;
        zzn.zzs = j;
        zzn.zzt = j5;
        zzn.zzw = map;
        zzn.zzx = zzy2.allHeaders;
        return zzn;
    }

    private static long zzg(String str) {
        try {
            return zzh("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzaq.v("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            zzaq.zza(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    static String zzb(long j) {
        return zzh("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzh(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
