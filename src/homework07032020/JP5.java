package homework07032020;

/*
Write a Java program to test an array list is empty or not.
 */

import java.util.ArrayList;

public class JP5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(12);
        numbers.add(24);
        System.out.println(numbers.isEmpty());
    }

}
