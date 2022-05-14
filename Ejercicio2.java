import java.util.ArrayList;
public class Ejercicio2 {
	private int numeroatrasladar = 2;
	public static void main(String[] args){
		int[] arreglooriginal = {1,2,3,4,5};
		int[] arreglotrasladado = rotarIzquierdaArray(arreglooriginal);



		
	}

	public static int[] rotarIzquierdaArray(int[] A) {
		/** */
		// Procedimiento para rotar la matriz
		/** */
		int longituddeA = A.length;
		for(int i=0; i<longituddeA; i++){
			int j = i+numeroatrasladar;
			if(j>longituddeA)
				j=j%longituddeA;
			tempovar = A [i];
			A [i] = A[j];
			A [j] = tempovar;


			
			
		}
		return A;
	}

}
