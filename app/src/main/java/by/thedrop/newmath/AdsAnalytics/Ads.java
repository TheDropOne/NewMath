package by.thedrop.newmath.AdsAnalytics;

import android.app.Activity;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import by.thedrop.newmath.R;

/**
 * Created by Semen on 06-Dec-16.
 */

public class Ads {

    public static void showBanner(final Activity activity){
        final AdView banner = (AdView) activity.findViewById(R.id.image_activity_adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        banner.loadAd(adRequest);

        banner.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                setupContentViewPadding(activity,banner.getHeight());
            }
        });
    }

    public static void setupContentViewPadding(Activity activity, int padding){
        View view = activity.findViewById(R.id.activity_image_coordinator_layout);
        view.setPadding(view.getPaddingLeft(),view.getPaddingTop(),view.getPaddingRight(),padding);
    }

}
