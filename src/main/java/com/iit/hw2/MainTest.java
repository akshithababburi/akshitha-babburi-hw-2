package com.iit.hw2;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {

            System.out.println("Please Enter 1 if you want to test Random Number Generator or " +
                    "Enter 2 for String tokenizer");

            int a = in.nextInt();

            if (a == 1) {
                System.out.println("Please Enter any 2 numbers between which a random number will be generated");
                int firstNumber = in.nextInt();
                int secondNumber = in.nextInt();

                if (firstNumber <= secondNumber) {
                    ImprovedRandom improvedRandom = new ImprovedRandom();

                    System.out.println("The Random Number between " + firstNumber + " and " + secondNumber + " is " + improvedRandom.randomBetween(firstNumber, secondNumber));
                } else
                    System.out.println("You have entered incorrect numbers, please enter the first number lesser than or equal to second number");
            } else if (a == 2) {
                System.out.println("Please Enter the String to be tokenized and converted into an array");
                in.nextLine();
                String s = in.nextLine();

                ImprovedStringTokenizer tokenizer = new ImprovedStringTokenizer(s);
                String[] tokenizedArray = tokenizer.tokenString();

                System.out.println("Please Enter the array index to check the string at that index");
                int index = in.nextInt();

                if (index <= (tokenizedArray.length - 1))
                    System.out.println("The String at the index " + index + " is: " + tokenizedArray[index]);
                else
                    System.out.println("Sorry that index is not valid");
                in.close();
            }
        } catch (Exception e) {
            System.out.println("Error has occurred, please try again");
            in.close();
        }

    }

    public void testRandomNumber() {

    }
}
