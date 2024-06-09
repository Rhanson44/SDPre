public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    for(int i = 0; i < 21; i++)
      if(i % 2 == 0) {
        System.out.println(i + " is even");
      }
      else
        System.out.println(i + " is odd");
  }
}