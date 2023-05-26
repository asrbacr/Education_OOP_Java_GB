package Domen;

/**
 * HotDrink - класс создания горячих напитков
 */
public class HotDrink extends Bottle{
    
    
    private int temp;


    /**
     * Создание новое записи с полями
     * 
     * @param productId - id продукта
     * @param productName - название продукта
     * @param productCategory - категория продукта
     * @param price - цена продукта
     * @param volume - объём продукта
     * @param temp - температура продукта
     * @throws Exception
     */
    public HotDrink(int productId, String productName, String productCategory, double price, int volume, int temp) throws Exception {
        super(productId, productName, productCategory, price, volume);
        this.temp = temp;
    }


    public int getTemp() {
        return temp;
    }


    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString()
        {
            return "Product{" +
            "productId='" + super.getProductId() + '\'' +
            "name='" + super.getProductName() + '\'' +
            "category='" + super.getProductCategory() + '\'' +
            ", cost=" + super.getPrice() +
            ", volume=" + super.getVolume() +
            ", temp=" + temp +           
            '}';
        }
    
}