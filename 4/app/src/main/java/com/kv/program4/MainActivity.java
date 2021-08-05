package com.kv.program4;

import androidx.appcompat.app.AppCompatActivity;
import android.app.WallpaperManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kv.prograam4.R;

import java.util.Timer;
import java.util.TimerTask;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnChangeWallpaper;
    boolean running;
    int[] imagesArray=new int[]{
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12
    };
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeWallpaper=(Button)
                findViewById(R.id.btn_start_change_wallpaper);
        btnChangeWallpaper.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        if(!running)
        {
            new Timer().schedule (new MyTimer(),0,3000);
            running=true;
        }
    }
    class MyTimer extends TimerTask
    {
        public void run()
        {
            try
            {
                WallpaperManager wallpaperManager=
                        WallpaperManager.getInstance(getBaseContext());
                if(i==12)
                    i=1;
                if(i==11)
                    i=2;
                if(i==10)
                    i=3;
                if(i==9)
                    i=4;
                if(i==8)
                    i=5;
                if(i==7)
                    i=6;
                if(i==6)
                    i=7;
                if(i==5)
                    i=8;
                if(i==4)
                    i=9;
                if(i==3)
                    i=10;
                wallpaperManager.setBitmap (BitmapFactory.decodeResource(getResources(),imagesArray[i]));
                i++;
            }
            catch(Exception e)
            {
            }
        }
    }
}