package by.thedrop.newmath.Chapters;

import android.content.Intent;
import android.net.Uri;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class UsefulResources extends BasicChapter {
    public UsefulResources() {
        this.mElements = Constants.mUsefulResourcesResources;
        Intent intentAnswersEge = new Intent(Intent.ACTION_VIEW);
        Intent intentInformationBelarusianUniversities = new Intent(Intent.ACTION_VIEW);
        Intent intentSkanaviBook = new Intent(Intent.ACTION_VIEW);
        Intent intentVeremenukBook = new Intent(Intent.ACTION_VIEW);
        Intent intentRtSolutions = new Intent(Intent.ACTION_VIEW);
        intentAnswersEge.setData(Uri.parse("http://answer-ege.com"));
        intentInformationBelarusianUniversities.setData(Uri.parse("http://kudapostupat.by"));
        intentSkanaviBook.setData(Uri.parse("http://educon.by/files/math/Zadacznik4.pdf"));
        intentVeremenukBook.setData(Uri.parse("http://fileskachat.com/getfile/24967_4708fe631c4ee7459b8438d25167ad78"));
        intentRtSolutions.setData(Uri.parse("http://repet.by"));


        paragrahpIntent.append(R.string.usefulResources_answers_ege, new CustomIntention(intentAnswersEge));
        paragrahpIntent.append(R.string.usefulResources_information_belarusian_universities, new CustomIntention(intentInformationBelarusianUniversities));
        paragrahpIntent.append(R.string.usefulResources_skanavi_book, new CustomIntention(intentSkanaviBook));
        paragrahpIntent.append(R.string.usefulResources_veremenuk_book, new CustomIntention(intentVeremenukBook));
        paragrahpIntent.append(R.string.usefulResources_rt_solutions, new CustomIntention(intentRtSolutions));
    }

    //

}
