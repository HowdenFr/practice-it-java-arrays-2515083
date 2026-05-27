import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    // double [] lotteryNums = new double[5];
    double[] lotteryNums = { 34, 52, 67, 12, 35 };
    System.out.println(lotteryNums[2]);
    lotteryNums[2] = 40;
    System.out.println(lotteryNums[2]);

    //for loops
    int [] arr = new int[] {92, 12,38,74};

    for (int i=0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println();

    //going backward
                                  //can change to bigger jump
    for (int i=arr.length-1; i>=0; i--){
      System.out.println(arr[i]);
    }
    System.out.println();

    //for each for loop
    for (int item: arr) {
      System.out.println(item);
    }
    System.out.println();

    //java streams
    Arrays.stream(arr).forEach(System.out::println);


  }
}