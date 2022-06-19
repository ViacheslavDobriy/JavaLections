/**
 *  Задана натуральная степень k. Сформировать случайным образом список коэффициентов
 *  (значения от 0 до 100) многочлена многочлен степени k.
 *  Пример: k = 2 => 2*x^2 + 4*x + 5 = 0 или x^2 + 5 = 0 или 10*x^2 = 0
 */

import java.util.*;

public class Task1 {
    static String GettingLine(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Insert ratio of the polynomial: ");
        return iScanner.nextLine();
    }

    static boolean isCorrect(String str){
        try {
            return Integer.parseInt(str) > 1;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static int[] CreatingArrayOfRatios(int UserNumber){
        int[] ArrayOfRatios = new int[UserNumber+1];
        int[] ArrayOfSymbols = new int[UserNumber+1];
        int count = 0;
        Random rnd = new Random(System.currentTimeMillis());
        while (UserNumber>=0){
            ArrayOfRatios[count] = rnd.nextInt(101);
            ArrayOfSymbols[count] = rnd.nextInt(2);
            if(ArrayOfSymbols[count] == 0){
                ArrayOfRatios[count] = -ArrayOfRatios[count];
            }
            count++;
            UserNumber--;
        }
        return ArrayOfRatios;
    }

    static String ResultPolynomial(int[] generatedArray) {
        String resultString = "";
        for (int i = 0; i < generatedArray.length; i++) {
            if (i == 0) {
                resultString = resultString + generatedArray[i] + "*x^" + (generatedArray.length - i - 1);
            } else {
                if (i == generatedArray.length - 2) {
                    if (generatedArray[i]>0) {
                        resultString = resultString + " + " + generatedArray[i] + "*x";
                    }
                    else{
                        resultString = resultString + " - " + -generatedArray[i] + "*x";
                    }
                }
                else{
                    if (i == generatedArray.length - 1) {
                        if (generatedArray[i]>0) {
                            resultString = resultString + " + " + generatedArray[i];
                        }
                        else{
                            resultString = resultString + " - " + -generatedArray[i];
                        }
                } else {
                        if (generatedArray[i] > 0) {
                            resultString = resultString + " + " + generatedArray[i] + "*x^" + (generatedArray.length - i - 1);
                        } else {
                            resultString = resultString + " - " + -generatedArray[i] + "*x^" + (generatedArray.length - i - 1);
                        }
                    }
                }
            }
        }
        resultString = resultString + " = 0";
        return resultString;
    }

    static String CheckPolynomial(String line){
        String[] lineArray = line.split(" ");
        List<String> list = new ArrayList(Arrays.asList(lineArray));
        int count = 0;
        for (int i = 0; i < lineArray.length-1; i++){
            if (lineArray[i].charAt(0) == '0'){
                if (i==0){
                    list.remove(i);
                    count = count + 1;
                } else {
                    list.remove(i - count);
                    list.remove(i - 1 - count);
                    count = count + 2;
                }
            }
        }
        String[] resultArray = new String[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            resultArray[i] = list.get(i);
        }
        String resultString = "";
        for (int i = 0; i < list.size(); i++){
            resultString = resultString + resultArray[i] + " ";
        }
        return resultString;
    }
    public static void main(String[] args) {
        int ValidateNumber;
        String userNumber = GettingLine();
        while (!isCorrect(userNumber)) {
            userNumber = GettingLine();
        }
        ValidateNumber = Integer.valueOf(userNumber);
        //System.out.printf("%s\n", userNumber);
        int[] ArrayOfRatios = CreatingArrayOfRatios(ValidateNumber);
        //System.out.println(Arrays.toString(ArrayOfRatios));
        //System.out.println(ResultPolynomial(ArrayOfRatios));
        System.out.println(CheckPolynomial(ResultPolynomial(ArrayOfRatios)));
    }
}