import java.util.ArrayList;

public class Q2Driver {
    public static void main(String[] args) {

        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer("Sara", "Ali", 50.00, 45.0));
        payables.add(new Freelancer("Omar", "Nabil", 60.00, 32.0));
        payables.add(new VendorInvoice("Acme Corp", "INV-001", 1200.00));
        payables.add(new VendorInvoice("Globex Ltd", "INV-002", 3400.50));

        double total = 0;

        for (Payable p : payables) {
            p.print();
            total = total + p.calculatePayment();
        }

        System.out.println();
        System.out.println("Total payout: " + total);
    }
}