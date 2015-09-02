package algdat;

import java.util.NoSuchElementException;

import hjelpeklasser.*;


public class AlgDat {
    public static int maks(int[] a) {
        if (a.length < 1) throw new NoSuchElementException("Tabellen er tom");

        int m = 0;
        int maksverdi = a[0];
        int tabellengde = a.length;

        for (int i = 1; i < tabellengde; i++) {
            if (a[i] >= maksverdi) {
                m = i;
                maksverdi = a[i];
            }
        }
        return m;
    }


    public static int min(int[] a) {
        if (a.length < 1) throw new NoSuchElementException("Tabellen er tom");

        int m = 0;
        int minverdi = a[0];
        int tabellengde = a.length;

        for (int i = 1; i < tabellengde; i++) {
            if (a[i] <= minverdi) {
                m = i;
                minverdi = a[i];
            }
        }
        return m;
    }


    public static int[] minmaks(int[] a) {
        return new int[]{min(a), maks(a)};
    }


    public static void main(String... args) {
        int[] a = {1, 1, 33, 2, 4, 32, 45};
        int x = maks(a);
        System.out.println(a[x]);
        System.out.println(x);
        int y = min(a);
        System.out.println(a[y]);
        System.out.println(y);
        System.out.println(minmaks(a));
    }
}
