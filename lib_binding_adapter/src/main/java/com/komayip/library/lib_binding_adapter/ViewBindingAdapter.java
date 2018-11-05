package com.komayip.library.lib_binding_adapter;

import android.databinding.BindingAdapter;
import android.view.View;

public class ViewBindingAdapter {

    @BindingAdapter({"visible"})
    public static void setVisible(View v, boolean b){
        v.setVisibility(b ? View.VISIBLE : View.GONE);
    }

    @BindingAdapter({"selected"})
    public static void setSelected(View v, boolean b){
        v.setSelected(b);
    }

}
