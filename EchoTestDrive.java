package HeadFirst;

public class EchoTestDrive {
    public static void main(String[]   args) {
        int[] a = {1,2,2,3,3,3,33,4};

      Echo  e1 = new Echo();
      //Echo e2 = new Echo(); // correct answer
        
      Echo e2 = e1;  // bonus "24" answer
      int x = 0;
      while (x < 4) {
        e1.hello();
        System.out.println(e1.count);
        e1.count = e1.count + 1;
        if (x == 3) {
          e2.count = e2.count + 1;
        }
        if (x > 0) {
          e2.count = e2.count + e1.count;
        }
        x = x + 1;
        System.out.println(e2.count);
    }
    System.out.println("final count : " + e2.count);
  }
}     