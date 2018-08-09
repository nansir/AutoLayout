package com.sir.library.auto;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.util.TypedValue;

import com.sir.library.auto.utils.ScreenUtils;

public class AutoActionMenuItemView extends ActionMenuItemView {

    private static final int NO_VALID = -1;

    private int mMenuTextSize;

    public AutoActionMenuItemView(Context context) {
        this(context, null);
    }

    public AutoActionMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @SuppressLint("RestrictedApi")
    public AutoActionMenuItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.AppCompatTheme, defStyle, R.style.ThemeOverlay_AppCompat);
        int menuTextAppearance = a.getResourceId(R.styleable.Toolbar_titleTextAppearance, R.style.ThemeOverlay_AppCompat_ActionBar);
        mMenuTextSize = loadTextSizeFromTextAppearance(menuTextAppearance);
        a.recycle();
    }

    private int loadTextSizeFromTextAppearance(int textAppearanceResId) {
        TypedArray a = getContext().obtainStyledAttributes(textAppearanceResId, R.styleable.TextAppearance);
        try {
            if (!ScreenUtils.isPxVal(a.peekValue(R.styleable.TextAppearance_android_textSize))) {
                return NO_VALID;
            }
            return a.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, NO_VALID);
        } finally {
            a.recycle();
        }
    }

    @SuppressLint("RestrictedApi")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.isInEditMode()) {
            setUpTitleTextSize();
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    private void setUpTitleTextSize() {
        if (mMenuTextSize == -1) return;
        int autoTextSize = ScreenUtils.getPercentHeightSize(mMenuTextSize);
        setTextSize(TypedValue.COMPLEX_UNIT_PX, autoTextSize);
    }
}
