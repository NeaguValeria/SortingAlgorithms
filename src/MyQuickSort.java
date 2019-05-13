public class MyQuickSort {
    public static void main(String[] args) {

        int[] a = {6, 8, 1, 2, 4, 5, 7, 3, 9};
        ArrayUtils.show(a);
        sort(a);
        ArrayUtils.show(a);
    }

    public static void sort(int[] a, int left, int right) {

        System.out.print("sorting: ");
        for (int i = left; i <= right; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int pivot = a[(left + right) / 2];
        System.out.println("pivot " + pivot);
        int i = left;
        int j = right;

        while (i <= j) {
            System.out.println("ws i: " + i + " j: " + j);
            while (a[i] < pivot) {
                i++;
            }

            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                if (i < j) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
                i++;
                j--;
            }

            ArrayUtils.show(a);
            System.out.println("we i: " + i + " j: " + j);
        }

        if (i < right) {
            sort(a, i, right);
        }
        if (j > left) {
            sort(a, left, j);
        }

    }

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }
}
