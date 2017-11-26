package sas.ita.com.hctproject.student_info;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import sas.ita.com.hctproject.R;

/**
 * Created by sasmob on 11/26/2017.
 */

public class Student_Adapter extends RecyclerView.Adapter<Student_Adapter.ViewHolder> {

    ArrayList<Student_Info> student;
    Context context;

    public Student_Adapter(ArrayList<Student_Info> student, Context context) {
        this.student = student;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater infaltor =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = infaltor.inflate(R.layout.student_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Student_Info std_info = student.get(position);
        holder.name.setText(std_info.getName());
        holder.imagesStudent.setImageResource(std_info.getImage());

    }

    @Override
    public int getItemCount() {
        return student.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView imagesStudent;

        public ViewHolder(View itemView) {
            super(itemView);
            name =  (TextView) itemView.findViewById(R.id.text);
            imagesStudent = (ImageView) itemView.findViewById(R.id.img1);
        }
    }

}
