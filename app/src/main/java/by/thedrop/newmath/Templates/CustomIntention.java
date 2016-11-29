package by.thedrop.newmath.Templates;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import by.thedrop.newmath.Activities.ChapterInDevelopmentActivity;
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
    4 - toast
     */
    private int type;
    private int imageResource;
    private int textResource;
    private int toastResource;
    private Intent mIntent;

    public CustomIntention(Intent intent) {
        this.type = 3;
        mIntent = intent;
    }
    public CustomIntention(){
        this.type = 0;
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
            case 4:
                toastResource = resource;
                break;
            default:
                imageResource = R.drawable.icon_award;
        }
    }
    public Intent returnIntent(Context context){
        Intent intent = null;
        switch (type) {
            case 0:
                intent = new Intent(context, ChapterInDevelopmentActivity.class);
                break;
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
            case 4:
                Toast.makeText(context,toastResource,Toast.LENGTH_LONG).show();
                break;
            default:
                intent = new Intent(context,ImageActivity.class);
                ImageActivity.imageResource = R.drawable.icon_award;
                break;
        }
        return intent;
    }
}
