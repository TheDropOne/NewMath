package by.thedrop.newmath.RecyclerViewAdapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import by.thedrop.newmath.Templates.MainActivityTemplate;
import by.thedrop.newmath.R;

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

                switch (chapter){

                    case R.string.help_author : MainActivity.underChapters = Kinematics.getList();                  break;
                    case R.string.advices : MainActivity.underChapters = Dynamics.getList();                      break;
                    case R.string.answersEgeCT : MainActivity.underChapters = ConservationLaws.getList();     break;
                    case R.string.typicalTasks : MainActivity.underChapters = Electrostatics.getList();          break;
                    case R.string.perimetr : MainActivity.underChapters = DirectCurrent.getList();           break;
                    case R.string.areaPlaneFigures : MainActivity.underChapters = MagneticField.getList();           break;
                    case R.string.areaOfSurface: MainActivity.underChapters = OscillationLaws.getList();      break;
                    case R.string.volume : MainActivity.underChapters = Optics.getList();                          break;
                    case R.string.triangle : MainActivity.underChapters = Relativity.getList();      break;
                    case R.string.radiusInscribedCircle : MainActivity.underChapters = QuantumPhysics.getList();        break;
                    case R.string.radiusCircumscribedCircle : MainActivity.underChapters = MolecularPhysics.getList();   break;
                    case R.string.algebra : MainActivity.underChapters = Thermodynamics.getList();           break;
                    case R.string.integrals: MainActivity.underChapters = AtomicKernelPhysics.getList();break;
                    case R.string.usefulResources: MainActivity.underChapters = AtomicKernelPhysics.getList();break;

                    default: MainActivity.underChapters = Kinematics.getList();

                }

                Toast.makeText(MainActivity.getContext(),template.getName(),Toast.LENGTH_SHORT).show();

                MainActivity.template = template;
                Intent intent = new Intent(MainActivity.getContext(), FormulasList.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                MainActivity.context.startActivity(intent);

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

