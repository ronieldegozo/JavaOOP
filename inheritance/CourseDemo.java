package io.inheritance;

public class CourseDemo {

    public static void main(String[] args){
        Course course = new Course(80, 90);
        course.setMidtermgrade(100);
        System.out.println("Midterm grade: " + course.midtermgrade);

    }
    
}
