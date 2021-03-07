/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aytenjava_2.pkg17;

import java.util.Scanner;

/**
 *
 * @author Aytan
 */
public class AytenJava_217 {

    /**
     * @param args the command line arguments
     */
    //Exercise 2.17
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        int largest;
        int smallest;

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = sum / 3;
        product = num1 * num2 * num3;

        largest = num1;
        smallest = num1;

        if(num2 > largest)
            largest = num2;

        if(num3 > largest)
            largest = num3;

        if(num2 < smallest)
            smallest = num2;

        if (num3 < smallest)
            smallest = num3;

        System.out.println("The sum is " + sum);

        System.out.println("The average is " + average);

        System.out.println("The product is " + product);

        System.out.println("Largest of three integers is " + largest + " and the smallest is "+ smallest + ".");
    }
    

}



    
    

