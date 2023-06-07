package Controllers;

public class TeacherController implements iUserController{
    private final TeacherController dataService = new TeacherController();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
    
}
