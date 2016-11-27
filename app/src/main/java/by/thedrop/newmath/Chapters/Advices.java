package by.thedrop.newmath.Chapters;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Advices extends BasicChapter {

    public Advices() {
        this.mElements = Constants.mAdvices;
        paragrahpIntent.append(R.string.advices_guess_answer, new CustomIntention(2, R.string.advices_guess_answer_text));
        paragrahpIntent.append(R.string.advices_answers_from_teacher, new CustomIntention(2, R.string.advices_answers_from_teacher_text));
        paragrahpIntent.append(R.string.advices_better_way_to_prepare, new CustomIntention(2, R.string.advices_better_way_to_prepare_text));
        paragrahpIntent.append(R.string.advices_day_before, new CustomIntention(2, R.string.advices_day_before_text));
        paragrahpIntent.append(R.string.advices_how_to_learn_trigonometry, new CustomIntention(2, R.string.advices_how_to_learn_trigonometry_text));
        paragrahpIntent.append(R.string.advices_in_test, new CustomIntention(2, R.string.advices_in_test_text));
        paragrahpIntent.append(R.string.advices_not_miss_the_answer, new CustomIntention(2, R.string.advices_not_miss_the_answer_text));
        paragrahpIntent.append(R.string.advices_prepare_on_100, new CustomIntention(2, R.string.advices_prepare_on_100_text));
        paragrahpIntent.append(R.string.advices_the_best_way_to_prerare, new CustomIntention(2, R.string.advices_the_best_way_to_prerare_text));
        paragrahpIntent.append(R.string.advices_time_using, new CustomIntention(2, R.string.advices_time_using_text));
        paragrahpIntent.append(R.string.advices_week_until_exam, new CustomIntention(2, R.string.advices_week_until_exam_text));
        paragrahpIntent.append(R.string.advices_you_will_pass, new CustomIntention(4, R.string.advices_you_will_pass_text));
    }

    //"Посмотреть рекламу", "Написать хороший отзыв:)","Вступить в нашу группу вк","Рассказать друзьям!"

}
