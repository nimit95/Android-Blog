package com.nimit.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvCourseList = findViewById(R.id.rvCourseList);

        rvCourseList.setLayoutManager(new LinearLayoutManager(this));
        rvCourseList.setAdapter(new CourseAdapter(this, getCourseList()));

    }


    public static ArrayList<Course> getCourseList() {
        ArrayList<Course> courseArrayList = new ArrayList<>();

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Garima", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Garima", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Garima", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Garima", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Garima", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Garima", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Garima", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Garima", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Garima", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));



        return courseArrayList;
    }

}
