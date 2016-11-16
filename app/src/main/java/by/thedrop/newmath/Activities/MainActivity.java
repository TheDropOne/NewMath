package by.thedrop.newmath.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.RecyclerViewAdapters.MainActivityAdapter;
import by.thedrop.newmath.Templates.MainActivityTemplate;
import by.thedrop.newmath.R;

public class MainActivity extends AppCompatActivity {

    public static MainActivityTemplate template;

    private List<MainActivityTemplate> chapters;
    //public static List<FormulaTemplate> underChapters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.chapters = Constants.chapters;

        //DO WITH ASYNC TASK

        Constants.initializeChapters();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.main_recyclerView);
        MainActivityAdapter adapter = new MainActivityAdapter(chapters);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        try{
            assert recyclerView != null;
            recyclerView.setAdapter(adapter);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(layoutManager);
        }catch (Exception ex){
            ex.printStackTrace();
            Toast.makeText(this,R.string.error_message,Toast.LENGTH_SHORT).show();
        }
    }
}
