package Domen;

public class Product {
    private int productId;
    private String productName;//for displaying to customer
    private String productCategory;
    private double price;

    public Product(int productId, String productName, String productCategory, double price) throws Exception{
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;

    }

    public int getProductId() {
        return productId;
    }

    // public void setProductId(int productId) {
    //     this.productId = productId;
    // }

    public String getProductName() {
        return productName;
    }

    // public void setProductName(String productName) {
    //     this.productName = productName;
    // }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // this.price = (price > 10) ? price: throw Exception;
        // if (price <= 0){
        //     throw new ille
        // }
        this.price = price;
    }

    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", price=" + price +
                '}';
    }
}
