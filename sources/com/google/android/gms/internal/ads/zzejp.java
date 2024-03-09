package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzejp extends zzejn<zzejq, zzejq> {
    zzejp() {
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzeip zzeip) {
        return false;
    }

    private static void zza(Object obj, zzejq zzejq) {
        ((zzegp) obj).zzifo = zzejq;
    }

    /* access modifiers changed from: package-private */
    public final void zzaj(Object obj) {
        ((zzegp) obj).zzifo.zzbdg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzat(Object obj) {
        return ((zzejq) obj).zzbfl();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzaz(Object obj) {
        return ((zzejq) obj).zzbib();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzk(Object obj, Object obj2) {
        zzejq zzejq = (zzejq) obj;
        zzejq zzejq2 = (zzejq) obj2;
        if (zzejq2.equals(zzejq.zzbhz())) {
            return zzejq;
        }
        return zzejq.zza(zzejq, zzejq2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Object obj, zzekk zzekk) throws IOException {
        ((zzejq) obj).zza(zzekk);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzekk zzekk) throws IOException {
        ((zzejq) obj).zzb(zzekk);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        zza(obj, (zzejq) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzay(Object obj) {
        zzejq zzejq = ((zzegp) obj).zzifo;
        if (zzejq != zzejq.zzbhz()) {
            return zzejq;
        }
        zzejq zzbia = zzejq.zzbia();
        zza(obj, zzbia);
        return zzbia;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzax(Object obj) {
        return ((zzegp) obj).zzifo;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        zza(obj, (zzejq) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzar(Object obj) {
        zzejq zzejq = (zzejq) obj;
        zzejq.zzbdg();
        return zzejq;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzbhy() {
        return zzejq.zzbia();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, Object obj2) {
        ((zzejq) obj).zzd((i << 3) | 3, (zzejq) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, zzeff zzeff) {
        ((zzejq) obj).zzd((i << 3) | 2, zzeff);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, int i, long j) {
        ((zzejq) obj).zzd((i << 3) | 1, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Object obj, int i, int i2) {
        ((zzejq) obj).zzd((i << 3) | 5, Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzejq) obj).zzd(i << 3, Long.valueOf(j));
    }
}
