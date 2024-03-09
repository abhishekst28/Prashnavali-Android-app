package com.example.cutsomnavigation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class HomeWatcher {
    private Context mContext;
    private IntentFilter mFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
    /* access modifiers changed from: private */
    public OnHomePressedListener mListener;
    private InnerRecevier mRecevier;

    public interface OnHomePressedListener {
        void onHomeLongPressed();

        void onHomePressed();
    }

    public HomeWatcher(Context context) {
        this.mContext = context;
    }

    public void setOnHomePressedListener(OnHomePressedListener listener) {
        this.mListener = listener;
        this.mRecevier = new InnerRecevier();
    }

    public void startWatch() {
        InnerRecevier innerRecevier = this.mRecevier;
        if (innerRecevier != null) {
            this.mContext.registerReceiver(innerRecevier, this.mFilter);
        }
    }

    public void stopWatch() {
        InnerRecevier innerRecevier = this.mRecevier;
        if (innerRecevier != null) {
            this.mContext.unregisterReceiver(innerRecevier);
        }
    }

    class InnerRecevier extends BroadcastReceiver {
        final String SYSTEM_DIALOG_REASON_GLOBAL_ACTIONS = "globalactions";
        final String SYSTEM_DIALOG_REASON_HOME_KEY = "homekey";
        final String SYSTEM_DIALOG_REASON_KEY = "reason";
        final String SYSTEM_DIALOG_REASON_RECENT_APPS = "recentapps";

        InnerRecevier() {
        }

        public void onReceive(Context context, Intent intent) {
            String reason;
            String action = intent.getAction();
            if (action != null && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && (reason = intent.getStringExtra("reason")) != null && HomeWatcher.this.mListener != null) {
                if (reason.equals("homekey")) {
                    HomeWatcher.this.mListener.onHomePressed();
                } else if (reason.equals("recentapps")) {
                    HomeWatcher.this.mListener.onHomeLongPressed();
                }
            }
        }
    }
}
