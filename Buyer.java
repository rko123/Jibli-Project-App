/**
 *
 * @author Mohamed
 */
public class Buyer extends User {
   private String prodcutDescr;
   private double price;
   private String location;
   private double profit;
   private String comments;

   public Buyer(String prodcutDescr, double price, String location, double profit, String comments, String userName, String passWord, String name, String email, String phoneNumber) {
      super(userName, passWord, name, email, phoneNumber);
      this.prodcutDescr = prodcutDescr;
      this.price = price;
      this.location = location;
      this.profit = profit;
      this.comments = comments;
   }

   public String getProdcutDescr() {
      return prodcutDescr;
   }

   public void setProdcutDescr(String prodcutDescr) {
      this.prodcutDescr = prodcutDescr;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public double getProfit() {
      return profit;
   }

   public void setProfit(double profit) {
      this.profit = profit;
   }

   public String getComments() {
      return comments;
   }

   public void setComments(String comments) {
      this.comments = comments;
   }
 
   @Override
   public String toString() {
      return "Buyer{" + "prodcutDescr=" + prodcutDescr + ", price=" + price + ", location=" + location + ", profit=" + profit + ", comments=" + comments + '}';
   }
   
   
}
