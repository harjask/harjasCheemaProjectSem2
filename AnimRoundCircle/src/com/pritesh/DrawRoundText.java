package com.pritesh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.view.View;

public class DrawRoundText extends View
{
	
	
	public DrawRoundText(Context context) 
	{
		super(context);		
	}
	
	@Override
	protected void onDraw(Canvas canvas) 
	{
		// create a path
		Path circle = new Path();
		int centerX=canvas.getWidth()/2;
		int centerY=canvas.getHeight()/3;
		int radius=150;
		circle.addCircle(centerX, centerY, radius, Direction.CW); //CW=Clockwise CCW=Counter clockwise
		String txt="Institute Of Science And Technology For Advanced Studies And Research, V.V. Nagar";
		

		// set the color and font size
		Paint paint = new Paint();
		paint.setColor(Color.YELLOW);
		paint.setTextSize(5);
		paint.setAntiAlias(true);

		// draw the text along the circle
		canvas.drawTextOnPath(txt, circle, 0, 30, paint);
		//canvas.drawText(txt, 0, 100, paint);
		
	}
	
	
}
