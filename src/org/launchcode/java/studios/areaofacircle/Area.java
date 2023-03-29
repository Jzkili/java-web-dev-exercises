package org.launchcode.java.studios.areaofacircle;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius ");

        Double radius = input.nextDouble();


        Double A = Circle.getArea(radius);
        System.out.println("Area equals " + A);

    }

}
