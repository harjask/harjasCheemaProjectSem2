package com.pritesh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;

public class RoundTextAnimation extends View
{
	private Animation anim;
	private String txt="Institute Of Science And Technology For Advanced Studies And Research, V.V. Nagar";
	////////////// To add Image ////////////
	 private Bitmap img;
     private int imgXOffset;
     private int imgYOffset;
     
	public RoundTextAnimation(Context context) 
	{
		super(context);			
		//////// To add Image
		img = BitmapFactory.decodeResource(getResources(), R.drawable.clock);//Get Image from resource
		imgXOffset = img.getWidth() / 2;
		imgYOffset = img.getHeight() / 2;		
	}
	
	@Override
    protected void onDraw(Canvas canvas) 
	{
        super.onDraw(canvas);
        // creates the animation the first time
        if (anim == null) 
        {
            createAnim(canvas);
        }

        Path circle = new Path();

        int centerX = canvas.getWidth() / 2;
        int centerY = canvas.getHeight() / 2;
        int r = Math.min(centerX, centerY);

        circle.addCircle(centerX, centerY, r, Direction.CW);
        
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setTextSize(30);
        paint.setAntiAlias(true);

        canvas.drawTextOnPath(txt, circle, 0, 30, paint);        
        /// To add Image
       canvas.drawBitmap(img, centerX - imgXOffset,    centerY - imgYOffset, null);
    }
	
	  private void createAnim(Canvas canvas) 
	  {
          anim = new RotateAnimation(0, 360, canvas.getWidth() / 2, canvas.getHeight() / 2);
          anim.setRepeatMode(Animation.REVERSE);
          anim.setRepeatCount(Animation.INFINITE);
          anim.setDuration(10000L);
          anim.setInterpolator(new AccelerateDecelerateInterpolator());

          startAnimation(anim);
      }
}
