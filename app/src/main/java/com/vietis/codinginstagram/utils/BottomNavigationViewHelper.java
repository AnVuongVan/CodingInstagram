package com.vietis.codinginstagram.utils;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.vietis.codinginstagram.home.HomeActivity;
import com.vietis.codinginstagram.likes.LikesActivity;
import com.vietis.codinginstagram.profile.ProfileActivity;
import com.vietis.codinginstagram.R;
import com.vietis.codinginstagram.search.SearchActivity;
import com.vietis.codinginstagram.share.ShareActivity;

public class BottomNavigationViewHelper {

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx) {
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = null;
                switch (item.getItemId()) {
                    case R.id.ic_house:
                        intent = new Intent(context, HomeActivity.class);
                        context.startActivity(intent);
                        break;
                    case R.id.ic_search:
                        intent = new Intent(context, SearchActivity.class);
                        context.startActivity(intent);
                        break;
                    case R.id.ic_circle:
                        intent = new Intent(context, ShareActivity.class);
                        context.startActivity(intent);
                        break;
                    case R.id.ic_alert:
                        intent = new Intent(context, LikesActivity.class);
                        context.startActivity(intent);
                        break;
                    case R.id.ic_android:
                        intent = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent);
                        break;
                }
                return false;
            }
        });
    }

}
