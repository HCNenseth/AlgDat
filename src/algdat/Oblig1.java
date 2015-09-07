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

        int i = 6;
        int start = 1296; // 10000 base 6
        int slutt = 7775; // 55555 base 6

        for (int j = start; j <= slutt; j++) {
            char[] mnr = Integer.toString(j, i).toCharArray();
            for (char x : mnr) {

            }
        }
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

    public static void rotasjon(char[] a, int k) {


    }


    // OPPGAVE-7 //////////////////////////////////////////

    public static String flett(String s, String t) {

        return "";
    }

    public static String flett(String... s) {
        return "";
    }


    // OPPGAVE-8 //////////////////////////////////////////

    public static int[] indeks(int[] a) {

        return a;
    }

    public static int[] tredjeMin(int[] a) {

        return a;
    }

    // OPPGAVE-9 //////////////////////////////////////////

    public static int[] kMinst(int[] a, int k) {

        return a;

    }

    // OPPGAVE-10 /////////////////////////////////////////

    public static boolean inneholdt(String a, String b) {

        return true;
    }
}