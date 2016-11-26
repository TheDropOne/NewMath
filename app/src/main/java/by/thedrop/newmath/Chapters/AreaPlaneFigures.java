package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class AreaPlaneFigures extends BasicChapter {
    public AreaPlaneFigures() {
        this.mElements = Constants.mAreaPlaneFigures;
        paragrahpIntent.append(R.string.areaPlaneFigures_circle, new CustomIntention(1, R.drawable.p2krug));
        paragrahpIntent.append(R.string.areaPlaneFigures_circle_sector, new CustomIntention(1, R.drawable.p2sectorkruga));
        paragrahpIntent.append(R.string.areaPlaneFigures_ellipce, new CustomIntention(1, R.drawable.p2ellipce));
        paragrahpIntent.append(R.string.areaPlaneFigures_equilateral_triangle, new CustomIntention(1, R.drawable.p2ravnostortriangle));
        paragrahpIntent.append(R.string.areaPlaneFigures_geron_formula, new CustomIntention(1, R.drawable.p2trianglegeron));
        paragrahpIntent.append(R.string.areaPlaneFigures_isosceles_triangle, new CustomIntention(1, R.drawable.p2ravnobedrtriangle));
        paragrahpIntent.append(R.string.areaPlaneFigures_parallelogram, new CustomIntention(1, R.drawable.p2parallelogam));
        paragrahpIntent.append(R.string.areaPlaneFigures_rectangle, new CustomIntention(1, R.drawable.p2pravmnogougolnik));
        paragrahpIntent.append(R.string.areaPlaneFigures_regular_polygon, new CustomIntention(1, R.drawable.p2pravmnogougolnik));
        paragrahpIntent.append(R.string.areaPlaneFigures_rhombus, new CustomIntention(1, R.drawable.p2romb));
        paragrahpIntent.append(R.string.areaPlaneFigures_right_triangle, new CustomIntention(1, R.drawable.p2pryamtriangle));
        paragrahpIntent.append(R.string.areaPlaneFigures_ring, new CustomIntention(1, R.drawable.p2kolco));
        paragrahpIntent.append(R.string.areaPlaneFigures_ring_sector, new CustomIntention(1, R.drawable.p2sectorkolca));
        paragrahpIntent.append(R.string.areaPlaneFigures_square, new CustomIntention(1, R.drawable.p2kvadrat));
        paragrahpIntent.append(R.string.areaPlaneFigures_trapeze, new CustomIntention(1, R.drawable.p2trapecia));
        paragrahpIntent.append(R.string.areaPlaneFigures_triangle, new CustomIntention(1, R.drawable.p2triangle));
        paragrahpIntent.append(R.string.areaPlaneFigures_triangle_2sides_angle, new CustomIntention(1, R.drawable.p2triangle2storiugol));
        paragrahpIntent.append(R.string.areaPlaneFigures_triangle_side_2angle, new CustomIntention(1, R.drawable.p2trianglestoronai2ugla));

    }

    //"Квадрат", "Круг", "Прямоугольник", "Прямоугольный треугольник", "Равноберенный треугольник", "Равносторонний треугольник", "Треугольник", "Треугольник(2 стороны и угол)", "Треугольник(сторона и 2 угла)", "Треугольник(Формула Герона)", "Ромб", "Параллелограмм", "Трапеция", "Правильный многоугольник", "Кольцо", "Эллипс", "Сектор кольца", "Сектор круга");

}
