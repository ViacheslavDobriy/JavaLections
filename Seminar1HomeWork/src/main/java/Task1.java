/**
 * Write a program for calculating the n-th triangular number
 */

import java.util.Scanner;

public class Task1 {

    static String GetNumber(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Insert integer number - i will make triangular number!");
        return iScanner.nextLine();
    }

    static boolean isCorrect(String line){
        try {
            if(Integer.parseInt(line)>0)
                return true;
        }
        catch (NumberFormatException e){
            return false;
        }
        return false;
    }

    static int TriangularNumber(String checkedNumber){
        int intNumber = Integer.parseInt(checkedNumber);
        return intNumber/2*(intNumber+1);
    }

    public static void main(String[] args) {
        String userNumber = GetNumber();
        while(!isCorrect(userNumber)){
            System.out.println("This is not correct, try again!");
            userNumber = GetNumber();
        }
            System.out.printf("%d - is your triangular number", TriangularNumber(userNumber));
    }
}
