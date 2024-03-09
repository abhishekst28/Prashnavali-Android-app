package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbhg extends MutableContextWrapper {
    private Context zzaai;
    private Activity zzecv;
    private Context zzepo;

    public zzbhg(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void setBaseContext(Context context) {
        this.zzaai = context.getApplicationContext();
        this.zzecv = context instanceof Activity ? (Activity) context : null;
        this.zzepo = context;
        super.setBaseContext(this.zzaai);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.zzecv;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.zzaai.startActivity(intent);
    }

    public final Activity zzzq() {
        return this.zzecv;
    }

    public final Object getSystemService(String str) {
        return this.zzepo.getSystemService(str);
    }

    public final Context zzaaz() {
        return this.zzepo;
    }
}
