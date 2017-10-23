package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint paint = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);

        canvas.drawLine(100, 100, 100, 600, paint);
        canvas.drawLine(100, 600, 1000, 600, paint);
        canvas.drawRect(120, 580, 200, 600, paint);
        paint.setTextSize(34);
        paint.setColor(Color.GREEN);
        canvas.drawRect(220, 550, 300, 600, paint);
        canvas.drawRect(320, 550, 400, 600, paint);
        canvas.drawRect(420, 300, 500, 600, paint);
        canvas.drawRect(520, 200, 600, 600, paint);
        canvas.drawRect(620, 100, 700, 600, paint);
        canvas.drawRect(720, 320, 800, 600, paint);
        /*Froyo*/
        canvas.drawText("Froyo", 120, 630, paint);
        canvas.drawText("GB", 220, 630, paint);
        canvas.drawText("ICS", 320, 630, paint);
        canvas.drawText("JB", 420, 630, paint);
        canvas.drawText("KitKat", 520, 630, paint);
        canvas.drawText("L", 620, 630, paint);
        canvas.drawText("M", 720, 630, paint);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
