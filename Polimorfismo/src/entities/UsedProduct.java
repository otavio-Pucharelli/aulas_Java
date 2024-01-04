package entities;



public class UsedProduct extends Product {
    private String manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public final String priceTag() {
        return super.priceTag() + " (Manufacture date: " + manufactureDate + ")";
    }
}

