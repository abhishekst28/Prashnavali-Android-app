package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdps {
    private final Executor executor;
    private final Clock zzbpw;
    private final String zzbra;
    private final String zzciq;
    private final String zzdpz;
    private final zzeg zzflj;
    private final zzdli zzfsl;
    private final zzcud zzfuf;
    private final zzbbh zzhif;
    private final Context zzvr;

    public zzdps(Executor executor2, zzbbh zzbbh, zzcud zzcud, zzbbg zzbbg, String str, String str2, Context context, zzdli zzdli, Clock clock, zzeg zzeg) {
        this.executor = executor2;
        this.zzhif = zzbbh;
        this.zzfuf = zzcud;
        this.zzbra = zzbbg.zzbra;
        this.zzdpz = str;
        this.zzciq = str2;
        this.zzvr = context;
        this.zzfsl = zzdli;
        this.zzbpw = clock;
        this.zzflj = zzeg;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, List<String> list) {
        zza(zzdlj, zzdkx, false, "", "", list);
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = z ? "1" : "0";
        for (String zzc : list) {
            String zzc2 = zzc(zzc(zzc(zzc, "@gw_adlocid@", zzdlj.zzhbp.zzfqn.zzhbv), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzbra);
            if (zzdkx != null) {
                zzc2 = zzawq.zzc(zzc(zzc(zzc(zzc2, "@gw_qdata@", zzdkx.zzdiy), "@gw_adnetid@", zzdkx.zzagt), "@gw_allocid@", zzdkx.zzdjo), this.zzvr, zzdkx.zzdsu);
            }
            String zzc3 = zzc(zzc(zzc(zzc2, "@gw_adnetstatus@", this.zzfuf.zzapv()), "@gw_seqnum@", this.zzdpz), "@gw_sessid@", this.zzciq);
            boolean z2 = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcre)).booleanValue() && !TextUtils.isEmpty(str);
            boolean isEmpty = true ^ TextUtils.isEmpty(str2);
            if (z2 || isEmpty) {
                if (this.zzflj.zzb(Uri.parse(zzc3))) {
                    Uri.Builder buildUpon = Uri.parse(zzc3).buildUpon();
                    if (z2) {
                        buildUpon = buildUpon.appendQueryParameter("ms", str);
                    }
                    if (isEmpty) {
                        buildUpon = buildUpon.appendQueryParameter("attok", str2);
                    }
                    zzc3 = buildUpon.build().toString();
                }
            }
            arrayList.add(zzc3);
        }
        zzi(arrayList);
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, List<String> list, zzatj zzatj) {
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        try {
            String type = zzatj.getType();
            String num = Integer.toString(zzatj.getAmount());
            ArrayList arrayList = new ArrayList();
            zzdli zzdli = this.zzfsl;
            String str = "";
            String zzgy = zzdli == null ? str : zzgy(zzdli.zzdve);
            zzdli zzdli2 = this.zzfsl;
            if (zzdli2 != null) {
                str = zzgy(zzdli2.zzdvf);
            }
            for (String zzc : list) {
                arrayList.add(zzawq.zzc(zzc(zzc(zzc(zzc(zzc(zzc(zzc, "@gw_rwd_userid@", Uri.encode(zzgy)), "@gw_rwd_custom_data@", Uri.encode(str)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzbra), this.zzvr, zzdkx.zzdsu));
            }
            zzi(arrayList);
        } catch (RemoteException e) {
        }
    }

    public final void zzi(List<String> list) {
        for (String zzes : list) {
            zzes(zzes);
        }
    }

    public final void zzes(String str) {
        this.executor.execute(new zzdpr(this, str));
    }

    private static String zzc(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String zzgy(String str) {
        if (TextUtils.isEmpty(str) || !zzbax.isEnabled()) {
            return str;
        }
        return "fakeForAdDebugLog";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzgz(String str) {
        this.zzhif.zzes(str);
    }
}
