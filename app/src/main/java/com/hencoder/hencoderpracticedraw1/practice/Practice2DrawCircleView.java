package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawCircle(100, 100, 50, paint);

        Paint paintEmpty = new Paint();
        paintEmpty.setColor(Color.BLACK);
        paintEmpty.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(400, 100, 50, paintEmpty);

        Paint paintBlue = new Paint();
        paintBlue.setColor(Color.BLUE);
        canvas.drawCircle(100, 400, 50, paintBlue);

        Paint paintStroke20 = new Paint();
        paintStroke20.setColor(Color.BLUE);
        paintStroke20.setStrokeWidth(20);
        paintStroke20.setStyle(Paint.Style.STROKE);

        canvas.drawCircle(400, 400, 50, paintStroke20);


    }
}
