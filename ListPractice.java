import java.util.ArrayList;
import java.util.HashMap;


// ListPractice.java
// Dennis Mohle
// 8/29/23


// Class coding for ArrayList


public class ListPractice {
    public static void main(String[] args) {
        System.out.println("\n\n Array List Practice\n\n");

        ArrayList<String> myFriendsList = new ArrayList<>();
        // Add five friends to my list
        myFriendsList.add("John");
        myFriendsList.add("Chris");
        myFriendsList.add("Eric");
        myFriendsList.add("Luke");
        myFriendsList.add("Mitch");

        System.out.println("\n my fifth friend is " + myFriendsList.get(4));

        System.out.println("\n the size (number of elements) " + myFriendsList.size());

        // Set change the data in an element
        myFriendsList.set(0,"Dennis");
        System.out.println("\n my first friend is n (expect Dennis) " + myFriendsList.get(0));

        // Remove the third element
        myFriendsList.remove(2);

        // output the list without a for loop
        System.out.println(myFriendsList);

        int myFriendNumber = 1;

        // output the list with a for/each loop
        for (String s : myFriendsList) {
            System.out.println(" friend " + myFriendNumber + " is " + s);
            myFriendNumber++;
        }

        // add list elements with a for loop
        for (int i = 0; i < 10; i++) {
            // use .add()
            myFriendsList.add(i+4, "new friend");
            System.out.println(" new friend added to list");
        }
        // output the list without a for loop
        System.out.println(myFriendsList);

        // output the list with a for loop
        for (int i = 0; i < myFriendsList.size(); i++) {
            System.out.println(" friend " + myFriendNumber + " is " + myFriendsList.get(i));
            myFriendNumber++;
        }

        // write a hash map
        HashMap<String, Integer> charsInString = new HashMap<>();

        charsInString.put("a", 3);
        charsInString.put("b", 8);
        charsInString.put("c", 4);

        // Output the hash map...
        System.out.println("\n The hashmap is: " + charsInString);

        // increment a key
        System.out.println(charsInString.toString());
        System.out.println(charsInString.get("a"));
        int newValue  = charsInString.get("a");
        // increment the value
        newValue++;
        // put the value
        charsInString.put("a",newValue);
        System.out.println();
        System.out.println("\n The hashmap is: " + charsInString);








    }


}
