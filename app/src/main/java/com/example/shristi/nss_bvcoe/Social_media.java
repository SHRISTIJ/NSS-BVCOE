package com.example.shristi.nss_bvcoe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;


public class Social_media extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);
    }
    public void showme(View v)
    {
        Intent i=new Intent();
        //Fb
        i.setData(Uri.parse("https://m.facebook.com/bvcoenss"));
        startActivity(i);

    }

    public void showme1(View v)
    {
        Intent i=new Intent();
        //colg
        i.setData(Uri.parse("http://bvcoend.ac.in/site/home/index/200"));
        startActivity(i);

    }
    public void showme2(View v)
    {
        Intent i=new Intent();
        //youtube
        i.setData(Uri.parse("https://www.youtube.com/channel/UCKvjzCWpxQJ6Zrhm92CZSew"));
        startActivity(i);

    }


}
