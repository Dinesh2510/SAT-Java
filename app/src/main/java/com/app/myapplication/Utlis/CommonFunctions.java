package com.app.myapplication.Utlis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CommonFunctions {

    public static View CreateDynamicViews(int layout, ViewGroup addingview, Context context) {
        View view = LayoutInflater.from(context).inflate(layout, null);
        setMargins(view, 15, 0, 15, 0);
        addingview.addView(view);
        return view;
    }

    public static int getColor(Context context, int icons) {

        return context.getResources().getColor(icons);
    }

    public static void setMargins(View view, int left, int top, int right, int bottom) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(left, top, right, bottom);
            view.requestLayout();

//            Funtions.LOGE("MainAcitvity","Left : "+left);

        }

    }
    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

    public static void showNoInternetDialog(Activity context) {
        showNoInternetDialog(context, false);
    }

    public static void showNoInternetDialog(final Activity context, final boolean close) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("Please check your internet connection!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if (close) {
                            context.finish();
                        }
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();


    }
    public static boolean isStringValid(String text) {

        if (text != null && !text.equals("") && !text.equals("null")) {
            return true;
        }

        return false;
    }

    public static boolean checkStringisValid(String text) {

        if (text != null && !text.equals("") && !text.equals("null") && !text.equals("0") && !text.equals("0.0")) {
            return true;
        }

        return false;
    }
}
