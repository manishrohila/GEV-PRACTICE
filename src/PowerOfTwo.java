import java.util.Scanner;

public class PowerOfTwo {
    public  void powerOfTwo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a power value N (0 <= N < 31): ");
        int N = scanner.nextInt();

        // Check if the input is within the valid range
        if (N >= 0 && N < 31) {
            // Print powers of 2 less than or equal to 2^N
            System.out.println("Powers of 2 up to 2^" + N + ":");
            for (int i = 0; i <= N; i++) {
                System.out.println("2^" + i + " = " + (1 << i)); // 1 << i is equivalent to 2^i
            }
        } else {
            System.out.println("Invalid input! N must be between 0 and 30.");
        }
    }
}
