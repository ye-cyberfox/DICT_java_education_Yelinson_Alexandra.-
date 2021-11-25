package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int water = 200;
        int milk= 50;
        int beans= 15;
        System.out.println("Write how many cups of coffee you will need:");
        int cup = scan.nextInt();
        System.out.println("For " + cup + " cups of coffee you will need:\n"+ cup * water +" ml of water\n" +
                cup * milk + " ml of milk\n" +
                cup * beans + " g of coffee beans" );
    }
}