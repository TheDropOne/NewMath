package by.thedrop.newmath.RecyclerViewAdapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import by.thedrop.newmath.Activities.MainActivity;
import by.thedrop.newmath.Constants.Constants;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.MainActivityTemplate;
import by.thedrop.newmath.Templates.SublistTemplate;

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
        final MainActivityTemplate template = chapters.get(position);

        TextView name = holder.mTextView;
        ImageView image = holder.mImageView;

        name.setText(template.getName());
        image.setImageResource(template.getLocation());

        holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int chapter = template.getName();

                List<SublistTemplate> tempList = new ArrayList<SublistTemplate>();

                switch (chapter){
                    case R.string.help_author                : tempList = Constants.mHelpAuthor;                break;
                    case R.string.advices            : tempList = Constants.mAdvices;                   break;
                    case R.string.answersEgeCT              : tempList = Constants.mAnswersEgeCT;              break;
                    case R.string.typicalTasks               : tempList = Constants.mTypicalTasks;              break;
                    case R.string.perimetr                     : tempList = Constants.mPerimetr;                  break;
                    case R.string.areaPlaneFigures        : tempList = Constants.mAreaPlaneFigures;          break;
                    case R.string.areaOfSurface          : tempList = Constants.mAreaOfSurface;             break;
                    case R.string.volume                    : tempList = Constants.mVolume;                    break;
                    case R.string.triangle                  : tempList = Constants.mTriangle;                  break;
                    case R.string.radiusInscribedCircle  : tempList = Constants.mRadiusInscribedCircle;     break;
                    case R.string.radiusCircumscribedCircle  : tempList = Constants.mRadiusCircumscribedCircle; break;
                    case R.string.algebra                      : tempList = Constants.mAlgebra;                   break;
                    case R.string.integrals      : tempList = Constants.mIntegrals;                 break;
                    //case R.string.usefulResources: MainActivity.underChapters = AtomicKernelPhysics.getList();break;

                    default: MainActivity.underChapters = Constants.mHelpAuthor;
                }

                Toast.makeText(v.getContext(),template.getName(),Toast.LENGTH_SHORT).show();

                MainActivity.template = template;
                Intent intent = new Intent(v.getContext(), FormulasList.class);
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

