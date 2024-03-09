package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zztq {

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    public static final class zza extends zzegp<zza, C0015zza> implements zzeib {
        /* access modifiers changed from: private */
        public static final zza zzbvu;
        private static volatile zzeim<zza> zzel;

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public enum zzb implements zzegu {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
            AD_FAILED_TO_LOAD_NETWORK_ERROR(101),
            AD_FAILED_TO_LOAD_TIMEOUT(102),
            AD_FAILED_TO_LOAD_CANCELLED(103),
            AD_FAILED_TO_LOAD_NO_ERROR(104),
            AD_FAILED_TO_LOAD_NOT_FOUND(105),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(PointerIconCompat.TYPE_CONTEXT_MENU),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(PointerIconCompat.TYPE_HAND),
            REQUEST_FAILED_TO_BUILD_URL(PointerIconCompat.TYPE_HELP),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(PointerIconCompat.TYPE_WAIT),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
            REQUEST_FAILED_TO_UPDATE_SIGNALS(PointerIconCompat.TYPE_CELL),
            REQUEST_FAILED_TO_RENDER(PointerIconCompat.TYPE_CROSSHAIR),
            REQUEST_IS_PREFETCH(1100),
            REQUEST_SAVED_TO_CACHE(1101),
            REQUEST_LOADED_FROM_CACHE(1102),
            REQUEST_PREFETCH_INTERCEPTED(1103),
            REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED(1104),
            REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED(1105),
            NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED(1106),
            NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED(1107),
            REQUEST_FAILED_TO_LOAD_FROM_CACHE(1108),
            BANNER_SIZE_INVALID(10000),
            BANNER_SIZE_VALID(10001),
            ANDROID_WEBVIEW_CRASH(10002),
            OFFLINE_UPLOAD(10003),
            DELAY_PAGE_LOAD_CANCELLED_AD(10004);
            
            private static final zzegt<zzb> zzes = null;
            private final int value;

            public final int zzv() {
                return this.value;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzes = new zztr();
            }
        }

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zztq$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        public static final class C0015zza extends zzegp.zzb<zza, C0015zza> implements zzeib {
            private C0015zza() {
                super(zza.zzbvu);
            }

            /* synthetic */ C0015zza(zztp zztp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zztp.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0015zza((zztp) null);
                case 3:
                    return zza((zzehz) zzbvu, "\u0001\u0000", (Object[]) null);
                case 4:
                    return zzbvu;
                case 5:
                    zzeim<zza> zzeim = zzel;
                    if (zzeim == null) {
                        synchronized (zza.class) {
                            zzeim = zzel;
                            if (zzeim == null) {
                                zzeim = new zzegp.zza<>(zzbvu);
                                zzel = zzeim;
                            }
                        }
                    }
                    return zzeim;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zza = new zza();
            zzbvu = zza;
            zzegp.zza(zza.class, zza);
        }
    }
}
