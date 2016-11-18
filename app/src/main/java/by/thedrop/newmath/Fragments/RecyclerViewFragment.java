package by.thedrop.newmath.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import by.thedrop.newmath.Templates.SublistTemplate;

/**
 * Created by Semen on 18-Nov-16.
 */

public class RecyclerViewFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private ArrayList<SublistTemplate> mElementsList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
