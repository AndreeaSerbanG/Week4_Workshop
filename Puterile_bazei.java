import java.util.Scanner;

public class Puterile_bazei {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int baza;
        int exponent;

        System.out.print("Introduceti baza: ");
        baza = sc.nextInt();
        System.out.print("introduceti exponentul : ");
        exponent = sc.nextInt();

        int result = 1;
        for (int it = 0; it <= exponent; it++){
            System.out.print( result + " ");
            result *= baza;
        }
        sc.close();
    }
}
