import java.util.Scanner;

public class Afisare_nr_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti limita superiora: ");
        int n = sc.nextInt();
        int j;
        boolean isPrime;

        for (int i = 2; i <= n ; i++) {
            isPrime = true;
            for( j = 2; j < i; j++){

                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.print(j + " ");
            }
        }
        sc.close();
    }
}
