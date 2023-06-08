import StudentDomen.Student;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Student<String, Integer> s1 = new Student<String, Integer>("Сергей","Иванов",24,1);
        System.out.println(s1);
        Student<String, Integer> s2 = new Student<String, Integer>("Сергей","Иванов",24,2);
        Student<String, Integer> s3 = new Student<String, Integer>("Сергей","Иванов",24,4);

         
    }
}
