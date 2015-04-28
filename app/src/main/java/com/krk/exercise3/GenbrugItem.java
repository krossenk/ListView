package com.krk.exercise3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Rossen on 22/04/15.
 */
public class GenbrugItem extends ImageView {
    private final Drawable logo;

    public GenbrugItem(Context context) {
        super(context);
        logo = context.getResources().getDrawable(R.drawable.img);

    }

    public GenbrugItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        logo = context.getResources().getDrawable(R.drawable.img);

    }

    public GenbrugItem(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        logo = context.getResources().getDrawable(R.drawable.img);

    }

    @Override protected void onMeasure(int widthMeasureSpec,
                                       int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = width * logo.getIntrinsicHeight() / logo.getIntrinsicWidth();
        setMeasuredDimension(width, height);
    }
}

