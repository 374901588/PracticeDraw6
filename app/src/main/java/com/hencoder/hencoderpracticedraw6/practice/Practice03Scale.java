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

public class Practice03Scale extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    public Practice03Scale(Context context) {
        super(context);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private int count=1;

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().scaleX/Y() 来让 View 放缩
                ViewPropertyAnimator animator=imageView.animate();
                switch (count) {
                    case 1:
                        animator.scaleX(1.5f);
                        break;
                    case 2:
                        animator.scaleX(1);
                        break;
                    case 3:
                        animator.scaleY(1.5f);
                        break;
                    case 4:
                        animator.scaleY(1);
                        break;
                    default:break;
                }
                count++;
                if (count>4) count=1;
            }
        });
    }
}
