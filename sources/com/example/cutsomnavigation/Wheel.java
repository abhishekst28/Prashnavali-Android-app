package com.example.cutsomnavigation;

public class Wheel extends Thread {
    private static int[] imgs = {R.drawable.slot1, R.drawable.slot2, R.drawable.slot3, R.drawable.slot4, R.drawable.slot5, R.drawable.slot6};
    public int currentIndex = 0;
    private long frameDuration;
    private boolean isStarted = true;
    private long startIn;
    private WheelListener wheelListener;

    interface WheelListener {
        void newImage(int i);
    }

    public Wheel(WheelListener wheelListener2, long frameDuration2, long startIn2) {
        this.wheelListener = wheelListener2;
        this.frameDuration = frameDuration2;
        this.startIn = startIn2;
    }

    public void nextImg() {
        int i = this.currentIndex + 1;
        this.currentIndex = i;
        if (i == imgs.length) {
            this.currentIndex = 0;
        }
    }

    public void run() {
        try {
            Thread.sleep(this.startIn);
        } catch (InterruptedException e) {
        }
        while (this.isStarted) {
            try {
                Thread.sleep(this.frameDuration);
            } catch (InterruptedException e2) {
            }
            nextImg();
            WheelListener wheelListener2 = this.wheelListener;
            if (wheelListener2 != null) {
                wheelListener2.newImage(imgs[this.currentIndex]);
            }
        }
    }

    public void stopWheel() {
        this.isStarted = false;
    }
}
