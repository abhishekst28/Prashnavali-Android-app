package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzark;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class ReportingInfo {
    private final zzarj zzhik;

    private ReportingInfo(Builder builder) {
        this.zzhik = new zzarj(builder.zzhil);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public final zzark zzhil;

        public Builder(View view) {
            zzark zzark = new zzark();
            this.zzhil = zzark;
            zzark.zzk(view);
        }

        public final Builder setAssetViews(Map<String, View> map) {
            this.zzhil.zzh(map);
            return this;
        }

        public final ReportingInfo build() {
            return new ReportingInfo(this);
        }
    }

    public final void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zzhik.updateImpressionUrls(list, updateImpressionUrlsCallback);
    }

    public final void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zzhik.updateClickUrl(uri, updateClickUrlCallback);
    }

    public final void reportTouchEvent(MotionEvent motionEvent) {
        this.zzhik.reportTouchEvent(motionEvent);
    }
}
