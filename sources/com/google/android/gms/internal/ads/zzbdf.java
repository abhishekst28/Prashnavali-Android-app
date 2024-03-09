package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbdf {
    public final boolean zzehu;
    public final int zzehv;
    public final int zzehw;
    public final int zzehx;
    private final String zzehy;
    public final int zzehz;
    public final int zzeia;
    public final int zzeib;
    public final int zzeic;
    public final boolean zzeid;
    public final int zzeie;

    public zzbdf(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
            }
        }
        this.zzehu = zza(jSONObject, "aggressive_media_codec_release", zzaat.zzcmj);
        this.zzehv = zzb(jSONObject, "byte_buffer_precache_limit", zzaat.zzclr);
        this.zzehw = zzb(jSONObject, "exo_cache_buffer_size", zzaat.zzcly);
        this.zzehx = zzb(jSONObject, "exo_connect_timeout_millis", zzaat.zzcln);
        this.zzehy = zzc(jSONObject, "exo_player_version", zzaat.zzclm);
        this.zzehz = zzb(jSONObject, "exo_read_timeout_millis", zzaat.zzclo);
        this.zzeia = zzb(jSONObject, "load_check_interval_bytes", zzaat.zzclp);
        this.zzeib = zzb(jSONObject, "player_precache_limit", zzaat.zzclq);
        this.zzeic = zzb(jSONObject, "socket_receive_buffer_size", zzaat.zzcls);
        this.zzeid = zza(jSONObject, "use_cache_data_source", zzaat.zzcsq);
        this.zzeie = zzb(jSONObject, "min_retry_count", zzaat.zzclu);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzaai<java.lang.Boolean>, com.google.android.gms.internal.ads.zzaai] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zza(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.zzaap r0 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r3 = r0.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r1 = zza((org.json.JSONObject) r1, (java.lang.String) r2, (boolean) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdf.zza(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzaai):boolean");
    }

    private static boolean zza(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException e) {
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzaai, com.google.android.gms.internal.ads.zzaai<java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzaai<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0009
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            r0 = move-exception
            goto L_0x000a
        L_0x0009:
        L_0x000a:
            com.google.android.gms.internal.ads.zzaap r0 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r0 = r0.zzd(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdf.zzb(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzaai):int");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzaai, com.google.android.gms.internal.ads.zzaai<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zzc(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzaai<java.lang.String> r2) {
        /*
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            r0 = move-exception
            goto L_0x000a
        L_0x0009:
        L_0x000a:
            com.google.android.gms.internal.ads.zzaap r0 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r0 = r0.zzd(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdf.zzc(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzaai):java.lang.String");
    }
}
