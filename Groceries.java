public abstract class Groceries implements Convertible {

    private String description;
    private double price;

    public Groceries() {
        description = "";
        price = 0.0;
    }

    public Groceries(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public double calcPriceInMYR() {
        return price * 4.43;
    }

    public abstract String displayInfo();
}
