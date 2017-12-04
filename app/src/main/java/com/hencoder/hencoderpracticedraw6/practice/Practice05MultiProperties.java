package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;

import com.hencoder.hencoderpracticedraw6.R;
import com.hencoder.hencoderpracticedraw6.Utils;

public class Practice05MultiProperties extends ConstraintLayout {
    Button animateBt;
    ImageView imageView;

    public Practice05MultiProperties(Context context) {
        super(context);
    }

    public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private boolean flag = true;

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setScaleX(0);
        imageView.setScaleY(0);
        imageView.setAlpha(0f);
        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewPropertyAnimator animator=imageView.animate();
                // TODO 在这里处理点击事件，同时对多个属性做动画
                if (flag) {
                    animator.translationX(Utils.dpToPixel(200))
                            .alpha(1)
                            .scaleX(1)
                            .scaleY(1)
                            .rotation(360);
                } else {
                    animator.translationX(0)
                            .alpha(0)
                            .scaleX(0)
                            .scaleY(0)
                            .rotation(0);
                }
                flag = !flag;
            }
        });
    }
}
