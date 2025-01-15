package se.lexicon;

import java.util.Locale;
import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //Uses (.) instead of (,)

    public static double readAmount(){
        return scanner.nextDouble();
    }

    public static int readOption(){
        return scanner.nextInt();
    }



}
