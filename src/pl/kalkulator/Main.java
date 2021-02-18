package pl.kalkulator;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        boolean czyDzialacDalej = true;
        Scanner scanner = new Scanner(System.in);
        finanse finanse = new finanse();


        while (czyDzialacDalej) {
            System.out.println("----------------------------------------------");
            System.out.println("Witaj w programie liczącym godziny i napiwki!");
            System.out.println(" ");
            System.out.println("Aby rozpocząć, wybierz opcje z menu poniżej:");
            System.out.println(" ");
            System.out.println("1. Dodaj godziny i napiwki");
            System.out.println("2. Ustal stawkę godzinową");
            System.out.println("3. Podgląd ilości godzin");
            System.out.println("4. Wyświetl stawkę godzinową");
            System.out.println("5. Wyświetl podsumowanie");
            System.out.println("6. Wyjście");
            System.out.println("----------------------------------------------");

            int menuWybor = scanner.nextInt();


            switch (menuWybor) {

                case 1 -> finanse.dodawanieGodzin();
                case 2 -> finanse.stawkaGodzinowa();
                case 3 -> finanse.sumaGodziny();
                case 4 -> finanse.wyswietlStawke();
                case 5 -> finanse.podsumowanie();
                case 6 -> czyDzialacDalej = false;
            }
        }
    }
}
