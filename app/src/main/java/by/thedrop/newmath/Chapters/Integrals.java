package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Integrals extends BasicChapter {
    public Integrals() {
        this.mElements = Constants.mIntegrals;
        paragrahpIntent.append(R.string.integrals_derivative, new CustomIntention(1, R.drawable.p11proizvodnzya));
        paragrahpIntent.append(R.string.integrals_equivalence, new CustomIntention(1, R.drawable.p11equals));
        paragrahpIntent.append(R.string.integrals_indefinite_integral, new CustomIntention(1, R.drawable.p11undefinedintegralsolution));
        paragrahpIntent.append(R.string.integrals_integrals, new CustomIntention(1, R.drawable.p11integrali));
        paragrahpIntent.append(R.string.integrals_primitive, new CustomIntention(1, R.drawable.p11pervoobraznaya));
    }

    //"Производная", "Первообразная", "Интегралы", "Эквивалентности", "Неопределенный Интеграл");

}
