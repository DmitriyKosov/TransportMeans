




public class KataMeans extends TransportMeans {

   public KataMeans() {
      flyBehavior = new NoFly();
      floatBehavior = new NoFloat();
   }

   public void move() {
      System.out.println("I'm rolling");
   }
}
