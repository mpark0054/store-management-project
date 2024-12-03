public class Flower extends Plant {

  private String flowerColor;

  public Flower(){
    super();
    this.flowerColor = "Unkown";
  }

  public Flower(double price, boolean hasDirt, boolean hasPot, String flowerColor){
    super(price, hasDirt, hasPot);
    this.flowerColor = flowerColor;
  }

  public String getFlowerColor(){
    return flowerColor;
  }

  public void setFlowerColor(String flowerColor){
    this.flowerColor =flowerColor;
  }
  
public String toString() {
        return super.toString() + 
        "\nColor: " + flowerColor;
}
}
  