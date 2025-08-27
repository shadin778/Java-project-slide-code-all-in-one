public class MyClassDemo {
   public static void main(String[] args) {
      MyClass myObject1 = new MyClass(5);
      MyClass myObject2 = new MyClass(7);

      myObject1.printX(); // Output: Value of x: 5
     // myObject1.incrementCount();
      //MyClass.incrementCount();
      myObject1.printCount(); // Output: Value of count: 2
      myObject2.printCount(); // Output: Value of count: 2
      myObject2.printX(); // Output: Value of x: 7
      myObject1.setX(14);
      myObject1.incrementCount();
      myObject1.printX(); // Output: Value of x: 14
      myObject1.printCount(); // Output: Value of count: 3
      myObject2.printCount(); // Output: Value of count: 3
   }
}
