package exercises;
import java.util.Scanner;

public class Numeric {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("How many miles? ");
      Double miles = input.nextDouble();

      System.out.println("How many gallons ?");
      Double gallons = input.nextDouble();

      Double result = miles/gallons;

      System.out.println("You are running on " + result + " mpg.");

    }
}
