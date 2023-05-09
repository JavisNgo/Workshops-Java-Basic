package MY;

public abstract class Product {
    private String code;
    private String name;
    private String brand;
    private String size;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(String code, String name, String brand, String size, int price, int quantity) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int Totalamount() {
        int total=this.price*this.quantity;
        return total;
    } 
    
    public abstract void ViewInfor();

}
