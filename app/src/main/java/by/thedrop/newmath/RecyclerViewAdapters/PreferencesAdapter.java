package by.thedrop.newmath.RecyclerViewAdapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import by.thedrop.newmath.Activities.MainActivity;
import by.thedrop.newmath.Activities.SublistActivity;
import by.thedrop.newmath.Chapters.HelpAuthor;
import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.MainActivityTemplate;

/**
 * Created by Semen on 30-Nov-16.
 */

public class PreferencesAdapter extends RecyclerView.Adapter<PreferencesAdapter.MyViewHolder> {

    private List<MainActivityTemplate> preferences;

    public PreferencesAdapter(List<MainActivityTemplate> preferences) {
        this.preferences = preferences;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_preferences, parent, false);
        return new PreferencesAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final MainActivityTemplate currentElement = preferences.get(position);

        ImageView image = holder.mImageView;

        image.setImageResource(currentElement.getLocation());

        holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    MainActivity.template = Constants.chaptersMap.get(currentElement.getName());
                } catch (Exception ex) {
                    MainActivity.template = new HelpAuthor();
                }
                Intent intent = new Intent(view.getContext(), SublistActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(intent);
                //view.getContext().startActivity((new CustomIntention().returnIntent(view.getContext())));
            }
        });
    }

    @Override
    public int getItemCount() {
        return preferences.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;
        private View itemView;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;

            mImageView = (ImageView) itemView.findViewById(R.id.item_preferences);
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            itemView.setOnClickListener(onClickListener);
        }
    }
}
