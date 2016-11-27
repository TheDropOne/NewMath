package by.thedrop.newmath.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import by.thedrop.newmath.R;

public class ImageActivity extends AppCompatActivity {

    public static int imageResource;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mImageView = (ImageView) findViewById(R.id.image_activity_mainImage);

        mImageView.setImageResource(imageResource);
    }
}
