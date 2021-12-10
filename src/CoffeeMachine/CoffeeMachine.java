package CoffeeMachine;
import java.util.*;

class Work {
    int water = 400;
    int milk = 540;
    int beans = 120;
    int paper_cup = 9;
    int money = 550;

    Scanner scan = new Scanner(System.in);
    public void buy_coffee(int water, int milk, int beans, int money){
        if(newWater()-water>=0 && newMilk()-milk>=0 && newPaper_cup()>0 && newBeans()-beans>=0){
            this.water -= water;
            this.milk -= milk;
            this.beans -= beans;
            this.paper_cup -=1;
            this.money += money;
            System.out.println("I have enough resources, making you a coffee!");
        }
        else{
            System.out.println("Sorry, not enough ingredients!");
        }
    }
    public void fill(){
        System.out.println("Write how many ml of water the coffee machine has:");
        this.water += scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        this.milk += scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        this.beans += scan.nextInt();
        System.out.println("Write how many cups the coffee machine has:");
        this.paper_cup += scan.nextInt();
    }
    public void remaining(){
        System.out.println("The coffee machine has:\n" +this.water + " of water\n" + this.milk + " of milk\n" +
                this.beans + " of coffee beans\n" + this.paper_cup + " of disposable cups\n" + this.money + " of money");
    }
     int newWater() {
        return water;
    }
     int newPaper_cup() {
        return paper_cup;
    }
     int newBeans() {
        return beans;
    }
    int newMilk() {
        return milk;
    }

    public void giveMeMoney(){
        System.out.println("I gave you " + money + "₴");
        money -= money;
    }
}
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Work machine = new Work();
        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String user = scan.nextLine();
            if (user.equals("buy")) {
                while (true) {
                    System.out.println("Choose your coffee: (1 - Espresso, 2 - Latte, 3 - Cappuccino, 4 - back to main menu>) ");
                    int coffee = scan.nextInt();
                    if (coffee == 1) {
                        machine.buy_coffee(250, 0, 16, 4);
                    }
                    if (coffee == 2) {
                        machine.buy_coffee(350, 75, 20, 7);
                    }
                    if (coffee == 3) {
                        machine.buy_coffee(200, 100, 12, 6);
                    }
                    if (coffee == 4) {
                        break;
                    }
                }
            }
            if (user.equals("fill")) {
                machine.fill();
            }
            if (user.equals("take")) {
                machine.giveMeMoney();
            }
            if (user.equals("remaining")) {
                machine.remaining();
            }
            if (user.equals("exit")) {
                break;

            }
        }
    }
}

