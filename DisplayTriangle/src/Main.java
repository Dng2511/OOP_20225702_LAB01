import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            for ( int j = 1 ; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n-i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    System.exit(0);
    }
}