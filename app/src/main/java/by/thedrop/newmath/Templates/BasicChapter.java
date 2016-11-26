package by.thedrop.newmath.Templates;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;

import java.util.List;

/**
 * Created by Semen on 19-Nov-16.
 */

public class BasicChapter {
    public List<SublistTemplate> mElements;
    protected SparseArray<CustomIntention> paragrahpIntent = new SparseArray<>();

    public Intent getBehavior(Context context, int i) {
        return paragrahpIntent.get(i).returnIntent(context);
    }
}
