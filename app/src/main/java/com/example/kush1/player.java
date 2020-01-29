package com.example.kush1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.SeekBar;

import java.net.URI;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class player<url> extends AppCompatActivity {
    MediaPlayer player;
    AudioManager audioManager;
    WebView web2;
    EditText ed;
    public void play1(View view)
    {
        player.start();

    }
    public void pause1(View view)
    {
        player.pause();

    }
    public void stop1(View view)
    {
        player.stop();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        player = MediaPlayer.create(this,R.raw.makhna);
        audioManager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
        int maxVol=audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVol=audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        SeekBar seekvol=findViewById(R.id.seekvol);
        seekvol.setMax(maxVol);
        seekvol.setProgress(curVol);
        seekvol.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final SeekBar seekplay=findViewById(R.id.seekplay);
        seekplay.setMax(player.getDuration());
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                seekplay.setProgress(player.getCurrentPosition());
            }
        },0,900);
        seekplay.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                player.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
    String string1;
    public void searchb(View view){
         web2 =(WebView)(findViewById(R.id.web1));
        web2.getSettings().setJavaScriptEnabled(true);
       // web2.getSettings().setBlockNetworkImage(true);
        web2.getSettings().setLoadsImagesAutomatically(true);
        web2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        ed=(EditText)findViewById(R.id.editText4);
        String string=ed.getText().toString();
        char [] ch = string.toCharArray();
        char c='+';
        for (int i=0;i<string.length();i++) {
            if (string.charAt(i) == ' ') {
                ch[i] = c;
            }
        }
        string1=String.valueOf(ch);
        String str ="https://www.youtube.com/results?search_query="+string1;
        web2.loadUrl(str);
        web2.setWebViewClient(new WebViewClient());

        }

    }


