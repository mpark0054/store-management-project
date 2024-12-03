public class Cactus extends Plant {

  private String cactusSize;

  public Cactus(){
    super();
    this.cactusSize = "Small";
  }

  public Cactus(double price, boolean hasDirt, boolean hasPot, String cactusSize){
    super(price, hasDirt, hasPot);
    this.cactusSize = cactusSize;
  }

  public String getCactusColor(){
    return cactusSize;
  }

  public void setCactusColor(String cactusSize){
    this.cactusSize =cactusSize;
  }
  
public String toString() {
        return super.toString() + 
        "\nSize: " + cactusSize;
}
}