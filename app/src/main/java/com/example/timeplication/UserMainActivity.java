package com.example.timeplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class UserMainActivity extends AppCompatActivity {
    private AppBarConfiguration mAppBarConfiguration;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity_main);
        DrawerLayout drawer = findViewById(R.id.user_drawer_layout);
        NavigationView navigationView = findViewById(R.id.user_nav_view);
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.user_nav_view, R.id.nav_history)
                .setDrawerLayout(drawer).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_user_fragment);
        NavigationUI.setupWithNavController(navigationView, navController);
    }
}
