import java.util.Scanner;

public class Numar_prim {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un numar: ");
        int n = sc.nextInt();
        int nrDiv = 0;

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                nrDiv++;
            }
        }
        if( nrDiv != 0){
            System.out.println("Numarul " + n + " nu este prim.");
        } else {
            System.out.println("Numarul " + n + " este prim.");
        }

    }
}
