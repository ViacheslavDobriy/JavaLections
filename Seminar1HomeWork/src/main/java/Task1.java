/**
 * Write a program for calculating the n-th triangular number
 */

import java.util.Scanner;

public class Task1 {
    static String GetNumber(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Insert integer number - i will make triangular number!");
        String userInsert = iScanner.nextLine();
        iScanner.close();
        return userInsert;
    }

    public static void main(String[] args) {

    }
}
