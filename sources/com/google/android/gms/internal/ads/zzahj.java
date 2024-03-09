package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;
import java.net.URISyntaxException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzahj<T extends zzbgt & zzbgs & zzbgw & zzbhb & zzbhd> implements zzahf<T> {
    private final zza zzder;
    private final zzapw zzdes;

    public zzahj(zza zza, zzapw zzapw) {
        this.zzder = zza;
        this.zzdes = zzapw;
    }

    private static boolean zzc(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzd(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            zzp.zzkr();
            return 7;
        } else if ("l".equalsIgnoreCase(str)) {
            zzp.zzkr();
            return 6;
        } else if ("c".equalsIgnoreCase(str)) {
            return zzp.zzkr().zzxs();
        } else {
            return -1;
        }
    }

    private final void zzab(boolean z) {
        zzapw zzapw = this.zzdes;
        if (zzapw != null) {
            zzapw.zzac(z);
        }
    }

    static Uri zza(Context context, zzeg zzeg, Uri uri, View view, Activity activity) {
        if (zzeg == null) {
            return uri;
        }
        try {
            if (zzeg.zzc(uri)) {
                return zzeg.zza(uri, context, view, activity);
            }
            return uri;
        } catch (zzef e) {
            return uri;
        } catch (Exception e2) {
            zzp.zzkt().zza(e2, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            zzaxy.zzc(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        String str;
        zzbgt zzbgt = (zzbgt) obj;
        String zzc = zzawq.zzc((String) map.get("u"), zzbgt.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzaxy.zzfe("Action missing from an open GMSG.");
            return;
        }
        zza zza = this.zzder;
        if (zza != null && !zza.zzjx()) {
            this.zzder.zzbo(zzc);
        } else if ("expand".equalsIgnoreCase(str2)) {
            if (((zzbgs) zzbgt).zzabj()) {
                zzaxy.zzfe("Cannot expand WebView that is already expanded.");
                return;
            }
            zzab(false);
            ((zzbgw) zzbgt).zzc(zzc(map), zzd(map));
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzab(false);
            if (zzc != null) {
                ((zzbgw) zzbgt).zza(zzc(map), zzd(map), zzc);
            } else {
                ((zzbgw) zzbgt).zza(zzc(map), zzd(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzab(true);
            if (TextUtils.isEmpty(zzc)) {
                zzaxy.zzfe("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzbgw) zzbgt).zza(new zzd(new zzahm(zzbgt.getContext(), ((zzbhb) zzbgt).zzabh(), ((zzbhd) zzbgt).getView()).zze(map)));
            } catch (ActivityNotFoundException e) {
                zzaxy.zzfe(e.getMessage());
            }
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxw)).booleanValue()) {
                zzab(true);
                String str3 = (String) map.get("p");
                if (str3 == null) {
                    zzaxy.zzfe("Package name missing from open app action.");
                    return;
                }
                PackageManager packageManager = zzbgt.getContext().getPackageManager();
                if (packageManager == null) {
                    zzaxy.zzfe("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str3);
                if (launchIntentForPackage != null) {
                    ((zzbgw) zzbgt).zza(new zzd(launchIntentForPackage));
                }
            }
        } else {
            zzab(true);
            String str4 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str4)) {
                try {
                    intent = Intent.parseUri(str4, 0);
                } catch (URISyntaxException e2) {
                    String valueOf = String.valueOf(str4);
                    zzaxy.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                if (!Uri.EMPTY.equals(data)) {
                    intent.setData(zze(zza(zzbgt.getContext(), ((zzbhb) zzbgt).zzabh(), data, ((zzbhd) zzbgt).getView(), zzbgt.zzzq())));
                }
            }
            if (intent != null) {
                ((zzbgw) zzbgt).zza(new zzd(intent));
                return;
            }
            if (!TextUtils.isEmpty(zzc)) {
                str = zze(zza(zzbgt.getContext(), ((zzbhb) zzbgt).zzabh(), Uri.parse(zzc), ((zzbhd) zzbgt).getView(), zzbgt.zzzq())).toString();
            } else {
                str = zzc;
            }
            ((zzbgw) zzbgt).zza(new zzd((String) map.get("i"), str, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
