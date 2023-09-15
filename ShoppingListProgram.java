import java.util.Scanner;
import java.util.Vector;

public class ShoppingListProgram {
    public static void main(String[] args) {
        Vector<String> shoppingList = new Vector<String>();

        // (a) Accept a shopping list of five items and store them in a vector
        acceptShoppingList(shoppingList);

        // (e) Print the content of the vector
        printShoppingList(shoppingList);

        // (b) Delete a specific item from the list
        deleteItem(shoppingList);

        // (e) Print the content of the vector
        printShoppingList(shoppingList);

        // (c) Add an item at a specified location in the list
        addItemAtLocation(shoppingList);

        // (e) Print the content of the vector
        printShoppingList(shoppingList);

        // (d) Add an item at the end of the list
        addItemToEnd(shoppingList);

        // (e) Print the content of the vector
        printShoppingList(shoppingList);
    }

    public static void acceptShoppingList(Vector<String> shoppingList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five items for the shopping list:");
        for (int i = 0; i < 5; i++) {
            String item = scanner.nextLine();
            shoppingList.add(item);
        }
    }

    public static void deleteItem(Vector<String> shoppingList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the item to delete: ");
        String item = scanner.nextLine();
        if (shoppingList.contains(item)) {
            shoppingList.remove(item);
            System.out.println(item + " deleted from the list.");
        } else {
            System.out.println(item + " is not in the list.");
        }
    }

    public static void addItemAtLocation(Vector<String> shoppingList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the item to add: ");
        String item = scanner.nextLine();
        System.out.print("Enter the index to insert the item at: ");
        int index = scanner.nextInt();
        shoppingList.insertElementAt(item, index);
        System.out.println(item + " added to the list at index " + index + ".");
    }

    public static void addItemToEnd(Vector<String> shoppingList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the item to add at the end: ");
        String item = scanner.nextLine();
        shoppingList.add(item);
        System.out.println(item + " added to the end of the list.");
    }

    public static void printShoppingList(Vector<String> shoppingList) {
        System.out.println("Shopping List:");
        for (String item : shoppingList) {
            System.out.println(item);
        }
        System.out.println();
    }
}

