public class MyBubbleSort {
    public static void main(String[] args) {

        int[] a = {6, 8, 1, 2, 4, 5, 7, 3, 9};
        ArrayUtils.show(a);
        sort(a);
        ArrayUtils.show(a);
    }

    public static void sort (int[] a) {
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < a.length -1 ; i++) {
                if(a[i] > a[i+1]) {
                    int aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                    sorted = false;  //se opreste
                    ArrayUtils.show(a);
                    System.out.println("switch " + a[i] + " <-> " + a[i + 1]);
                }
            }
            //ArrayUtils.show(a);
            System.out.println("par  curgere");
        }
    }
}
