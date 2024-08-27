package Stock;

public class Stock {

	 private String symbol;
	    private String name;
	    private double previousClosingPrice;
	    private double currentPrice;

	    // Constructor
	    public Stock(String symbol, String name) {
	        this.symbol = symbol;
	        this.name = name;
	    }

	    // Getter and setter for symbol
	    public String getSymbol() {
	        return symbol;
	    }

	    public void setSymbol(String symbol) {
	        this.symbol = symbol;
	    }

	    // Getter and setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and setter for previousClosingPrice
	    public double getPreviousClosingPrice() {
	        return previousClosingPrice;
	    }

	    public void setPreviousClosingPrice(double previousClosingPrice) {
	        this.previousClosingPrice = previousClosingPrice;
	    }

	    // Getter and setter for currentPrice
	    public double getCurrentPrice() {
	        return currentPrice;
	    }

	    public void setCurrentPrice(double currentPrice) {
	        this.currentPrice = currentPrice;
	    }

	    // Method to calculate percentage change
	    public double getChangePercent() {
	        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	    }
	}
