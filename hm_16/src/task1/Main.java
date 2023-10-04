package task1;

public class Main {
    public static void main(String[] args) {


        MyDate birthday1= new MyDate(03,10,1991);
        MyDate startOfCourse = new MyDate(18,07,2002);
        Student student1= new Student("Bohdan","Havryliv",birthday1,"Cohort31-1",startOfCourse);

        MyDate birthday2 = new MyDate(20, 4, 2001);
        MyDate startCourse2 = new MyDate(1, 9, 2021);
        Student student2 = new Student("Марія", "Іванова", birthday2, "Група Б", startCourse2);

        System.out.println(Student.studentToString(student1));

    }
}