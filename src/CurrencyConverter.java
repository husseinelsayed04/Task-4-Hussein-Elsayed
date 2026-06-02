import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {

    private ConversionStrategy strategy;
    private Map<String, Double> rates;

    public CurrencyConverter(
            ConversionStrategy strategy) {

        this.strategy = strategy;

        rates = new HashMap<>();

        rates.put("USD_EGP", 50.0);
        rates.put("EUR_EGP", 57.0);
        rates.put("EGP_USD", 0.02);
        rates.put("EGP_EUR", 0.0175);
    }

    public double convert(
            String from,
            String to,
            double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Amount must be positive");
        }

        String key = from.toUpperCase()
                + "_"
                + to.toUpperCase();

        if (!rates.containsKey(key)) {

            throw new IllegalArgumentException(
                    "Currency conversion not supported");
        }

        double rate = rates.get(key);

        return strategy.convert(
                amount,
                rate);
    }
}