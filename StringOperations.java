/*
Question:
Write a program that demonstrates string operations using
String and StringBuffer class.
*/

package assignment2;

import java.io.*;

public class Assignment2 {
    public static void main(String[] args) {

        try {
            DataInputStream d = new DataInputStream(System.in);

            System.out.println("\nEnter the 1st String:");
            String s = d.readLine();

            // String Functions
            int y = s.length();
            System.out.println("\nLength of string is " + y);

            String z = s.toUpperCase();
            System.out.println("\nString in upper case: " + z);

            String l = s.toLowerCase();
            System.out.println("\nString in lower case: " + l);

            char m = s.charAt(3);
            System.out.println("\nCharacter at 3rd index is " + m);

            String o = s.replace('a', 'b');
            System.out.println("\nReplaced string is " + o);

            String n = s.substring(2, 5);
            System.out.println("\nSubstring from index 2 to 5 is " + n);

            System.out.println("\nEnter the character to find index:");
            String s2 = d.readLine();
            int a = s.indexOf(s2);
            System.out.println("\nIndex of character is " + a);

            System.out.println("\nEnter the character to find last index:");
            String s3 = d.readLine();
            int b = s.lastIndexOf(s3);
            System.out.println("\nLast index of character is " + b);

            System.out.println("\nEnter the 2nd String:");
            String s1 = d.readLine();

            String p = s.concat(s1);
            System.out.println("\nConcatenated string is " + p);

            boolean b1 = s.equals(s1);

            if (b1 == true) {
                System.out.println("\nStrings are equal.");
            } else {
                System.out.println("\nStrings are not equal.");
            }

            // StringBuffer Functions
            StringBuffer sf = new StringBuffer("Coding Atharva");

            System.out.println("\nString = " + sf);
            System.out.println("\nLength = " + sf.length());
            System.out.println("\nCapacity = " + sf.capacity());

            sf.setLength(6);
            System.out.println("\nAfter setting length String = " + sf);

            sf.setCharAt(0, 'K');
            System.out.println("\nSetCharAt String = " + sf);

            sf.setCharAt(0, 'C');

            int a1 = 7;
            sf.append(a1);
            System.out.println("\nAppended String = " + sf);

            sf.insert(6, " Atharva");
            System.out.println("\nInserted String = " + sf);

            sf.reverse();
            System.out.println("\nReverse String = " + sf);

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
