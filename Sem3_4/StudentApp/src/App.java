import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Person;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Person man = new Person("Денис", "Криницын", 35);
        //System.out.println(man.toString());

        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        //System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        listStud.add(pers1);
        
        StudentGroup group4335 = new StudentGroup(listStud, 4335);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(new Student("Сергей", "Иванов", 22, 101));
        listStud2.add(new Student("Андрей", "Сидоров", 22, 111));
        listStud2.add(new Student("Иван", "Петров", 22, 121));
        listStud2.add(new Student("Игорь", "Иванов", 23, 301));
        listStud2.add(new Student("Даша", "Цветкова", 23, 171));
        listStud2.add(new Student("Лена", "Незабудкина", 23, 104));
        StudentGroup group4356 = new StudentGroup(listStud2, 4356);
        
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(new Student("Сергей", "Иванов", 22, 101));
        listStud3.add(new Student("Андрей", "Сидоров", 22, 111));
        listStud3.add(new Student("Иван", "Петров", 22, 121));
        listStud3.add(new Student("Игорь", "Иванов", 23, 301));
        listStud3.add(new Student("Даша", "Цветкова", 23, 171));
        listStud3.add(new Student("Лена", "Незабудкина", 23, 104));
        StudentGroup group3567 = new StudentGroup(listStud3, 3567);

        StudentSteam listGroup = new StudentSteam()
        listGroup.add()

        //System.out.println(group4335.toString());

        /* for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        }

        System.out.println("===============================");
        Collections.sort(group4335.getGroup());

        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        } */
        System.out.println("===============================");


    }
}