import java.util.Scanner;

class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) throws IllegalArgumentException {
        if (celsius < -273.15)
            throw new IllegalArgumentException("Temperature below absolute zero.");
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) throws IllegalArgumentException {
        if (fahrenheit < -459.67)
            throw new IllegalArgumentException("Temperature below absolute zero.");
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class exp14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the scale (Celsius or Fahrenheit): ");
        String scale = scanner.next();

        try {
            if (scale.equalsIgnoreCase("Celsius")) {
                double fahrenheit = TemperatureConverter.celsiusToFahrenheit(temperature);
                System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit);
            } else if (scale.equalsIgnoreCase("Fahrenheit")) {
                double celsius = TemperatureConverter.fahrenheitToCelsius(temperature);
                System.out.println("Equivalent temperature in Celsius: " + celsius);
            } else {
                System.out.println("Invalid scale. Please enter either Celsius or Fahrenheit.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
