import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= 0;
        do {
            System.out.println("Podaj liczbę ");
            x = scan.nextInt();
            if (x > 200) {
                System.out.println("Liczba jest za duża");
            } else if (x < 100) {
                System.out.println("Liczba jest za mała");
            } else if (x % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            }
        } while (x > 200 || x < 100 || x % 3 != 0);
        scan.close();
        System.out.println("Podałeś poprawną liczbę");
    }
}
