package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Model;
import Model.Student;
import View.View;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    public void getAllStudents(){
        students = model.getAllStudents();
    }    

    public boolean testDate(){
        if (students.size() > 0) return true;
        else return false;   
    }

    public void update(){
        //MCP - когда данные перед отправкой пользователю проверяются на Presenter
        getAllStudents();
        if(testDate()) {
            view.printAllStudents(students);
        }
        else {
            System.out.println("Список студентов пуст!");
        }


        // MVC - когда данные приходят сразу пользователю
        // view.printAllStudents(model.getAllStudents());

    }
}
