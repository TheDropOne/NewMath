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
import by.thedrop.newmath.Activities.SublistActivity;
import by.thedrop.newmath.Chapters.Advices;
import by.thedrop.newmath.Chapters.Algebra;
import by.thedrop.newmath.Chapters.AnswersEgeCT;
import by.thedrop.newmath.Chapters.AreaOfSurface;
import by.thedrop.newmath.Chapters.AreaPlaneFigures;
import by.thedrop.newmath.Chapters.HelpAuthor;
import by.thedrop.newmath.Chapters.Integrals;
import by.thedrop.newmath.Chapters.Perimetr;
import by.thedrop.newmath.Chapters.RadiusCircumscribedCircle;
import by.thedrop.newmath.Chapters.RadiusInscribedCircle;
import by.thedrop.newmath.Chapters.Triangle;
import by.thedrop.newmath.Chapters.Trigonometry;
import by.thedrop.newmath.Chapters.TypicalTasks;
import by.thedrop.newmath.Chapters.Volume;
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

                switch (chapter) {
                    case R.string.help_author:
                        MainActivity.template = new HelpAuthor();
                        tempList = Constants.mHelpAuthor;
                        break;
                    case R.string.advices:
                        MainActivity.template = new Advices();
                        tempList = Constants.mAdvices;
                        break;
                    case R.string.answersEgeCT:
                        MainActivity.template = new AnswersEgeCT();
                        tempList = Constants.mAnswersEgeCT;
                        break;
                    case R.string.typicalTasks:
                        MainActivity.template = new TypicalTasks();
                        tempList = Constants.mTypicalTasks;
                        break;
                    case R.string.perimetr:
                        MainActivity.template = new Perimetr();
                        tempList = Constants.mPerimetr;
                        break;
                    case R.string.areaPlaneFigures:
                        MainActivity.template = new AreaPlaneFigures();
                        tempList = Constants.mAreaPlaneFigures;
                        break;
                    case R.string.areaOfSurface:
                        MainActivity.template = new AreaOfSurface();
                        tempList = Constants.mAreaOfSurface;
                        break;
                    case R.string.volume:
                        MainActivity.template = new Volume();
                        tempList = Constants.mVolume;
                        break;
                    case R.string.triangle:
                        MainActivity.template = new Triangle();
                        tempList = Constants.mTriangle;
                        break;
                    case R.string.radiusInscribedCircle:
                        MainActivity.template = new RadiusInscribedCircle();
                        tempList = Constants.mRadiusInscribedCircle;
                        break;
                    case R.string.radiusCircumscribedCircle:
                        MainActivity.template = new RadiusCircumscribedCircle();
                        tempList = Constants.mRadiusCircumscribedCircle;
                        break;
                    case R.string.trigonometry:
                        MainActivity.template = new Trigonometry();
                        tempList = Constants.mTrigonometry;
                        break;
                    case R.string.algebra:
                        MainActivity.template = new Algebra();
                        tempList = Constants.mAlgebra;
                        break;
                    case R.string.integrals:
                        MainActivity.template = new Integrals();
                        tempList = Constants.mIntegrals;
                        break;
                    //case R.string.usefulResources: MainActivity.underChapters = AtomicKernelPhysics.getList();break;

                    default:
                        MainActivity.underChapters = Constants.mHelpAuthor;
                        MainActivity.template = new HelpAuthor();
                }
                Toast.makeText(v.getContext(), template.getName(), Toast.LENGTH_SHORT).show();

                MainActivity.underChapters = tempList;
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

