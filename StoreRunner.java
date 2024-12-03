import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {


   Plant p1 = new Plant();
   Plant p2 = new Plant(20.0, true, true);

   Flower f1 = new Flower();
   Flower f2 = new Flower(45.0, true, false, "Purple");

   Cactus c1 = new Cactus();
   Cactus c2 = new Cactus(30.0, false, true, "Medium");

   System.out.println(p1.toString());
   System.out.println(p2.toString());
   System.out.println(f1.toString());
   System.out.println(f2.toString());
   System.out.println(c1.toString());
   System.out.println(c2.toString());

  }
}