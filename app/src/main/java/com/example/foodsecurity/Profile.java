package com.example.foodsecurity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.nav_person);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_history:
                        startActivity(new Intent(getApplicationContext(), History.class));

                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_person:

                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));

                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });
    }


}
