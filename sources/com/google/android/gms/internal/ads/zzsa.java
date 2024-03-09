package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzsa {
    private final int zzbtw;
    private final zzrq zzbty;
    private String zzbug;
    private String zzbuh;
    private final boolean zzbui = false;
    private final int zzbuj;
    private final int zzbuk;

    public zzsa(int i, int i2, int i3) {
        this.zzbtw = i;
        if (i2 > 64 || i2 < 0) {
            this.zzbuj = 64;
        } else {
            this.zzbuj = i2;
        }
        if (i3 <= 0) {
            this.zzbuk = 1;
        } else {
            this.zzbuk = i3;
        }
        this.zzbty = new zzrx(this.zzbuj);
    }

    public final String zza(ArrayList<String> arrayList, ArrayList<zzrn> arrayList2) {
        boolean z;
        boolean z2;
        String str;
        ArrayList<zzrn> arrayList3 = arrayList2;
        Collections.sort(arrayList3, new zzrz(this));
        HashSet hashSet = new HashSet();
        for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize(arrayList.get(arrayList3.get(i).zzmp()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str2 : split) {
                    if (str2.indexOf("'") != -1) {
                        StringBuilder sb = new StringBuilder(str2);
                        int i2 = 1;
                        boolean z3 = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                        z3 = true;
                                    }
                                }
                                sb.setCharAt(i2, ' ');
                                z3 = true;
                            }
                            i2++;
                        }
                        if (z3) {
                            str = sb.toString();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            this.zzbuh = str;
                            str2 = str;
                        }
                    }
                    String[] zze = zzru.zze(str2, true);
                    if (zze.length >= this.zzbuk) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= zze.length) {
                                break;
                            }
                            String str3 = "";
                            int i6 = 0;
                            while (true) {
                                if (i6 >= this.zzbuk) {
                                    z2 = true;
                                    break;
                                }
                                int i7 = i5 + i6;
                                if (i7 >= zze.length) {
                                    z2 = false;
                                    break;
                                }
                                if (i6 > 0) {
                                    str3 = String.valueOf(str3).concat(" ");
                                }
                                String valueOf = String.valueOf(str3);
                                String valueOf2 = String.valueOf(zze[i7]);
                                str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                                i6++;
                            }
                            if (!z2) {
                                break;
                            }
                            hashSet.add(str3);
                            if (hashSet.size() >= this.zzbtw) {
                                z = false;
                                break;
                            }
                            i5++;
                        }
                        if (hashSet.size() >= this.zzbtw) {
                            z = false;
                            break;
                        }
                    }
                }
            }
            z = true;
            if (!z) {
                break;
            }
        }
        zzrr zzrr = new zzrr();
        this.zzbug = "";
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzrr.write(this.zzbty.zzbu((String) it.next()));
            } catch (IOException e) {
                zzaxy.zzc("Error while writing hash to byteStream", e);
            }
        }
        return zzrr.toString();
    }
}
