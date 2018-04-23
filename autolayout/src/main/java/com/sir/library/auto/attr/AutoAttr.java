package com.sir.library.auto.attr;

import android.util.Log;
import android.view.View;

import com.sir.library.auto.utils.ScreenUtils;

/**
 * Created by zhy on 15/12/4.
 */
public abstract class AutoAttr {

    public static final int BASE_WIDTH = 1;
    public static final int BASE_HEIGHT = 2;
    public static final int BASE_DEFAULT = 3;

    private static final String TAG = "AutoAttr";

    protected int pxVal;
    protected int baseWidth;
    protected int baseHeight;

    public AutoAttr(int pxVal, int baseWidth, int baseHeight) {
        this.pxVal = pxVal;
        this.baseWidth = baseWidth;
        this.baseHeight = baseHeight;
    }

    public void apply(View view) {

        boolean log = view.getTag() != null && view.getTag().toString().equals("auto");

        if (log) {
            Log.i(TAG, " pxVal = " + pxVal + " ," + this.getClass().getSimpleName());
        }
        int val;
        if (useDefault()) {
            val = defaultBaseWidth() ? getPercentWidthSize() : getPercentHeightSize();
            if (log) {
                Log.i(TAG, " useDefault val= " + val);
            }
        } else if (baseWidth()) {
            val = getPercentWidthSize();
            if (log) {
                Log.i(TAG, " baseWidth val= " + val);
            }
        } else {
            val = getPercentHeightSize();
            if (log) {
                Log.i(TAG, " baseHeight val= " + val);
            }
        }

        if (val > 0)
            val = Math.max(val, 1);//for very thin divider
        execute(view, val);
    }

    protected boolean useDefault() {
        return !contains(baseHeight, attrVal()) && !contains(baseWidth, attrVal());
    }

    protected abstract boolean defaultBaseWidth();

    protected int getPercentWidthSize() {
        return ScreenUtils.getPercentWidthSizeBigger(pxVal);
    }

    protected int getPercentHeightSize() {
        return ScreenUtils.getPercentHeightSizeBigger(pxVal);
    }

    protected boolean baseWidth() {
        return contains(baseWidth, attrVal());
    }

    protected abstract void execute(View view, int val);

    protected boolean contains(int baseVal, int flag) {
        return (baseVal & flag) != 0;
    }

    protected abstract int attrVal();

    @Override
    public String toString() {
        return "AutoAttr{" +
                "pxVal=" + pxVal +
                ", baseWidth=" + baseWidth() +
                ", defaultBaseWidth=" + defaultBaseWidth() +
                '}';
    }
}
