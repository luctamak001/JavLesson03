import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for a: ");
        int a = input.nextInt();
        System.out.println("Enter a value for b: ");
        int b = input.nextInt();


        System.out.println("Max of 15 and 23: " + findMaximum(15, 23));


        System.out.println("Max of " + a + " and " + b + ": " + findMaximum(15, 23));
        System.out.println("Max of 15 and 23: " + findMaximum(15, 23));
        System.out.println("Max of 100 and 50: " + findMaximum(100, 50));
        System.out.println("Max of -5 and -10: " + findMaximum(-5, -10));


    }

    private static int findMaximum(int a, int b) {
        return a > b ? a : b;
    }
}
