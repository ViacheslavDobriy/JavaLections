/**
 *  Задана натуральная степень k. Сформировать случайным образом список коэффициентов
 *  (значения от 0 до 100) многочлена многочлен степени k.
 *  Пример: k = 2 => 2*x^2 + 4*x + 5 = 0 или x^2 + 5 = 0 или 10*x^2 = 0
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {

    static int GettingNumber(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Insert ratio of the polynomial: ");
        return iScanner.nextInt();
    }

    static int[] CreatingArrayOfRatios(int UserNumber){
        int[] ArrayOfRatios = new int[UserNumber+1];
        int count = 0;
        Random rnd = new Random(System.currentTimeMillis());
        while (UserNumber>=0){
            ArrayOfRatios[count] = rnd.nextInt(101);
            count++;
            UserNumber--;
        }
        return ArrayOfRatios;
    }

    public static void main(String[] args) {
        int userNumber = GettingNumber();
        System.out.printf("%d\n", userNumber);
        System.out.println(Arrays.toString(CreatingArrayOfRatios(userNumber)));
    }
}
