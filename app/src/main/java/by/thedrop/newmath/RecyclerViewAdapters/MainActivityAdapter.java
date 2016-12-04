package by.thedrop.newmath.RecyclerViewAdapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import by.thedrop.newmath.Activities.MainActivity;
import by.thedrop.newmath.Activities.SublistActivity;
import by.thedrop.newmath.Chapters.HelpAuthor;
import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.Fragments.PreferencesFragment;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.MainActivityTemplate;

/**
 * Created by Semen on 16-Nov-16.
 */

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.MyViewHolder> {

    private List<MainActivityTemplate> chapters;
    public static final String ACTION_IMAGE_PREFERENCES_CLICKED = "action_image_preferences_clicked";

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
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final MainActivityTemplate currentElement = chapters.get(position);
        for (MainActivityTemplate t : Constants.preferences) {
            if (t.equals(currentElement)) {
                chapters.get(position).setSelected(true);
                break;
            }
        }

        TextView name = holder.mTextView;
        final ImageView image = holder.mImageView;

        name.setText(currentElement.getName());
        if (currentElement.isSelected())
            image.setImageResource(currentElement.getLocationSelected());
        else image.setImageResource(currentElement.getLocation());

        final Animation shakeAnimation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.shake);
        final Animation disappearingAnimation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.image_disappearing);
        final Animation appearingAnimation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.image_appearing);


        disappearingAnimation.setAnimationListener(new Animation.AnimationListener() {
            int newLocation;

            @Override
            public void onAnimationStart(Animation animation) {
                if (currentElement.isSelected()) newLocation = currentElement.getLocation();
                else newLocation = currentElement.getLocationSelected();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                image.setImageResource(newLocation);
                currentElement.setSelected(!currentElement.isSelected());
                image.startAnimation(appearingAnimation);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Constants.preferences.size() > Constants.MAX_PREFERENCES_LIST_SIZE - 1 && !currentElement.isSelected()) {
                    image.startAnimation(shakeAnimation);
                } else {

                    int index = Constants.preferences.indexOf(currentElement);
                    if (index != -1) {
                        PreferencesFragment.adapter.remove(index);
                    } else {
                        PreferencesFragment.adapter.add(currentElement, 0);
                    }
                    image.startAnimation(disappearingAnimation);
                    MainActivity.updatePreferences();
                }
            }
        });
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
        public ImageView mImageView;
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

