package com.education.capstone_stage2.utils;

import android.app.Activity;
import android.content.Intent;

import com.education.capstone_stage2.view.activity.HomeActivity;
import com.education.capstone_stage2.view.activity.SettingsActivity;

/**
 * Created by Sara on 9/15/2017.
 */

public class NavigationManager {

    public static void navigateToHome(Activity activity) {
        Intent intent = new Intent(activity, HomeActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    public static void navigateToSetting(Activity activity) {
        Intent intent = new Intent(activity, SettingsActivity.class);
        activity.startActivity(intent);
    }
}
