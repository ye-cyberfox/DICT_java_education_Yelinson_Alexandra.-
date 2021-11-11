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
        System.out.println("Я могу угадать твой возраст.\nТолько напиши остаток от деления твоего возраста на 3, 5 и 7");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3*70+remainder5*21+remainder7*15)%105;
        System.out.println("Я думаю, что тебе "+age+":) Круто быть умным, как я!");
        //STAGE4
        System.out.println("Ещё я хорошо считаю. Введи число и я легко посчитаю до него.");
        int number = scanner.nextInt();
        for (int i=0; i<number+1; i++){
            System.out.println(i+"!");
            if (i==number){
            System.out.println("Готово!");}
        }
        //STAGE5
        System.out.println("Давай теперь проверим твою внимательность. Я задам вопрос, а ты выбери правильный ответ (цифру).\nВопроc: как меня зовут?");
        System.out.println("1.Глеб\n2.Чонгук\n3.Cерафим\n4.Алекс");
        while (true) {
        int user_answer = scanner.nextInt();
        if(user_answer==2){
            System.out.println("Верно ты запомнил! Я тоже помню твое имя, "+user_name+"!\nЕще обязательно увидимся! Хорошего тебе дня:)");
            break;}
        else {
            System.out.println("Неет:( Дам тебе еще попытку!");}
            }
        }
    }

