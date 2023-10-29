import java.util.Scanner;

public class Afisare_divizori_proprii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti numarul: ");
        int n = sc.nextInt();
        int nrDiv = 0;

        for ( int i = 2; i < n; i++){
            if( n % i == 0){
                System.out.print(i + ", ");
                nrDiv++;
            }
        }
        if ( nrDiv == 0 && n != 1 ){
            System.out.print( n + " este numar prim");
        }
        sc.close();
    }
}
