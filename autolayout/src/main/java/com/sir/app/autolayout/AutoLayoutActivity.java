package com.sir.app.autolayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

public class AutoLayoutActivity extends AppCompatActivity {

    private static final String LAYOUT_LINEARLAYOUT = "LinearLayout";
    private static final String LAYOUT_FRAMELAYOUT = "FrameLayout";
    private static final String LAYOUT_RELATIVELAYOUT = "RelativeLayout";
    private static final String LAYOUT_GRIDLAYOUT = "GridLayout";
    private static final String LAYOUT_RADIOGROUP = "RadioGroup";
    private static final String LAYOUT_TABLELAYOUT = "TableLayout";
    private static final String LAYOUT_TABLEROW = "TableRow";
    private static final String LAYOUT_TOOLBAR = "android.support.v7.widget.Toolbar";
    private static final String LAYOUT_CARDVIEW = "android.support.v7.widget.CardView";
    private static final String LAYOUT_TAB_LAYOUT = "android.support.design.widget.TabLayout";
    private static final String LAYOUT_ACTIONMENUITEM = "android.support.v7.view.menu.ActionMenuItemView";
    private static final String LAYOUT_AUTOAPPBARLAYOUT = "android.support.design.widget.AppBarLayout";

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View view = null;

        if (name.equals(LAYOUT_FRAMELAYOUT)) {
            view = new AutoFrameLayout(context, attrs);
        } else if (name.equals(LAYOUT_LINEARLAYOUT)) {
            view = new AutoLinearLayout(context, attrs);
        } else if (name.equals(LAYOUT_RELATIVELAYOUT)) {
            view = new AutoRelativeLayout(context, attrs);
        } else if (name.equals(LAYOUT_GRIDLAYOUT)) {
            view = new AutoGridLayout(context, attrs);
        } else if (name.equals(LAYOUT_CARDVIEW)) {
            view = new AutoCardView(context, attrs);
        }else if (name.equals(LAYOUT_RADIOGROUP)){
            view = new AutoRadioGroup(context, attrs);
        }else if (name.equals(LAYOUT_TABLELAYOUT)){
            view = new AutoTableLayout(context, attrs);
        }else if (name.equals(LAYOUT_TABLEROW)){
            view = new AutoTableRow(context, attrs);
        }else if (name.equals(LAYOUT_TOOLBAR)){
            view = new AutoToolbar(context, attrs);
        }else if (name.equals(LAYOUT_TAB_LAYOUT)){
            view = new AutoTabLayout(context, attrs);
        }else if (name.equals(LAYOUT_ACTIONMENUITEM)){
            view = new AutoActionMenuItemView(context, attrs);
        }else if (name.equals(LAYOUT_AUTOAPPBARLAYOUT)){
            view = new AutoAppBarLayout(context, attrs);
        }

        if (view != null) return view;
        return super.onCreateView(name, context, attrs);
    }
}
