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

        /*holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chapter = template.getName();

                switch (chapter){

                    case "Кинематика" : MainActivity.underChapters = Kinematics.getList();                  break;
                    case "Динамика" : MainActivity.underChapters = Dynamics.getList();                      break;
                    case "Законы сохранения" : MainActivity.underChapters = ConservationLaws.getList();     break;
                    case "Электростатика" : MainActivity.underChapters = Electrostatics.getList();          break;
                    case "Постоянный ток" : MainActivity.underChapters = DirectCurrent.getList();           break;
                    case "Магнитное поле" : MainActivity.underChapters = MagneticField.getList();           break;
                    case "Колебания и волны" : MainActivity.underChapters = OscillationLaws.getList();      break;
                    case "Оптика" : MainActivity.underChapters = Optics.getList();                          break;
                    case "Теория относительности" : MainActivity.underChapters = Relativity.getList();      break;
                    case "Квантовая физика" : MainActivity.underChapters = QuantumPhysics.getList();        break;
                    case "Молекулярная физика" : MainActivity.underChapters = MolecularPhysics.getList();   break;
                    case "Термодинамика" : MainActivity.underChapters = Thermodynamics.getList();           break;
                    case "Физика атомного ядра": MainActivity.underChapters = AtomicKernelPhysics.getList();break;

                    default: MainActivity.underChapters = Kinematics.getList();

                }

                Toast.makeText(MainActivity.getContext(),template.getName(),Toast.LENGTH_SHORT).show();

                MainActivity.template = template;
                Intent intent = new Intent(MainActivity.getContext(), FormulasList.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                MainActivity.context.startActivity(intent);

            }
        });*/
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

