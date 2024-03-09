package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzadj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class MediaView extends FrameLayout {
    private MediaContent zzbnc;
    private boolean zzbnd;
    private zzadh zzbne;
    private ImageView.ScaleType zzbnf;
    private boolean zzbng;
    private zzadj zzbnh;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.zzbnd = true;
        this.zzbnc = mediaContent;
        zzadh zzadh = this.zzbne;
        if (zzadh != null) {
            zzadh.setMediaContent(mediaContent);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zza(zzadh zzadh) {
        this.zzbne = zzadh;
        if (this.zzbnd) {
            zzadh.setMediaContent(this.zzbnc);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzbng = true;
        this.zzbnf = scaleType;
        zzadj zzadj = this.zzbnh;
        if (zzadj != null) {
            zzadj.setImageScaleType(scaleType);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zza(zzadj zzadj) {
        this.zzbnh = zzadj;
        if (this.zzbng) {
            zzadj.setImageScaleType(this.zzbnf);
        }
    }
}
