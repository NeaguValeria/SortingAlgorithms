public class MySelectSort {
    public static void sort(int[] a){
        for (int i =0; i < a.length; i++){
            int minIndex = i;
            for( int j = i; j < a.length; j++){
                if(a[j] < a[minIndex]) {

                    minIndex = j;
                }
            }
            //inversare var
            int aux = a[i];
            a[i] = a[minIndex];
            a[minIndex] = aux;
            ArrayUtils.show(a);
        }
    }

    public static void main(String[] args) {

        int[] a = {6, 8, 1, 2, 4, 5, 7, 3, 9};
        ArrayUtils.show(a);
        sort(a);
        ArrayUtils.show(a);
    }
}
