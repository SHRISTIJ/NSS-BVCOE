package com.example.shristi.nss_bvcoe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Social_media extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_social_media, container, false);
        final ImageButton show_me = (ImageButton) view.findViewById(R.id.button_showme);
        ImageButton show_me1 = (ImageButton) view.findViewById(R.id.button_showme1);
        ImageButton show_me2 = (ImageButton) view.findViewById(R.id.button_showme2);

        show_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                //Fb
                i.setData(Uri.parse("https://m.facebook.com/bvcoenss"));
                startActivity(i);
            }
        });

        show_me1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent();
                //colg
                i.setData(Uri.parse("http://bvcoend.ac.in/site/home/index/200"));
                startActivity(i);

            }
        });

        show_me2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent();
                //youtube
                i.setData(Uri.parse("https://www.youtube.com/channel/UCKvjzCWpxQJ6Zrhm92CZSew"));
                startActivity(i);

            }
        });

        return view;
    }

}
