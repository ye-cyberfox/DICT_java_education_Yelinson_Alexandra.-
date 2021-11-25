package CoffeeMachine;
import java.util.*;


public class CoffeeMachine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int water = 200;
        int milk= 50;
        int beans= 15;
        System.out.println("Write how many cups of coffee you will need:");
        int cup = scan.nextInt();
        System.out.println("Write how many ml of water the coffee machine has:");
        int water_machine = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk_machine = scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans_machine = scan.nextInt();
        int[] array= new int[] {water_machine / water, milk_machine / milk, beans_machine / beans};
        var min_cup = Arrays.stream(array).min().getAsInt();

        if (min_cup == cup){
            System.out.println("Yes, I can make that amount of coffee");
        } if (min_cup > cup) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (min_cup - cup) + " more than that)");
        } else {
            System.out.println("No, I can make only " + min_cup + " cups of coffee");
        }
    }
}