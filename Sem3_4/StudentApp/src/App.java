import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Controllers.TeacherController;
import Services.TeacherService;
import StudentDomen.Emploee;
import StudentDomen.Person;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        /* Person man = new Person("Денис", "Криницын", 35);
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
        
        StudentSteam listGroup = new StudentSteam(0);
        // listGroup.addGroupStream(group3567);
        // listGroup.addGroupStream(group4356);
        // listGroup.addGroupStream(group4335);

        
        listGroup.addGroup(group3567);
        listGroup.addGroup(group4356);
        listGroup.addGroup(group4335);

        listGroup.toString(); */

        // Семинар 4 Задание 3. начало

        List<Teacher> listTeacher = new ArrayList<Teacher>();
        listTeacher.add(new Teacher("Сергей", "Иванов", 22, 101));
        listTeacher.add(new Teacher("Андрей", "Сидоров", 22, 111));
        listTeacher.add(new Teacher("Иван", "Петров", 22, 121));
        listTeacher.add(new Teacher("Игорь", "Иванов", 23, 301));
        listTeacher.add(new Teacher("Даша", "Цветкова", 23, 171));
        listTeacher.add(new Teacher("Лена", "Незабудкина", 23, 104));

        for (Teacher teacher : listTeacher) {
            teacher.toString();
        }

        // Семинар 4 Задание 3. конец

        


        //System.out.println(group4335.toString());

        // for(Student stud:group4335)
        // {
        //     System.out.println(stud.toString());
        // }

        /* System.out.println("===============================");
        Collections.sort(group4335.getGroup());

        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        } 
        System.out.println("==============================="); */

        /* Emploee per1 = new Emploee("Борис", "Иванов", 40, "basic");
        Student s1 = new Student("Сергей", "Иванов", 22, 101);

        // EmploeeController empContr = new EmploeeController();
        // empContr.paySalary(per1);
        EmploeeController.paySalary(per1);
        // empContr.paySalary(s1); */

        /* Teacher t1 = new Teacher("Сергей", "Иванов", 22, 101);
        Teacher t3 = new Teacher("Иван", "Петров", 22, 121);
        Teacher t4 = new Teacher("Игорь", "Иванов", 23, 301);
        Teacher t5 = new Teacher("Даша", "Цветкова", 23, 171);
        Teacher t6 = new Teacher("Лена", "Незабудкина", 23, 104);

        TeacherService techServ = new TeacherService();

        techServ.getAll();
        techServ.getSortedByFIOTeachersList(); */
        

        


    }
}