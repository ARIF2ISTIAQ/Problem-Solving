import java.util.*;

public class GroceriesApp {

    static Customer customer = null;

    public static void main(String[] args) {

        int choice = 0;
        Scanner input = new Scanner(System.in);


        while (true) {

            dispMenu();

            try {

                choice = Integer.parseInt(input.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("<<< Add Customer >>>\nName: ");
                        String name = input.nextLine().trim();
                        customer = new Customer(name);
                        break;
                    case 2:

                        if (customer == null) {
                            System.out.println("There is no customer. Please start by entering the customer's name");
                        } else {
                            System.out.println("<<< Buy Fruit >>>\n");
                            System.out.print("Description: ");
                            String description = input.nextLine().trim();
                            System.out.print("Price (in USD): ");
                            double usd = Double.parseDouble(input.nextLine().trim());
                            System.out.print("Weight (in pounds): ");
                            double weight = Double.parseDouble(input.nextLine().trim());

                            Fruit fruit = new Fruit(description, usd, weight);
                            customer.buy(fruit);
                        }

                        break;
                    case 3:

                        if (customer == null) {
                            System.out.println("There is no customer. Please start by entering the customer's name");
                        } else {
                            System.out.println("<<< Buy Canned Food >>>\n");
                            System.out.print("Description: ");
                            String description = input.nextLine().trim();
                            System.out.print("Price (in USD): ");
                            double usd = Double.parseDouble(input.nextLine().trim());
                            System.out.print("Type: ");
                            String type = input.nextLine().trim();
                            System.out.print("Expiry Date: ");
                            String date = input.nextLine().trim();

                            CannedFood cfood = new CannedFood(description, usd, date, type);
                            customer.buy(cfood);
                        }

                        break;
                    case 4:

                        if (customer == null) {
                            System.out.println("There is no customer. Please start by entering the customer's name");
                        } else {

                            System.out.println(customer);
                            customer.print();
                        }

                        break;

                    case 5:
                        return;

                    default:
                        throw new Exception("Invalid Input!!");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }
    }

    public static void dispMenu() {

        System.out.println("========== Menu ==========");
        System.out.println("[1] Add Customer");
        System.out.println("[2] Buy Fruit");
        System.out.println("[3] Buy Canned Food");
        System.out.println("[4] Display Grocery Shopping List");
        System.out.println("[5] Exit");
        System.out.println("==========================");
        System.out.print("\nSelect task: ");
    }
}
