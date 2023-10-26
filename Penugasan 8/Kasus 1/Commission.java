public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        totalSales = 0.0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        // Calculate the pay for hours worked using the parent's pay method
        double hourlyPay = super.pay();
        
        // Calculate the pay for sales using the commission rate and total sales
        double commissionPay = totalSales * commissionRate;

        // Reset the total sales
        totalSales = 0.0;

        // Return the combined pay
        return hourlyPay + commissionPay;
    }

    @Override
    public String toString() {
        // Call the parent's toString method
        String result = super.toString();

        // Add information about total sales and commission rate
        result += "\nTotal Sales: " + totalSales;
        result += "\nCommission Rate: " + commissionRate;

        return result;
    }
}
