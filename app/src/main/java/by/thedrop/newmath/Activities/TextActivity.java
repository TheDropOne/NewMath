package by.thedrop.newmath.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import by.thedrop.newmath.R;

public class TextActivity extends AppCompatActivity {

    public static int textResource;
    private TextView mTextView;
    private FloatingActionButton mShareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        mTextView = (TextView) findViewById(R.id.text_activity_text);
        mTextView.setText(textResource);

        mShareButton = (FloatingActionButton) findViewById(R.id.text_activity_fab_share);

        mShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");

                shareIntent.putExtra(Intent.EXTRA_TEXT, view.getContext().getString(textResource) + "\n"+ view.getContext().getString(R.string.share_text));
                startActivity(Intent.createChooser(shareIntent, view.getContext().getString(R.string.share_using)));
            }
        });
    }
}
