package by.thedrop.newmath.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.RecyclerViewAdapters.MainActivityAdapter;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.MainActivityTemplate;

public class MainActivity extends AppCompatActivity {

    public static String package_name;

    public static BasicChapter template;

    private List<MainActivityTemplate> chapters;
    RecyclerView recyclerView;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        package_name = getPackageName();
        template = new BasicChapter();

        this.chapters = Constants.chapters;
        recyclerView = (RecyclerView) findViewById(R.id.main_recyclerView);
        fab = (FloatingActionButton) findViewById(R.id.fab_group);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri groupInVk = Uri.parse("http://vk.com/club114807844");
                Intent goToGroup = new Intent(Intent.ACTION_VIEW, groupInVk);
                try {
                    startActivity(goToGroup);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    Toast.makeText(view.getContext(), R.string.error_message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //DO WITH ASYNC TASK --- Done
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
