package com.example.tetris;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.util.Log;

import com.example.tetris.Matrix;

public class TetrisView extends View {
    private int dy, dx;   // view size in unit blocks
    private int by = 0, bx = 0;     // unit block size
    private int color = Color.BLACK;
    private int skip = 0;
    private Matrix screen = null;
    private Paint paint = new Paint();
    public int ondraw_calls = 0;

    public TetrisView(Context context, AttributeSet attrs, int defStyle) { super(context, attrs, defStyle); }
    public TetrisView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public TetrisView(Context context) {
        super(context);
    }
    public void init(int y, int x, int w) {
        dy = y; dx = x;
        skip = w;
    }
    public void accept(Matrix m)  { screen = m; }
    public void onDraw(Canvas canvas) {
        int cy = 10;
        int cx = 10;
        ondraw_calls++;
        if (screen == null) return;
        int[][] array = screen.get_array();
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        bx = (getWidth() - 20 - ((dx-1)*5))/dx;
        by = (getHeight() - 20 - ((dy-1)*5))/dy;
        //Log.d("TetrisView", "dy="+dy+",dx="+dx+",bx="+bx+",by="+by+",skip="+skip);

        for (int y = 0; y < dy; y++) {
            for (int x = skip; x < skip + dx; x++) {
                switch(array[y][x]) {
                    case 0: paint.setColor(Color.BLACK); break;
                    case 10: paint.setColor(Color.GRAY); break;
                    case 20: paint.setColor(Color.GREEN); break;
                    case 30: paint.setColor(Color.CYAN); break;
                    case 40: paint.setColor(Color.BLUE); break;
                    case 50: paint.setColor(Color.YELLOW); break;
                    case 60: paint.setColor(Color.RED); break;
                    case 70: paint.setColor(Color.MAGENTA); break;
                    default : paint.setColor(Color.WHITE); break;
                }
                if (array[y][x] != 0)
                    canvas.drawRect(cx, cy, cx + bx, cy + by, paint);
                cx += (bx + 5);
            }
            cx = 10;
            cy += (by + 5);
        }
    }
}
