package com.sir.library.auto.attr;

import android.view.View;

/**
 * Created by zhy on 15/12/5.
 */
public class PaddingRightAttr extends AutoAttr {

    public PaddingRightAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    public static PaddingRightAttr generate(int val, int baseFlag) {
        PaddingRightAttr attr = null;
        switch (baseFlag) {
            case BASE_WIDTH:
                attr = new PaddingRightAttr(val, Attrs.PADDING_RIGHT, 0);
                break;
            case BASE_HEIGHT:
                attr = new PaddingRightAttr(val, 0, Attrs.PADDING_RIGHT);
                break;
            case BASE_DEFAULT:
                attr = new PaddingRightAttr(val, 0, 0);
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
        int l = view.getPaddingLeft();
        int t = view.getPaddingTop();
        int r = val;
        int b = view.getPaddingBottom();
        view.setPadding(l, t, r, b);

    }

    @Override
    protected int attrVal() {
        return Attrs.PADDING_RIGHT;
    }
}
