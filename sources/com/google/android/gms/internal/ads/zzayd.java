package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzayd implements zzaya {
    private final Object lock = new Object();
    private SharedPreferences zzcld;
    private boolean zzdqd = true;
    private boolean zzdqq = false;
    private String zzdqt = "";
    private boolean zzdsc = true;
    private boolean zzdso = true;
    private boolean zzdzm;
    private final List<Runnable> zzdzn = new ArrayList();
    private zzdvt<?> zzdzo;
    private zzrk zzdzp = null;
    private SharedPreferences.Editor zzdzq;
    private boolean zzdzr = false;
    private String zzdzs;
    private String zzdzt;
    private long zzdzu = 0;
    private long zzdzv = 0;
    private long zzdzw = 0;
    private int zzdzx = -1;
    private int zzdzy = 0;
    private Set<String> zzdzz = Collections.emptySet();
    private JSONObject zzeaa = new JSONObject();
    private String zzeab = null;
    private int zzeac = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r0 = java.lang.String.valueOf("admob__");
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r4.length() == 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r4 = r0.concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r4 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r2.zzdzo = com.google.android.gms.internal.ads.zzbbi.zzedu.zzf(new com.google.android.gms.internal.ads.zzayc(r2, r3, r4));
        r2.zzdzm = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r4 = "admob";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r2.zzcld     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r4 != 0) goto L_0x000f
            java.lang.String r4 = "admob"
            goto L_0x0029
        L_0x000f:
            java.lang.String r0 = "admob__"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0024
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0029
        L_0x0024:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0029:
            com.google.android.gms.internal.ads.zzdvw r0 = com.google.android.gms.internal.ads.zzbbi.zzedu
            com.google.android.gms.internal.ads.zzayc r1 = new com.google.android.gms.internal.ads.zzayc
            r1.<init>(r2, r3, r4)
            com.google.android.gms.internal.ads.zzdvt r3 = r0.zzf(r1)
            r2.zzdzo = r3
            r2.zzdzm = r5
            return
        L_0x0039:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayd.zza(android.content.Context, java.lang.String, boolean):void");
    }

    private final void zzxl() {
        zzdvt<?> zzdvt = this.zzdzo;
        if (zzdvt != null && !zzdvt.isDone()) {
            try {
                this.zzdzo.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                zzaxy.zzd("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                zzaxy.zzc("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    private final Bundle zzxm() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.lock) {
            bundle.putBoolean("use_https", this.zzdqd);
            bundle.putBoolean("content_url_opted_out", this.zzdsc);
            bundle.putBoolean("content_vertical_opted_out", this.zzdso);
            bundle.putBoolean("auto_collect_location", this.zzdqq);
            bundle.putInt("version_code", this.zzdzy);
            bundle.putStringArray("never_pool_slots", (String[]) this.zzdzz.toArray(new String[0]));
            bundle.putString("app_settings_json", this.zzdqt);
            bundle.putLong("app_settings_last_update_ms", this.zzdzu);
            bundle.putLong("app_last_background_time_ms", this.zzdzv);
            bundle.putInt("request_in_session_count", this.zzdzx);
            bundle.putLong("first_ad_req_time_ms", this.zzdzw);
            bundle.putString("native_advanced_settings", this.zzeaa.toString());
            bundle.putString("display_cutout", this.zzeab);
            bundle.putInt("app_measurement_npa", this.zzeac);
            if (this.zzdzs != null) {
                bundle.putString("content_url_hashes", this.zzdzs);
            }
            if (this.zzdzt != null) {
                bundle.putString("content_vertical_hashes", this.zzdzt);
            }
        }
        return bundle;
    }

    private final void zzc(Bundle bundle) {
        zzbbi.zzedu.execute(new zzayf(this));
    }

    public final zzrk zzwx() {
        if (!this.zzdzm) {
            return null;
        }
        if ((zzwy() && zzxa()) || !zzaci.zzczx.get().booleanValue()) {
            return null;
        }
        synchronized (this.lock) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zzdzp == null) {
                this.zzdzp = new zzrk();
            }
            this.zzdzp.zzmg();
            zzaxy.zzfd("start fetching content...");
            zzrk zzrk = this.zzdzp;
            return zzrk;
        }
    }

    public final void zzao(boolean z) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdsc != z) {
                this.zzdsc = z;
                if (this.zzdzq != null) {
                    this.zzdzq.putBoolean("content_url_opted_out", z);
                    this.zzdzq.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.zzdsc);
                bundle.putBoolean("content_vertical_opted_out", this.zzdso);
                zzc(bundle);
            }
        }
    }

    public final boolean zzwy() {
        boolean z;
        zzxl();
        synchronized (this.lock) {
            z = this.zzdsc;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzej(java.lang.String r4) {
        /*
            r3 = this;
            r3.zzxl()
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.zzdzs     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.zzdzs = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.zzdzq     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.zzdzq     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.zzdzq     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.zzc(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayd.zzej(java.lang.String):void");
    }

    public final String zzwz() {
        String str;
        zzxl();
        synchronized (this.lock) {
            str = this.zzdzs;
        }
        return str;
    }

    public final void zzap(boolean z) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdso != z) {
                this.zzdso = z;
                if (this.zzdzq != null) {
                    this.zzdzq.putBoolean("content_vertical_opted_out", z);
                    this.zzdzq.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.zzdsc);
                bundle.putBoolean("content_vertical_opted_out", this.zzdso);
                zzc(bundle);
            }
        }
    }

    public final boolean zzxa() {
        boolean z;
        zzxl();
        synchronized (this.lock) {
            z = this.zzdso;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzek(java.lang.String r4) {
        /*
            r3 = this;
            r3.zzxl()
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.zzdzt     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.zzdzt = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.zzdzq     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.zzdzq     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.zzdzq     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.zzc(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayd.zzek(java.lang.String):void");
    }

    public final String zzxb() {
        String str;
        zzxl();
        synchronized (this.lock) {
            str = this.zzdzt;
        }
        return str;
    }

    public final void zzaq(boolean z) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdqq != z) {
                this.zzdqq = z;
                if (this.zzdzq != null) {
                    this.zzdzq.putBoolean("auto_collect_location", z);
                    this.zzdzq.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                zzc(bundle);
            }
        }
    }

    public final boolean zzxc() {
        boolean z;
        zzxl();
        synchronized (this.lock) {
            z = this.zzdqq;
        }
        return z;
    }

    public final void zzdf(int i) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdzy != i) {
                this.zzdzy = i;
                if (this.zzdzq != null) {
                    this.zzdzq.putInt("version_code", i);
                    this.zzdzq.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i);
                zzc(bundle);
            }
        }
    }

    public final int zzxd() {
        int i;
        zzxl();
        synchronized (this.lock) {
            i = this.zzdzy;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzel(java.lang.String r6) {
        /*
            r5 = this;
            r5.zzxl()
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzp.zzkw()     // Catch:{ all -> 0x0060 }
            long r1 = r1.currentTimeMillis()     // Catch:{ all -> 0x0060 }
            r5.zzdzu = r1     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r3 = r5.zzdqt     // Catch:{ all -> 0x0060 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x001b
            goto L_0x005e
        L_0x001b:
            r5.zzdqt = r6     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.zzdzq     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.zzdzq     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.zzdzq     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.zzdzq     // Catch:{ all -> 0x0060 }
            r3.apply()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0060 }
            r3.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x0060 }
            r5.zzc(r3)     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Runnable> r6 = r5.zzdzn     // Catch:{ all -> 0x0060 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0060 }
        L_0x004c:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0060 }
            r1.run()     // Catch:{ all -> 0x0060 }
            goto L_0x004c
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayd.zzel(java.lang.String):void");
    }

    public final zzaxl zzxe() {
        zzaxl zzaxl;
        zzxl();
        synchronized (this.lock) {
            zzaxl = new zzaxl(this.zzdqt, this.zzdzu);
        }
        return zzaxl;
    }

    public final void zzb(Runnable runnable) {
        this.zzdzn.add(runnable);
    }

    public final void zzez(long j) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdzv != j) {
                this.zzdzv = j;
                if (this.zzdzq != null) {
                    this.zzdzq.putLong("app_last_background_time_ms", j);
                    this.zzdzq.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j);
                zzc(bundle);
            }
        }
    }

    public final long zzxf() {
        long j;
        zzxl();
        synchronized (this.lock) {
            j = this.zzdzv;
        }
        return j;
    }

    public final void zzdg(int i) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdzx != i) {
                this.zzdzx = i;
                if (this.zzdzq != null) {
                    this.zzdzq.putInt("request_in_session_count", i);
                    this.zzdzq.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i);
                zzc(bundle);
            }
        }
    }

    public final int zzxg() {
        int i;
        zzxl();
        synchronized (this.lock) {
            i = this.zzdzx;
        }
        return i;
    }

    public final void zzfa(long j) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdzw != j) {
                this.zzdzw = j;
                if (this.zzdzq != null) {
                    this.zzdzq.putLong("first_ad_req_time_ms", j);
                    this.zzdzq.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j);
                zzc(bundle);
            }
        }
    }

    public final long zzxh() {
        long j;
        zzxl();
        synchronized (this.lock) {
            j = this.zzdzw;
        }
        return j;
    }

    public final void zza(String str, String str2, boolean z) {
        zzxl();
        synchronized (this.lock) {
            JSONArray optJSONArray = this.zzeaa.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzp.zzkw().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzeaa.put(str, optJSONArray);
            } catch (JSONException e) {
                zzaxy.zzd("Could not update native advanced settings", e);
            }
            if (this.zzdzq != null) {
                this.zzdzq.putString("native_advanced_settings", this.zzeaa.toString());
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.zzeaa.toString());
            zzc(bundle);
        }
    }

    public final JSONObject zzxi() {
        JSONObject jSONObject;
        zzxl();
        synchronized (this.lock) {
            jSONObject = this.zzeaa;
        }
        return jSONObject;
    }

    public final void zzxj() {
        zzxl();
        synchronized (this.lock) {
            this.zzeaa = new JSONObject();
            if (this.zzdzq != null) {
                this.zzdzq.remove("native_advanced_settings");
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            zzc(bundle);
        }
    }

    public final String zzxk() {
        String str;
        zzxl();
        synchronized (this.lock) {
            str = this.zzeab;
        }
        return str;
    }

    public final void zzem(String str) {
        zzxl();
        synchronized (this.lock) {
            if (!TextUtils.equals(this.zzeab, str)) {
                this.zzeab = str;
                if (this.zzdzq != null) {
                    this.zzdzq.putString("display_cutout", str);
                    this.zzdzq.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("display_cutout", str);
                zzc(bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.lock) {
            this.zzcld = sharedPreferences;
            this.zzdzq = edit;
            if (PlatformVersion.isAtLeastM() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.zzdzr = z;
            this.zzdqd = this.zzcld.getBoolean("use_https", this.zzdqd);
            this.zzdsc = this.zzcld.getBoolean("content_url_opted_out", this.zzdsc);
            this.zzdzs = this.zzcld.getString("content_url_hashes", this.zzdzs);
            this.zzdqq = this.zzcld.getBoolean("auto_collect_location", this.zzdqq);
            this.zzdso = this.zzcld.getBoolean("content_vertical_opted_out", this.zzdso);
            this.zzdzt = this.zzcld.getString("content_vertical_hashes", this.zzdzt);
            this.zzdzy = this.zzcld.getInt("version_code", this.zzdzy);
            this.zzdqt = this.zzcld.getString("app_settings_json", this.zzdqt);
            this.zzdzu = this.zzcld.getLong("app_settings_last_update_ms", this.zzdzu);
            this.zzdzv = this.zzcld.getLong("app_last_background_time_ms", this.zzdzv);
            this.zzdzx = this.zzcld.getInt("request_in_session_count", this.zzdzx);
            this.zzdzw = this.zzcld.getLong("first_ad_req_time_ms", this.zzdzw);
            this.zzdzz = this.zzcld.getStringSet("never_pool_slots", this.zzdzz);
            this.zzeab = this.zzcld.getString("display_cutout", this.zzeab);
            this.zzeac = this.zzcld.getInt("app_measurement_npa", this.zzeac);
            try {
                this.zzeaa = new JSONObject(this.zzcld.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zzaxy.zzd("Could not convert native advanced settings to json object", e);
            }
            zzc(zzxm());
        }
    }
}
