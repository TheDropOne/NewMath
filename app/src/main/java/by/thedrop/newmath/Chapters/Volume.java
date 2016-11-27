package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Volume extends BasicChapter {
    public Volume() {
        this.mElements = Constants.mVolume;
        paragrahpIntent.append(R.string.volume_cone, new CustomIntention(1, R.drawable.p4konus));
        paragrahpIntent.append(R.string.volume_conoid, new CustomIntention(1, R.drawable.p4usechenniikonus));
        paragrahpIntent.append(R.string.volume_cube, new CustomIntention(1, R.drawable.p4kub));
        paragrahpIntent.append(R.string.volume_cuboid, new CustomIntention(1, R.drawable.p4parallelepiped));
        paragrahpIntent.append(R.string.volume_frustrum, new CustomIntention(1, R.drawable.p4usechennayapiramida));
        paragrahpIntent.append(R.string.volume_pyramid, new CustomIntention(1, R.drawable.p4pyramid));
        paragrahpIntent.append(R.string.volume_regular_pyramid, new CustomIntention(1, R.drawable.p4pravilnpiramida));
        paragrahpIntent.append(R.string.volume_regular_square_pyramid, new CustomIntention(1, R.drawable.p4pravilnchetpiramida));
        paragrahpIntent.append(R.string.volume_regular_triangular_pyramid, new CustomIntention(1, R.drawable.p4pravilntreugpiramyd));
        paragrahpIntent.append(R.string.volume_tetrahedron, new CustomIntention(1, R.drawable.p4tetraedr));
    }

    //

}
