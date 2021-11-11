package Hangman;
import java.util.*;

public class hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Висилица!\nИгра скоро будет доступна...");
        //STAGE2
        System.out.print("Угадай слово: ");
        String answer = scan.nextLine();
        String word = "java";
        if (answer.equals(word)){
            System.out.println("Вы выжили!");
        }
        else{
            System.out.println("Вы проиграли!");
        }
    }
}
