public class Fruit extends Groceries {

    private double weight;

    public Fruit(String description, double price, double weight) {
        super(description, price);
        this.weight = weight;
    }

    public double calcWeightInGram() {
        return weight * poundToGram;
    }

    @Override
    public String displayInfo() {

        String info = String.format("Grocery Description: %s\nWeight in pound: %.2f\nWeight in gram: %.2f\nPrice: USD %.2f\nPrice converted to Malaysian: MYR %.2f\n", this.getDescription(), this.weight, this.calcWeightInGram(), this.getPrice(), this.calcPriceInMYR());
        return info;
    }
}
