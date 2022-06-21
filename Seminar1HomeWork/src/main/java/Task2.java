import java.util.Random;

public class Task2 {

    static int GettingRandomNumber() {
        Random random = new Random();
        return random.nextInt(10001);
    }

    static int SumOfDigits(int randomNumber) {
        int resultSum = 0;
        while (randomNumber != 0) {
            resultSum = resultSum + randomNumber % 10;
            randomNumber = randomNumber / 10;
        }
        return resultSum;
    }

    static boolean CheckDivision(int randomNumber, int sumOfDigits) {
        float quotient = (float) randomNumber / sumOfDigits;
        return quotient % 1 == 0;
    }

    public static void main(String[] args) {
        int randomNumber = GettingRandomNumber();
        int sumOfDigits = SumOfDigits(randomNumber);
        while (!CheckDivision(randomNumber, sumOfDigits)) {
            randomNumber = GettingRandomNumber();
            sumOfDigits = SumOfDigits(randomNumber);
        }
        System.out.printf("%d - is a number that is divisible without a remainder\n", randomNumber);
        System.out.printf("%d - is sum of digits", sumOfDigits);
    }
}
