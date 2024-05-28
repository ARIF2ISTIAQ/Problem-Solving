//MOHHAMAD ARIF ISTIAQ (A17CS4028)


import java.util.*;

public class Customer {

    private String name;
    private double totalPrice;
    private ArrayList<Groceries> groceriesList;

    public Customer(String name) {
        this.name = name;
        this.groceriesList = new ArrayList<>();
    }

    public void buy(Groceries item) {
        this.groceriesList.add(item);
    }

    public int calcItemPurchased() {
        return this.groceriesList.size();
    }

    public void print() {

        if(calcItemPurchased() < 1) {
            System.out.println("No items were purchased!!");
            return;
        }

        System.out.println("Number of items purchased: " + this.calcItemPurchased());

        int count = 1;
        for(Groceries item : this.groceriesList) {
            System.out.println("Item " + count);
            System.out.println(item.displayInfo());
            count++;
            totalPrice += item.calcPriceInMYR();
        }

        System.out.println(String.format("TOTAL PRICE: MYR %.2f\n", totalPrice));
    }

    public String toString() {

        String data = String.format("<<< %s\'s grocery shopping list >>>\n", this.name);
        return data;
    }
}
