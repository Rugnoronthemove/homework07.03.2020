package homework07032020;

/*Write a Java program to create a new array list,
 add some colours (string) and printout the collection.
*/

import java.util.ArrayList;

public class JP2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList <>();
        list.add("red");
        list.add("blue");
        list.add("yellow");
        list.add("green");
        list.add("black");

        System.out.println("Arraylist before adding new string: " + list);
        list.add("grey");
        list.add("pink");
        System.out.println("Arraylist after adding new string: "+ list);
    }

}
