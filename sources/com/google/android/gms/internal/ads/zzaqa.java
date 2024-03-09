package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaqa implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapx zzdmx;
    private final /* synthetic */ String zzdmy;
    private final /* synthetic */ String zzdmz;

    zzaqa(zzapx zzapx, String str, String str2) {
        this.zzdmx = zzapx;
        this.zzdmy = str;
        this.zzdmz = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.zzdmx.zzvr.getSystemService("download");
        try {
            String str = this.zzdmy;
            String str2 = this.zzdmz;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzp.zzkr();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException e) {
            this.zzdmx.zzdx("Could not store picture.");
        }
    }
}
