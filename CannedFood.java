public class CannedFood extends Groceries {

    private String expiredDate;
    private String type;

    public CannedFood(String description, double price, String expiredDate, String type) {
        super(description, price);
        this.expiredDate = expiredDate;
        this.type = type;
    }

    @Override
    public String displayInfo() {
        String info = String.format("Grocery Description: %s\nCanned Food Type: %s\nExpiry date: %s\nPrice: USD %.2f\nPrice converted to Malaysian: MYR %.2f\n", this.getDescription(), this.type, this.expiredDate, this.getPrice(), this.calcPriceInMYR());
        return info;
    }
}
