package CoffeeMachine;
import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int paper_cup = 9;
        int money = 550;
        System.out.println("The coffee machine has:\n" +
                water + "ml of water\n" + milk + "ml of milk\n" +
                beans + "g of coffee beans\n" + paper_cup + " of paper cups\n" + money + "₴ of money");
        System.out.println("\nWrite action (buy, fill, take):");
        String user = scan.nextLine();
            if (user.equals("buy")) {
                System.out.println("Choose your coffee: (1 - Espresso, 2 - Latte, 3 - Cappuccino) ");
                int coffee = scan.nextInt();
                if (coffee == 1) {
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    paper_cup--;
                } else if (coffee == 2) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    paper_cup--;
                } else if (coffee == 3) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    paper_cup--;
                }
            } else if (user.equals("fill")) {
                System.out.println("Write how many ml of water you want to add: ");
                water += scan.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                milk += scan.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                beans += scan.nextInt();
                System.out.println("Write how many paper_cup you want to add: ");
                paper_cup += scan.nextInt();
            }
            else if (user.equals("take")){
                System.out.println("I gave you "+ money +"₴");
                money -= money;
            }
        System.out.println("\nThe coffee machine has:\n" + water + "ml of water\n" +milk +
                "ml of milk\n" +beans + "g of coffee beans\n" +paper_cup + " of paper cups\n" +money + "₴ of money");
    }
}
