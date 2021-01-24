package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> myInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); // Initialize a list of integers in one line
        System.out.println(myInt); // print on console the list
        System.out.println(Arrays.toString(myInt.toArray())); // Another way of printing myInt on the console
        System.out.println(myInt.get(1)); // Getting elements from the list by index
        for (int number:myInt) // Using the foreach loop to print elements without the commas and square brackets with a space in between
            System.out.print(number+" ");
    }
}
