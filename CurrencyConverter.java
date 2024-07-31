import java.util.Scanner;

public class CurrencyConverter{
    public static void main(String[] args) {

       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter!");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.println("5. Dirham to Rupee");
        System.out.println("6. Rupee to Dirham");
        System.out.print("Enter your choice (1 or 2 or 3 or 4 or 5 or 6): ");
        int choice = scanner.nextInt();

       
        if (choice == 1) {
            System.out.print("Enter the amount in USD: ");
            double USD = scanner.nextDouble();
            double Rupee = usdToRupee(USD);
            System.out.println("Converted amount in Rupee: " + Rupee);
        } else if (choice == 2) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double USD = RupeeToUsd(Rupee);
            System.out.println("Converted amount in USD: " +USD);
        }
            else if (choice == 3) {
                System.out.print("Enter the amount in EURO: ");
                double EURO= scanner.nextDouble();
                double Rupee = euroToRupee(EURO);
                System.out.println("Converted amount in Rupee: " +Rupee);
        } 
        else if (choice == 4) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double EURO = RupeeToEuro(Rupee);
            System.out.println("Converted amount in EURO: " +EURO);
        }
        else if (choice == 5) {
            System.out.print("Enter the amount in DIRHAM: ");
            double DIRHAM = scanner.nextDouble();
            double Rupee = DirhamToRupee(DIRHAM);
            System.out.println("Converted amount in Rupee: " +Rupee);
        }
        else if (choice == 6) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double DIRHAM = RupeeToDirham(Rupee);
            System.out.println("Converted amount in DIRHAM: " +DIRHAM);
        }
       
        else {
            System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4 or 5 or 6.");
        }

        scanner.close();
    }

    public static double usdToRupee(double USD) {
        return USD * 83.74;  // Date: 07/08/24
    }
    public static double RupeeToUsd(double Rupee) {
        return Rupee * 0.0112;   // Date 07/08/24
    }
    public static double euroToRupee(double EURO) {
        return EURO *90.66;   //Date: 07/08/24
    }
    public static double RupeeToEuro(double Rupee) {
        return Rupee *0.011;   //Date: 07/08/24
    }
    public static double DirhamToRupee(double DIRHAM) {
        return DIRHAM * 22.80;  // Date: 07/08/24
    }
    public static double RupeeToDirham(double Rupee) {
        return Rupee * 0.043867 ;  // Date: 07/08/24
    }

   
}