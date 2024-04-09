import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayListService choreList = new ArrayListService();
        choreList.addItem("Wash Dishes");
        choreList.addItem("Fold Laundry");
        choreList.addItem("Code For an Hour");
        System.out.println(choreList.toString());

        choreList.deleteItem("Wash Dishes");
        System.out.println(choreList.toString());

        choreList.updateItem("Code For an Hour", "Code All Day");
        System.out.println(choreList.toString());
    }
}
