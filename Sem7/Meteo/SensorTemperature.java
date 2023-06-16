package OOP_GB_4335.Sem7.Meteo;

// Интерфейс дополнительного датчика 
interface SensorTemperature{
	int identifier(); // идентификатор датчика
	double temperature(); // температура датчика
	int year();			 // Год
	int day();			 // День года
	int second();		 // Секунда дня
}
	
