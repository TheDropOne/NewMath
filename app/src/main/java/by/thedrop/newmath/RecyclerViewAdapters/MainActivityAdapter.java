package by.thedrop.newmath.RecyclerViewAdapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import by.thedrop.newmath.Activities.MainActivity;
import by.thedrop.newmath.Activities.SublistActivity;
import by.thedrop.newmath.Chapters.HelpAuthor;
import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.MainActivityTemplate;

/**
 * Created by Semen on 16-Nov-16.
 */

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.MyViewHolder> {

    private List<MainActivityTemplate> chapters;

    public MainActivityAdapter(List<MainActivityTemplate> chapters) {
        this.chapters = chapters;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_main_activity, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final MainActivityTemplate currentElement = chapters.get(position);

        TextView name = holder.mTextView;
        ImageView image = holder.mImageView;

        name.setText(currentElement.getName());
        image.setImageResource(currentElement.getLocation());

        holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    MainActivity.template = Constants.chaptersMap.get(currentElement.getName());
                } catch (Exception ex) {
                    MainActivity.template = new HelpAuthor();
                }
                Intent intent = new Intent(v.getContext(), SublistActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return chapters.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;
        private ImageView mImageView;
        private View itemView;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;

            mTextView = (TextView) itemView.findViewById(R.id.item_main_name);
            mImageView = (ImageView) itemView.findViewById(R.id.item_main_image);
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            itemView.setOnClickListener(onClickListener);
        }
    }
}

