package OOP_GB_4335.Sem7.Meteo;

import java.time.*;

// Интерфейс родного датчика
public interface MeteoSensor {
    int getId(); // идентификатор датчика

    Float getTemperature(); // температура датчика

    Float getHumidity(); // влажность

    Float getPressure(); // давление

    LocalDateTime getDateTime(); // время чтения данных датчика
}