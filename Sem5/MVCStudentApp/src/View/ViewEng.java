package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{
    
    public void printAllStudents(List<Student> students) {
        System.out.println("-----The list of students-----");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----The end list of students-----");
        
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
