/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.multipleandmutilevel1;

/**
 *
 * @author Asus
 */

/*
Question:
Write a program that demonstrates the program structure of Java
using arithmetical and logical implementation.
*/


public class ArithmeticOperations {

   public static void main(String[] args) {

        // Initializing variables
        int num1 = 20, num2 = 10;
        int sum = 0, diff = 0, multi = 0;
        float div = 0;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Arithmetic Operations
        sum = num1 + num2;
        System.out.println("The sum = " + sum);

        diff = num1 - num2;
        System.out.println("The diff = " + diff);

        multi = num1 * num2;
        System.out.println("The multi = " + multi);

        div = (float) num1 / num2;
        System.out.println("The div = " + div);

        // Logical Implementation
        if ((num1 == 20) && (num2 == 10)) {   // You can also use || operator
            System.out.println("Both True");
        } else {
            System.out.println("Both Not True");
        }
    }
}
