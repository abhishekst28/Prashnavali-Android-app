package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdlp {
    /* access modifiers changed from: private */
    public boolean zzbnu;
    /* access modifiers changed from: private */
    public zzvj zzbpb;
    /* access modifiers changed from: private */
    public zzadm zzdla;
    /* access modifiers changed from: private */
    public zzair zzdrn;
    /* access modifiers changed from: private */
    public int zzgra = 1;
    /* access modifiers changed from: private */
    public boolean zzgso = false;
    /* access modifiers changed from: private */
    public zzxi zzhbs;
    /* access modifiers changed from: private */
    public zzaac zzhbt;
    /* access modifiers changed from: private */
    public zzvc zzhbu;
    /* access modifiers changed from: private */
    public String zzhbv;
    /* access modifiers changed from: private */
    public ArrayList<String> zzhbw;
    /* access modifiers changed from: private */
    public ArrayList<String> zzhbx;
    /* access modifiers changed from: private */
    public zzvm zzhby;
    /* access modifiers changed from: private */
    public PublisherAdViewOptions zzhbz;
    /* access modifiers changed from: private */
    public zzxc zzhca;
    /* access modifiers changed from: private */
    public zzdlc zzhcc = new zzdlc();

    public final zzdlp zzh(zzvc zzvc) {
        this.zzhbu = zzvc;
        return this;
    }

    public final zzvc zzasr() {
        return this.zzhbu;
    }

    public final zzdlp zze(zzvj zzvj) {
        this.zzbpb = zzvj;
        return this;
    }

    public final zzdlp zzbo(boolean z) {
        this.zzgso = z;
        return this;
    }

    public final zzvj zzke() {
        return this.zzbpb;
    }

    public final zzdlp zzc(zzxi zzxi) {
        this.zzhbs = zzxi;
        return this;
    }

    public final zzdlp zzgt(String str) {
        this.zzhbv = str;
        return this;
    }

    public final String zzass() {
        return this.zzhbv;
    }

    public final zzdlp zzc(zzaac zzaac) {
        this.zzhbt = zzaac;
        return this;
    }

    public final zzdlc zzast() {
        return this.zzhcc;
    }

    public final zzdlp zzbp(boolean z) {
        this.zzbnu = z;
        return this;
    }

    public final zzdlp zzec(int i) {
        this.zzgra = i;
        return this;
    }

    public final zzdlp zzc(ArrayList<String> arrayList) {
        this.zzhbw = arrayList;
        return this;
    }

    public final zzdlp zzd(ArrayList<String> arrayList) {
        this.zzhbx = arrayList;
        return this;
    }

    public final zzdlp zzb(zzadm zzadm) {
        this.zzdla = zzadm;
        return this;
    }

    public final zzdlp zzb(zzvm zzvm) {
        this.zzhby = zzvm;
        return this;
    }

    public final zzdlp zzb(zzair zzair) {
        this.zzdrn = zzair;
        this.zzhbt = new zzaac(false, true, false);
        return this;
    }

    public final zzdlp zzb(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzhbz = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zzbnu = publisherAdViewOptions.getManualImpressionsEnabled();
            this.zzhca = publisherAdViewOptions.zzjt();
        }
        return this;
    }

    public final zzdlp zzc(zzdln zzdln) {
        this.zzhcc.zza(zzdln.zzhcb);
        this.zzhbu = zzdln.zzhbu;
        this.zzbpb = zzdln.zzbpb;
        this.zzhbs = zzdln.zzhbs;
        this.zzhbv = zzdln.zzhbv;
        this.zzhbt = zzdln.zzhbt;
        this.zzhbw = zzdln.zzhbw;
        this.zzhbx = zzdln.zzhbx;
        this.zzdla = zzdln.zzdla;
        this.zzhby = zzdln.zzhby;
        zzdlp zzb = zzb(zzdln.zzhbz);
        zzb.zzgso = zzdln.zzgso;
        return zzb;
    }

    public final zzdln zzasu() {
        Preconditions.checkNotNull(this.zzhbv, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzbpb, "ad size must not be null");
        Preconditions.checkNotNull(this.zzhbu, "ad request must not be null");
        return new zzdln(this);
    }

    public final boolean zzasv() {
        return this.zzgso;
    }
}
