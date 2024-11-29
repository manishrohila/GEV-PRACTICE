import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public void flipcoin() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number how many times you want to flip");
        int numflips = scanner.nextInt();
        if (numflips < 0) {
            System.out.println("Please enter a positive number");

        } else {
            int head = 0;
            int tail = 0;
            for (int i = 0; i < numflips; i++) {
                double flip = random.nextDouble();
                if (flip < 0.5) {
                    tail++;
                } else {
                    head++;
                }
            }
            double headPercentage = ((double) head / numflips) * 100;
            double tailPercentage = ((double) tail / numflips) * 100;
            System.out.printf("percentage of head count %.2f%% \n", headPercentage);
            System.out.printf("percentage of tail count %.2f%% \n", tailPercentage);
        }
    }
}
