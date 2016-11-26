package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Trigonometry extends BasicChapter {
    public Trigonometry() {
        this.mElements = Constants.mTrigonometry;
        paragrahpIntent.append(R.string.trigonometry_cubed_function, new CustomIntention(1, R.drawable.p8funkciavkube));
        paragrahpIntent.append(R.string.trigonometry_difference_trigonom_functions, new CustomIntention(1, R.drawable.p8raznosttrigonomfunkcii));
        paragrahpIntent.append(R.string.trigonometry_formulas_diff_angles, new CustomIntention(1, R.drawable.p8formraznostiuglov));
        paragrahpIntent.append(R.string.trigonometry_formulas_half_angle, new CustomIntention(1, R.drawable.p8formpolovinugla));
        paragrahpIntent.append(R.string.trigonometry_formulas_summ_angles, new CustomIntention(1, R.drawable.p8formsummiuglov));
        paragrahpIntent.append(R.string.trigonometry_formulas_triple_angle, new CustomIntention(1, R.drawable.p8formtroinogougla));
        paragrahpIntent.append(R.string.trigonometry_multiplication_trigonom_functions, new CustomIntention(1, R.drawable.p8proizvtrigonomfunkcii));
        paragrahpIntent.append(R.string.trigonometry_reduction_formulas, new CustomIntention(1, R.drawable.p8formuliprivedenia));
        paragrahpIntent.append(R.string.trigonometry_squared_function, new CustomIntention(1, R.drawable.p8funcvkvadrate));
        paragrahpIntent.append(R.string.trigonometry_summ_trigonom_functions, new CustomIntention(1, R.drawable.p8summtrigfun));
        paragrahpIntent.append(R.string.trigonometry_values_common_angles, new CustomIntention(1, R.drawable.p8znachpopuglov));
    }

    //"Значения популярных углов", "Сумма тригонометрических функций", "Разность тригонометрических функций", "Произведение тригонометрических функций", "Формулы суммы углов", "Формулы разности углов", "Формулы половинного угла", "Формулы тройного угла", "Формулы приведения", "Функция в квадрате", "Функция в кубе");

}
