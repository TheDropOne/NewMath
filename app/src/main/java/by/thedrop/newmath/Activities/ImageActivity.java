package by.thedrop.newmath.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import by.thedrop.newmath.AdsAnalytics.Ads;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Views.TouchImageView;

public class ImageActivity extends AppCompatActivity {

    public static int imageResource;
    private TouchImageView mImageView;
    private FloatingActionButton mShareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-8634096223053663/2286760030");
        Ads.showBanner(this, R.id.image_activity_adView, R.id.activity_image_coordinator_layout);


        mImageView = (TouchImageView) findViewById(R.id.image_activity_mainImage);
        mShareButton = (FloatingActionButton) findViewById(R.id.fab_share);
        final Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), imageResource);

        mImageView.setImageResource(imageResource);
        mShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("image/text");

                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, bytes);
                File file = new File(Environment.getExternalStorageDirectory() + File.separator + "math_temporary_file.jpg");
                try {
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bytes.toByteArray());
                    shareIntent.putExtra(Intent.EXTRA_TEXT, view.getContext().getString(R.string.share_text));
                    shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory() + File.separator + "math_temporary_file.jpg"));
                    startActivity(Intent.createChooser(shareIntent, view.getContext().getString(R.string.share_using)));
                } catch (IOException ie) {
                    ie.printStackTrace();
                    Toast.makeText(view.getContext(), R.string.error_message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        if (!MainActivity.isAdViewed && MainActivity.screensCount > 2) {
            MainActivity.mInterstitialAd.show();
            MainActivity.isAdViewed = true;
        }
    }
}
