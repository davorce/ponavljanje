package Zadatak3;

import java.util.ArrayList;
import java.util.Collections;

public class Zad3Main {
    public static void main(String[] args) {

        Polazink p1 = new Polazink(5000, "Illidan", "Stormrage");
        Polazink p2 = new Polazink(3800, "Tyrande", "Whisperwind");
        Polazink p3 = new Polazink(4999, "Malfurion", "Stormrage");

        ArrayList<Polazink> polaznici = new ArrayList<>();
        polaznici.add(p1);
        polaznici.add(p2);
        polaznici.add(p3);

        Collections.sort(polaznici, (a, b) -> a.getDob() - b.getDob());

        for (Polazink p : polaznici) {
            System.out.println(p.getIme() + " " + p.getPrezime() + " - " + p.getDob() + " godina.");
        }
    }
}
