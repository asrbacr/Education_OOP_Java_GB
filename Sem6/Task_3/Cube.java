package OOP_GB_4335.Sem6.Task_3;

public class Cube implements Shape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    public double volume() {
        return edge * edge * edge;
    }
}
