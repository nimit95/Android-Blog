# RecyclerView

RecyclerView is used to show list item on the Android. It is similar to ListView in terms of layout on the screen. But has major difference in the way both are implemented.

In ListView we have to use ViewHolder pattern(optional) for good performance. But RecyclerView enforces to recycle the views created on the screen. Like if 5 items are being displayed on your screen, then only 7 items will be in memory(one extra abpove and below sceen). When user scrolls, the views are recycled by binding item with different data.

Also, in ListView it is optional to uses ViewGroup containers but in RecyclerView, layout has to be inflated inside the container. This helps as shape of containers can be modified to get different types of list. RecyclerView list can be horigontal, vertical etc.

To use RecyclerView we need to follow following steps :-

1. Add RecyclerView support library to the gradle build file
```java
compile 'com.android.support:recyclerview-v7:26.1.0'
```

2. Each list Item needs a data source. We will create a Course model/POJO class as our data source
```java

public class Course {
    private String name, instructor;
    private int batchStrength;

    public Course(String name, String instructor, int batchStrength) {
        this.name = name;
        this.instructor = instructor;
        this.batchStrength = batchStrength;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getBatchStrength() {
        return batchStrength;
    }
}

```

3. Add RecyclerView to your activity/fragment XML file
```xml
<android.support.v7.widget.RecyclerView
    android:id="@+id/rvCourseList"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

4. Now we need to create a custom XML row item layout which will be used as layout for each row. Go on layout folder in res, right click and select New -> resource Layout file. In demo project it is named as list_item_course.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">


    <TextView
        android:id="@+id/tvCourseName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="text1"
        android:textAppearance="@android:style/TextAppearance.Large" />

    <TextView
        android:id="@+id/tvInstName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="text2"
        android:textAppearance="@android:style/TextAppearance.Large" />

    <TextView
        android:id="@+id/tvBatchStrength"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="text3"
        android:textAppearance="@android:style/TextAppearance.Large" />
</LinearLayout>
```

5. Now we make the RecyclerView adapter. We make a java class lets say CourseAdapter. We extend RecyclerView.Adapter but it needs a ViewHolder class. So inside CourseAdapter we create ViewHolder class which extends from RecyclerView.ViewHolder. Then send use ViewHolder class in our CourseAdapter class.
We have to implement three methods as follows -
  * public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)

    This is called when the layouts are first time created on the screen. Item layout is inflated inside the parent container and ViewHolder is created for this view, whose object needs to be returned.

  * public void onBindViewHolder(ViewHolder holder, int position)
  
    This is called to bind our views with the data. method uses the view holder's position to determine what the contents should be. It gets the view holder of the layout item which populates data into the item through holder


  * public int getItemCount()

    This returns the number of list items.

    We make constructor for Adapter with context(needed to inflate the view) and arrayList which acts as a data source.

    The final code of adapter is as below.
```java

```
