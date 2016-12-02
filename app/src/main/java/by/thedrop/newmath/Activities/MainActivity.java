package by.thedrop.newmath.Activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import by.thedrop.newmath.Chapters.HelpAuthor;
import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.Fragments.MainRecyclerViewFragment;
import by.thedrop.newmath.Fragments.PreferencesFragment;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;

public class MainActivity extends AppCompatActivity {

    public static String package_name;
    private static final String RECYCLER_VIEW_FRAGMENT = "RECYCLER_VIEW_FRAGMENT";
    private static final String PREFERENCES_FRAGMENT = "PREFERENCES_FRAGMENT";

    public static BasicChapter template;

    public static boolean pendingIntroAnimation;

    public static FragmentManager mFragmentManager;
    private static Fragment recyclerViewFragment;
    private static Fragment preferencesFragment;
    public static Animation disappearAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        disappearAnimation = AnimationUtils.loadAnimation(this, R.anim.image_disappearing);

        disappearAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        HelpAuthor.shareText = getString(R.string.share_text);


        mFragmentManager = getSupportFragmentManager();

        if (savedInstanceState == null) {
            pendingIntroAnimation = true;
            recyclerViewFragment = mFragmentManager.findFragmentById(R.id.main_activity_fragment_container);
            preferencesFragment = mFragmentManager.findFragmentById(R.id.main_activity_preferences_container);
        } else {
            package_name = getPackageName();
            recyclerViewFragment = getSupportFragmentManager().getFragment(savedInstanceState, RECYCLER_VIEW_FRAGMENT);
            preferencesFragment = getSupportFragmentManager().getFragment(savedInstanceState, PREFERENCES_FRAGMENT);
        }
        template = new BasicChapter();


        (new InitializeFragments()).execute();
        (new InitializePreferences()).execute();
        (new InitializeConstants()).execute();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        getSupportFragmentManager().putFragment(outState, RECYCLER_VIEW_FRAGMENT, recyclerViewFragment);
        getSupportFragmentManager().putFragment(outState, PREFERENCES_FRAGMENT, preferencesFragment);
    }

    public static void updatePreferences() {
        if (Constants.preferences.size() == 0) {
            mFragmentManager.beginTransaction()
                    .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                    .hide(preferencesFragment)
                    .commit();
        } else {
            preferencesFragment = new PreferencesFragment();
            mFragmentManager.beginTransaction()
                    .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                    .replace(R.id.main_activity_preferences_container, preferencesFragment)
                    .commit();
        }

    }

    class InitializePreferences extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            if (preferencesFragment == null) {
                preferencesFragment = new PreferencesFragment();
                mFragmentManager.beginTransaction().add(R.id.main_activity_preferences_container, preferencesFragment).commit();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            updatePreferences();
        }
    }

    class InitializeConstants extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            Constants.initializeChapters();
            Constants.initializeSubChapters();
            return null;
        }
    }

    class InitializeFragments extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            if (recyclerViewFragment == null) {
                recyclerViewFragment = new MainRecyclerViewFragment();
                mFragmentManager.beginTransaction().add(R.id.main_activity_fragment_container, recyclerViewFragment).commit();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_activity_fragment_container, recyclerViewFragment).commit();
        }
    }
}
