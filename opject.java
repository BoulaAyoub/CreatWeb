public class Maths {
    public int sum(int a, int b) {
      int k = a + b;
      return k;
    }
    
    public static void main(String [] args) {
      Maths m = new Maths();
      
      System.out.println(m.sum(10, 20));
      // prints - sum is 30
    }
  }