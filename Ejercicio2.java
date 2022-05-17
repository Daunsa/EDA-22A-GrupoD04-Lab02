public class Ejercicio2 {
	private static int numeroatrasladar = 4;
	public static void main(String[] args){
		int[] arreglooriginal = {1,2,3,4,5};
		imprimirArreglo(arreglooriginal);
		arreglooriginal = rotarIzquierdaArray(arreglooriginal);
		imprimirArreglo(arreglooriginal);
	}

	public static int[] rotarIzquierdaArray(int[] A) {
		/** */
		// Procedimiento para rotar la matriz
		/** */
		int longituddeA = A.length;
		int[] trasladado = new int[longituddeA];
		for(int i=0; i<longituddeA; i++){
			int j = i+numeroatrasladar;
			if(j>longituddeA-1)
				j=j%longituddeA;
			System.out.println(i+" intercambia con "+j);
			trasladado [j] = A [i];
		}
		return trasladado;
	}
	public static void imprimirArreglo(int [] arreglo){
		System.out.print("El arreglo es: ");
		for(int i=0;i<arreglo.length;i++){
			System.out.print(arreglo[i]+" ");
		}
		System.out.print("\n");
	}

}
