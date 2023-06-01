package StudentDomen;

import java.util.Iterator;

public class Student extends Person implements Comparable<Student> {

    private int id;

    public Student(String firstName, String secondName, int age, int id) {
        super(firstName, secondName, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o){
        System.out.println(super.getFirstName() + " - " + );
        if(this.getAge() == o.getAge()){
            return -1;
        }
        if(this.getAge() < o.getAge()){
            return 0;
        }
        if(this.getAge() > o.getAge()){
            return 1;
        }

    }

    
}

