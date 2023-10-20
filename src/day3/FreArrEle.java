package day3;

public class FreArrEle {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 1, 2, 5, 8, 7, 2, 8};
        int[] f = new int[a.length];
        int c1 = -1;
        for (int i = 0; i < a.length; i++) {
            int c2 = 1;
            for (int j = i + 1; j< a.length; j++) {
                if (a[i] == a[j]) {
                    c2++;
                    f[j] = c1;
                }
            }
            if (f[i] != c1) {
                f[i] = c2;

            }

        }
        for (int i = 0; i < f.length; i++) {
            if (f[i] != c1) {
                System.out.println("Element: " + a[i] + " Freuency is " + f[i]);
            }

        }


    }}

