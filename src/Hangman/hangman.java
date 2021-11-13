package Hangman;
import java.util.*;

public class hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Висилица!\nИгра скоро будет доступна...");

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
                someLetters.add(user);
                health--;
                if (variation.contains(user)) {
                    for (int i = 0; i < variation.length(); i++) {
                        if (symbol[i] == user.charAt(0)) {
                            secret.setCharAt(i, user.charAt(0));
                        }
                    }
                    if (secret.toString().equals(variation)) {
                        System.out.println(variation+"\nПоздравляю с победой!\nУвидимся на следующем этапе!");
                        break;
                    }
                } else {
                    System.out.println("Этой буквы нет в слове!");
                }
            } else {
                System.out.println("Вы проиграли!");
                break;
            }
        }
    }
}


