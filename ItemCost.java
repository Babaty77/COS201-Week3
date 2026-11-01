import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Item Cost Calculator =====");
        System.out.print("Enter the name of the item: ");
        String itemName = input.nextLine();

        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        double totalCost = unitPrice * quantity;

        System.out.println("\n----- Receipt -----");
        System.out.println("Item: " + itemName);
        System.out.println("Unit Price: ₦" + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₦" + totalCost);

        input.close();
    }
}