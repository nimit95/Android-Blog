package com.nimit.recyclerviewdemo;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvCourseList = findViewById(R.id.rvCourseList);

        rvCourseList.setLayoutManager(new LinearLayoutManager(this));
        rvCourseList.setAdapter(new CourseAdapter(this, getCourseList()));

        AsyncTaskDemo asyncTaskDemo = new AsyncTaskDemo();
        asyncTaskDemo.execute("Hello");
    }

    private class AsyncTaskDemo extends AsyncTask<String, Void, String> {
        protected void onPreExecute() {
            // Runs on the UI thread before doInBackground
            // Good for toggling visibility of a progress indicator
            Log.e("AsyncTaskDemo", "onPreExecute");
        }

        protected String doInBackground(String... strings) {
            // Some long-running task in backgorund

            long startTime = System.currentTimeMillis();

            //This task will not block UI thread as it is being done in background thread
            while (System.currentTimeMillis() - startTime<5000);

            Log.e("AsyncTaskDemo", "doInBackground says " + strings[0]);
            return "Hi";
        }



        protected void onPostExecute(String result) {
            // This method is executed in the UIThread
            // with access to the result.
            Log.e("AsyncTaskDemo", "onPostExecute: " + result);

        }
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
