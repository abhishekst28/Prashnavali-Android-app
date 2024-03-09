package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzehh extends zzeez<String> implements zzehk, RandomAccess {
    private static final zzehh zzihf;
    private static final zzehk zzihg = zzihf;
    private final List<Object> zzihh;

    public zzehh() {
        this(10);
    }

    public zzehh(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private zzehh(ArrayList<Object> arrayList) {
        this.zzihh = arrayList;
    }

    public final int size() {
        return this.zzihh.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzbdh();
        if (collection instanceof zzehk) {
            collection = ((zzehk) collection).zzbgn();
        }
        boolean addAll = this.zzihh.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzbdh();
        this.zzihh.clear();
        this.modCount++;
    }

    public final void zzaj(zzeff zzeff) {
        zzbdh();
        this.zzihh.add(zzeff);
        this.modCount++;
    }

    public final Object zzhe(int i) {
        return this.zzihh.get(i);
    }

    private static String zzal(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeff) {
            return ((zzeff) obj).zzbdj();
        }
        return zzegr.zzz((byte[]) obj);
    }

    public final List<?> zzbgn() {
        return Collections.unmodifiableList(this.zzihh);
    }

    public final zzehk zzbgo() {
        if (zzbdf()) {
            return new zzejs(this);
        }
        return this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        zzbdh();
        return zzal(this.zzihh.set(i, (String) obj));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        zzbdh();
        Object remove = this.zzihh.remove(i);
        this.modCount++;
        return zzal(remove);
    }

    public final /* bridge */ /* synthetic */ boolean zzbdf() {
        return super.zzbdf();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzbdh();
        this.zzihh.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ zzeha zzft(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzihh);
            return new zzehh((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzihh.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeff) {
            zzeff zzeff = (zzeff) obj;
            String zzbdj = zzeff.zzbdj();
            if (zzeff.zzbdk()) {
                this.zzihh.set(i, zzbdj);
            }
            return zzbdj;
        }
        byte[] bArr = (byte[]) obj;
        String zzz = zzegr.zzz(bArr);
        if (zzegr.zzy(bArr)) {
            this.zzihh.set(i, zzz);
        }
        return zzz;
    }

    static {
        zzehh zzehh = new zzehh();
        zzihf = zzehh;
        zzehh.zzbdg();
    }
}
