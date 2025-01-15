package se.lexicon;

public class ConversionFactor {

    private final double factor;
    private final String destinationCurrencyIdentifier;
    private final String fromCurrencyIdentifier;

    public ConversionFactor(double factor, String currencyIdentifier, String fromCurrencyIdentifier){
        this.factor = factor;
        this.destinationCurrencyIdentifier = currencyIdentifier;
        this.fromCurrencyIdentifier = fromCurrencyIdentifier;
    }

    public double getFactor(){
        return factor;
    }

    public String getCurrencyIdentifier(){
        return destinationCurrencyIdentifier;
    }

    public String getFromCurrencyIdentifier(){
        return fromCurrencyIdentifier;
    }

}
