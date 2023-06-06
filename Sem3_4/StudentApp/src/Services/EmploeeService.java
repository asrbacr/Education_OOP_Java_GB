package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.PersonComparator;
import StudentDomen.Student;

public class EmploeeService implements iPresonService<Emploee>{
    private int count;
    private List<Student> emploees;
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }
    @Override
    public List<Emploee> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    @Override
    public void create(String firstName, String secondName, int age) {
        Emploee per = new Emploee(firstName, secondName, age, "basic");
        emploees.add(per);
    }

    public List<Emploee> getSortedByFIOEmploeeList() {
        List<Emploee> newEmploiList = new ArrayList<Emploee>(emploees);
        newEmploiList.sort(new PersonComparator<Emploee>());
        return newEmploiList;
    }
}
