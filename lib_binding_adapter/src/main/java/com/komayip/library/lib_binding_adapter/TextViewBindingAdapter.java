package com.komayip.library.lib_binding_adapter;

import android.databinding.BindingAdapter;
import android.graphics.Paint;
import android.widget.TextView;

public class TextViewBindingAdapter {

    @BindingAdapter({"strike"})
    public static void setStrike(TextView tv, boolean strike){
        if (strike){
            tv.setPaintFlags(tv.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        } else {
            tv.setPaintFlags(tv.getPaintFlags() & ~Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }
}