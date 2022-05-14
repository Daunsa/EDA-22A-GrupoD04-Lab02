import java.util.ArrayList;

import javafx.print.PrintColor;
public class Ejercicio2 {
	private static int numeroatrasladar = 3;
	public static void main(String[] args){
		int[] arreglooriginal = {1,2,3,4,5};
		imprimirArreglo(arreglooriginal);
		int[] arreglotrasladado = rotarIzquierdaArray(arreglooriginal);
		imprimirArreglo(arreglotrasladado);
	}

	public static int[] rotarIzquierdaArray(int[] A) {
		/** */
		// Procedimiento para rotar la matriz
		/** */
		int longituddeA = A.length;
		for(int i=0; i<longituddeA; i++){
			int j = i+numeroatrasladar;
			if(j>longituddeA-1)
				j=j%longituddeA;
			//System.out.println(i+" intercambia con "+j);
			int tempovar = A [i];
			A [i] = A[j];
			A [j] = tempovar;
		}
		return A;
	}
	public static void imprimirArreglo(int [] arreglo){
		System.out.print("El arreglo es: ");
		for(int i=0;i<arreglo.length;i++){
			System.out.print(arreglo[i]+" ");
		}
		System.out.print("\n");
	}

}
