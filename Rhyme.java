package javaActivities;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rhyme {

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Enter first word: ");
        String word1 = userInput.nextLine();
        System.out.printf("Enter second word: ");
        String word2 = userInput.nextLine();
        boolean check = matches(word2, word1);
        if (check) {
            System.out.println(word2 + " rhymes with " + word1);
        } else {
            System.out.printf("I'm not sure! Sorry!");
        }
    }
    
    private static boolean matches(String word2, String word1){
        int word1Length = word1.length() - 2;
        String sub = word1.substring(word1Length);
        Pattern pattern = Pattern.compile("[a-zA-Z]{1,2}" + sub + "");
        Matcher match = pattern.matcher(word2);
        if (match.matches()) {
            return true;
        }
        return false;
    }
}
