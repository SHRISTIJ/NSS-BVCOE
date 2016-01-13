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


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
