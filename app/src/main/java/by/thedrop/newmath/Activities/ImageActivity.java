package by.thedrop.newmath.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import by.thedrop.newmath.R;

public class ImageActivity extends AppCompatActivity {

    public static int imageResource;
    private ImageView mImageView;
    private FloatingActionButton mShareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mImageView = (ImageView) findViewById(R.id.image_activity_mainImage);
        mShareButton = (FloatingActionButton) findViewById(R.id.fab_share);
        final Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), imageResource);

        mImageView.setImageResource(imageResource);
        mShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);

                shareIntent.putExtra(Intent.EXTRA_TEXT, view.getContext().getString(R.string.share_text));
                String url = MediaStore.Images.Media.insertImage(ImageActivity.this.getContentResolver(), bitmap, "title", "description");
                shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse(url));
                shareIntent.setType("image/text");
                startActivity(Intent.createChooser(shareIntent,view.getContext().getString(R.string.share_using)));
            }
        });
    }
}
