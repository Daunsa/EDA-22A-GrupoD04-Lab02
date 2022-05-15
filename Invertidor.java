class Invertidor{
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4};
        System.out.println("Inicio de invertidor de arrays");
        System.out.println("Array ingresado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        array = invertirArray(array);
        System.out.println("\nArray invertido: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    public static int[] invertirArray(int[] a){
        int length = a.length;
        int[] array = new int[length];
        for (int i = 0; i < length;i++) {
            array[length-1-i] = a[i];
        }
        return array;
    }
}