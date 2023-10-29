import java.util.Scanner;

public class Descompunere_factori_primi {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar n: ");
        int n = sc.nextInt();

        for ( int i = 2; i <= n; i++){
            int nr = 0;
            while(n % i ==0){
                n = n/i;
                nr++;
            }
            if ( nr!= 0) {
                if (  i == 1){
                    System.out.println( i + " * ");
                }else {
                    System.out.print(i + " ^ " + nr + "*");
                }
            }
        }
        sc.close();
    }
}
