package se.lexicon;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Console {

    private final static Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //Uses (.) instead of (,)

    public static double readAmount(){
        while(true){
            try{
                if(scanner.nextDouble() <= 0)
                    System.out.println("Negative numbers not allowed. Try again: ");
                return scanner.nextDouble();
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please try again: ");
                scanner.next();
            }
        }
    }

    public static int readOption(){
        while(true){
            try{
                return scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please try again: ");
                scanner.next();
            }
        }
    }



}
