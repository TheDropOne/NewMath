package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class TypicalProblems extends BasicChapter {
    public TypicalProblems() {
        this.mElements = Constants.mTypicalProblems;
        paragrahpIntent.append(R.string.typicalProblems_planimetry, new CustomIntention(2,R.string.chapter10));
        paragrahpIntent.append(R.string.typicalProblems_stereometry, new CustomIntention(2,R.string.chapter11));
        paragrahpIntent.append(R.string.typicalProblems_trig_equations, new CustomIntention(1,R.drawable.chapter8));
        paragrahpIntent.append(R.string.typicalProblems_equations_in_problems, new CustomIntention(1,R.drawable.chapter12));
        paragrahpIntent.append(R.string.typicalProblems_answers, new CustomIntention(1,R.drawable.answersskanavi));
    }

    //"Помочь автору","Планиметрия", "Стереометрия", "Тригонометрические уравнения", "Уравнения в решении задач", "Ответы и решения");

    class TypicalTasksSolutions{

    }
}
