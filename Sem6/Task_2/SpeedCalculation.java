package OOP_GB_4335.Sem6.Task_2;

public class SpeedCalculation {

    /**
     * Метод для подсчёта максимально разрешённой скорости
     * @param vehicle - Подаётся тип ТС
     * @return Разрешённая максимальная скорость или 0.0
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getNameString() == "Car") {
            return vehicle.getMaxSpeed() * vehicle.getType();
        } else if (vehicle.getNameString() == "Bus") {
            return vehicle.getMaxSpeed() * vehicle.getType();
        }
        return 0.0;
    }
}