package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        //STAGE1
        String bot_name = "Чонгук";
        int birth_year = 2021;
        System.out.println("Привет! Меня зовут "+bot_name+".\n"+"Я был создан в "+ birth_year+".");
        //STAGE2
        System.out.println("Давай познакомимся. Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String user_name = scanner.next();
        System.out.println("Я рад знакомству, "+ user_name+"!");


    }
}
