package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzadg extends RelativeLayout {
    private static final float[] zzdco = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzdcp;

    public zzadg(Context context, zzadd zzadd, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzadd);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzdco, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(zzadd.getBackgroundColor());
        setLayoutParams(layoutParams);
        zzp.zzkr();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzadd.getText())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzadd.getText());
            textView.setTextColor(zzadd.getTextColor());
            textView.setTextSize((float) zzadd.getTextSize());
            zzwe.zzpq();
            int zzc = zzbat.zzc(context, 4);
            zzwe.zzpq();
            textView.setPadding(zzc, 0, zzbat.zzc(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzadi> zzrz = zzadd.zzrz();
        if (zzrz != null && zzrz.size() > 1) {
            this.zzdcp = new AnimationDrawable();
            for (zzadi zzsd : zzrz) {
                try {
                    this.zzdcp.addFrame((Drawable) ObjectWrapper.unwrap(zzsd.zzsd()), zzadd.zzsa());
                } catch (Exception e) {
                    zzaxy.zzc("Error while getting drawable.", e);
                }
            }
            zzp.zzkr();
            imageView.setBackground(this.zzdcp);
        } else if (zzrz.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(zzrz.get(0).zzsd()));
            } catch (Exception e2) {
                zzaxy.zzc("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzdcp;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
