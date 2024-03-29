package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzejj {
    static String zzam(zzeff zzeff) {
        zzejm zzejm = new zzejm(zzeff);
        StringBuilder sb = new StringBuilder(zzejm.size());
        for (int i = 0; i < zzejm.size(); i++) {
            byte zzfu = zzejm.zzfu(i);
            if (zzfu == 34) {
                sb.append("\\\"");
            } else if (zzfu == 39) {
                sb.append("\\'");
            } else if (zzfu != 92) {
                switch (zzfu) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zzfu >= 32 && zzfu <= 126) {
                            sb.append((char) zzfu);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzfu >>> 6) & 3) + 48));
                            sb.append((char) (((zzfu >>> 3) & 7) + 48));
                            sb.append((char) ((zzfu & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
