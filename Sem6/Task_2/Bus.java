package OOP_GB_4335.Sem6.Task_2;

public class Bus implements Vehicle{
    private int maxSpeed;

    public Bus(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double getType() {
        return 0.6;
    }
    
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String getNameString() {
        return "Bus";
    }

}
