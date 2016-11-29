package by.thedrop.newmath.Chapters;

import android.content.Intent;
import android.net.Uri;

import by.thedrop.newmath.Activities.MainActivity;
import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.CustomIntention;

/**
 * Created by Semen on 16-Nov-16.
 */

public class HelpAuthor extends BasicChapter {
    public static String shareText;
    public HelpAuthor() {
        this.mElements = Constants.mHelpAuthor;
        Intent watchAd;
        Intent joinGroup;
        Intent leftFeedback;
        Intent tellFriend;

        Uri appInMarket = Uri.parse("market://details?id=" + MainActivity.package_name);
        leftFeedback = new Intent(Intent.ACTION_VIEW, appInMarket);

        Uri groupInVk = Uri.parse("http://vk.com/club114807844");
        joinGroup = new Intent(Intent.ACTION_VIEW, groupInVk);

        tellFriend = new Intent(Intent.ACTION_SEND);
        tellFriend.setType("text/plain");
        tellFriend.putExtra(Intent.EXTRA_TEXT, shareText);

        paragrahpIntent.append(R.string.help_author_watch_ad, new CustomIntention());
        paragrahpIntent.append(R.string.help_author_join_group, new CustomIntention(joinGroup));
        paragrahpIntent.append(R.string.help_author_left_feedback, new CustomIntention(leftFeedback));
        paragrahpIntent.append(R.string.help_author_tell_friends, new CustomIntention(tellFriend));

    }

    //"Посмотреть рекламу", "Написать хороший отзыв:)","Вступить в нашу группу вк","Рассказать друзьям!");

}
