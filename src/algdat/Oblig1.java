package algdat;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Hans Christian Nenseth s236334
 */

public class Oblig1 {

    // OPPGAVE-1

    // Teorispørsmål
    public static int maks(int[] a) {
        if (a.length < 1) throw new NoSuchElementException("Tabellen er tom");
        for (int j = 0; j < a.length; j++) {
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        return a[a.length - 1];
    }


    // Teorispørsmål
    public static int ombyttinger(int[] a) {

        return -1;
    }


    // OPPGAVE-2

    public static void sortering(int[] a){

    }

    public static void main(String... args) {

        int[] a = {3};
        int[] b = {5, 2, 8, 4, 7, 6};
        int[] c = {5, 4, 3, 2, 1};
        int[] d = {1, 2, 3, 4, 5};

        int[] mid = c;

        System.out.println(Arrays.toString(mid));
        System.out.println(maks(mid));
        System.out.println(ombyttinger(mid));

    }
}
