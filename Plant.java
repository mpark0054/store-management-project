public class Plant {
  // Instance Variables
  private double price;
  private boolean hasDirt;
  private boolean hasPot;
  
  // Constructor Methods
  public Plant() {
    this.price = 0.0;
    this.hasDirt = false;
    this.hasPot= false;
  }
  // Parameterize
   public Plant(double price, boolean hasDirt, boolean hasPot) {
    this.price = price;
    this.hasDirt = hasDirt;
    this.hasPot = hasPot;
  }
  // Acessor and Mutator Methods
  public double getPrice(){
    return price;
  }
  
   public boolean getHasPot(){
    return hasPot;
  }
  
   public boolean getHasDirt(){
    return hasDirt;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
   public void setHasDirt(boolean hasDirt) {
    this.hasDirt = hasDirt;
  }

   public void setHasPot(boolean hasPot) {
    this.hasPot = hasPot;
  }
  
  // toString Method Override
  public String toString() {
    
    return "\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ " +
           "\nPlant: " +
           "\nPrice: $" + getPrice() + 
           "\nPot Included: " + (getHasPot() ? "Yes" : "No") + 
           "\nDirt Included: " + (getHasDirt() ? "Yes" : "No") ;
         
      }
}
  
