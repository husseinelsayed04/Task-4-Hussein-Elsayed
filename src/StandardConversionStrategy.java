public class StandardConversionStrategy implements ConversionStrategy {
    @Override
    public double convert(
            double amount,
            double rate) {

        return amount * rate;
    }
}