package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private int count=1;

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
                ViewPropertyAnimator animator=imageView.animate();
                switch (count) {
                    case 1:
                        animator.rotationX(180);
                        break;
                    case 2:
                        animator.rotationX(0);
                        break;
                    case 3:
                        animator.rotationY(180);
                        break;
                    case 4:
                        animator.rotationY(0);
                        break;
                    case 5:
                        animator.rotation(180);
                        break;
                    case 6:
                        animator.rotation(0);
                        break;
                    default:break;
                }
                count++;
                if (count>6) count=1;
            }
        });
    }
}