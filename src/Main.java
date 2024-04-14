import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayListService choreList = new ArrayListService();
//        choreList.addItem("Wash Dishes");
//        choreList.addItem("Fold Laundry");
//        choreList.addItem("Code For an Hour");
//        System.out.println(choreList.toString());
//
//        choreList.deleteItem("Wash Dishes");
//        System.out.println(choreList.toString());
//
//        choreList.updateItem("Code For an Hour", "Code All Day");
//        System.out.println(choreList.toString());

        Main main = new Main();
        int hereANumberGo = main.giveMe5();
        User user = new User("Bob", "password", "spleenStepper");

        System.out.println(user);

    }

    int giveMe5(){
        return 5;
    }
}
