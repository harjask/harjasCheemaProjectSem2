package com.pritesh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.view.View;

public class MyCircle	extends View 
{
	
	public MyCircle(Context ctx)
	{
		super(ctx);
	}
	
	public void onDraw(Canvas c)
	{
		Paint p =new Paint(Paint.ANTI_ALIAS_FLAG);
		p.setColor(Color.YELLOW);
		//p.setStyle(Paint.Style.STROKE);
		
		LinearGradient lg = new LinearGradient(10, 10, 20, 20, Color.YELLOW, Color.MAGENTA, TileMode.REPEAT);
		p.setShader(lg);
		
		c.drawCircle(100, 100, 50, p);
		
		
	}

}
