package StockDemo;
import Stock.Stock;
import java.util.Scanner;

public class Demo {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompting the user for stock symbol and name
	        System.out.print("Enter the stock symbol: ");
	        String symbol = scanner.nextLine();

	        System.out.print("Enter the stock name: ");
	        String name = scanner.nextLine();

	        // Creating a Stock object with user input
	        Stock stock = new Stock(symbol, name);

	        // Prompting the user for previous closing price and current price
	        System.out.print("Enter the previous closing price: ");
	        double previousClosingPrice = scanner.nextDouble();

	        System.out.print("Enter the current price: ");
	        double currentPrice = scanner.nextDouble();

	        // Setting the prices in the Stock object
	        stock.setPreviousClosingPrice(previousClosingPrice);
	        stock.setCurrentPrice(currentPrice);

	        double changePercent = stock.getChangePercent();

	        // Displaying the percentage change formatted to 2 decimal places
	        System.out.printf("The price change percentage is: %.2f%%\n", changePercent);

	    }
}
