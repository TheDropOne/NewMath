package by.thedrop.newmath.Activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import by.thedrop.newmath.Chapters.HelpAuthor;
import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.Fragments.MainRecyclerViewFragment;
import by.thedrop.newmath.Fragments.PreferencesFragment;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;

public class MainActivity extends AppCompatActivity {

    public static String package_name;

    public static BasicChapter template;

    public static FragmentManager mFragmentManager;
    private static Fragment recyclerViewFragment;
    private static Fragment preferencesFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelpAuthor.shareText = getString(R.string.share_text);
        package_name = getPackageName();
        template = new BasicChapter();


        mFragmentManager = getSupportFragmentManager();
        recyclerViewFragment = mFragmentManager.findFragmentById(R.id.main_activity_fragment_container);
        (new InitializePreferences()).execute();
        (new InitializeFragments()).execute();
        (new InitializeConstants()).execute();
    }

    public static void updatePreferences() {
        mFragmentManager.beginTransaction().replace(R.id.main_activity_preferences_container, new PreferencesFragment()).commit();
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
