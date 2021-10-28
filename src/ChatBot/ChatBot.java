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
        String user_name = scanner.nextLine();
        System.out.println("Я рад знакомству, "+ user_name+"!");
        //STAGE3
        System.out.println("Я могу угадать сколько тебе лет.\nТолько напиши остаток от деления твоего возраста на 3, 5 и 7");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3*70+remainder5*21+remainder7*15)%105;
        System.out.println("Я думаю, что тебе "+age+" лет :) Круто быть умным, как я!");
        //STAGE4
        System.out.println("Ещё я хорошо считаю. Введи число и я легко посчитаю до него.");
        int number = scanner.nextInt();
        for (int i=0; i<number+1; i++){
            System.out.println(i+"!");
        }


    }
}
