package tw.rxjava;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import tw.rxjava.example.Student;

public class FlatmapPractice {
    public static void main(String[] args) {
        Student student1 = new Student("Jason");
        student1.addCourse("math");
        student1.addCourse("english");

        Student student2 = new Student("Sarah");
        student2.addCourse("Locking");
        student2.addCourse("Popping");

        student2.getCourses().forEach(System.out::println);

        Student[] studentNames = new Student[]{student1, student2};

        Observable.from(studentNames)
                .map(new Func1<Student, String>() {
                    @Override
                    public String call(Student student) {
                        return student.getmName();
                    }
                }).subscribe(new Subscriber<String>() {
                    @Override
                    public void onNext(String s) {
                        System.out.println(s);
                    }
                    @Override
                    public void onCompleted() {
                        System.out.println("=========");
                        System.out.println("Completed");
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println(e.getMessage());
                    }
                });

    }
}
