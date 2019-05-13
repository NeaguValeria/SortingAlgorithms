public class MyInsertSort {

    public static void main(String[] args) {

        int[] a = {6, 8, 1, 2, 4, 5, 7, 3, 9};
        ArrayUtils.show(a);
        sort(a);
        ArrayUtils.show(a);
    }

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int aux = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > aux) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = aux;
            ArrayUtils.show(a);
        }
        //metoda mai optima
        /*for (int i = 1; i < a.length; i++) {
            int aux = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > aux) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
            ArrayUtils.show(a);
        }
        }*/
    }
}
