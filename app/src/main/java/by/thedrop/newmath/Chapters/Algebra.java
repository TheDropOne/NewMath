package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Algebra extends BasicChapter {

    public Algebra() {
        this.mElements = Constants.mAlgebra;
        paragrahpIntent.append(R.string.algebra_viett_teorem,new CustomIntention(1,R.drawable.p10vieta));
        paragrahpIntent.append(R.string.algebra_arithmetic_progression,new CustomIntention(1,R.drawable.p10ariphmprog));
        paragrahpIntent.append(R.string.algebra_geometric_progression,new CustomIntention(1,R.drawable.p10geomprogr));
        paragrahpIntent.append(R.string.algebra_logarithm_properties,new CustomIntention(1,R.drawable.p10logarifm));
        paragrahpIntent.append(R.string.algebra_tangent_equation,new CustomIntention(1,R.drawable.p10tangental));
        paragrahpIntent.append(R.string.algebra_parabola_vertex_coordinates,new CustomIntention(1,R.drawable.p10coordinates));
    }

    //"Теорема Виета", "Арифметическая прогрессия", "Геометрическая прогрессия", "Уравнение касательной", "","","Свойства логарифма", "Координаты вершины параболы", "Показательные неравенства","Формулы сокращенного умножения");

    class AbridgedMultiplication {

    }
}
