package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzalk implements zzajs, zzalh {
    private final zzali zzdhm;
    private final HashSet<AbstractMap.SimpleEntry<String, zzahf<? super zzali>>> zzdhn = new HashSet<>();

    public zzalk(zzali zzali) {
        this.zzdhm = zzali;
    }

    public final void zza(String str, Map map) {
        zzajr.zza((zzajs) this, str, map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        zzajr.zza((zzajs) this, str, jSONObject);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        zzajr.zzb(this, str, jSONObject);
    }

    public final void zzj(String str, String str2) {
        zzajr.zza((zzajs) this, str, str2);
    }

    public final void zzdc(String str) {
        this.zzdhm.zzdc(str);
    }

    public final void zza(String str, zzahf<? super zzali> zzahf) {
        this.zzdhm.zza(str, zzahf);
        this.zzdhn.add(new AbstractMap.SimpleEntry(str, zzahf));
    }

    public final void zzb(String str, zzahf<? super zzali> zzahf) {
        this.zzdhm.zzb(str, zzahf);
        this.zzdhn.remove(new AbstractMap.SimpleEntry(str, zzahf));
    }

    public final void zztk() {
        Iterator<AbstractMap.SimpleEntry<String, zzahf<? super zzali>>> it = this.zzdhn.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((zzahf) next.getValue()).toString());
            zzaxy.zzei(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.zzdhm.zzb((String) next.getKey(), (zzahf) next.getValue());
        }
        this.zzdhn.clear();
    }
}
