package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class RadiusCircumscribedCircle extends BasicChapter {
    public RadiusCircumscribedCircle() {
        this.mElements = Constants.mRadiusCircumscribedCircle;
        paragrahpIntent.append(R.string.radiusCircumscribedCircle_isosceles_trapeze, new CustomIntention(1, R.drawable.p6ravnobedrtrapecia));
        paragrahpIntent.append(R.string.radiusCircumscribedCircle_equilateral_triangle, new CustomIntention(1, R.drawable.p6ravnostortriangle));
        paragrahpIntent.append(R.string.radiusCircumscribedCircle_isosceles_triangle, new CustomIntention(1, R.drawable.p6ravnobedrtriangle));
        paragrahpIntent.append(R.string.radiusCircumscribedCircle_rectangle, new CustomIntention(1, R.drawable.p6pryamougolnik));
        paragrahpIntent.append(R.string.radiusCircumscribedCircle_regular_hexagon, new CustomIntention(1, R.drawable.p6pravshestiugolnik));
        paragrahpIntent.append(R.string.radiusCircumscribedCircle_regular_polygon, new CustomIntention(1, R.drawable.p6pravmnogougolnik));
        paragrahpIntent.append(R.string.radiusCircumscribedCircle_right_triangle, new CustomIntention(1, R.drawable.p6pryamtringle));
        paragrahpIntent.append(R.string.radiusCircumscribedCircle_square, new CustomIntention(1, R.drawable.p6kvadrat));
        paragrahpIntent.append(R.string.radiusCircumscribedCircle_triangle, new CustomIntention(1, R.drawable.p6triangle));
    }

    //"Треугольник", "Прямоугольный треугольник", "Равносторонний треугольник", "Равнобедренный треугольник", "Квадрат", "Правильный шестиугольник", "Правильный многоугольник", "Прямоугольник", "Равнобедренная трапеция");

}
