package by.thedrop.newmath.AdsAnalytics;

import android.app.Activity;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Semen on 06-Dec-16.
 */

public class Ads {

    public static void showBanner(final Activity activity, int bannerLocation, final int layout) {
        final AdView banner = (AdView) activity.findViewById(bannerLocation);
        AdRequest adRequest = new AdRequest.Builder().build();
        banner.loadAd(adRequest);

        banner.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                setupContentViewPadding(activity, banner.getHeight(), layout);
            }
        });
    }

    public static void setupContentViewPadding(Activity activity, int padding, int layout) {
        View view = activity.findViewById(layout);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), padding);
    }

}
