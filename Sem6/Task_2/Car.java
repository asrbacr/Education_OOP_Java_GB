package OOP_GB_4335.Sem6.Task_2;

public class Car implements Vehicle {
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double getType() {
        return 0.8;
    }
    
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    @Override
    public String getNameString() {
        return "Car";
    }


    // public void setMaxSpeed(int maxSpeed) {
    //     this.maxSpeed = maxSpeed;
    // }
    
}
