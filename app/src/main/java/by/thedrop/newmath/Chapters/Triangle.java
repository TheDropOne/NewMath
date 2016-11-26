package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Triangle extends BasicChapter {
    public Triangle() {
        this.mElements = Constants.mTriangle;
        paragrahpIntent.append(R.string.triangle_all_equals_equilateral_triangle, new CustomIntention(1, R.drawable.p12medianastoronabissravnostor));
        paragrahpIntent.append(R.string.triangle_bissectriss_right_triangle, new CustomIntention(1, R.drawable.p12biispryam));
        paragrahpIntent.append(R.string.triangle_bissectriss_triangle, new CustomIntention(1, R.drawable.p12bissproizvol));
        paragrahpIntent.append(R.string.triangle_height, new CustomIntention(1, R.drawable.p12visotaproizvol));
        paragrahpIntent.append(R.string.triangle_height_median_biss_isosceles_triangle, new CustomIntention(1, R.drawable.p12visotabissmedravnobedr));
        paragrahpIntent.append(R.string.triangle_median_right_triangle, new CustomIntention(1, R.drawable.p12medianapryam));
        paragrahpIntent.append(R.string.triangle_median_triangle, new CustomIntention(1, R.drawable.p12mediana));
        paragrahpIntent.append(R.string.triangle_right_triangle, new CustomIntention(1, R.drawable.p12pryamougolnii));
        paragrahpIntent.append(R.string.triangle_side_isosceles_triangle, new CustomIntention(1, R.drawable.p12storonaravnobedr));
        paragrahpIntent.append(R.string.triangle_side_triangle, new CustomIntention(1, R.drawable.p12storonaproizvol));
    }

    //"Сторона произвольного треугольника", "Стороны равнобедренного треугольника", "Стороны прямоугольного треугольника", "Высота произвольного треугольника", "Высота прямоугольного треугольника", "Высота, медиана, биссектриса равнобедренного треугольника", "Высота=медиана=биссектриса равностороннего треугольника", "Биссектриса произвольного треугольника", "Биссектриса прямоугольного треугольника", "Медиана произвольного треугольника", "Медиана прямоугольного треугольника");

}
