package com.nimit.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nimit on 13/1/18.
 */

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Course> courseList = new ArrayList<>();

    public CourseAdapter(Context context, ArrayList<Course> courseList) {
        this.context = context;
        this.courseList = courseList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //inflate has three parameters, layout to inflate, container in which it needs to be inflated
        // attach to root layout, should be false
        View v = LayoutInflater.from(context).inflate(R.layout.list_item_course, parent, false);
        return new ViewHolder(v);  // returns a viewHolder object
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Get the desired data
        String courseName = courseList.get(position).getName();
        String instructorName = courseList.get(position).getInstructor();
        int batchStrength = courseList.get(position).getBatchStrength();

        //Binding the data with help of viewholder
        holder.tvCourseName.setText(courseName);
        holder.tvInstructorName.setText(instructorName);
        holder.tvBatchStrength.setText(String.valueOf(batchStrength));

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    // Provide a direct reference to each of the views within a data item
    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView tvCourseName, tvInstructorName, tvBatchStrength;

        // findviewbyid is costly operation so we do it only once for each view which are recycled
        public ViewHolder(View itemView) {
            super(itemView);

            tvCourseName = itemView.findViewById(R.id.tvCourseName);
            tvInstructorName = itemView.findViewById(R.id.tvInstName);
            tvBatchStrength = itemView.findViewById(R.id.tvBatchStrength);
        }
    }
}
