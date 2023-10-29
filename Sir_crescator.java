import java.util.Scanner;

public class Sir_crescator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti numarul de numere n: ");
        int n = sc.nextInt();
        int x;
        int prevMax = Integer.MIN_VALUE;
        boolean isAscending = true;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti numarul " + (i + 1));
            x = sc.nextInt();

            if (x >= prevMax) {
                prevMax = x;
            } else {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.print("Sirul este crescator.");
        } else {
            System.out.print("Sirul nu este crescator.");
        }
    }
}
