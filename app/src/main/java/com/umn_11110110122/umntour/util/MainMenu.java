package com.umn_11110110122.umntour.util;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

/**
 * Created by Yoan Pratama Putra on 08/12/15.
 */
public class MainMenu {

    private Context context;
    private String title, content;
    private View fragment;

    private Context getContext() {
        return context;
    }

    private void setContext(Context context) {
        this.context = context;
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private String getContent() {
        return content;
    }

    private void setContent(String content) {
        this.content = content;
    }

    private View getFragment() {
        return fragment;
    }

    private void setFragment(View fragment) {
        this.fragment = fragment;
    }

    public ImageButton setRipple(ImageButton button, MotionEvent event, String colorPressed, String colorUnpressed){
        if (event.getAction() == MotionEvent.ACTION_DOWN)
            button.setColorFilter(Color.parseColor(colorPressed));
        else if (event.getAction() == MotionEvent.ACTION_UP)
            button.setColorFilter(Color.parseColor(colorUnpressed));

        return button;
    }

    private android.support.v7.app.AlertDialog.Builder setDialog(){
        //create dialog using builder
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this.getContext());
        builder.setTitle(this.getTitle());
        builder.setMessage(this.getContent());

        return builder; //return builder
    }

    public void showDialog(Context ctx, String title, String content){
        //set required data
        this.setContext(ctx);
        this.setTitle(title);
        this.setContent(content);

        //create and get dialog builder
        android.support.v7.app.AlertDialog.Builder builder = this.setDialog();

        //show dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void showDialogPositive(Context ctx, String title, String content){
        //set required data
        this.setContext(ctx);
        this.setTitle(title);
        this.setContent(content);

        //create and get dialog builder
        android.support.v7.app.AlertDialog.Builder builder = this.setDialog();

        //add positive button
        builder.setPositiveButton("Ok", null);

        //show dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private Dialog setFragmentDialog(){
        //create dialog using a fragment as view
        Dialog dialog = new Dialog(this.getContext());
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(this.getFragment());

        return dialog; //return dialog
    }

    public void showFragmentDialog(Context ctx, View fragment){
        //set required data
        this.setContext(ctx);
        this.setFragment(fragment);

        //create and get dialog
        Dialog dialog = this.setFragmentDialog();

        //show fragment dialog
        dialog.show();
    }

}
