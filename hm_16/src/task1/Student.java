package task1;

public class Student {
    /*
    #1 Создать класс Student со следующими полями
    (String firstName, String lastName, MyDate birthday, String group, MyDate startCourse}
Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
который возвращает строку с данными студента.
     */

    private String firstName;
    private String lastName;
    private MyDate birthday;
    private String group;
    private MyDate startCourse;

    public Student(String firstName, String lastName, MyDate birthday, String group, MyDate startCourse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.group = group;
        this.startCourse = startCourse;
    }
    public static String studentToString(Student student){
        return "First name:" + student.firstName + "\n"+
                "Last name " + student.lastName + "\n" +
                "Date of birthday: " + student.birthday+ "\n"+
                "Group: "+ student.group+ "\n"+
                "Start of the course: "+ student.startCourse;
    }
}
