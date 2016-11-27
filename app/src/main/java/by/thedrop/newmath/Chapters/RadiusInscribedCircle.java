package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class RadiusInscribedCircle extends BasicChapter {
    public RadiusInscribedCircle() {
        this.mElements = Constants.mRadiusInscribedCircle;
        paragrahpIntent.append(R.string.radiusInscribedCircle_equilateral_triangle, new CustomIntention(1, R.drawable.p5ravnostortriangle));
        paragrahpIntent.append(R.string.radiusInscribedCircle_hexagon, new CustomIntention(1, R.drawable.p5shestiugolnik));
        paragrahpIntent.append(R.string.radiusInscribedCircle_isosceles_triangle, new CustomIntention(1, R.drawable.p5ravnobedrtriangle));
        paragrahpIntent.append(R.string.radiusInscribedCircle_regular_polygon, new CustomIntention(1, R.drawable.p5pravmnogougolnik));
        paragrahpIntent.append(R.string.radiusInscribedCircle_rhombus, new CustomIntention(1, R.drawable.p5romb));
        paragrahpIntent.append(R.string.radiusInscribedCircle_right_triangle, new CustomIntention(1, R.drawable.p5pryamtriangle));
        paragrahpIntent.append(R.string.radiusInscribedCircle_square, new CustomIntention(1, R.drawable.p5kvadrat));
        paragrahpIntent.append(R.string.radiusInscribedCircle_trapeze, new CustomIntention(1, R.drawable.p5trapecia));
        paragrahpIntent.append(R.string.radiusInscribedCircle_triangle, new CustomIntention(1, R.drawable.p5triangle));

    }

    //"Треугольник", "Прямоугольный треугольник", "Равносторонний треугольник", "Равнобедренный треугольник", "Квадрат", "Правильный многоугольник", "Ромб", "Трапеция", "Шестиугольник");

}
