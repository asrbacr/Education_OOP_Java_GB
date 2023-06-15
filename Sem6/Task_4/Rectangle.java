package OOP_GB_4335.Sem6.Task_4;

public class Rectangle extends Square{

    @Override
    public void setWidth(int width) {
        super.width = width;
    }
    
    @Override
    public void setHeight(int height) {
        super.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
    
}
