package com.example.kush1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class firstpage extends MainActivity{


  public static final String key1="1002";
    public static final String key2="1003";
    public static final String key3="1004";
    public static final String key4="1005";
    public static final String key5="1006";
  String id="123456";
    String id1="1234567";
    String id2="12345678";
    String id3="123456789";
    String id4="1234567890";
    ImageView imageView0;
     ImageButton next,prev;

    int curimg=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        Intent intent=getIntent();
        String name="Hey !!"+intent.getStringExtra(MainActivity.key)+"Welcome to Moriruku Portal";
        TextView textview=findViewById(R.id.textView2);
        textview.setText(name);
    }
   public void aboutus(View view) {
       Intent intent=new Intent(getApplicationContext(), about.class);
       intent.putExtra(key1,id);
       startActivity(intent);


   }
  public void entertainment(View view){
        Intent intent=new Intent(getApplicationContext(),player.class);
        intent.putExtra(key2,id1);
        startActivity(intent);

  }

  public void prev(View view){
  String idx="imageView"+curimg;
  int x=this.getResources().getIdentifier(idx,"id",getPackageName());
  imageView0=findViewById(x);
  imageView0.setAlpha(0f);
  curimg=(9+curimg-1)%9;
      String idy="imageView"+curimg;
      int y=this.getResources().getIdentifier(idy,"id",getPackageName());
      imageView0=findViewById(y);
      imageView0.setAlpha(1f);


  }


  public void next(View view){

      String idx="imageView"+curimg;
      int x=this.getResources().getIdentifier(idx,"id",getPackageName());
      imageView0=findViewById(x);
      imageView0.setAlpha(0f);
      curimg=(curimg+1)%9;
      String idy="imageView"+curimg;
      int y=this.getResources().getIdentifier(idy,"id",getPackageName());
      imageView0=findViewById(y);
      imageView0.setAlpha(1f);

  }
  public  void net(View view){

      Intent intent=new Intent(getApplicationContext(), website.class);
      intent.putExtra(key3,id2);
      startActivity(intent);

  }
public void admin(View view){
    Intent intent=new Intent(getApplicationContext(), administrator.class);
    intent.putExtra(key4,id3);
    startActivity(intent);

}
public void buttonpressed(View view){
    Intent intent=new Intent(getApplicationContext(), picture.class);
    intent.putExtra(key5,id4);
    startActivity(intent);

}

}
