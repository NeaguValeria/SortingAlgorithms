public class ArrayMerge {

    public static void main(String[] args) {
        int[] a = {11, 13, 19, 24};
        int[] b = {3, 14, 15};
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        ArrayUtils.show(a);
        ArrayUtils.show(b);

        while (i < a.length && j < b.length) {//cit timp nu am ajuns la capatul nici unui array
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;//am mers la urmatorul element implementez i din a
            } else {
                c[k] = b[j];
                j++;// implementez j din b
            }
            k++;// semnalez ca am adaugat elemente in array nou, punem aici pentru ca stim sigur ca va intra pe ramura if sau else altfel puneam k++ dupa fiecare if si else
        }

        while (i < a.length) {//pentru copiere elemente ramase in a sau b, doar un while o sa fie adevarat
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            i++;
            k++;
        }
        ArrayUtils.show(c);
    }
}
