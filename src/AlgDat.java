import java.util.NoSuchElementException;

/**
 * Created by HansChristian on 18.08.2015.
 */
public class AlgDat
{
    public static int maks(int[] a)
    {
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

    public static int min(int[] a)
    {
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

    public static int[] minmaks(int[] a)
    {
        return new int[]{min(a),maks(a)};
    }

    public static void main(String... args)
    {
        int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        int x = maks(a);
        System.out.println(a[x]);
        System.out.println(x);
        int y = min(a);
        System.out.println(a[y]);
        System.out.println(y);
        System.out.println(minmaks(a));
    }
}
