import java.util.Random;

public class Task2 {

    static int GettingRandomNumber(){
        Random random = new Random();
        return random.nextInt(1000001);
    }

    static int SumOfDigits(int randomNumber){
        int resultSum = 0;
        while(randomNumber!=0){
            resultSum = resultSum + randomNumber%10;
            randomNumber = randomNumber/10;
        }
        return resultSum;
    }

    public static void main(String[] args) {
        int randomNumber = GettingRandomNumber();
        System.out.println(randomNumber);
        System.out.println(SumOfDigits(randomNumber));
    }
}
