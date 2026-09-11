public class VendorInvoice implements Payable {
   private String vendorName;
   private String invioceNumber;
   private double amountDue;


   public VendorInvoice(String vendorName, String invioceNumber, double amountDue) {
      this.vendorName = vendorName;
      this.invioceNumber = invioceNumber;
      this.amountDue = amountDue;
   }



   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   public void setInvioceNumber(String invioceNumber) {
      this.invioceNumber = invioceNumber;
   }

   public void setAmountDue(double amountDue) {
      if (amountDue >= (double)0.0) {
         this.amountDue = amountDue;
      }

   }


   public String getVendorName() {
      return this.vendorName;
   }

   public String getInvioceNumber() {
      return this.invioceNumber;
   }

   public double getAmountDue() {
      return this.amountDue;
   }






   // Required by Payable
   public String getPayeeName() {
      return vendorName;
   }

   public double calculatePayment() {
      return amountDue;
   }

   public void print() {
      System.out.println("Vendor: " + vendorName + ", Invoice #: " + invioceNumber + ", Payment: " + calculatePayment());
   }
}
