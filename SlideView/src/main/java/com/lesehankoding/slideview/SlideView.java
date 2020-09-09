package com.lesehankoding.slideview;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class SlideView {
    public static void left2Right(Context context, View view){
        Animation enterAnim = AnimationUtils.loadAnimation(context, R.anim.left_2_right);
        Animation leaveAnim = AnimationUtils.loadAnimation(context, R.anim.right_2_left);

        if(view.getVisibility() != View.VISIBLE) {
            view.setVisibility(View.VISIBLE);
            view.startAnimation(enterAnim);
        }else{
            view.startAnimation(leaveAnim);
            view.setVisibility(View.GONE);
        }
    }

    public static void right2Left(Context context,View view){
        view.setVisibility(View.GONE);
        Animation enterAnim = AnimationUtils.loadAnimation(context, R.anim.left_2_right);


        if(view.getVisibility() != View.VISIBLE) {
            view.setVisibility(View.VISIBLE);
            view.startAnimation(enterAnim);
        }
    }
}
