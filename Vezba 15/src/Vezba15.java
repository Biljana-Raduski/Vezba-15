import java.util.Scanner;

public class Vezba15 {
    public static void main(String[] args) {

        String marka_automobila = "Ford";
        int broj_vrata = 4;

        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite marku automobila");
        String marka = unos.next();

        System.out.println("Unesite broj vrata");
        int broj = unos.nextInt();


        if (marka_automobila.equals(marka) && broj_vrata == broj) {
            System.out.println("Tacno");

        }else System.out.println("Netacno");

    }
}