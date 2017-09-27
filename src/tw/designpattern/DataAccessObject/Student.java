package tw.designpattern.DataAccessObject;

public class Student {
    String mName;
    String mAge;

    public Student(String mName, String mAge) {
        this.mName = mName;
        this.mAge = mAge;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAge() {
        return mAge;
    }

    public void setmAge(String mAge) {
        this.mAge = mAge;
    }
}
