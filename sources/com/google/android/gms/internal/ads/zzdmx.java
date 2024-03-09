package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdmx {
    private final int maxEntries;
    private final LinkedList<zzdnh<?>> zzhdq = new LinkedList<>();
    private final int zzhdr;
    private final zzdny zzhds;

    public zzdmx(int i, int i2) {
        this.maxEntries = i;
        this.zzhdr = i2;
        this.zzhds = new zzdny();
    }

    public final boolean zzb(zzdnh<?> zzdnh) {
        this.zzhds.zzauc();
        zzatj();
        if (this.zzhdq.size() == this.maxEntries) {
            return false;
        }
        this.zzhdq.add(zzdnh);
        return true;
    }

    public final zzdnh<?> zzate() {
        this.zzhds.zzauc();
        zzatj();
        if (this.zzhdq.isEmpty()) {
            return null;
        }
        zzdnh<?> remove = this.zzhdq.remove();
        if (remove != null) {
            this.zzhds.zzaud();
        }
        return remove;
    }

    public final int size() {
        zzatj();
        return this.zzhdq.size();
    }

    public final long getCreationTimeMillis() {
        return this.zzhds.getCreationTimeMillis();
    }

    public final long zzatf() {
        return this.zzhds.zzatf();
    }

    public final int zzatg() {
        return this.zzhds.zzatg();
    }

    public final String zzath() {
        return this.zzhds.zzats();
    }

    public final zzdnx zzati() {
        return this.zzhds.zzauf();
    }

    private final void zzatj() {
        while (!this.zzhdq.isEmpty()) {
            if (zzp.zzkw().currentTimeMillis() - this.zzhdq.getFirst().zzhfj >= ((long) this.zzhdr)) {
                this.zzhds.zzaue();
                this.zzhdq.remove();
            } else {
                return;
            }
        }
    }
}
