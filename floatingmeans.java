




public class FloatingMeans extends TransportMeans {
 
   public FloatingMeans() {
      flyBehavior = new NoFly();
      floatBehavior = new Float();
   }

   public void move() {
      System.out.println("I'm floating");
   }
}
