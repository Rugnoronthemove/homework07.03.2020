package homework07032020;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */

import java.util.ArrayList;

public class JP4 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        System.out.println(numbers.get(3));

    }
}
