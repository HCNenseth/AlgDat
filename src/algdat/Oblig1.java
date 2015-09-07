package algdat;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Hans Christian Nenseth s236334
 */

public class Oblig1 {

    // OPPGAVE-1 //////////////////////////////////////////

    // Teorispørsmål
    public static int maks(int[] a) {

        if (a.length < 1) throw new NoSuchElementException("Tabellen er tom");

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
            }
        }
        return a[a.length - 1];
    }


    // Teorispørsmål
    public static int ombyttinger(int[] a) {

        int ant_ombytt = 0;
        if (a.length < 1) throw new NoSuchElementException("Tabellen er tom");

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
                ant_ombytt++;
            }
        }
        return ant_ombytt;
    }


    // OPPGAVE-2 //////////////////////////////////////////

    // Teorispørsmål
    public static void sortering(int[] a) {

        for (int j = 0; j < a.length; j++) {
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }


    // OPPGAVE-3 //////////////////////////////////////////

    public static int medlemsnummer() {


        return -1;
    }

    // OPPGAVE-4 //////////////////////////////////////////

    public static int antallUlikeUsortert(int[] a) {

        

        return -1;
    }


    // OPPGAVE-5 //////////////////////////////////////////

    public static void rotasjon(char[] a) {

    }

    // OPPGAVE-6 //////////////////////////////////////////


    // OPPGAVE-7 //////////////////////////////////////////


    // OPPGAVE-8 //////////////////////////////////////////


    // OPPGAVE-9 //////////////////////////////////////////


    // OPPGAVE-10 /////////////////////////////////////////



/*
    public static void main(String... args) {

        int[] a = {3};
        int[] b = {5, 2, 8, 4, 7, 6};
        int[] c = {5, 4, 3, 2, 1};
        int[] d = {1, 2, 3, 4, 5};
        int[] e = {3, 2};

        int[] mid = b;

        System.out.println(Arrays.toString(mid));
        System.out.println(maks(mid));
        System.out.println(ombyttinger(mid));
        sortering(mid);
    }

*/


    public static void main(String[] args) {
        int antallFeil = 0;

        //antallFeil += oppgave1();
        antallFeil += oppgave2();
        //antallFeil += oppgave3();
        //antallFeil += oppgave4();
        //antallFeil += oppgave5();
        //antallFeil += oppgave6();
        //antallFeil += oppgave7();
        //antallFeil += oppgave8();
        //antallFeil += oppgave9();
        //antallFeil += oppgave10();

        if (antallFeil == 0) {
            System.out.println("Gratulerer!! Du passerte testen!");
        } else {
            System.out.println("Dette må forbedres. Du har minst " + antallFeil + " feil!");
        }
    }


    /*
    ///// Oppgave 1 //////////////////////////////////////

    public static int oppgave1() {
        int antallFeil = 0;

        boolean unntak = false;
        int[] tom = {};
        try {
            Oblig1.maks(tom);  // kaller maks-metoden
        } catch (Exception e) {
            unntak = true;
            if (!(e instanceof java.util.NoSuchElementException)) {
                System.out.println("Opgave 1: Feil unntak for en tom tabell!");
                antallFeil++;
            }
        }

        if (!unntak) {
            System.out.println("Opgave 1: Kast unntak for en tom tabell!");
            antallFeil++;
        }

        int[] a = {3};
        int[] b = {5, 2, 8, 4, 7, 6};
        int[] c = {5, 4, 3, 2, 1};
        int[] d = {1, 2, 3, 4, 5};
        if (Oblig1.maks(a) != 3 || Oblig1.maks(b) != 8 ||
                Oblig1.maks(c) != 5 || Oblig1.maks(d) != 5) {
            System.out.println("Oppgave 1: a) Maks-metoden: Feil resultat!");
            antallFeil++;
        }

        int[] e = {1, 4, 3, 7, 6, 5, 10, 2, 9, 8};
        int[] f = {1, 3, 4, 6, 5, 7, 2, 9, 8, 10};

        Oblig1.maks(e);
        if (!Arrays.equals(e, f)) {
            System.out.println("Oppgave 1: b) Maks-metoden: feil i ombyttingene!");
            antallFeil++;
        }

        a = new int[]{6, 5, 4, 3, 2, 1};
        b = new int[]{1, 2, 3, 4, 5};
        c = new int[]{4, 9, 3, 6, 1, 5, 7, 8, 10, 2};
        d = new int[]{2, 5, 8, 4, 3, 10, 1, 7, 6, 9};

        if (Oblig1.ombyttinger(a) != 5 || Oblig1.ombyttinger(b) != 0
                || Oblig1.ombyttinger(c) != 7 || Oblig1.ombyttinger(d) != 6) {
            System.out.println("Oppgave 1: c) Feil opptelling i ombyttingsmetoden!");
            antallFeil++;
        }
        return antallFeil;
    }

*/


    ///// Oppgave 2 //////////////////////////////////////

    public static int oppgave2() {
        int antallFeil = 0;

        int[] a = {};
        int[] b = {5};
        int[] c = {7, 2, 8, 3, 10, 5, 9, 1, 6, 4};
        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] e = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] f = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 7};
        int[] g = {4, 6, 2, 4, 7, 5, 6, 4, 3, 5, 4, 2, 5, 3, 1, 3};

        try {
            Oblig1.sortering(a);
        } catch (Exception ex) {
            System.out.println("Oppgave 2: a) Skal ikke kaste unntak for tom tabell!");
            antallFeil++;
        }

        Oblig1.sortering(b);  // skal ikke kaste unntak her!
        Oblig1.sortering(c);
        Oblig1.sortering(e);
        Oblig1.sortering(g);
        if (!Arrays.equals(c, d) || !Arrays.equals(e, d) || !Arrays.equals(f, g)) {
            System.out.println("Oppgave 2: b) Metoden gir feil resultat!");
            antallFeil++;
        }

        return antallFeil;
    }


}

