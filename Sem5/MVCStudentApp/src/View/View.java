package View;

import java.util.List;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView{
    public void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
