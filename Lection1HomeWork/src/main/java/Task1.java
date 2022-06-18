/**
 *  Задана натуральная степень k. Сформировать случайным образом список коэффициентов
 *  (значения от 0 до 100) многочлена многочлен степени k.
 *  Пример: k = 2 => 2*x^2 + 4*x + 5 = 0 или x^2 + 5 = 0 или 10*x^2 = 0
 */

import java.util.Scanner;

public class Task1 {

    static int GettingNumber(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Insert ratio of the polynomial: ");
        int userNumber = iScanner.nextInt();
        return userNumber;
    }

    public static void main(String[] args) {
        System.out.println(GettingNumber());
    }
}
