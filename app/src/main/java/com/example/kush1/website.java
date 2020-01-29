package com.example.kush1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class website extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        Intent intent=getIntent();
        WebView web2 =(WebView)(findViewById(R.id.web1));
        web2.getSettings().setJavaScriptEnabled(true);
       // web2.getSettings().setBlockNetworkImage(true);
        web2.getSettings().setLoadsImagesAutomatically(true);
        web2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        web2.setWebViewClient(webViewClient);

        web2.loadUrl("http://technology.moriroku.co.jp/english/");
    }
}
