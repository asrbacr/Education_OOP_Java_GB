package Model;

public class Teacher extends Person{
    private String acadDegree;
    public Teacher(String firstName, String secondName, int age, int count) {
        super(firstName, secondName, age);
        this.acadDegree = count;
    }
}