package by.thedrop.newmath.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
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
import by.thedrop.newmath.RecyclerViewAdapters.MainActivityAdapter;
import by.thedrop.newmath.Templates.MainActivityTemplate;

/**
 * Created by Semen on 18-Nov-16.
 */

public class MainRecyclerViewFragment extends Fragment {
    public RecyclerView mRecyclerView;
    private FloatingActionButton fab;
    private ArrayList<MainActivityTemplate> chapters;
    private LinearLayoutManager mLayoutManager;
    private Parcelable mListState;
    private static final String LIST_STATE_KEY = "list_state_key";
    private Bundle mBundleRecyclerViewState;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        chapters = Constants.chapters;

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler_view_main, container, false);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.fragment_main_recyclerView);
        fab = (FloatingActionButton) v.findViewById(R.id.fragment_main_fab_group);
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

        (new LoadMainRecyclerViewFragment()).execute();
        return v;
    }
/*
    @Override
    public void onPause() {
        super.onPause();
        // save RecyclerView state
        mBundleRecyclerViewState = new Bundle();
        Parcelable listState = mRecyclerView.getLayoutManager().onSaveInstanceState();
        mBundleRecyclerViewState.putParcelable(LIST_STATE_KEY, listState);
    }

    @Override
    public void onResume() {
        super.onResume();
        // restore RecyclerView state
        if (mBundleRecyclerViewState != null) {
            Parcelable listState = mBundleRecyclerViewState.getParcelable(LIST_STATE_KEY);
            mRecyclerView.getLayoutManager().onRestoreInstanceState(listState);
        }
    }
*/
    class LoadMainRecyclerViewFragment extends AsyncTask<Void, Void, Void> {
        MainActivityAdapter adapter;

        @Override
        protected Void doInBackground(Void... voids) {
            adapter = new MainActivityAdapter(chapters);
            mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
            mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            try {
                assert mRecyclerView != null;
                mRecyclerView.setAdapter(adapter);
                mRecyclerView.setHasFixedSize(true);
                mRecyclerView.setLayoutManager(mLayoutManager);
                //mRecyclerView.setItemAnimator(new SlideInUpAnimator(new OvershootInterpolator(1f)));
            } catch (Exception ex) {
                ex.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(), R.string.error_message, Toast.LENGTH_SHORT).show();
            }
        }
    }
}