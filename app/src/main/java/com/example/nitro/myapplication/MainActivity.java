package com.example.nitro.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.container, new HomeFragment());
                    transaction.commit();
                    return true;
                case R.id.navigation_news:
                    transaction.replace(R.id.container, new NewsFragment());
                    transaction.commit();
                    return true;
                case R.id.navigation_profile:
                    transaction.replace(R.id.container, new ProfileFragment());
                    transaction.commit();
                    return true;
                case R.id.navigation_notifications:
                    transaction.replace(R.id.container, new NotificationFragment());
                    transaction.commit();
                    return true;
                case R.id.navigation_settings:
                    transaction.replace(R.id.container, new SettingsFragment());
                    transaction.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void image_1_click(View view) {
        Intent intent = new Intent(this, Image1Screen.class);
        startActivity(intent);
    }

    public void toPaper(View view) {
        Intent intent = new Intent(this, ScreenPaper.class);
        startActivity(intent);
    }

    public void toWrite(View view) {
        Intent intent = new Intent(this, Write.class);
        startActivity(intent);
    }
}
