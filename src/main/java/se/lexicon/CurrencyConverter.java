package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrencyConverter {

    public static void convertCurrency(ConversionFactor conversionFactor){
        String currentDateNTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println(currentDateNTime);
        System.out.println("Converting " + conversionFactor.getFromCurrencyIdentifier() + " to " + conversionFactor.getCurrencyIdentifier());
        System.out.printf("Please enter the amount (%s) : ", conversionFactor.getFromCurrencyIdentifier());
        double amount = Console.readAmount();
        System.out.println(amount * conversionFactor.getFactor() + " " + conversionFactor.getCurrencyIdentifier() + "\n");

    }
}
