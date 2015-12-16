package com.umn_11110110122.umntour.util;

import android.content.Context;
import android.content.Intent;

import com.umn_11110110122.umntour.MainActivity;

/**
 * Created by Yoan Pratama Putra on 08/12/15.
 */
public class Navigation {

    public void toHome(Context ctx){
        //set main activity intent and start it
        Intent i = new Intent(ctx.getApplicationContext(), MainActivity.class);
        ctx.startActivity(i);
    }

    public void changeActivity(Context ctx, Class act){
        //set new intent and start selected activity
        Intent i = new Intent(ctx.getApplicationContext(), act);
        ctx.startActivity(i);
    }

}
