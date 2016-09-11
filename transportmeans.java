




public abstract class TransportMeans {

   FlyBehavior flyBehavior;
   FloatBehavior floatBehavior;

   public TransportMeans() {
   }
   
   public abstract void move();

   public void performFly() {
      flyBehavior.fly();
   }

   public void performFloat() {
      floatBehavior.float();
   }

   public void start() {
   }

   public void stop() {
   }
}
