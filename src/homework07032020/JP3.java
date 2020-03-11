package homework07032020;

/*
Write a Java program to iterate through all elements in a array list.
 */


import java.util.ArrayList;

public class JP3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(9);
        numbers.add(22);
        numbers.add(28);
        numbers.add(29);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
