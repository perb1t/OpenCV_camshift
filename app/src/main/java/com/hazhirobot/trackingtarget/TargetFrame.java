package com.hazhirobot.trackingtarget;

import android.graphics.Point;

/**
 * Created by shijiwei on 2018/3/12.
 *
 * @VERSION 1.0
 */

public class TargetFrame {

    private Point center = new Point();
    private int width = -1;

    public TargetFrame() {
    }

    public TargetFrame(Point center, int width) {
        this.center = center;
        this.width = width;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center.x = center.x;
        this.center.y = center.y;
    }

    public void setCenter(int centerX, int centerY) {
        this.center.x = centerX;
        this.center.y = centerY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
