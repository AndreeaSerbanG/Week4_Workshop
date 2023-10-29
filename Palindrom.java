import java.util.Scanner;

public class Palindrom {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");

        int x = sc.nextInt();
        int copyx = x;
        int palindrom = 0;
        int ultimaCifra = 0;

        while (x != 0) {
            ultimaCifra = x % 10;
            palindrom = palindrom * 10 + ultimaCifra;
            x /= 10;
        }
        if ( copyx == palindrom){
            System.out.println("Numarul este palindrom");
        }else {
            System.out.println("Numarul nu e palindrom");
        }
    }
}
