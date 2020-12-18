package com.infinisolutions.nestedradiobuttons;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class CustomizedRadioGroup extends LinearLayout {

    private ArrayList<View> radioButtons = new ArrayList<View>();

    public CustomizedRadioGroup(Context context) {
        super(context);
    }

    public CustomizedRadioGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomizedRadioGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomizedRadioGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void addView(View child, int index, android.view.ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        parseChild(child);
    }

    public void parseChild(final View child)
    {
        if(child instanceof Checkable)
        {
            radioButtons.add(child);
            child.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                    for(int i = 0; i < radioButtons.size();i++)
                    {
                        Checkable view = (Checkable) radioButtons.get(i);
                        if(view == v)
                        {
                            ((Checkable)view).setChecked(true);
                        }
                        else
                        {
                            ((Checkable)view).setChecked(false);
                        }
                    }
                }
            });
        }
        else if(child instanceof ViewGroup)
        {
            parseChildren((ViewGroup)child);
        }
    }

    public void parseChildren(final ViewGroup child)
    {
        for (int i = 0; i < child.getChildCount();i++)
        {
            parseChild(child.getChildAt(i));
        }
    }

}
