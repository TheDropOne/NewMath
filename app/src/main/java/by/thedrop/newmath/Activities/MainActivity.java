package by.thedrop.newmath.Activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import by.thedrop.newmath.Chapters.HelpAuthor;
import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.Fragments.MainRecyclerViewFragment;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;

public class MainActivity extends AppCompatActivity {

    public static String package_name;

    public static BasicChapter template;

    FragmentManager mFragmentManager;
    Fragment recyclerViewFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelpAuthor.shareText = getString(R.string.share_text);
        package_name = getPackageName();
        template = new BasicChapter();


        mFragmentManager = getSupportFragmentManager();
        recyclerViewFragment = mFragmentManager.findFragmentById(R.id.main_activity_fragment_container);
        (new InitializeFragments()).execute();
        (new InitializeConstants()).execute();
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
