package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HachModel implements iGetModel{
    private HashMap<Long, Student> hachModel;
    
    /**
     * Конструктор Модели
     * @param students принимает на вход список студентов
     */
    public void ModelHM(HashMap<Long, Student> students){
        this.hachModel = new HashMap<Long, Student>();
    }

    /**
     * Метод для получения списка всех студентов
     * @return возвращаяет список
     */
    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<Student>(hachModel.values());
    }
    
    /**
     * Метод для удаления студента
     * @param id - принимает на вход id студента 
     */
    public void removeStudent(Long id) {
        hachModel.remove(id);
    }
}
