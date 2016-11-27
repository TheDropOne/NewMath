package by.thedrop.newmath.Chapters;

import android.content.Intent;

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
        Intent planimetry = null, stereometry = null, trigEquations = null, equationsInProblems = null, answers = null;
        paragrahpIntent.append(R.string.typicalProblems_planimetry, new CustomIntention(planimetry));
        paragrahpIntent.append(R.string.typicalProblems_stereometry, new CustomIntention(stereometry));
        paragrahpIntent.append(R.string.typicalProblems_trig_equations, new CustomIntention(trigEquations));
        paragrahpIntent.append(R.string.typicalProblems_equations_in_problems, new CustomIntention(equationsInProblems));
        paragrahpIntent.append(R.string.typicalProblems_answers, new CustomIntention(answers));
    }

    //"Помочь автору","Планиметрия", "Стереометрия", "Тригонометрические уравнения", "Уравнения в решении задач", "Ответы и решения");

    class TypicalTasksSolutions{

    }
}
