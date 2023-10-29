import java.util.Scanner;

public class Cea_mai_mare_suma_a_divizorilor {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int n = sc.nextInt();
        int maxDivSum = 0;
        int maxI = 2;
        //find number with largest divisors sum
        for (int i = 2; i <= n; i++) {
            int divSum = 0;

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    divSum += j;
                }
            }
            // alta metoda pt instructiunea de mai sus
            //for (int j = 2; j <= Math.sqrt(i); j++){
            //    if (i % j == 0) {
            //        divSum += j;
            //        divSum += (i / j);
            //}
            // alta metoda ca sa nu folosim functii matematice ca Math.sqrt
            //for (int j = 2; j*j <= i; j++){
            //    if (i % j == 0) {
            //        divSum += j;
            //        divSum += (i / j);
            //}
            if (maxDivSum < divSum) {
                maxDivSum = divSum;
                maxI = i;
            }

        }
        System.out.print("Numarul cu cea mai mare suma a divizorilor este: " + maxI + " si are suma egala cu: " + maxDivSum);
    }
}
