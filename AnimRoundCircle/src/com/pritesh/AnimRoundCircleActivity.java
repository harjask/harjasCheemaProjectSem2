package com.pritesh;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;

public class AnimRoundCircleActivity extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
       // setContentView (new DrawRoundText(this));
        //  setContentView (new RoundTextAnimation(this));
     //   setContentView (R.layout.main);
        
        setContentView (new MyCircle(this));
    }
   /* @Override
    public void onAttachedToWindow() 
    {
      super.onAttachedToWindow();
      Window window = getWindow();
      // Eliminates color banding
      window.setFormat(PixelFormat.RGBA_8888);
    }
*/
}