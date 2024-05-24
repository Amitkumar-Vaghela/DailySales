import java.util.Scanner;

public class SalesTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days to track sales: ");
        int numDays = scanner.nextInt();
        
        // Creating an array to store daily sales
        double[] dailySales = new double[numDays];
        
        // Getting daily sales data
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter sales for day " + (i + 1) + ": ");
            dailySales[i] = scanner.nextDouble();
        }
        
        // Displaying the total sales and average sales
        double totalSales = 0;
        for (double sales : dailySales) {
            totalSales += sales;
        }
        double averageSales = totalSales / numDays;
        
        System.out.println("Total sales for " + numDays + " days: $" + totalSales);
        System.out.println("Average daily sales: $" + averageSales);
        
        scanner.close();
    }
}
