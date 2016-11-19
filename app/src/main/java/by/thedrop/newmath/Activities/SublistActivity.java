package by.thedrop.newmath.Activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import by.thedrop.newmath.R;
import by.thedrop.newmath.RecyclerViewAdapters.SublistActivityAdapter;
import by.thedrop.newmath.Templates.SublistTemplate;

public class SublistActivity extends AppCompatActivity {

    private List<SublistTemplate> formulas;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sublist);

        this.formulas = MainActivity.underChapters;
        recyclerView = (RecyclerView) findViewById(R.id.sublist_recyclerView);

        (new LoadSublistRecyclerView()).execute();
    }

    class LoadSublistRecyclerView extends AsyncTask<Void, Void, Void> {
        SublistActivityAdapter adapter;
        LinearLayoutManager layoutManager;

        @Override
        protected Void doInBackground(Void... voids) {
            adapter = new SublistActivityAdapter(formulas);
            layoutManager = new LinearLayoutManager(SublistActivity.this);
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
                Toast.makeText(SublistActivity.this, R.string.error_message, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
