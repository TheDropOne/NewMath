package by.thedrop.newmath.Activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.RecyclerViewAdapters.MainActivityAdapter;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.MainActivityTemplate;
import by.thedrop.newmath.Templates.SublistTemplate;

public class MainActivity extends AppCompatActivity {

    public static BasicChapter template;

    private List<MainActivityTemplate> chapters;
    public static List<SublistTemplate> underChapters = new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.chapters = Constants.chapters;
        recyclerView = (RecyclerView) findViewById(R.id.main_recyclerView);

        //DO WITH ASYNC TASK
        (new InitializeConstants()).execute();
        (new LoadMainRecyclerView()).execute();

    }

    class InitializeConstants extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            Constants.initializeChapters();
            Constants.initializeSubChapters();
            return null;
        }
    }

    class LoadMainRecyclerView extends AsyncTask<Void, Void, Void> {
        MainActivityAdapter adapter;
        LinearLayoutManager layoutManager;

        @Override
        protected Void doInBackground(Void... voids) {
            adapter = new MainActivityAdapter(chapters);
            layoutManager = new LinearLayoutManager(MainActivity.this);
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            try {
                assert recyclerView != null;
                recyclerView.setAdapter(adapter);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
            } catch (Exception ex) {
                ex.printStackTrace();
                Toast.makeText(MainActivity.this, R.string.error_message, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
