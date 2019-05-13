public class MyMergeSort {

    public static void main(String[] args) {

        int[] a = {9, 6, 5, 7, 3, 4};
        ArrayUtils.show(a);
        sort(a);
        ArrayUtils.show(a);
    }

    public static void sort(int[] a, int left, int right) {
        System.out.println(" sorting " + left + " - " + right);
        if (left != right) {//cind e singur element (nu are sens sa facem sortare)
            int mid = (left + right) / 2;
            sort(a, left, mid);
            sort(a, mid + 1, right);//divizare mijloc
            merge(a, left, mid, right);
        }
    }

    public static void merge(int[] a, int left, int mid, int right) {
        System.out.println(" merging " + left + " - " + mid + " - " + right);

        int[] aLeft = new int[mid - left + 1];//decalarare array nou pentru pastrare cu mar mid...
        int[] aRight = new int[right - (mid + 1) + 1];// mid+ 1 e 2 iar mid 1+1 e 3

        for (int i = left; i <= mid; i++) {
            aLeft[i - left] = a[i];
        }
        for (int i = mid + 1; i <= right; i++) {//lucrez pe indexi trebuie si =
            aRight[i - (mid + 1)] = a[i];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < aLeft.length && j < aRight.length) {
            if (aLeft[i] < aRight[j]) {
                a[k] = aLeft[i];
                i++;
            } else {
                a[k] = aRight[j];
                j++;
            }
            k++;
        }
        while (i < aLeft.length) {
            a[k] = aLeft[i];
            i++;
            k++;
        }
        while (j < aRight.length) {
            a[k] = aRight[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }
}
