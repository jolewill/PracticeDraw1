package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paint;


    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);

        RectF rectF = new RectF(200, 50, 700, 550);
        //   canvas.drawRect(rectF, paint);
        canvas.drawArc(rectF, -60, -120, true, paint);


        RectF rectFM = new RectF(220, 70, 720, 570);
        paint.setColor(Color.parseColor("#DAA520"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(rectFM, -60, 56, true, paint);

        paint.setColor(Color.parseColor("#9932CC"));
        RectF rectFG = new RectF(224, 74, 724, 574);
        canvas.drawArc(rectFG, -1, 6, true, paint);
        paint.setColor(Color.parseColor("#757575"));
        RectF rectFI = new RectF(224, 78, 724, 578);
        canvas.drawArc(rectFI, 5, 5, true, paint);
        paint.setColor(Color.parseColor("#009688"));
        RectF rectFJ = new RectF(224, 82, 724, 582);
        canvas.drawArc(rectFJ, 10, 60, true, paint);
        paint.setColor(Color.parseColor("#0091ea"));
        RectF rectFK = new RectF(220, 82, 720, 582);
        canvas.drawArc(rectFK, 70, 105, true, paint);
        Path path = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setTextSize(26);
        canvas.drawText("Lollipop", 50, 50, paint);
        path.setLastPoint(150, 50);
        path.lineTo(300, 50);
        path.lineTo(320, 75);
        canvas.drawPath(path, paint);

        Path pathM = new Path();
        pathM.setLastPoint(850, 200);
        pathM.lineTo(750, 200);
        pathM.lineTo(700, 240);
        canvas.drawText("Marshmallow", 855, 200, paint);
        canvas.drawPath(pathM, paint);

        Path pathF = new Path();
        pathF.setLastPoint(850, 310);
        pathF.lineTo(720, 310);
        canvas.drawText("Froyo", 855, 310, paint);
        canvas.drawPath(pathF, paint);

        Path pathG = new Path();
        pathG.setLastPoint(850,350);
        pathG.lineTo(800,350);
        pathG.lineTo(750,330);
        pathG.lineTo(720,330);
        canvas.drawText("Gingerbread",855,350,paint);
        canvas.drawPath(pathG,paint);

        Path pathIce = new Path();
        pathIce.setLastPoint(850,390);
        pathIce.lineTo(800,390);
        pathIce.lineTo(750,370);
        pathIce.lineTo(720,370);
        canvas.drawText("Ice Cream Sandwich",855,390,paint);
        canvas.drawPath(pathIce,paint);
        Path pathJ = new Path();
        pathJ.setLastPoint(850,500);
        pathJ.lineTo(700,500);
        pathJ.lineTo(680,480);
        canvas.drawText("Jelly Bean",855,500,paint);
        canvas.drawPath(pathJ,paint);

        Path pathKitKat = new Path();
        pathKitKat.setLastPoint(170,550);
        pathKitKat.lineTo(270,550);
        pathKitKat.lineTo(300,530);
        canvas.drawPath(pathKitKat,paint);
        canvas.drawText("KitKat",50,550,paint);


//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
