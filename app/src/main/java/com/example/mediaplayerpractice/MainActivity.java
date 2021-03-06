package com.example.mediaplayerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startResAudio(View v){
        if(mp == null){
            mp = MediaPlayer.create(this, R.raw.chill_pop);
            mp.start();
        }else{
            Toast.makeText(this, "playing the music...",Toast.LENGTH_SHORT).show();
            Log.i("info msg", "음악재생중");
        }

    }


    public void stopResAudio(View v){
        if(mp!=null){ //두 번 눌렀을 때 에러 방지
            mp.stop();
            mp.release();
        }
        mp=null;
    }
}