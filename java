import java.util.Random;

public class RandomNumberEvenOdd {
    public static void main(String[] args) {

        Random random = new Random();


        int randomNumber = random.nextInt(100) + 1;


        String result = (randomNumber % 2 == 0) ? "even" : "odd";


        System.out.println("Generated a random number between 1 and 100: " + randomNumber);
        System.out.println("The random number is " + result + ".");
    }
}
