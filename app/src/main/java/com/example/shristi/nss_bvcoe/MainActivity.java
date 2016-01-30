package com.example.shristi.nss_bvcoe;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CustomPagerAdapter   mCustomPagerAdapter = new CustomPagerAdapter(this);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mCustomPagerAdapter);


        TextView mtextView=(TextView) findViewById(R.id.mtextView);
        String htmlString="<B><u>ABOUT US</u></B>";
        mtextView.setText(Html.fromHtml(htmlString));
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(" ■ Faculty Coordinators:\nDr. Anil Kumar (NSS Officer)\n\n ■ Student Representatives:\nLakshay Mutreja & Meenal Gupta\n\n ■ Description about the cell:\nThe National Service Scheme (NSS) was established in India on September 24, 1969.\nThe NSS is an Indian government-sponsored public service program conducted by the Department of Youth Affairs and Sports of the Government of India.\nIn Bharati Vidyapeeth’s College of Engineering, New Delhi;\nNSS Unit  had started in 2013 under the guidance of NSS officer Dr. Anil Kumar (A.P. in Physics Applied Sc. Deptt.)\n\nMade By:\nShristi Jain, Gourav Rastogi and Aishwarya Goel");


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_home) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);

        }else if (id == R.id.nav_event) {
           FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.container, new Events(), "Event");
            transaction.commit();

        } else if (id == R.id.nav_media) {

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.container, new Social_media(), "SocialMedia");
            transaction.commit();

        } else if (id == R.id.nav_contact) {
            final Context context = this;
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom);
            dialog.setTitle(" CONTACT US");
            TextView text = (TextView) dialog.findViewById(R.id.text);
            text.setText("\n For more information you may contact us at:-\n" +
                    " \n" +
                    " Address: A-4,Paschim Vihar, New Delhi 110063,\n" +
                    "\n" +
                    " Contact No.: 011-25278444/43-225(ext)\n" +
                    "\n"+
                    " Email-Id: bvcoe.nss@gmail.com"+
                    ".");
            dialog.show();
        }else if (id == R.id.nav_feedback) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.container, new Suggestion(), "Suggestions");
            transaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
