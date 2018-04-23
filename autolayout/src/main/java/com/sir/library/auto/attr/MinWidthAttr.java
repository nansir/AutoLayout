package com.sir.library.auto.attr;

import android.os.Build;
import android.view.View;

import java.lang.reflect.Field;

/**
 * Created by zhy on 15/12/24.
 */
public class MinWidthAttr extends AutoAttr {

    public MinWidthAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    public static int getMinWidth(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
            return view.getMinimumWidth();
        try {
            Field minWidth = view.getClass().getField("mMinWidth");
            minWidth.setAccessible(true);
            return (int) minWidth.get(view);
        } catch (Exception ignore) {
        }
        return 0;
    }

    public static MinWidthAttr generate(int val, int baseFlag) {
        MinWidthAttr attr = null;
        switch (baseFlag) {
            case BASE_WIDTH:
                attr = new MinWidthAttr(val, Attrs.MIN_WIDTH, 0);
                break;
            case BASE_HEIGHT:
                attr = new MinWidthAttr(val, 0, Attrs.MIN_WIDTH);
                break;
            case BASE_DEFAULT:
                attr = new MinWidthAttr(val, 0, 0);
                break;
        }
        return attr;
    }

    @Override
    protected boolean defaultBaseWidth() {
        return true;
    }

    @Override
    protected void execute(View view, int val) {
        view.setMinimumWidth(val);
    }

    @Override
    protected int attrVal() {
        return Attrs.MIN_WIDTH;
    }
}
