package MY;


public class Airconditioner extends Product{

    public Airconditioner() {
    }

    public Airconditioner(String code, String name, String brand, String size, int price, int quantity) {
        super(code, name, brand, size, price, quantity);
    }

    @Override
    public void ViewInfor() {
        System.out.println(this.getCode() + " | " + this.getName() + " | " + this.getBrand() + " | " + this.getSize() + " | " + this.getPrice() + " | " + this.getQuantity());
    }
    
}
