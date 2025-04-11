import java.util.Scanner;
class InvoiceItem {
    String id;
    String description;
    int quantity;
    double unitPrice;  
    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public double getTotalPrice() {
        return quantity * unitPrice;
    }   
    public double applyDiscount(double discountPercent) {
        return getTotalPrice() - (getTotalPrice() * discountPercent / 100);
    }  
    public double applyTax(double taxPercent) {
        return applyDiscount(0) + (applyDiscount(0) * taxPercent / 100);
    }  
    public void displayInvoice(double discountPercent, double taxPercent) {
        System.out.println("Invoice Details:");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price (Before Discount & Tax): " + getTotalPrice());
        System.out.println("Total Price After Discount: " + applyDiscount(discountPercent));
        System.out.println("Final Price After Tax: " + applyTax(taxPercent));
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter Item ID: ");
        String id = scanner.nextLine();        
        System.out.print("Enter Item Description: ");
        String description = scanner.nextLine();        
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();        
        System.out.print("Enter Unit Price: ");
        double unitPrice = scanner.nextDouble();        
        System.out.print("Enter Discount Percentage: ");
        double discountPercent = scanner.nextDouble();        
        System.out.print("Enter Tax Percentage: ");
        double taxPercent = scanner.nextDouble();        
        InvoiceItem item = new InvoiceItem(id, description, quantity, unitPrice);
        item.displayInvoice(discountPercent, taxPercent);        
        scanner.close();
    }
}
