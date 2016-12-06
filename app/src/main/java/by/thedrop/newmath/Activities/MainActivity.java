package by.thedrop.newmath.Activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;

import by.thedrop.newmath.Chapters.HelpAuthor;
import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.Fragments.MainRecyclerViewFragment;
import by.thedrop.newmath.Fragments.PreferencesFragment;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.MainActivityTemplate;

public class MainActivity extends AppCompatActivity {

    public static String package_name;
    public static boolean pendingIntroAnimation;
    private static final String RECYCLER_VIEW_FRAGMENT = "RECYCLER_VIEW_FRAGMENT";
    private static final String PREFERENCES_FRAGMENT = "PREFERENCES_FRAGMENT";
    public static final String APP_PREFERENCES = "MY_SETTINGS";
    private static final String PREFERENCES_COUNT = "PREFERENCES_COUNT";
    private static final String PREFERENCES_OBJECT = "PREFERENCES_OBJECT";

    public static BasicChapter template;
    public static FragmentManager mFragmentManager;
    private static Fragment recyclerViewFragment;
    private static Fragment preferencesFragment;
    public static Animation disappearAnimation;

    private SharedPreferences mSharedPreferences;
    private int countSerializedObjects;
    public static FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        MobileAds.initialize(getApplicationContext(), " ca-app-pub-8634096223053663/2286760030");

        disappearAnimation = AnimationUtils.loadAnimation(this, R.anim.image_disappearing);

        HelpAuthor.shareText = getString(R.string.share_text);

        mSharedPreferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        countSerializedObjects = mSharedPreferences.getInt(PREFERENCES_COUNT, 0);

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

        (new InitializeConstants()).execute();
        (new InitializePreferences()).execute();
        (new InitializeFragments()).execute();

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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_clear_preferences:
                mSharedPreferences.edit().clear().apply();
                getSupportFragmentManager().beginTransaction()
                        .detach(preferencesFragment)
                        .detach(recyclerViewFragment)
                        .commit();
                Constants.preferences.clear();
                for (int i = 0; i < Constants.chapters.size(); i++) {
                    Constants.chapters.get(i).setSelected(false);
                }

                recyclerViewFragment = new MainRecyclerViewFragment();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.main_activity_fragment_container, recyclerViewFragment)
                        .commit();
                preferencesFragment = new PreferencesFragment();
                updatePreferences();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        countSerializedObjects = Constants.preferences.size();
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putInt(PREFERENCES_COUNT, countSerializedObjects);
        for (int i = 0; i < countSerializedObjects; i++) {
            editor.putInt(PREFERENCES_OBJECT + String.valueOf(i), Constants.preferences.get(i).getName());
        }
        editor.apply();
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
            for (int i = 0; i < countSerializedObjects; i++) {
                Integer address = mSharedPreferences.getInt(PREFERENCES_OBJECT + String.valueOf(i), 0);
                for (MainActivityTemplate t : Constants.chapters) {
                    if (t.getName() == address) {
                        Constants.preferences.add(t);
                    }
                }
            }
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
