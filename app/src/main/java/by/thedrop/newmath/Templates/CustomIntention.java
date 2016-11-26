package by.thedrop.newmath.Templates;

import android.content.Context;
import android.content.Intent;

import by.thedrop.newmath.Activities.ImageActivity;
import by.thedrop.newmath.Activities.TextActivity;
import by.thedrop.newmath.R;

/**
 * Created by Semen on 26-Nov-16.
 */

public class CustomIntention {
    /*
    0 - nothing
    1 - image
    2 - text
    3 - intent
     */
    private int type;
    private int imageResource;
    private int textResource;
    private Intent mIntent;

    public CustomIntention(Intent intent) {
        this.type = 3;
        mIntent = intent;
    }

    public CustomIntention(int type, int resource) {
        this.type = type;
        switch (type) {
            case 1:
                imageResource = resource;
                break;
            case 2:
                textResource = resource;
                break;
            default:
                imageResource = R.drawable.brackets;
        }
    }
    public Intent returnIntent(Context context){
        Intent intent;
        switch (type) {
            case 1:
                intent = new Intent(context,ImageActivity.class);
                ImageActivity.imageResource = imageResource;
                break;
            case 2:
                intent = new Intent(context,TextActivity.class);
                TextActivity.textResource = textResource;
                break;
            case 3:
                intent = mIntent;
                break;
            default:
                intent = new Intent(context,ImageActivity.class);
                ImageActivity.imageResource = R.drawable.brackets;
                break;
        }
        return intent;
    }
}
