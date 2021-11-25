package Hangman;
import java.util.*;

public class hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Висилица!\nИгра скоро будет доступна...");
        while (true){
            System.out.print("Нажми \"играть\" для начала игры, \"выход\" для выхода: ");
            String user = scan.nextLine();
            if (user.equals("играть")){
                game();
            }
            if (user.equals("выход")){
                break;
            }
        }
    }
    public static void game (){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Висилица!");

        ArrayList<String> someLetters = new ArrayList<>();
        String[] words = {"java", "python", "javascript", "kotlin"};
        String variation = words[random.nextInt(words.length)];
        StringBuffer secret = new StringBuffer(variation);
        char[] symbol = variation.toCharArray();
        for (int i = 0; i < symbol.length; i++) {
            secret.setCharAt(i,'-');
        }
        short health = 8;
        boolean True = true;
        while (True) {
            if (health > 0) {
                System.out.print(secret + "\nВведите букву:");
                String user = scan.nextLine();
                if (user.length()>1){
                    System.out.println("Вы можете ввести только одну букву");
                    continue;}
                if(!user.matches("[a-z]")) {
                    System.out.println("Введите строчную английскую букву, пожалуйста");
                    continue;
                }
                if (variation.contains(user)) {
                    if (someLetters.contains(user)) {
                        System.out.println("Эта буква уже угадана");
                    } else {
                        for (int i = 0; i < variation.length(); i++) {
                            if (symbol[i] == user.charAt(0)) {
                                secret.setCharAt(i, user.charAt(0));
                            }
                        }
                    }
                    if (secret.toString().equals(variation)) {
                        System.out.println(variation+"\nПоздравляю с победой!!!");
                        break;
                    }
                } else {
                    System.out.println("Этой буквы нет в слове!");
                    health--;
                }
                someLetters.add(user);
            } else {
                System.out.println("Вы проиграли!");
                break;
            }
        }
    }
}


