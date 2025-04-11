public class StockPrices {
    public static void main(String[] args) {
        // 2D array to store stock prices at different times
        // Format: {time, stock value}
        String[][] stockData = {
            {"09:00 AM", "$100"},
            {"10:00 AM", "$105"},
            {"11:00 AM", "$110"},
            {"12:00 PM", "$102"},
            {"01:00 PM", "$108"},
        };
        
        // Printing the stock prices at respective times
        System.out.println("Stock Prices at Different Time Intervals:");
        for (String[] stock : stockData) {
            System.out.println("Time: " + stock[0] + " - Stock Value: " + stock[1]);
        }
    }
}
