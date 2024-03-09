package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbdj implements AudioManager.OnAudioFocusChangeListener {
    private float zzdj = 1.0f;
    private boolean zzefs;
    private final AudioManager zzeir;
    private final zzbdi zzeis;
    private boolean zzeit;
    private boolean zzeiu;

    public zzbdj(Context context, zzbdi zzbdi) {
        this.zzeir = (AudioManager) context.getSystemService("audio");
        this.zzeis = zzbdi;
    }

    public final void setMuted(boolean z) {
        this.zzeiu = z;
        zzaaa();
    }

    public final void setVolume(float f) {
        this.zzdj = f;
        zzaaa();
    }

    public final float getVolume() {
        float f = this.zzeiu ? 0.0f : this.zzdj;
        if (this.zzeit) {
            return f;
        }
        return 0.0f;
    }

    public final void zzzy() {
        this.zzefs = true;
        zzaaa();
    }

    public final void zzzz() {
        this.zzefs = false;
        zzaaa();
    }

    public final void onAudioFocusChange(int i) {
        this.zzeit = i > 0;
        this.zzeis.zzyx();
    }

    private final void zzaaa() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.zzefs && !this.zzeiu && this.zzdj > 0.0f;
        if (z4 && !(z2 = this.zzeit)) {
            AudioManager audioManager = this.zzeir;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.zzeit = z3;
            }
            this.zzeis.zzyx();
        } else if (!z4 && (z = this.zzeit)) {
            AudioManager audioManager2 = this.zzeir;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.zzeit = z3;
            }
            this.zzeis.zzyx();
        }
    }
}
