package se.lexicon;


public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        var sekToUSD = new ConversionFactor(0.090d, "USD", "SEK");
        var usdToSEK = new ConversionFactor(11.17d, "SEK", "USD");
        var sekToEURO = new ConversionFactor(0.087d, "Euro", "SEK");
        var euroToSEK = new ConversionFactor(11.50d, "SEK", "Euro");



        while(isRunning){
        printOptions();

            switch(Console.readOption()){
                case 0:
                    isRunning = false;
                    System.out.println("Exiting..");
                    break;
                case 1:
                    CurrencyConverter.convertCurrency(sekToUSD);
                    continue;
                case 2:
                    CurrencyConverter.convertCurrency(usdToSEK);
                    continue;
                case 3:
                    CurrencyConverter.convertCurrency(sekToEURO);
                    continue;
                case 4:
                    CurrencyConverter.convertCurrency(euroToSEK);
                    continue;
                default:
                    System.out.println("Try again..");

            }
            /*System.out.println("Do you wish to continue Y/n?");*/


        }
    }

    public static void printOptions(){
        System.out.println("""
                Currency Converter App:\
                
                1. Convert SEK to USD\
                
                2. Convert USD to SEK\
                
                3. Convert SEK to Euro\
                
                4. Convert Euro to SEK\
                
                0. Exit\
                
                Enter your choice:\s""");
    }
}