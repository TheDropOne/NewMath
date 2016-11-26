package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Perimeter extends BasicChapter {
    public Perimeter() {
        this.mElements = Constants.mPerimeter;

        paragrahpIntent.append(R.string.perimeter_arc_length, new CustomIntention(1, R.drawable.p1dlina_dugi));
        paragrahpIntent.append(R.string.perimeter_circumference, new CustomIntention(1, R.drawable.p1dlina_okruzhnosti));
        paragrahpIntent.append(R.string.perimeter_parallelogram, new CustomIntention(1, R.drawable.p1parallelogram));
        paragrahpIntent.append(R.string.perimeter_rectangle, new CustomIntention(1, R.drawable.p1pryamougolnik));
        paragrahpIntent.append(R.string.perimeter_rhombus, new CustomIntention(1, R.drawable.p1romb));
        paragrahpIntent.append(R.string.perimeter_square, new CustomIntention(1, R.drawable.p1kvadrat));
        paragrahpIntent.append(R.string.perimeter_trapeze, new CustomIntention(1, R.drawable.p1trapecia));
        paragrahpIntent.append(R.string.perimeter_triangle, new CustomIntention(1, R.drawable.p1triangle));
    }


    //"Треугольник", "Квадрат", "Прямоугольник", "Параллелограмм", "Ромб", "Длина окружности", "Трапеция", "Длина дуги");

}
