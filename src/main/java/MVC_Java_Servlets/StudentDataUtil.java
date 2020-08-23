package MVC_Java_Servlets;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
    public static List<Student> getStudents(){
        List<Student> students=new ArrayList<>();

        students.add(new Student("romeo","tarko","romeo.tarko@email.com"));
        students.add(new Student("alket","tarko","alket.tarko@email.com"));
        students.add(new Student("donaldo","lika","donaldo.lika@email.com"));

        return students;
    }
}
