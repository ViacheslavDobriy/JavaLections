import java.util.Random;

public class Task2 {

    static int GettingRandomNumber(){
        Random random = new Random();
        return random.nextInt(1000001);
    }

    public static void main(String[] args) {
        System.out.println(GettingRandomNumber());
    }
}
