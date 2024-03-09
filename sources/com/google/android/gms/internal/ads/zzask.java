package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzask extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzask> CREATOR = new zzasm();
    private ParcelFileDescriptor zzdsy;
    private Parcelable zzdsz = null;
    private boolean zzdta = true;

    public zzask(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzdsy = parcelFileDescriptor;
    }

    /* JADX INFO: finally extract failed */
    public final <T extends SafeParcelable> T zza(Parcelable.Creator<T> creator) {
        if (this.zzdta) {
            if (this.zzdsy == null) {
                zzaxy.zzfc("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zzdsy));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                IOUtils.closeQuietly((Closeable) dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.zzdsz = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.zzdta = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                zzaxy.zzc("Could not read from parcel file descriptor", e);
                IOUtils.closeQuietly((Closeable) dataInputStream);
                return null;
            } catch (Throwable th2) {
                IOUtils.closeQuietly((Closeable) dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.zzdsz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzvc();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdsy, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: finally extract failed */
    private final ParcelFileDescriptor zzvc() {
        if (this.zzdsy == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzdsz.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.zzdsy = zzh(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.zzdsy;
    }

    private static <T> ParcelFileDescriptor zzh(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                zzbbi.zzedu.execute(new zzasn(autoCloseOutputStream, bArr));
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                zzaxy.zzc("Error transporting the ad response", e);
                zzp.zzkt().zza(e, "LargeParcelTeleporter.pipeData.2");
                IOUtils.closeQuietly((Closeable) autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void zza(java.io.OutputStream r3, byte[] r4) {
        /*
            r0 = 0
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x001a }
            r1.<init>(r3)     // Catch:{ IOException -> 0x001a }
            int r0 = r4.length     // Catch:{ IOException -> 0x0015, all -> 0x0012 }
            r1.writeInt(r0)     // Catch:{ IOException -> 0x0015, all -> 0x0012 }
            r1.write(r4)     // Catch:{ IOException -> 0x0015, all -> 0x0012 }
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r1)
            return
        L_0x0012:
            r4 = move-exception
            r0 = r1
            goto L_0x0033
        L_0x0015:
            r4 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x0018:
            r4 = move-exception
            goto L_0x0033
        L_0x001a:
            r4 = move-exception
        L_0x001b:
            java.lang.String r1 = "Error transporting the ad response"
            com.google.android.gms.internal.ads.zzaxy.zzc(r1, r4)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.zzaxk r1 = com.google.android.gms.ads.internal.zzp.zzkt()     // Catch:{ all -> 0x0018 }
            java.lang.String r2 = "LargeParcelTeleporter.pipeData.1"
            r1.zza(r4, r2)     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x002f
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r3)
            return
        L_0x002f:
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r0)
            return
        L_0x0033:
            if (r0 != 0) goto L_0x0039
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r3)
            goto L_0x003c
        L_0x0039:
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r0)
        L_0x003c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzask.zza(java.io.OutputStream, byte[]):void");
    }
}
