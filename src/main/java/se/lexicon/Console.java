package se.lexicon;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Console {

    private final static Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //Uses (.) instead of (,) for decimals

    public static double readAmount(){
        while(true){
            try{
                double amount = scanner.nextDouble();
                if(amount <= 0){
                    System.out.println("Negative numbers not allowed. Try again: ");
                }
                else
                    return amount;
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please try again: ");
                scanner.nextLine();
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
