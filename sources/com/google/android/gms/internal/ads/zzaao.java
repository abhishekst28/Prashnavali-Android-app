package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaao {
    private final Collection<zzaai<?>> zzcky = new ArrayList();
    private final Collection<zzaai<String>> zzckz = new ArrayList();
    private final Collection<zzaai<String>> zzcla = new ArrayList();

    public final void zza(zzaai zzaai) {
        this.zzcky.add(zzaai);
    }

    public final void zzb(zzaai<String> zzaai) {
        this.zzckz.add(zzaai);
    }

    public final void zzc(zzaai<String> zzaai) {
        this.zzcla.add(zzaai);
    }

    public final void zza(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzaai next : this.zzcky) {
            if (next.getSource() == 1) {
                next.zza(editor, next.zzb(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzbbd.zzfc("Flag Json is null.");
        }
    }

    public final List<String> zzrd() {
        ArrayList arrayList = new ArrayList();
        for (zzaai<String> zzd : this.zzckz) {
            String str = (String) zzwe.zzpu().zzd(zzd);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzaay.zzrj());
        return arrayList;
    }

    public final List<String> zzre() {
        List<String> zzrd = zzrd();
        for (zzaai<String> zzd : this.zzcla) {
            String str = (String) zzwe.zzpu().zzd(zzd);
            if (!TextUtils.isEmpty(str)) {
                zzrd.add(str);
            }
        }
        zzrd.addAll(zzaay.zzrk());
        return zzrd;
    }
}
