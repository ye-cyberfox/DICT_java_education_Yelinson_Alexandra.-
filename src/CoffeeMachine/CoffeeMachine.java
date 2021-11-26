package CoffeeMachine;
import java.util.*;

public class CoffeeMachine {
    static Object Scan(String condition) {
        Scanner scanner = new Scanner(System.in);
        if ("Str".equals(condition)) {
            return scanner.nextLine();
        } else {return scanner.nextInt();}
    }
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int paper_cup = 9;
        int money = 550;
        System.out.println("The coffee machine has:\n" +
                water + "ml of water\n" + milk + "ml of milk\n" +
                beans + "g of coffee beans\n" + paper_cup + " of paper cups\n" + money + "₴ of money");
        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String user = (String) Scan("Str");
            if (user.equals("buy")) {
                while (true) {
                    System.out.println("Choose your coffee: (1 - Espresso, 2 - Latte, 3 - Cappuccino, 4 - back to main menu>) ");
                    int coffee = (int) Scan("int");
                    if (coffee == 1) {
                        if (water < 250  || beans < 16 || paper_cup < 1) {
                            System.out.println("Sorry, not enough ingredients!");
                        } else {
                            water -= 250;
                            beans -= 16;
                            money += 4;
                            paper_cup--;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    }
                    if (coffee == 2) {
                        if (water < 350 || milk < 75 || beans < 20 || paper_cup < 1) {
                            System.out.println("Sorry, not enough ingredients!");
                        } else {
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            money += 7;
                            paper_cup--;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    }
                    if (coffee == 3) {
                        if (water < 200 || milk < 100 || beans < 12 || paper_cup < 1) {
                            System.out.println("Sorry, not enough ingredients!");
                        } else {
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            money += 6;
                            paper_cup--;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    } if(coffee == 4){
                        break;
                    }
                }
            }if (user.equals("fill")) {
                System.out.println("Write how many ml of water you want to add: ");
                water +=(int) Scan("int");
                System.out.println("Write how many ml of milk you want to add: ");
                milk += (int) Scan("int");
                System.out.println("Write how many grams of coffee beans you want to add: ");
                beans +=(int) Scan("int");
                System.out.println("Write how many paper_cup you want to add: ");
                paper_cup += (int) Scan("int");
            } if (user.equals("take")) {
                System.out.println("I gave you " + money + "₴");
                money -= money;
            } if (user.equals("remaining")){
                System.out.println("\nThe coffee machine has:\n" + water + "ml of water\n" + milk +"ml of milk\n"
                        + beans + "g of coffee beans\n" + paper_cup + " of paper cups\n" + money + "₴ of money");
            } if (user.equals("exit")) {
                break;
            }
        }

    }
}

