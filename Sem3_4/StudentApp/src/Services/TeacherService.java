package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

public class TeacherService implements iUserService<Teacher>{
    private int count;
    private List<Teacher> teachers;
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher tech = new Teacher(firstName, secondName, age, count);
        count++;
        teachers.add(tech);
    }

    public List<Teacher> getSortedByFIOTeachersList() {
        List<Teacher> newTeachList = new ArrayList<Teacher>(teachers);
        newTeachList.sort(new PersonComparator<Teacher>());
        return newTeachList;
    }

}
