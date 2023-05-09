package MY;

public class Smartphone extends Product {

    private String RAM;
    private String CPU;

    public Smartphone(String code, String name, String brand, String size, int price, int quantity, String RAM, String CPU) {
        super(code, name, brand, size, price, quantity);
        this.RAM = RAM;
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public void ViewInfor() {
        System.out.println(this.getCode() + " | " + this.getName() + " | " + this.getBrand() + " | " + this.getSize() + " | " + this.getPrice() + " | " + this.getQuantity() + " | " + this.RAM + " | " + this.CPU);
    }

}
