package com.example.kush1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class about extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Intent intent=getIntent();
        VideoView videoview=findViewById(R.id.about);
        videoview.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.aboutus);
        MediaController mediaController=new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
        videoview.start();

    }

    public void notib (View view)
    {
        Intent intent1=new Intent();
        PendingIntent pdin=PendingIntent.getActivity(this,0,intent1,0);
        Notification noti=new Notification.Builder(this).setTicker("setting ticker").setContentTitle("moririku")

                .setContentText("your notifications").setSmallIcon(R.drawable.mti2).setContentIntent(pdin).getNotification();
        noti.flags=Notification.FLAG_AUTO_CANCEL;
        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.notify(0,noti);
        Toast.makeText(this,"chal gya button",Toast.LENGTH_LONG).show();


    }

}
