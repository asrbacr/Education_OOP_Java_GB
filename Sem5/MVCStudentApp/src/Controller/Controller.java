package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Model;
import Model.Student;
import View.View;

public class Controller {
    private iGetView view;
    private iGetView viewEng;
    private iGetModel model;
    private List<Student> students;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    public void getAllStudents() {
        students = model.getAllStudents();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        // MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        // MVC
        // view.printAllStudents(model.getAllStudents());
    }

    /**
     * Русский язык
     */
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
            }
        }
    }
    
    /**
     * English language
     */
    public void runEng() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Input command: ");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exiting the programme!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
            }
        }
    }
    
    private void errorInputLanguage() {
        System.out.println("Ошибка: возможно ошиблись при вводе, повторите запуск приложения");
    }

    /**
     * Команда для запуска программы
     */
    public void startProgramm() {
        LangProgramm lang = LangProgramm.NONE;
        String command = view.prompt("Введите язык (RUS или ENG) / Input language (RUS or ENG): ");
        lang = LangProgramm.valueOf(command.toUpperCase());
        switch (lang) {
            case RUS:
                run();
                break; 
            case ENG:
                runEng();
                break;
        }

        
    }
}