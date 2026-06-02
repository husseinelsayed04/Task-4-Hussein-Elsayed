import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ConversionStrategy strategy =
                new StandardConversionStrategy();

        CurrencyConverter converter =
                new CurrencyConverter(strategy);

        while (true) {

            System.out.println("\n=== Currency Converter ===");
            System.out.println("1. Convert Currency");
            System.out.println("2. Show Supported Rates");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice;

            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid choice!");
                input.nextLine();
                continue;
            }

            switch (choice) {

                case 1:

                    try {
                        System.out.print("From Currency: ");
                        String from = input.next();

                        System.out.print("To Currency: ");
                        String to = input.next();

                        System.out.print("Amount: ");
                        double amount = input.nextDouble();

                        double result =
                                converter.convert(from, to, amount);

                        System.out.printf(
                                "%.2f %s = %.2f %s%n",
                                amount,
                                from.toUpperCase(),
                                result,
                                to.toUpperCase()
                        );

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Invalid Input");
                        input.nextLine();
                    }

                    break;

                case 2:
                    System.out.println("\nSupported currencies:");
                    System.out.println("USD ↔ EGP");
                    System.out.println("EUR ↔ EGP");
                    System.out.println("EGP ↔ USD");
                    System.out.println("EGP ↔ EUR");
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}