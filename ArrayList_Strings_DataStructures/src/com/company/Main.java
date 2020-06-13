package com.company;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.javafx.collections.ArrayListenerHelper;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        // write your code here
       /* String example = "In a dishwasher far far away";

        String replaced = example.replace("dishwasher", "galaxy");

        // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
        // Please fix it for me!
        // Expected output: In a galaxy far far away

        System.out.println(replaced);



        String url = "https//www.reddit.com/r/nevertellmethebots";
        String replacedURL = url.replace("bots", "odds");
        String newURL = replacedURL.replace("ps", "ps:");

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(newURL);



        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String newQuote = quote.replace("t y", "t always takes longer than y");
        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instea of just redefining the string)

        System.out.println(newQuote);
        System.out.println(quote.indexOf(" ",19));


        String substringQuote = quote.substring(20, 20);
        substringQuote = " always takes longer than";
        String first = quote.substring(0, 20);
        String second = quote.substring(20, quote.length());
        String newest = first + substringQuote + second;
        System.out.println(newest);




        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        if (todoText.startsWith(" ")) {
            System.out.println("My todo:");
        }
        System.out.println(todoText + " - Download games");
        if (todoText.endsWith("milk\n")){
            System.out.println("    - Diablo");
        }



        //String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
        StringBuilder sb=new StringBuilder(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI");
        sb.reverse();
        System.out.println(sb);


        String str = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String reverse = "";
        for(int i = str. length() - 1; i >= 0; i--) {
            reverse = reverse + str. charAt(i); }

        System.out.println("Reversed string is:");
        System.out.println(reverse);





        DATA STRUCTURES
        We are going to play with lists. Feel free to use the built-in methods where possible.

                Create an empty list which will contain names (strings)
        Print out the number of elements in the list
        Add William to the list
        Print out whether the list is empty or not
        Add John to the list
        Add Amanda to the list
        Print out the number of elements in the list
        Print out the 3rd element
        Iterate through the list and print out each name
                William
        John
                Amanda
        Iterate through the list and print
        1. William
        2. John
        3. Amanda
        Remove the 2nd element
        Iterate through the list in a reversed order and print out each name
                Amanda
        William
        Remove all elements



        ArrayList<String> namesList = new ArrayList<>();
        System.out.println(namesList.size());

        namesList.add("William");
        if (namesList.isEmpty()){
            System.out.println("namesList is empty");
        } else {
            System.out.println("namesList is NOT empty");
        }
        namesList.add("John");
        namesList.add("Amanda");
        System.out.println(namesList.size());
        System.out.println(namesList.get(2));
        for (int i = 0; i < namesList.size() ; i++) {
            System.out.println(namesList.get(i));
        }
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println((i) + 1 + ". " + namesList.get(i));

        }

        namesList.remove(1);

        for (int i = namesList.size() - 1; i >= 0; i--) {
            System.out.println(namesList.get(i));
        }

        namesList.clear();
        if (namesList.isEmpty()){
            System.out.println("namesList is empty");
        } else {
            System.out.println("namesList is NOT empty");
        }




        We are going to play with maps. Feel free to use the built-in methods where possible.

                Create an empty map where the keys are integers and the values are characters

        Print out whether the map is empty or not

        Add the following key-value pairs to the map

        Key	Value
        97	a
        98	b
        99	c
        65	A
        66	B
        67	C
        Print all the keys

        Print all the values

        Add value D with the key 68

        Print how many key-value pairs are in the map

        Print the value that is associated with key 99

        Remove the key-value pair where with key 97

        Print whether there is an associated value with key 100 or not

        Remove all the key-value pairs

        HashMap<Integer, String> mapIntroduction1 = new HashMap<>();
        if (mapIntroduction1.isEmpty()){
            System.out.println("mapIntroduction1 is empty");
        } else {
            System.out.println("mapIntroduction1 is NOT empty");
        }
        mapIntroduction1.put(97, "a");
        mapIntroduction1.put(98, "b");
        mapIntroduction1.put(99, "c");
        mapIntroduction1.put(65, "A");
        mapIntroduction1.put(66, "B");
        mapIntroduction1.put(67, "C");

        for (Integer i : mapIntroduction1.keySet()){
            System.out.println(i);
        }

        for (String i : mapIntroduction1.values()) {
            System.out.println(i);
        }
        mapIntroduction1.put(68, "D");

        System.out.println(mapIntroduction1.size());

        System.out.println(mapIntroduction1.get(99));

        mapIntroduction1.remove(97);

        if (mapIntroduction1.containsKey(100)){
            System.out.println("there is an associated value with key 100");
        } else {
            System.out.println("there is NOT an associated value with key 100 ");
        }

        mapIntroduction1.clear();
        if (mapIntroduction1.isEmpty()){
            System.out.println("mapIntroduction1 is empty");
        } else {
            System.out.println("mapIntroduction1 is NOT empty");
        }



        Create a list ('List A') which contains the following values
                Apple, Avocado, Blueberries, Durian, Lychee
        Create a new list ('List B') with the values of List A
        Print out whether List A contains Durian or not
        Remove Durian from List B
        Add Kiwifruit to List A after the 4th element
        Compare the size of List A and List B
        Get the index of Avocado from List A
        Get the index of Durian from List B
        Add Passion Fruit and Pomelo to List B in a single statement
        Print out the 3rd element from List A


        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<>();
        listB.addAll(listA);

        for (int i = 0; i < listB.size() ; i++) {
            System.out.println(listB.get(i));
        }

        if (listA.contains("Durian")) {
            System.out.println("listA contains Durian");
        } else {
            System.out.println("listA NOT contains Durian");
        }

        listB.remove("Durian");

        listA.add(4, "Kiwifruit");

        if (listA.containsAll(listB)) {
            System.out.println("listA contains all elements like listB");
        } else {
            System.out.println("listA does NOT contain all elements like listB");
        }

        if (listA.size() == listB.size()) {
            System.out.println("listA and listB are equal");
        } if (listA.size() > listB.size()) {
            System.out.println("listA is bigger");
        } if (listB.size() > listA.size()) {
            System.out.println("listB is bigger");
        }

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));


        listB.add("Passion Fruit and Pomelo");
        better solution: ArrayList<String> listC = new ArrayList<String>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

        System.out.println(listA.get(2));

        for (int i = 0; i < listB.size(); i++) {
            System.out.println(listB.get(i));
        }



        Create a map where the keys are strings and the values are strings with the following initial values

        Key	Value
        978-1-60309-452-8	A Letter to Jo
        978-1-60309-459-7	Lupus
        978-1-60309-444-3	Red Panda and Moon Bear
        978-1-60309-461-0	The Lab
        Print all the key-value pairs in the following format

        A Letter to Jo (ISBN: 978-1-60309-452-8)
        Lupus (ISBN: 978-1-60309-459-7)
        Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        The Lab (ISBN: 978-1-60309-461-0)
        Remove the key-value pair with key 978-1-60309-444-3

        Remove the key-value pair with value The Lab

        Add the following key-value pairs to the map

        Key	Value
        978-1-60309-450-4	They Called Us Enemy
        978-1-60309-453-5	Why Did We Trust Him?
                Print whether there is an associated value with key 478-0-61159-424-8 or not

        Print the value associated with key 978-1-60309-453-5

        HashMap<String, String> mapIntro2 = new HashMap<>();
        mapIntro2.put("978-1-60309-452-8", "A Letter to Jo");
        mapIntro2.put("978-1-60309-459-7", "Lupus");
        mapIntro2.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        mapIntro2.put("978-1-60309-461-0", "The Lab");

        for (String i : mapIntro2.values()) {
            for (String j : mapIntro2.keySet())
            System.out.println((i) + " (ISBN:" + (j) + ")");

        }

        for (String i : mapIntro2.values()) {
            System.out.println((i));
            for (String j : mapIntro2.keySet()) {
                System.out.println(" (ISBN: " + (j) + ")");
            }
        }



        We are going to represent our expenses in a list containing integers.

        Create a list with the following items.
        500, 1000, 1250, 175, 800 and 120
        Create an application which solves the following problems.
        How much did we spend?
                Which was our greatest expense?
        Which was our cheapest spending?
                What was the average amount of our spendings?

        ArrayList<Integer> personalFinance = new ArrayList<>();
        personalFinance.add(500);
        personalFinance.add(1000);
        personalFinance.add(1250);
        personalFinance.add(175);
        personalFinance.add(800);
        personalFinance.add(120);

            double sum = 0;
            for (int i = 0; i < personalFinance.size(); i++)
                sum += personalFinance.get(i);
        System.out.println(sum);

        Integer greatestExpense = Collections.max(personalFinance);
        System.out.println(greatestExpense);

        Integer cheapestExpense = Collections.min(personalFinance);
        System.out.println(cheapestExpense);

        System.out.println(sum/personalFinance.size());




        We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.

        Create a map with the following key-value pairs.

                Name (key)	Phone number (value)
                William A. Lathan	405-709-1865
        John K. Miller	402-247-8568
        Hortensia E. Foster	606-481-6467
        Amanda D. Newland	319-243-5613
        Brooke P. Askew	307-687-2982
        Create an application which solves the following problems.

        What is John K. Miller's phone number?
        Whose phone number is 307-687-2982?
                Do we know Chris E. Myers' phone number?

        Map<String, String> telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(telephoneBook.get("John K. Miller"));

        for (String i : telephoneBook.keySet()) {
            if (telephoneBook.get(i).equals("307-687-2982")) {
                System.out.println(i);
            }
        }

        if (telephoneBook.containsKey("Chris E. Myers")){
            System.out.println("We know Chris' number");
        } else {
            System.out.println("We do NOT know Chris' number");
        }



        We are going to represent a shopping list in a list containing strings.

                Create a list with the following items.
        Eggs, milk, fish, apples, bread and chicken
        Create an application which solves the following problems.
        Do we have milk on the list?
                Do we have bananas on the list?

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");

        if (shoppingList.contains("milk")){
            System.out.println("Shopping List contains milk");
        } else {
            System.out.println("Shopping List does NOT contain milk");
        }

        if (shoppingList.contains("bananas")){
            System.out.println("Shopping List contains bananas");
        } else {
            System.out.println("Shopping List does NOT contain bananas");
        }


        We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.

        Create a map with the following key-value pairs.

                Product name (key)	Price (value)
        Eggs	200
        Milk	200
        Fish	400
        Apples	150
        Bread	50
        Chicken	550
        Create an application which solves the following problems.

        How much is the fish?
                What is the most expensive product?
                What is the average price?
        How many products' price is below 300?
        Is there anything we can buy for exactly 125?
                What is the cheapest product?
        */

        HashMap<String, Integer> productDatabase = new HashMap<>();
        productDatabase.put("Eggs", 200);
        productDatabase.put("Milk", 200);
        productDatabase.put("Fish", 400);
        productDatabase.put("Apples", 150);
        productDatabase.put("Bread", 50);
        productDatabase.put("Chicken", 550);

        System.out.println(productDatabase.get("Fish"));

        int mostExpensiveProduct = (Collections.max(productDatabase.values()));  // This will return max value in the Hashmap
        System.out.println(mostExpensiveProduct);

            }
}

