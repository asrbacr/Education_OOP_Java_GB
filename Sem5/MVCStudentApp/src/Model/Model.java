package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel{
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    public void removeStudent(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeStudent'");
    }
 
    
}
