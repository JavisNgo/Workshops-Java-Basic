
package DemoGuitar;

public class Guitar {
    private String serialNumber, builder, model, backWood, topWood;
    private int price;

    public Guitar() {
    }

    public Guitar(String serialNumber, String builder, String model, String backWood, String topWood, int price) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void createSound() {
        System.out.println(serialNumber+" - "+builder+" - "+ model+" - "+backWood+" - "+topWood+" - "+price);
    }
}
