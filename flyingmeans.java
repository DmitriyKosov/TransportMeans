



public class FlyingMeans extends TransportMeans {

   public FlyingMeans() {
      flyBehavior = new Fly();
      floatBehavior = new NoFloat();
   }
 
   public void move() {
      System.out.println("I'am flying");
   }
}
