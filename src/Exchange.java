import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Your money (in USD):");
        int USD = scanner.nextInt();
        int VND = USD * rate;
        System.out.println("Your money (in VND) is: " + VND);
    }
}
