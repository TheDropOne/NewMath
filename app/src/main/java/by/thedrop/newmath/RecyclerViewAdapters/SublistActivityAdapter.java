package by.thedrop.newmath.RecyclerViewAdapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.analytics.HitBuilders;

import java.util.List;

import by.thedrop.newmath.Activities.MainActivity;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.SublistTemplate;

/**
 * Created by Semen on 19-Nov-16.
 */

public class SublistActivityAdapter extends RecyclerView.Adapter<SublistActivityAdapter.MyViewHolder> {

    private List<SublistTemplate> subChapters;

    public SublistActivityAdapter(List<SublistTemplate> subChapters) {
        this.subChapters = subChapters;
    }

    @Override
    public SublistActivityAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_sublist_activity, parent, false);
        return new SublistActivityAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SublistActivityAdapter.MyViewHolder holder, final int position) {
        final SublistTemplate template = subChapters.get(position);

        TextView name = holder.mTextView;

        name.setText(template.getLocation());

        final Bundle bundle = new Bundle();

        holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BasicChapter temp = MainActivity.template;
                Intent intent = temp.getBehavior(view.getContext(), template.getLocation());
                if (intent != null) {
                    MainActivity.screensCount++;
                    view.getContext().startActivity(intent);
                    MainActivity.mFirebaseAnalytics.logEvent("Image Activity created, image = " + template.getName(), bundle);
                    MainActivity.mTracker
                            .send(new HitBuilders.EventBuilder()
                                    .setCategory("Image Activity")
                                    .setAction("View")
                                    .setLabel(template.getName())
                                    .build());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return subChapters.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;
        private View itemView;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;

            mTextView = (TextView) itemView.findViewById(R.id.item_sublist_name);
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            itemView.setOnClickListener(onClickListener);
        }
    }
}
