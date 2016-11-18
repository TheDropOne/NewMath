package by.thedrop.newmath.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.SublistTemplate;

public class SublistActivity extends AppCompatActivity {

    public static Fragment actualFragment;
    private ArrayList<? extends SublistTemplate> formulas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sublist);

        this.formulas = getIntent().getParcelableArrayListExtra("CHAPTER");



    }
}
