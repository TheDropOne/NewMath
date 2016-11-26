package by.thedrop.newmath.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import by.thedrop.newmath.R;
import uk.co.senab.photoview.PhotoViewAttacher;

public class ImageActivity extends AppCompatActivity {

    public static int imageResource;
    private ImageView mImageView;
    private PhotoViewAttacher mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mImageView = (ImageView) findViewById(R.id.image_activity_mainImage);

        mAttacher = new PhotoViewAttacher(mImageView);
        mAttacher.update();

        mImageView.setImageResource(imageResource);
    }
}
