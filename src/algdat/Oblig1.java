package algdat;

import java.util.*;

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

        int ant = 0;
        int i = 6;
        int start = 1296; // 10000 base 6
        int slutt = 7775; // 55555 base 6

        for (int j = start; j <= slutt; j++) {
            char[] mdlnr = Integer.toString(j, i).toCharArray();

            for (int k = 0; k < mdlnr.length; k++) {

                for (int m = 1; m < mdlnr.length; m++) {
                    if (mdlnr[k] == mdlnr[m]) ant++;
                }
            }
        }
        System.out.println(ant);
        return ant;
    }

    // OPPGAVE-4 //////////////////////////////////////////

    public static int antallUlikeUsortert(int[] a) {

        if (a.length <= 1)
            return a.length;

        int antall = a.length;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    antall--;
                    break;
                }
            }
        }

        return antall;
    }


    // OPPGAVE-5 //////////////////////////////////////////

    public static void rotasjon(char[] a) {
        if (a.length <= 1)
            return;

        char k = a[a.length - 1];

        for (int i = a.length - 1; i >= 1; i--) {
            a[i] = a[i - 1];
        }

        a[0] = k;
    }

    // OPPGAVE-6 //////////////////////////////////////////

    public static void rotasjon(char[] a, int k) {
        if (a.length <= 1)
            return;

        k %= a.length;

        char[] tmp = new char[Math.abs(k)];
        int c = 0;

        // Høyre
        if (k > 0) {
            for (int i = a.length - k; i < a.length; i++)
                tmp[c++] = a[i];

            for (int i = a.length - k - 1; i >= 0; i--) {
                a[k + i] = a[i];
                if (i < k)
                    a[i] = tmp[i];
            }

            // Venstre
        } else if (k < 0) {
            k = Math.abs(k);

            for (int i = 0; i < k; i++)
                tmp[i] = a[i];

            for (int i = 0; i <= a.length - k - 1; i++)
                a[i] = a[k + i];

            for (int i = 0; i < tmp.length; i++)
                a[a.length - i - 1] = tmp[k - i - 1];
        }
    }


    // OPPGAVE-7 //////////////////////////////////////////

    public static String flett(String s, String t) {
        char[] txt = new char[s.length() + t.length()];

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        int ac = 0;
        int bc = 0;
        int j = 0;

        for (int i = 0; i < Math.max(s.length(), t.length()); i++) {
            if (ac < s.length()) {
                txt[j++] = a[ac++];
            }
            if (bc < t.length()) {
                txt[j++] = b[bc++];
            }
        }

        return String.valueOf(txt);
    }

    public static String flett(String... s) {
        String r = "";
        int l = 0;

        for (String x : s) {
            l += x.length();
        }

        int[] c = new int[s.length];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < s.length; j++) {
                if (c[j] < s[j].length()) {
                    r += s[j].toCharArray()[c[j]];
                    c[j]++;
                }
            }
        }

        return r;
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
        if (k < 1)
            throw new NoSuchElementException("k(" + k + ") kan ikke være mindre enn 1 ");

        if (k > a.length)
            throw new IllegalArgumentException("k(" + k + ") kan ikke være større enn lengden av a = (" + a.length + ")");

        int[] r = new int[k];

        for (int i = 0; i < k; i++) {
            r[i] = a[i];
        }

        Arrays.sort(r);

        for (int i = k; i < a.length; i++) {
            if (a[i] < r[k - 1]) {
                for (int j = k - 1; j > 0; j--) {
                    if (a[i] >= r[j]) {
                        r[j + 1] = a[i];
                        break;
                    } else {
                        r[j] = r[j - 1];
                    }
                }
                if (a[i] < r[0]) {
                    r[0] = a[i];
                }
            }
        }

        return r;

    }

    // OPPGAVE-10 /////////////////////////////////////////

    public static boolean inneholdt(String a, String b) {

        return true;
    }
}