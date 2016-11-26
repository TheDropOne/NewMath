package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class AreaOfSurface extends BasicChapter {
    public AreaOfSurface() {
        this.mElements = Constants.mAreaOfSurface;
        paragrahpIntent.append(R.string.areaOfSurface_cone, new CustomIntention(1, R.drawable.p3konus));
        paragrahpIntent.append(R.string.areaOfSurface_conoid, new CustomIntention(1, R.drawable.p3usechkonus));
        paragrahpIntent.append(R.string.areaOfSurface_cube, new CustomIntention(1, R.drawable.p3kub));
        paragrahpIntent.append(R.string.areaOfSurface_cuboid, new CustomIntention(1, R.drawable.p3pryamparallelepiped));
        paragrahpIntent.append(R.string.areaOfSurface_cylinder, new CustomIntention(1, R.drawable.p3cilindr));
        paragrahpIntent.append(R.string.areaOfSurface_frustum, new CustomIntention(1, R.drawable.p3pravusechpiramida));
        paragrahpIntent.append(R.string.areaOfSurface_regular_pyramid, new CustomIntention(1, R.drawable.p3pravpiramida));
        paragrahpIntent.append(R.string.areaOfSurface_sphere, new CustomIntention(1, R.drawable.p3sfera));
        paragrahpIntent.append(R.string.areaOfSurface_sphere_layer, new CustomIntention(1, R.drawable.p3sharovoisloi));
        paragrahpIntent.append(R.string.areaOfSurface_sphere_sector, new CustomIntention(1, R.drawable.p3sharovoisektor));
        paragrahpIntent.append(R.string.areaOfSurface_sphere_segment, new CustomIntention(1, R.drawable.p3shrovoisegment));

    }

    //"Куб", "Цилиндр", "Сфера", "Прямоугольный параллелепипед", "Правильная пирамида", "Правильная усеченная пирамида", "Конус", "Усеченный конус", "Шаровой сегмент", "Шаровой сектор", "Шаровой слой");

}
