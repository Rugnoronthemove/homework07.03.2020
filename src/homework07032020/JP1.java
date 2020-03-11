package homework07032020;

//Write a Java program to reverse an array of integer values.

import java.util.ArrayList;
import java.util.Collections;

public class JP1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        System.out.println("Arraylist before reversing: ");
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println("Arraylist after reversing: ");
        System.out.println(numbers);
    }

}
