import java.util.Scanner;

public class Complementarul_numarului {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti numarul dorit: ");

        int n = sc.nextInt();
        int nrPerfect = 1;
        int result = 0;
        sc.close();

        while (nrPerfect <= n) {
            nrPerfect *= 10;
        }

        result = nrPerfect - n;
        System.out.println(n + "+" + result + '=' + nrPerfect);
    }
}
