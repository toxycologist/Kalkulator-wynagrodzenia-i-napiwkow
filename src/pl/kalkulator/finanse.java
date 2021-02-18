package pl.kalkulator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class finanse {
    Scanner scanner = new Scanner(System.in);
    private final List<Double> godziny = new ArrayList<>();
    private final List<Integer> napiwki = new ArrayList<>();
    int stawka = 0;


    public void dodawanieGodzin() {
        System.out.println("Wpisz poniżej ilość godzin, którą chcesz dodać do programu: ");
        double godzina = scanner.nextDouble();
        godziny.add(godzina);
        System.out.println("Miałeś jakiś napiwek? Jeśli nic, wpisz 0 :");
        int napiwek = scanner.nextInt();
        napiwki.add(napiwek);

    }

    public void stawkaGodzinowa() {
        System.out.println("Wpisz swoją obecną stawkę godzinową w zł/h : ");
        stawka = scanner.nextInt();
        System.out.println("Pomyślnie ustalono stawkę na " + stawka + " zł/h");

    }

    void wyswietlStawke() {
        System.out.println("Obecna stawka wynosi " + stawka + " zł/h.");
    }


    public void sumaGodziny() {
        double sumaGodzin = godziny.stream()
                .mapToDouble(a -> a)
                .sum();
        System.out.println("Obecnie posiadasz zapisanych " + sumaGodzin + " godzin/y!");
    }


    public void podsumowanie() {
        double sumaGodzin = godziny.stream()
                .mapToDouble(a -> a)
                .sum();
        int sumaNapiwkow = (int) napiwki.stream()
                .mapToDouble(a -> a)
                .sum();


        double suma = (sumaGodzin * stawka) + sumaNapiwkow;
        System.out.println("W  tym miesiącu zrobiłeś " + suma + " zł!");
    }


}
