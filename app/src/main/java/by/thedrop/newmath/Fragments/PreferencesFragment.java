package by.thedrop.newmath.Fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.RecyclerViewAdapters.PreferencesAdapter;
import by.thedrop.newmath.Templates.MainActivityTemplate;

/**
 * Created by Semen on 30-Nov-16.
 */

public class PreferencesFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private ArrayList<MainActivityTemplate> preferences;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = Constants.preferences;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_preferences, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.fragment_preferences_recycler_view);

        (new LoadPreferencesRecyclerViewFragment()).execute();
        return v;
    }

    class LoadPreferencesRecyclerViewFragment extends AsyncTask<Void, Void, Void> {

        PreferencesAdapter adapter;
        LinearLayoutManager layoutManager;

        @Override
        protected Void doInBackground(Void... voids) {
            adapter = new PreferencesAdapter(preferences);
            layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
            layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            try {
                assert mRecyclerView != null;
                mRecyclerView.setAdapter(adapter);
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(layoutManager);
            }catch (Exception ex){
                ex.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(),R.string.error_message,Toast.LENGTH_SHORT).show();
            }
        }
    }
}
