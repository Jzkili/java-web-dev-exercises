package exercises;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the rectangle's length? ");
        Double recLength = input.nextDouble();

        System.out.println("what is the rectangle's width? ");
        Double recWidth = input.nextDouble();

        Double recArea = recLength*recWidth;
        System.out.println("Rectangle's area is " + recArea);

    }
}
