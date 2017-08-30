package tw.rxjava.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String mName;
    public List<String> mCourse;

    public Student(String mName) {
        this.mName = mName;
        this.mCourse = new ArrayList<>();
    }

    public String getmName() {
        return mName;
    }

    public List<String> getCourses() {
        return mCourse;
    }

    public void addCourse(String course) {
        if (mCourse == null)
            return;
        mCourse.add(course);
    }
}
